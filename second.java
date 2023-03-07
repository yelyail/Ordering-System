package cceProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class second extends JFrame implements ActionListener{
	
	//frames and designs
		JFrame ordFr;
	//--------------------------------------------------------------------------------------------------------
		JLabel amer1, espres1, capp1, vL1, cL1, ecp1, cm1, aff1, frap1;
		JLabel AmPrice, EsPrice, capPrice, vlPrice, clPrice, ecpPrice, cmPrice, affPrice, frapPrice; 
		JButton next, cancel, orderList;
		JPanel amer, espres, capp, vL, cL, ecp, cm, aff, frap;
		ImageIcon img, img1, img2, img3, img4, img5, img6, img7, img8;
//-------------------------------------------------------------------------------------------------
		//settings for another frames
		JPanel ordPan;
		JLabel amTxt;	
		JButton amLeft, amRight, returnButton, add;
		JTextField text;
	
		int price;
		int ordNum = 0;
		int quan=1;
		int total;
		String ordTxt;
	//-----------------------------------------------------------------------------------------------------------------
	first f;
	second(first f)
	{
		this.f = f;
		//methods-------------------------------------------------------------------------------------------------------------
		side();
		center();
		rightSide();
		
		//frame setting 
		new JFrame();
		setSize(1000, 800);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(new Color(0xceb19c));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//-----------------------------------------------------------------------------------------------------------------
		next= new JButton("NEXT");
		next.setFont(new Font("Arial", Font.BOLD, 16));
		next.setBackground(new Color(0x7c573e));
		next.setForeground(Color.white);
		next.setBounds(870, 600, 100, 50);
		next.setBorderPainted(false);
		next.setFocusable(false);
		next.addActionListener(this);
//--------------------------------------------------------------------------------------------		

		cancel= new JButton("CANCEL");
		cancel.setFont(new Font("Arial", Font.BOLD, 16));
		cancel.setBackground(new Color(0x7c573e));
		cancel.setForeground(Color.white);
		cancel.setBounds(870, 670, 100, 50);
		cancel.setBorderPainted(false);
		cancel.setFocusable(false);
		cancel.addActionListener(this);
//-------------------------------------------------------------------------------------------
		orderList= new JButton("ORDER LIST");
		orderList.setFont(new Font("Arial", Font.BOLD, 16));
		orderList.setBackground(new Color(0x7c573e));
		orderList.setForeground(Color.white);
		orderList.setBounds(830, 10, 130, 50);
		orderList.setBorderPainted(false);
		orderList.setFocusable(false);
		orderList.addActionListener(this);
//-------------------------------------------------------------------------------------------
		//adding to frame panel
		add(amer);
		add(espres);
		add(capp);
		add(vL);
		add(cL);
		add(ecp);
		add(cm);
		add(aff);
		add(frap);
		add(next);
		add(cancel);
		add(orderList);
		setVisible(true);
	}
		
	public void side()
	{
		//1st choice
//---------------------------------------------------------------------------------------------------
		amer = new JPanel();
		amer.setBounds(30, 50, 250, 200);
		amer.setLayout(null);
		amer.setBackground(new Color(0xb48768));

		img = new ImageIcon("Americano.jpg");
		amer1 = new JLabel();
		amer1.setIcon(img);
		amer1.setBounds(10, 10, 100, 150);
		amer.add(amer1);
		
		amer1= new JLabel("Americano");
		amer1.setForeground(Color.BLACK);
		amer1.setFont(new Font("Constantia", Font.PLAIN, 20));
		amer1.setBounds(130, 10, 100, 100);
		amer.add(amer1);
		
		f.button[1] = new JButton("ADD");
		f.button[1].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[1].setBackground(new Color(0x7c573e));
		f.button[1].setForeground(Color.white);
		f.button[1].setBounds(160, 140, 70, 50);
		f.button[1].setBorderPainted(false);
		f.button[1].setFocusable(false);
		f.button[1].addActionListener(this);
		amer.add(f.button[1]);
		
		AmPrice = new JLabel("Php 149.00");
		AmPrice.setForeground(Color.BLACK);
		AmPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		AmPrice.setBounds(130, 40, 100, 100);
		amer.add(AmPrice);
		
		f.stockText[1] = new JLabel();
		f.stockText[1].setText("Stock: " + f.tempStock[1]);
		f.stockText[1].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[1].setForeground(Color.WHITE);
		f.stockText[1].setBounds(20, 130, 100, 100);
		amer.add(f.stockText[1]);
//---------------------------------------------------------------------------------------------------
		//2nd choice
//---------------------------------------------------------------------------------------------------
		espres = new JPanel();
		espres.setBounds(30, 270, 250, 200);
		espres.setLayout(null);
		espres.setBackground(new Color(0xb48768));

		img1 = new ImageIcon("es.jpg");
		espres1 = new JLabel();
		espres1.setBounds(10, 40, 100, 100);
		espres1.setIcon(img1);
		espres.add(espres1);
		
		espres1= new JLabel("Espresso");
		espres1.setForeground(Color.BLACK);
		espres1.setFont(new Font("Constantia", Font.PLAIN, 20));
		espres1.setBounds(130, 10, 100, 100);
		espres.add(espres1);
		
		f.button[2] = new JButton("ADD");
		f.button[2].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[2].setBackground(new Color(0x7c573e));
		f.button[2].setForeground(Color.white);
		f.button[2].setBounds(160, 140, 70, 50);
		f.button[2].setBorderPainted(false);
		f.button[2].setFocusable(false);
		f.button[2].addActionListener(this);
		espres.add(f.button[2]);
		
		EsPrice = new JLabel("Php 175.00");
		EsPrice.setForeground(Color.BLACK);
		EsPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		EsPrice.setBounds(130, 40, 100, 100);
		espres.add(EsPrice);
		
		f.stockText[2] = new JLabel("Stock: " + f.tempStock[2]);
		f.stockText[2].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[2].setForeground(Color.WHITE);
		f.stockText[2].setBounds(20, 130, 100, 100);
		espres.add(f.stockText[2]);
//--------------------------------------------------------------------------------------------
		//3rd choice
//---------------------------------------------------------------------------------------------------
		capp = new JPanel();
		capp.setBounds(30, 500, 250, 200);
		capp.setLayout(null);
		capp.setBackground(new Color(0xb48768));

		img2 = new ImageIcon("cappucino.jpg");
		capp1= new JLabel();
		capp1.setBounds(10, 40, 100, 100);
		capp1.setIcon(img2);
		capp.add(capp1);
				
		capp1= new JLabel("Cappucino");
		capp1.setForeground(Color.BLACK);
		capp1.setFont(new Font("Constantia", Font.PLAIN, 20));
		capp1.setBounds(130, 10, 100, 100);
		capp.add(capp1);
				
		f.button[3] = new JButton("ADD");
		f.button[3].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[3].setBackground(new Color(0x7c573e));
		f.button[3].setForeground(Color.white);
		f.button[3].setBounds(160, 140, 70, 50);
		f.button[3].setBorderPainted(false);
		f.button[3].setFocusable(false);
		f.button[3].addActionListener(this);
		capp.add(f.button[3]);
		
		capPrice = new JLabel("Php 180.00");
		capPrice.setForeground(Color.BLACK);
		capPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		capPrice.setBounds(130, 40, 100, 100);
		capp.add(capPrice);
		
		f.stockText[3] = new JLabel("Stock: " + f.tempStock[3]);
		f.stockText[3].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[3].setForeground(Color.WHITE);
		f.stockText[3].setBounds(20, 130, 100, 100);
		capp.add(f.stockText[3]);
		
//--------------------------------------------------------------------------------------------		
		}
	
	public void center()
	{
		//4th choice
//-------------------------------------------------------------------------------------------------------------------
			vL = new JPanel();
			vL.setBounds(300, 49, 250, 200);
			vL.setLayout(null);
			vL.setBackground(new Color(0xb48768));
			
			img3 = new ImageIcon("Vanilla Latte.jpg");
			vL1 = new JLabel();
			vL1.setBounds(10, 30, 120, 120);
			vL1.setIcon(img3);
			vL.add(vL1);
			
			vL1= new JLabel("Vanilla Latte");
			vL1.setForeground(Color.BLACK);
			vL1.setFont(new Font("Constantia", Font.PLAIN, 17));
			vL1.setBounds(120, 10, 100, 100);
			vL.add(vL1);
			
			f.button[4] = new JButton("ADD");
			f.button[4].setFont(new Font("Arial", Font.BOLD, 16));
			f.button[4].setBackground(new Color(0x7c573e));
			f.button[4].setForeground(Color.white);
			f.button[4].setBounds(160, 140, 70, 50);
			f.button[4].setBorderPainted(false);
			f.button[4].setFocusable(false);
			f.button[4].addActionListener(this);
			vL.add(f.button[4]);
			
			vlPrice = new JLabel("Php 190.00");
			vlPrice.setForeground(Color.BLACK);
			vlPrice.setFont(new Font("Constantia", Font.PLAIN,16));
			vlPrice.setBounds(120, 40, 100, 100);
			vL.add(vlPrice);
			
			f.stockText[4] = new JLabel("Stock: " + f.tempStock[4]);
			f.stockText[4].setFont(new Font("Constantia",Font.PLAIN,20));
			f.stockText[4].setForeground(Color.WHITE);
			f.stockText[4].setBounds(20, 130, 100, 100);
			vL.add(f.stockText[4]);
//--------------------------------------------------------------------------------------------------------------------
			//5th choice
//-------------------------------------------------------------------------------------------------------------------
			cL = new JPanel();
			cL.setBounds(300, 270, 250, 200);
			cL.setLayout(null);
			cL.setBackground(new Color(0xb48768));
						
			img4 = new ImageIcon("Caffee Latte.jpg");
			cL1 = new JLabel();
			cL1.setBounds(10, 30, 120, 120);
			cL1.setIcon(img4);
			cL.add(cL1);
						
			cL1= new JLabel("Cafe Latte");
			cL1.setForeground(Color.BLACK);
			cL1.setFont(new Font("Constantia", Font.PLAIN, 20));
			cL1.setBounds(135, 10, 100, 100);
			cL.add(cL1);
			
			f.button[5]= new JButton("ADD");
			f.button[5].setFont(new Font("Arial", Font.BOLD, 16));
			f.button[5].setBackground(new Color(0x7c573e));
			f.button[5].setForeground(Color.white);
			f.button[5].setBounds(160, 140, 70, 50);
			f.button[5].setBorderPainted(false);
			f.button[5].setFocusable(false);
			f.button[5].addActionListener(this);
			cL.add(f.button[5]);
			
			clPrice = new JLabel("Php 200.00");
			clPrice.setForeground(Color.BLACK);
			clPrice.setFont(new Font("Constantia", Font.PLAIN,16));
			clPrice.setBounds(135, 40, 100, 100);
			cL.add(clPrice);
			
			f.stockText[5] = new JLabel("Stock: " + f.tempStock[5]);
			f.stockText[5].setFont(new Font("Constantia",Font.PLAIN,20));
			f.stockText[5].setForeground(Color.WHITE);
			f.stockText[5].setBounds(20, 130, 100, 100);
			cL.add(f.stockText[5]);
//--------------------------------------------------------------------------------------------------------------------			
			//6th choice
//-------------------------------------------------------------------------------------------------------------------
			ecp = new JPanel();
			ecp.setBounds(300, 500, 250, 200);
			ecp.setLayout(null);
			ecp.setBackground(new Color(0xb48768));
						
			img5 = new ImageIcon("Doppio.jpg");
			ecp1 = new JLabel();
			ecp1.setBounds(10, 30, 120, 120);
			ecp1.setIcon(img5);
			ecp.add(ecp1);
						
			ecp1= new JLabel("Doppio");
			ecp1.setForeground(Color.BLACK);
			ecp1.setFont(new Font("Constantia", Font.PLAIN, 20));
			ecp1.setBounds(135, 10, 100, 100);
			ecp.add(ecp1);
						
			f.button[6]= new JButton("ADD");
			f.button[6].setFont(new Font("Arial", Font.BOLD, 16));
			f.button[6].setBackground(new Color(0x7c573e));
			f.button[6].setForeground(Color.white);
			f.button[6].setBounds(160, 140, 70, 50);
			f.button[6].setBorderPainted(false);
			f.button[6].setFocusable(false);
			f.button[6].addActionListener(this);
			ecp.add(f.button[6]);
			
			ecpPrice = new JLabel("Php 190.00");
			ecpPrice.setForeground(Color.BLACK);
			ecpPrice.setFont(new Font("Constantia", Font.PLAIN,16));
			ecpPrice.setBounds(135, 40, 100, 100);
			ecp.add(ecpPrice);
			
			f.stockText[6] = new JLabel("Stock: " + f.tempStock[6]);
			f.stockText[6].setFont(new Font("Constantia",Font.PLAIN,20));
			f.stockText[6].setForeground(Color.WHITE);
			f.stockText[6].setBounds(20, 130, 100, 100);
			ecp.add(f.stockText[6]);
//--------------------------------------------------------------------------------------------
	}
	public void rightSide()
	{
		//7th choice
//-------------------------------------------------------------------------------------------------------------------
		cm = new JPanel();
		cm.setBounds(570, 50, 250, 200);
		cm.setLayout(null);
		cm.setBackground(new Color(0xb48768));
					
		img6 = new ImageIcon("caramel macchiato.jpg");
		cm1 = new JLabel();
		cm1.setBounds(10, 30, 120, 120);
		cm1.setIcon(img6);
		cm.add(cm1);
					
		cm1= new JLabel("Caramel Macchiato");
		cm1.setForeground(Color.BLACK);
		cm1.setFont(new Font("Constantia", Font.PLAIN, 20));
		cm1.setBounds(80, 10, 200, 100);
		cm.add(cm1);
		
		f.button[7]= new JButton("ADD");
		f.button[7].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[7].setBackground(new Color(0x7c573e));
		f.button[7].setForeground(Color.white);
		f.button[7].setBounds(160, 140, 70, 50);
		f.button[7].setBorderPainted(false);
		f.button[7].setFocusable(false);
		f.button[7].addActionListener(this);
		cm.add(f.button[7]);
		
		cmPrice = new JLabel("Php 220.00");
		cmPrice.setForeground(Color.BLACK);
		cmPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		cmPrice.setBounds(100, 40, 100, 100);
		cm.add(cmPrice);
		
		f.stockText[7] = new JLabel("Stock: " + f.tempStock[7]);
		f.stockText[7].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[7].setForeground(Color.WHITE);
		f.stockText[7].setBounds(20, 130, 100, 100);
		cm.add(f.stockText[7]);
//--------------------------------------------------------------------------------------------
		//8th choice
//-------------------------------------------------------------------------------------------------------------------
		aff = new JPanel();
		aff.setBounds(570, 270, 250, 200);
		aff.setLayout(null);
		aff.setBackground(new Color(0xb48768));
					
		img7 = new ImageIcon("Affogato.jpg");
		aff1 = new JLabel();
		aff1.setBounds(10, 30, 120, 120);
		aff1.setIcon(img7);
		aff.add(aff1);
					
		aff1= new JLabel("Affogato");
		aff1.setForeground(Color.BLACK);
		aff1.setFont(new Font("Constantia", Font.PLAIN, 20));
		aff1.setBounds(100, 10, 200, 100);
		aff.add(aff1);
		
		f.button[8]= new JButton("ADD");
		f.button[8].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[8].setBackground(new Color(0x7c573e));
		f.button[8].setForeground(Color.white);
		f.button[8].setBounds(160, 140, 70, 50);
		f.button[8].setBorderPainted(false);
		f.button[8].setFocusable(false);
		f.button[8].addActionListener(this);
		aff.add(f.button[8]);
		
		affPrice = new JLabel("Php 240.00");
		affPrice.setForeground(Color.BLACK);
		affPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		affPrice.setBounds(100, 40, 100, 100);
		aff.add(affPrice);
		
		f.stockText[8] = new JLabel("Stock: " + f.tempStock[8]);
		f.stockText[8].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[8].setForeground(Color.WHITE);
		f.stockText[8].setBounds(20, 130, 100, 100);
		aff.add(f.stockText[8]);
//--------------------------------------------------------------------------------------------	
		//9th choice
//-------------------------------------------------------------------------------------------------------------------
		frap = new JPanel();
		frap.setBounds(570,500, 250, 200);
		frap.setLayout(null);
		frap.setBackground(new Color(0xb48768));
					
		img8 = new ImageIcon("Frappucino.jpg");
		frap1 = new JLabel();
		frap1.setBounds(10, 30, 120, 120);
		frap1.setIcon(img8);
		frap.add(frap1);
					
		frap1= new JLabel("Frappuccino");
		frap1.setForeground(Color.BLACK);
		frap1.setFont(new Font("Constantia", Font.PLAIN, 20));
		frap1.setBounds(100, 10, 200, 100);
		frap.add(frap1);
		
		f.button[9]= new JButton("ADD");
		f.button[9].setFont(new Font("Arial", Font.BOLD, 16));
		f.button[9].setBackground(new Color(0x7c573e));
		f.button[9].setForeground(Color.white);
		f.button[9].setBounds(160, 140, 70, 50);
		f.button[9].setBorderPainted(false);
		f.button[9].setFocusable(false);
		f.button[9].addActionListener(this);
		frap.add(f.button[9]);
		
		frapPrice = new JLabel("Php 250.00");
		frapPrice.setForeground(Color.BLACK);
		frapPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		frapPrice.setBounds(100, 40, 100, 100);
		frap.add(frapPrice);
		
		f.stockText[9] = new JLabel("Stock: " + f.tempStock[9]);
		f.stockText[9].setFont(new Font("Constantia",Font.PLAIN,20));
		f.stockText[9].setForeground(Color.WHITE);
		f.stockText[9].setBounds(20, 130, 100, 100);
		frap.add(f.stockText[9]);
//--------------------------------------------------------------------------------------------			
	
	}

//-------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
	public void buttons(ActionEvent e) {
		// Buttons
		if(e.getSource() == f.button[1])
		{
			ordNum = 1; order();
		}
		if(e.getSource() == f.button[2])
		{
			ordNum = 2; order();
		}
		if(e.getSource() == f.button[3])
		{
			ordNum = 3; order();
		}
		if(e.getSource() == f.button[4])
		{
			ordNum = 4; order();
		}
		if(e.getSource() == f.button[5])
		{
			ordNum = 5; order();
		}
		if(e.getSource() == f.button[6])
		{
			ordNum = 6; order();
		}
		if(e.getSource() == f.button[7])
		{
			ordNum = 7; order();
		}
		if(e.getSource() == f.button[8])
		{
			ordNum = 8; order();
		}
		if(e.getSource() == f.button[9])
		{
			ordNum = 9; order();
		}
		if(e.getSource() == cancel) {
			Frame[] frames = Frame.getFrames();	
			for (Frame frame : frames) {
				    frame.dispose();
				}
			JOptionPane.showMessageDialog(null, "THANK YOU FOR DINING");
		}
		if(e.getSource() == orderList) {
			new Cart(f);
		}
		if(e.getSource() == add) {
			ordFr.dispose();
		}
		if(e.getSource() == returnButton) {
			ordFr.dispose();
		}
		next.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				third s = new third(f);
				s.setVisible(true);
			}
	
		});
	
	}

	public void order()
	{
		quan =1;
		ordFr = new JFrame();
		ordFr.setSize(400, 400);
		ordFr.getContentPane().setBackground(new Color(0xceb19c));
		ordFr.setResizable(false);
		ordFr.setLayout(null);
		ordFr.setLocationRelativeTo(null);
//----------------------------------------------------------------		
		switch(ordNum) {
		case 1: price = 149; ordTxt = "Americano\t"; break;
		case 2: price = 175; ordTxt = "Espresso\t"; break;
		case 3: price = 180; ordTxt = "Cappucino  "; break;
		case 4: price = 190; ordTxt = "Vanilla Latte "; break;
		case 5: price = 200; ordTxt = "Cafe Latte "; break;
		case 6: price = 190; ordTxt = "Doppio\t"; break;
		case 7: price = 220; ordTxt = "Caramel Macchiato"; break;
		case 8: price = 240; ordTxt = "Affogato\t"; break;
		case 9: price = 250; ordTxt = "Frappuccino"; break;
		}
		ordFr.setTitle(ordTxt);
				
		//background panel
		ordPan = new JPanel();
		ordPan.setBounds(0, 0, 400, 400);
		ordPan.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
		ordPan.setBorder(BorderFactory.createEtchedBorder());
		ordPan.setBackground(new Color(0xceb19c));
		
		//displaying txt for quantity
		amTxt = new JLabel("QUANTITY");
		amTxt.setForeground(Color.BLACK);
		amTxt.setFont(new Font ("Tahoma", Font.BOLD,20));
		ordPan.add(amTxt);
		
			amLeft  = new JButton("<");
			amLeft.setFont(new Font("Tahoma", Font.BOLD,20));
			amLeft.setBackground(new Color(0xb48768));
			amLeft.setForeground(Color.white);
			amLeft.setBounds(40, 120, 50, 50);
			amLeft.setBorder(BorderFactory.createEtchedBorder());
			amLeft.setFocusable(false);
			amLeft.addActionListener(this);
			
			amRight = new JButton(">");
			amRight.setFont(new Font("Tahoma", Font.BOLD,20));
			amRight.setBackground(new Color(0xb48768));
			amRight.setForeground(Color.white);
			amRight.setBounds(300, 120, 50, 50);
			amRight.setBorder(BorderFactory.createEtchedBorder());
			amRight.setFocusable(false);
			amRight.addActionListener(this);
				
				returnButton = new JButton("RETURN");
				returnButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				returnButton.setBounds(220, 260, 100, 50);
				returnButton.setBackground(new Color(0x7c573e));
				returnButton.setForeground(Color.WHITE);
				returnButton.setBorder(BorderFactory.createEtchedBorder());
				returnButton.setFocusable(false);
				returnButton.addActionListener(this);
				
				add = new JButton("ADD");
				add.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add.setBounds(60, 260, 100, 50);
				add.setBackground(new Color(0x7c573e));
				add.setForeground(Color.white);
				add.setBorder(BorderFactory.createEtchedBorder());
				add.setFocusable(false);
				add.addActionListener(this);
//---------------------------------------------------------------------------------------					
				JTextField text = new JTextField();
				text.setBounds(160, 120, 80,50);
				text.setEditable(false);
				text.setFont(new Font("Courier New",Font.BOLD,30));
				text.setText(String.valueOf(quan));
				text.setHorizontalAlignment(JTextField.CENTER);
					
						amLeft.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent event)
									{
										if (quan > 0)
										{
											quan -= 1;
											text.setText(String.valueOf(quan));
										}
									}
								});
						amRight.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent event)
									{
										quan += 1;
										text.setText(String.valueOf(quan));
									}
								});
