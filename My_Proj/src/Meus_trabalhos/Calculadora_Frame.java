package Meus_trabalhos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Inter_Gráfica.Screen;

public class Calculadora_Frame extends JFrame implements ActionListener{
	JButton numButton[]=new JButton[10];
	JButton jsinal[]=new JButton[7];

	JButton addButton,multButton,divButton,subButton;
	JButton equButton,delButton,clrButton;
	
	JTextField text;
	Font myFont=new Font("Arial",Font.BOLD,25);
	int num1,num2,result=0;
	char op;
	 Calculadora_Frame(){
		 
		setSize(370,500);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		
		JPanel panel=new JPanel();
		panel.setBounds(40,125,280,250);
		panel.setLayout(new GridLayout(5,6,18,10));
		
		addButton=new JButton("+");
		subButton=new JButton("-");
		multButton=new JButton("x");
		divButton=new JButton("/");
		clrButton=new JButton("Clear");
		delButton=new JButton("Delete");
		equButton=new JButton("=");
		
		jsinal[0]=addButton;
		jsinal[1]=subButton;
		jsinal[2]=divButton;
		jsinal[3]=multButton;
		jsinal[4]=equButton;
		jsinal[5]=delButton;
		jsinal[6]=clrButton;
		
		for(int i=0;i<7;i++) {
			jsinal[i].setFont(myFont);
			jsinal[i].setFocusable(false);
			jsinal[i].addActionListener(this);
		}
		for(int i=0;i<10;i++) {
			numButton[i]=new JButton(String.valueOf(i));
			//numButton[i].setBounds(5,10,6,3);
			numButton[i].setFont(myFont);
			numButton[i].setFocusable(false);
			numButton[i].addActionListener(this);
		}
		panel.add(numButton[1]);
		panel.add(numButton[2]);
		
		panel.add(numButton[3]);
		
		panel.add(numButton[4]);
		
		panel.add(numButton[5]);
		panel.add(numButton[6]);
		
		panel.add(numButton[7]);
		panel.add(numButton[8]);
		panel.add(numButton[9]);
		panel.add(addButton);
		panel.add(numButton[0]);
		panel.add(subButton);
		panel.add(equButton);
		panel.add(multButton);
		panel.add(divButton);
		
		clrButton.addActionListener(this);
		clrButton.setBounds(40,392,130,45);
	    
	    delButton.addActionListener(this);
		delButton.setBounds(187,392,132,45);
	   
		
		
		
		text=new JTextField();
		text.setBounds(40,40,280,55);
		text.setFont(new Font("Arial",Font.PLAIN,25));
		//text.setEditable(false);
		
		add(panel);
		add(delButton);
		add(clrButton);
	    add(text);
		setVisible(true);
		
	 }
	 
	 public static void main(String[] args) {
			new Calculadora_Frame();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<10;i++) {
			if(e.getSource()==numButton[i]) {
				text.setText(text.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==addButton) {
			num1=Integer.parseInt(text.getText());
			op='+';
			text.setText("");
			
		}
		if(e.getSource()==subButton) {
			num1=Integer.parseInt(text.getText());
			text.setText("");
			op='-';
		}
		if(e.getSource()==multButton) {
			num1=Integer.parseInt(text.getText());
			text.setText("");
			op='x';
		}
		if(e.getSource()==divButton) {
			num1=Integer.parseInt(text.getText());
			text.setText("");
			op='/';
		}
		if(e.getSource()==equButton) {
			num2=Integer.parseInt(text.getText());
			switch(op) {
			
			case '+':
				result=num1+num2;
				break;
				
			case '-':
				result=num1-num2;
				break;
				
			case 'x':
				result=num1*num2;
				break;
			
			case '/':
				result=num1/num2;
				break;
			} 
			
			text.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			text.setText("");
		}
		if(e.getSource()==delButton) {
			String str=text.getText();
			text.setText("");
			for(int i=0;i<str.length()-1;i++) {
				text.setText(text.getText()+str.charAt(i));
			}
		}
	}
	
	 
	
	 
	

}
