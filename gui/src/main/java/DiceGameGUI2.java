/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD


import javax.swing.*;
import java.util.*;
import dice.*;
=======

import javax.swing.*;
import java.util.*;
import dice*;
>>>>>>> d0ad09b140e305206dfa7f552b0dbaa41a704811
/**
 *
 * @author Nguyen
 */
public class DiceGameGUI2 extends javax.swing.JFrame {

    /**
     * Creates new form DiceGameGUI
     */
    public DiceGameGUI2() {
        initComponents();
		initVar();
    }
    
    private void initVar(){
	     thisGame = new DiceGame();
        listLbl = new ArrayList<>();
        listLbl.add(picDie1);
	     listLbl.add(picDie2);
	     listLbl.add(picDie3);
        listIcon = new ArrayList<>();
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_1.png")));
	listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_2.png")));
	listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_3.png")));
	listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_4.png")));
	listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_5.png")));
	listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die-a.gif")));
	}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRoll = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDiceNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRollScore = new javax.swing.JLabel();
        lblTotalScore = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnInstr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        picDie1 = new javax.swing.JLabel();
        picDie2 = new javax.swing.JLabel();
        picDie3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRoll.setText("ROLL");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });

        btnStop.setText("STOP");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel4.setText("Number of Dice:");

        jLabel5.setText("Roll Score:");

        jLabel6.setText("Total Score:");

        lblRollScore.setText("0");

        lblTotalScore.setText("0");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnInstr.setText("Instruction");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Player's Name");

        picDie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie1.setEnabled(false);

        picDie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie2.setEnabled(false);

        picDie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie3.setEnabled(false);

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInstr))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(204, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRollScore)
                                    .addComponent(lblTotalScore))
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)))
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(picDie2)
                .addGap(18, 18, 18)
                .addComponent(picDie1)
                .addGap(18, 18, 18)
                .addComponent(picDie3)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picDie2)
                    .addComponent(picDie3)
                    .addComponent(picDie1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblRollScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblTotalScore))
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInstr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        thisGame = new DiceGame();
        for (int index = 0; index < listLbl.size(); index++)
        {
            listLbl.get(index).setEnabled(false);
        }
        lblRollScore.setText("0");
        lblTotalScore.setText("0");
        txtDiceNumber.setText("");
        btnRoll.setEnabled(true);
        picDie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie1.setEnabled(false);

        picDie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie2.setEnabled(false);

        picDie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiceGameUI/die_face_6.png"))); // NOI18N
        picDie3.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
// TODO add your handling code here:
        int diceNumber = Integer.parseInt(txtDiceNumber.getText());
        RollResult rScore = new RollResult();
        try{rScore = thisGame.roll(diceNumber);} 
        catch (RollAfterGameOverException ex)
        {ex.getStackTrace();}
        Integer tScore = thisGame.getCurrentTotal();
        lblRollScore.setText(""+rScore.sum());
        lblTotalScore.setText(tScore.toString());
        txtDiceNumber.setEnabled(true);
        
        for (int index = 0; index < rScore.rollCount(); index++)
        {
            int dieValue = rScore.rollsArray()[index];
            if(dieValue == 0)
                listLbl.get(index).setIcon(listIcon.get(5));
            else
               listLbl.get(index).setIcon(listIcon.get(dieValue-1));
        }
        
        if (thisGame.getCurrentTotal() >= 23){
            JOptionPane.showMessageDialog(null, "Game Over!", "Game Over",
            JOptionPane.OK_OPTION);
            btnRoll.setEnabled(false);
            btnStop.setEnabled(false);
        }
        else
        {
         btnStop.setEnabled(false);
         btnRoll.setEnabled(true);
        }    }//GEN-LAST:event_btnStopActionPerformed

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        int diceNumber = Integer.parseInt(txtDiceNumber.getText());
        if (diceNumber > 3 || diceNumber <1 || txtDiceNumber.getText().equals("") )
        {
          JOptionPane.showMessageDialog(null, "Please enter a number from 1-3", "Invalid Input",
          JOptionPane.OK_OPTION);
        } 
        else
        {
         enableDie(diceNumber);
        
         dieAnimation(diceNumber);
        
         txtDiceNumber.setEnabled(false);
         btnStop.setEnabled(true);
         btnRoll.setEnabled(false);
        }
    }//GEN-LAST:event_btnRollActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
      // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DiceGameGUI2().setVisible(true);
        });
        
    }
    
    
    public void enableDie(int diceNumber){
        switch (diceNumber)
        {
            case 1: 
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(false);
                picDie3.setEnabled(false);
                break;
            }
            case 2:
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(true);
                picDie3.setEnabled(false);
                break;
            }
            case 3:
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(true);
                picDie3.setEnabled(true);
                break;
            }   
        }        
    }
    
    public void dieAnimation(int diceNumber)
    {
        for (int index = 0; index < diceNumber ; index++)
        {
                listLbl.get(index).setIcon(listIcon.get(6));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnInstr;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRoll;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblRollScore;
    private javax.swing.JLabel lblTotalScore;
    private javax.swing.JLabel picDie1;
    private javax.swing.JLabel picDie2;
    private javax.swing.JLabel picDie3;
    private javax.swing.JTextField txtDiceNumber;
    // End of variables declaration//GEN-END:variables
    private DiceGame thisGame;
    private List<JLabel> listLbl;
    private List<Icon> listIcon;
}