//--------------------------------------------------------------------------------------------------------------------------------
					//add to frame
					ordFr.add(text);
					ordFr.add(amLeft);
					ordFr.add(amRight);
					ordFr.add(returnButton);
					ordFr.add(add);
					ordFr.add(ordPan);
					ordFr.setVisible(true);
	}

	//STOCKS
	private void stocks(int i ) {
		if(f.tempStock[i] == 0) {
			switch(i) {
				case 1 -> infoStock("AMERICANO", 1);
				case 2 -> infoStock("ESPRESSO", 2);
				case 3 -> infoStock("CAPUCCINO", 3);
				case 4 -> infoStock("VANILLA LATTE", 4);
				case 5 -> infoStock("CAFE LATTE", 5);
				case 6 -> infoStock("DOPPIO", 6);
				case 7 -> infoStock("CARAMEL MACCHIATO", 7);
				case 8 -> infoStock("AFOGATO", 8);
				case 9 -> infoStock("FRAPUCCINO", 9);
			}
		} else if(f.tempStock[i] < quan) {
			JOptionPane.showMessageDialog(null, "NOT ENOUGH STOCK!");
		} else {
			f.tempStock[i] -= quan;
			f.stockText[i].setText("Stock: " + f.tempStock[i]);
			cart();
		}
	}
	private void infoStock(String order, int i) {
			JOptionPane.showMessageDialog(null, order + " IS OUT OF STOCK!"); 
			f.button[i].setEnabled(false);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		buttons(e);
		if (e.getSource() == add) {
			ordFr.dispose();
			for(int i = 1; i < 10; i++) {
				if(i == ordNum) stocks(i);
			}
		}
	}
	public void cart()
	{
		String ord = " - " + quan +" " + ordTxt + "\t\t" + "₱ " + price * quan + ".00";
		f.order.add(ord);
		f.orderPrice.add(price * quan);
		f.temp.add(ordNum);
	}
	
}

