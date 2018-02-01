package com.awt.withinClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class AEvent extends Frame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3506835500039439455L;
	TextField tf;
AEvent()
{
	tf=new TextField();
	tf.setBounds(60,50,170,20);  
	Button b=new Button("click me");  
	b.setBounds(100,120,80,30);
	b.addActionListener(this);//passing current instance  
	  
	//add components and set size, layout and visibility  
	add(b);
	add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	}  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome to SMILES2");  
}  
public static void main(String args[]){  
new AEvent();  
}  
	
	

}
