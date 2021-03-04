package tictactoe;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TicTacToe implements ActionListener {
	
	Random random = new Random(); //savoire qui va comencé randomly
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();// panel hold Title
	JPanel buttons_panel = new JPanel();//panel who hold all buttons we have
	JLabel textfield = new JLabel();//textfield to display message of some sort
	JButton[] buttons = new JButton[9];//array of buttons ( 9 buttons in this case )
	boolean player1_turn; //
	
	
	TicTacToe() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout()); //faire des bordre 
		frame.setVisible(true);
		
		//le text dernah f label
		textfield.setBackground(new Color(25,25,25));//color dial background more text
		textfield.setForeground(new Color(25,255,0));//color dial text
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);//ra nhtouha f lwesst hit khdamin b BorderLayout , alor howa kayht finma briti
		textfield.setText("Tic Tac Toe");
		textfield.setOpaque(true);
		
		//Panel li gha ndiro fih label (textfield) li fiha titre
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,600,100);//blassa o size dial panel
		
		
		buttons_panel.setLayout(new GridLayout(3,3));//nfr9o 1 panel l 9 dial l7oudod(layout) carré;
		buttons_panel.setBackground(new Color(150,150,150));
		
		//add buttons in buttons_Panel
		
		for (int i = 0; i < 9; i++)
		{
			buttons[i] = new JButton();
			buttons_panel.add(buttons[i]);//ajouter les 9 buttons dans le Panel
			buttons[i].setFont(new Font("MB Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);//ajouter label f panel
		frame.add(title_panel,BorderLayout.NORTH);//ajouter panel f Frame and "borderLayout.North" hit khdamin b borderLayout il manage la palce
		frame.add(buttons_panel);
		
		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//check all our 9 buttons
		for (int i = 0; i < 9 ; i++) {
			
			if(e.getSource()== buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn =false;
						textfield.setText("O turn");
						check();
					}
				}else {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn =true;
						textfield.setText("X turn");
						check();
					
				}
				}
			}
			}
		
	}
	
	// Whos turn is First ??
	public void firstTurn()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (random.nextInt(2) == 0) {
			player1_turn = true;
			textfield.setText("X turn ");
		}else
		{
			player1_turn = false;
		  	textfield.setText("O turn ");
		}
	}
	//who's wonn
	public void check()
	{
		//check X win condition
		if(
				(buttons[0].getText()=="X") &&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X")
				) {
					xWins(0,1,2);
				}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X")
				) 
				{
					xWins(3,4,5);
				}
		if(
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
					xWins(6,7,8);
					}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
					xWins(0,3,6);
					}
		if(
				(buttons[1].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[7].getText()=="X")
				) {
					xWins(1,4,7);
					}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
					xWins(2,5,8);
					}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
					xWins(0,4,8);
					}
		
		
		if(
				(buttons[2].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
					xWins(2,4,6);
					}
		
		
		//check O win conditions
		if(
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O")
				) {
					oWins(0,1,2);
					}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O")
				) {
					oWins(3,4,5);
					}
		if(
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
					oWins(6,7,8);
					}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
					oWins(0,3,6);
					}
		if(
				(buttons[1].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[7].getText()=="O")
				) {
					oWins(1,4,7);
					}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
					oWins(2,5,8);
					}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
					oWins(0,4,8);
					}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
					oWins(2,4,6);
					}
		String alle = "";
		for (int i = 0; i < buttons.length; i++) {
			alle += buttons[i].getText();
		}
		if(alle.length() > 8) 
		{
			int x = JOptionPane.showConfirmDialog(frame, "SPIEL VORBEI. Nochmal","GAME OVER", JOptionPane.YES_NO_OPTION);
			if( x == 1)
				
			
				new TicTacToe();
				frame.dispose();
				
		}
		
	}
	
	
	
	// if X winns
	
	public void xWins(int a,int b ,int c)
	{
		buttons[a].setBackground(Color.GREEN);//change la couleur d le boutton 
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);//faire disable toutes les buttons 
		}
		textfield.setText("X wins");
		textfield.setBackground(Color.GREEN);
		textfield.setForeground(new Color(0,0,0));
		
		
	
		
	}
	
	// if O winns
	public void oWins(int a,int b ,int c)
	{
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O wins");
		textfield.setBackground(Color.green);
		textfield.setForeground(new Color(0,0,0));
	}
			
	

	

}
