/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author maria
 */
public class PlayFriend extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;
	public static JButton[] buttons = new JButton[9];
	public static int count = 0;
	private static int[][] check = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 },
			{ 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };
       
    public PlayFriend() {
        

            initComponents();

            panel.setLayout(new GridLayout(3, 3, 5, 5));

            for (int i = 0; i < 9; i++) {
                            buttons[i] = new Button();
                            panel.add(buttons[i]);
                            buttons[i].setBackground(Color.PINK);
                            buttons[i].setFont(new Font("Symbol BOLD", Font.BOLD, 60));

                    SpringLayout layout = new SpringLayout();

                  


            }
        }

        private  class Button extends JButton implements ActionListener {
                    boolean win;
                    public int draw=0;
                    public int winX=0;
                    public int winO=0;
                    String letter = "";
                    String X, O;
                    int option;

                    public Button() {
                            super();
                            letter = "";
                            X = "X";
                            O = "O";
                            setText(letter);
                            this.addActionListener(this);
                    }

                    public void actionPerformed(ActionEvent e) {

                            if (((count % 2) == 0) && (getText().equals("")) && (win == false)) {
                                    letter = X;
                                    count++;
                            } else if (((count % 2) == 1) && (getText().equals("")) && (win == false)) {
                                    letter = O;
                                    count++;
                            }

                            setText(letter);



                            for (int i = 0; i < 8; i++) {
                                    if (buttons[check[i][0]].getText().equals(buttons[check[i][1]].getText())
                                                    && buttons[check[i][1]].getText().equals(buttons[check[i][2]].getText())
                                                    && buttons[check[i][0]].getText() != "") {
                                            win = true;
                                    }
                            }

                            if (win == true) {
                                    option = JOptionPane.showConfirmDialog(null, letter + " wins! Play again?",
                                                    letter + " wins!", JOptionPane.YES_NO_OPTION);
                                    if (letter == X) {
                                            winX++;
                                            XScore.setText(String.valueOf(String.valueOf(winX)));

                                    } else {
                                            winO++;
                                            OScore.setText(String.valueOf(String.valueOf(winO)));

                                    }

                            } else if (count == 9 && win == false) {
                                    option = JOptionPane.showConfirmDialog(null, "Draw Game! Play again?", "It's a tie!",
                                                    JOptionPane.YES_NO_OPTION);
                                    win = true;
                                    draw++;

                                    DrawScore.setText(String.valueOf(String.valueOf(draw)));
                            }

                            if (option == JOptionPane.YES_OPTION && win == true) {
                                    reset();
                                    win = false;

                            } else if (option == JOptionPane.NO_OPTION) {
                                    System.exit(0);
                            }
                    }

            }

public void reset() {
		for (int i = 0; i < 9; i++) {
			buttons[i].setText("");
		}
		count = 0;
	}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        RightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        BotButton = new javax.swing.JButton();
        X = new javax.swing.JTextField();
        o = new javax.swing.JTextField();
        o1 = new javax.swing.JTextField();
        XScore = new javax.swing.JTextField();
        OScore = new javax.swing.JTextField();
        DrawScore = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RightPanel.setBackground(new java.awt.Color(244, 0, 240));
        RightPanel.setForeground(new java.awt.Color(240, 240, 0));
        RightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\Desktop\\tictactoe.jpg")); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleParent(RightPanel);

        LeftPanel.setBackground(new java.awt.Color(240, 240, 0));

        BotButton.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        BotButton.setText("Play with me!");
        BotButton.setToolTipText("");
        BotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotButtonActionPerformed(evt);
            }
        });

        X.setBackground(new java.awt.Color(240, 240, 0));
        X.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        X.setText("X:");

        o.setBackground(new java.awt.Color(240, 240, 0));
        o.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        o.setText("0:");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        o1.setBackground(new java.awt.Color(240, 240, 0));
        o1.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        o1.setText("Draw:");

        XScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XScoreActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\Desktop\\xo.png")); // NOI18N

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftPanelLayout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(BotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel2)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OScore, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(XScore)
                            .addComponent(DrawScore))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XScore, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DrawScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jLabel2.getAccessibleContext().setAccessibleParent(LeftPanel);

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oActionPerformed

    private void BotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotButtonActionPerformed
        TicTacToe t=new TicTacToe();
        t.NewScreen2();
    }//GEN-LAST:event_BotButtonActionPerformed

    private void XScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XScoreActionPerformed
    }//GEN-LAST:event_XScoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void NewScreen() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayFriend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFriend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFriend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFriend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFriend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BotButton;
    private javax.swing.JTextField DrawScore;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JTextField OScore;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JTextField X;
    public javax.swing.JTextField XScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField o;
    private javax.swing.JTextField o1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
