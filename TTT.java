import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TTT implements ActionListener{
	
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel title_panel=new JPanel();
	JPanel button_panel=new JPanel();
	JLabel textfield=new JLabel();
	JButton[] buttons=new JButton[9];
	boolean player1_turn=true;		//if false, it is player2 turn
	
	//Constructor
	TTT(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Int Free",Font.BOLD,50));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("TIC TAC TOE");
		textfield.setOpaque(true);
		//textfield is going to be added to the title panel, which will be added to the frame
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,600,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("Int Free",Font.ITALIC,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setText("O");
						player1_turn=false;
						textfield.setText("Player 2 turn");
						check();
					}
				}
				else {
						if(buttons[i].getText()=="") {
							buttons[i].setText("X");
							player1_turn=true;
							textfield.setText("Player 1 turn");
							check();
						}
				}
			}
			
		}
		
	}
	
	//who plays first
	public void firstTurn() {
		
		//to add delay before the turn is assigned to a player
		try {
			Thread.sleep(5000);		//5 secs delay
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("Player 1 turn");
		}
		else {
			player1_turn=false;
			textfield.setText("Player 2 turn");
		}
	}
	
	//checking winning conditions
	public void check() {
		
		//check x wins
		if((buttons[0].getText()=="X")&&(buttons[1].getText()=="X")&&(buttons[2].getText()=="X")) {
			xWins(0,1,2);
		}
		if((buttons[3].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[5].getText()=="X")) {
			xWins(3,4,5);
		}
		if((buttons[6].getText()=="X")&&(buttons[7].getText()=="X")&&(buttons[8].getText()=="X")) {
			xWins(6,7,8);
		}
		if((buttons[0].getText()=="X")&&(buttons[3].getText()=="X")&&(buttons[6].getText()=="X")) {
			xWins(0,3,6);
		}
		if((buttons[1].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[7].getText()=="X")) {
			xWins(1,4,7);
		}
		if((buttons[2].getText()=="X")&&(buttons[5].getText()=="X")&&(buttons[8].getText()=="X")) {
			xWins(2,5,8);
		}
		if((buttons[0].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[8].getText()=="X")) {
			xWins(0,4,8);
		}
		if((buttons[2].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[6].getText()=="X")) {
			xWins(2,4,6);
		}
		
		//check o wins
		if((buttons[0].getText()=="O")&&(buttons[1].getText()=="O")&&(buttons[2].getText()=="O")) {
			oWins(0,1,2);
		}
		if((buttons[3].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[5].getText()=="O")) {
			oWins(3,4,5);
		}
		if((buttons[6].getText()=="O")&&(buttons[7].getText()=="O")&&(buttons[8].getText()=="O")) {
			oWins(6,7,8);
		}
		if((buttons[0].getText()=="O")&&(buttons[3].getText()=="O")&&(buttons[6].getText()=="O")) {
			oWins(0,3,6);
		}
		if((buttons[1].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[7].getText()=="O")) {
			oWins(1,4,7);
		}
		if((buttons[2].getText()=="O")&&(buttons[5].getText()=="O")&&(buttons[8].getText()=="O")) {
			oWins(2,5,8);
		}
		if((buttons[0].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[8].getText()=="O")) {
			oWins(0,4,8);
		}
		if((buttons[2].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[6].getText()=="O")) {
			oWins(2,4,6);
		}
		
	}
	
	public void xWins(int a, int b, int c){
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=1;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		
		textfield.setText("Player 2 wins");
		
	}
	
	public void oWins(int a, int b, int c){
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=1;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		
		textfield.setText("Player 1 wins");
		
	}
}
