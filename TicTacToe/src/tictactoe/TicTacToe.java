/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author maria

/**
 *
 * @author maria
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe {
	
	private JFrame frame;
	Component[] components;
	private static int countButtons = 0;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
               
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Tic-Tac-Toe");
                
             
         
                JButton button = new JButton("");
                button.setName("11");
                button.setBackground(Color.PINK);
                button.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
                button.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent arg0) {
                                    userValidate(button);
                                    pickButton();
                            }
		});
		button.setBounds(1, 1, 120, 120);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setName("12");
                 button_1.setBackground(Color.PINK);
                button_1.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_1);
				pickButton();
			}
		});
		button_1.setBounds(126, 1, 120, 120);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setName("13");
                 button_2.setBackground(Color.PINK);
                button_2.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_2);
				pickButton();
			}
		});
		button_2.setBounds(251, 1, 120, 120);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setName("21");
                 button_3.setBackground(Color.PINK);
                button_3.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_3);
				pickButton();
			}
		});
		button_3.setBounds(1, 126, 120, 120);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setName("22");
                 button_4.setBackground(Color.PINK);
                button_4.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_4);
				pickButton();
			}
		});
		button_4.setBounds(126, 126, 120, 120);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setName("23");
                 button_5.setBackground(Color.PINK);
                button_5.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_5);
				pickButton();
			}
		});
		button_5.setBounds(251, 126, 120, 120);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setName("31");
                 button_6.setBackground(Color.PINK);
                button_6.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_6);
				pickButton();
			}
		});
		button_6.setBounds(1, 251, 120, 120);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setName("32");
                 button_7.setBackground(Color.PINK);
                button_7.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_7);
				pickButton();
			}
		});
		button_7.setBounds(126, 251, 120, 120);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setName("33");
                 button_8.setBackground(Color.PINK);
                button_8.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userValidate(button_8);
				pickButton();
			}
		});
		button_8.setBounds(251, 251, 120, 120);
		frame.getContentPane().add(button_8);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(160, 376, 70, 30);
                
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		components = frame.getContentPane().getComponents();
	}
	
	private void userValidate(JButton b) {
		b.setText("X");
		b.setEnabled(false);
		countButtons++;
	}
	
	private void computerValidate(Component component) {
		((AbstractButton) component).setText("O");
		component.setEnabled(false);
		countButtons++;
	}
	
	
	private void pickButton() {
		if(components!=null) {
			Random rand = new Random();
			int n;
			while(true) {
				n=rand.nextInt(9);
				if(components[n] instanceof JButton && components[n].isEnabled()==true) {
					computerValidate(components[n]);
					break;
				}
				if(countButtons==9) {
					checkWin();
					if(textField.getText()=="")
						textField.setText("DRAW");
					break;
				}
			}
		}
	}
	
	int diag1x=0,diag2x=0,l1x=0,l2x=0,l3x=0,c1x=0,c2x=0,c3x=0;
	int diag1y=0,diag2y=0,l1y=0,l2y=0,l3y=0,c1y=0,c2y=0,c3y=0;
	private JTextField textField;
	
	private void checkWin() {
            
		if(components!=null) {
                    
		for(Component component : components) {
			if(component instanceof JButton) {
                            
				if(((JButton)component).getText().equals("X")){
					if(component.getName().equals("11")) {
						diag1x++;
						l1x++;
						c1x++;
					}
					if(component.getName().equals("12")) {
						l1x++;
						c2x++;
					}
					if(component.getName().equals("13")) {
						diag2x++;
						l1x++;
						c3x++;
					}
					if(component.getName().equals("21")) {
						l2x++;
						c1x++;
					}
					if(component.getName().equals("22")) {
						diag1x++;
						diag2x++;
						l2x++;
						c2x++;
					}
					if(component.getName().equals("23")) {
						l2x++;
						c3x++;
					}
					if(component.getName().equals("31")) {
						diag2x++;
						l3x++;
						c1x++;
					}
					if(component.getName().equals("32")) {
						l3x++;
						c2x++;
					}
					if(component.getName().equals("33")){
						l3x++;
						c3x++;
						diag1x++;
					}
				}
				if(((JButton)component).getText().equals("O")){
					if(component.getName().equals("11")) {
						diag1y++;
						l1y++;
						c1y++;
					}
					if(component.getName().equals("12")) {
						l1y++;
						c2y++;
					}
					if(component.getName().equals("13")) {
						diag2y++;
						l1y++;
						c3y++;
					}
					if(component.getName().equals("21")) {
						l2y++;
						c1y++;
					}
					if(component.getName().equals("22")) {
						diag1y++;
						diag2y++;
						l2y++;
						c2y++;
					}
					if(component.getName().equals("23")) {
						l2y++;
						c3y++;
					}
					if(component.getName().equals("31")) {
						diag2y++;
						l3y++;
						c1y++;
					}
					if(component.getName().equals("32")) {
						l3y++;
						c2y++;
					}
					if(component.getName().equals("33")){
						l3y++;
						c3y++;
						diag1y++;
					}
				}
			}
		}
		if(diag1x==3 || diag2x==3 || l1x==3 || l2x==3 || l3x==3 || c1x==3 || c2x==3 || c3x==3) {
			textField.setText("X WON");
                        
		}
		if(diag1y==3 || diag2y==3 || l1y==3 || l2y==3 || l3y==3 || c1y==3 || c2y==3 || c3y==3) {
			textField.setText("O WON");
		}
                else
                    textField.setText("Draw!");
		}
	}
}
