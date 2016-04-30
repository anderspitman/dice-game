package dice;


public class DiceGame {
    private static final int MAX_TOTAL = 23;

    private Die die;
    private String username;
    private int currentTotal;
    private int gameId;
    private Database database;

    private DiceGame(String username, Database database) {
        this.username = username;
        currentTotal = 0;
        die = new Die();
        this.database = database;
        this.gameId = -1;
    }

    public static DiceGame create(String username)
            throws InvalidUsernameException {
        validateUsername(username);

        Database db = Database.create();
        return new DiceGame(username, db);
    }

    public static DiceGame create(String username, Database database)
            throws InvalidUsernameException {
        validateUsername(username);

        return new DiceGame(username, database);
    }

    public RollResult roll(int numDice) throws RollAfterGameOverException {

        if (getCurrentTotal() >= MAX_TOTAL) {
            throw new RollAfterGameOverException();
        }

        RollResult result = new RollResult();

        int rollValue = 0;

        for (int dieIndex = 0; dieIndex < numDice; dieIndex++) {
            rollValue = die.roll();
            result.addRoll(rollValue);
        }

        currentTotal += result.sum();

        if (gameId == -1) {
            gameId = getNextGameId();
        }

        RollRecord record = new RollRecord(getUsername(), gameId, numDice,
                                           result.sum(), getScore());

        database.addRoll(record);

        return result;
    }

    /**
     * Function to get current score total
     * @return {int} - returns the users current game score
     */
    public int getCurrentTotal() {
        return currentTotal;
    }

    /**
     * Function to get the final score
     * @return {int} - returns final score
     */
    public int getScore() {
        int score;

        int currentTotal = getCurrentTotal();

        if (currentTotal > MAX_TOTAL) {
            score = 0;
        }
        else if (currentTotal == MAX_TOTAL) {
            score = 2 * MAX_TOTAL;
        }
        else {
            score = currentTotal;
        }

        return score;
    }

    /**
     * Function to get username
     * @return {string} - returns the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Function to get the next usable game ID
     * @return {int} - next usable game ID
     */
    private int getNextGameId() {
        RollRecord[] records = database.getAllRecords();

        int maxId = -1;
        for (RollRecord record : records) {
            if (record.getGameId() > maxId) {
                maxId = record.getGameId();
            }
        }

        return maxId + 1;
    }

    /**
     * Function do ensure user name follows correct standards for database
     * @param  username                 - the username entered by the user
     * @throws InvalidUsernameException - exception thrown when username 
     *             doesn't follow correct standards for database.
     */
    private static void validateUsername(String username)
            throws InvalidUsernameException {
        final int VALID_LENGTH = 3;
        if (username.length() == 0) {
            throw new InvalidUsernameException("Blank username");
        }
        else if (username.length() < VALID_LENGTH) {
            String message = "Username '" + username + "' too short";
            throw new InvalidUsernameException(message);
        }
        else if (username.length() > VALID_LENGTH) {
            String message = "Username '" + username + "' too long";
            throw new InvalidUsernameException(message);
        }
    }
}
