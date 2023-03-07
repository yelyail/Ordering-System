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

public class third extends JFrame implements ActionListener{
	JFrame desFr;
	
	JLabel quantityTxt;
	JPanel desPan, quantPan;
	JButton LeftButton, RightButton, addButton, returnBut;
	JLabel brug, cCake1, brown1, cCookies1, donuts1, chur1; 
	JLabel brugPrice, ccakePrice, brownPrice, ccookiesPrice, donutsPrice, churPrice;
	JButton back, clear, checkOut, orderList, addMoney; 
	JPanel brugge, cCake, brown, cCookies, donuts, chur, mon; 
	ImageIcon im, im1, im2,im3,im4,im5; 
	JTextField text, money;
//----------------------------------------------------------------------------------------------
	int prices;
	int total;
	int desNum=0;
	int quanti= 1;
	String orTxt;
	
	first f;
	third(first f)
	{
		this.f=f;
//---------------------------------------------------------------------------------------------------
		leftSide();
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
		clear= new JButton("CANCEL");
		clear.setFont(new Font("Arial", Font.BOLD, 16));
		clear.setBackground(new Color(0x7c573e));
		clear.setForeground(Color.white);
		clear.setBounds(800, 600, 150, 50);
		clear.setBorderPainted(false);
		clear.setFocusable(false);
		clear.addActionListener(this);
//-------------------------------------------------------------------------------------------
				back= new JButton("BACK");
				back.setFont(new Font("Arial", Font.BOLD, 16));
				back.setBackground(new Color(0x7c573e));
				back.setForeground(Color.white);
				back.setBounds(20, 670, 150, 50);
				back.setBorderPainted(false);
				back.setFocusable(false);
				back.addActionListener(this);
				add(back);
				
//-------------------------------------------------------------------------------------------
		checkOut= new JButton("CHECK OUT");
		checkOut.setFont(new Font("Arial", Font.BOLD, 16));
		checkOut.setBackground(new Color(0x7c573e));
		checkOut.setForeground(Color.white);
		checkOut.setBounds(800, 670, 150, 50);
		checkOut.setBorderPainted(false);
		checkOut.setFocusable(false);
		checkOut.addActionListener(this);
		add(checkOut);
		
		money= new JTextField("  MONEY: ₱ " + f.money1 + ".00");
		money.setFont(new Font("Arial", Font.BOLD, 16));
		money.setBackground(Color.DARK_GRAY);
		money.setForeground(Color.white);
		money.setBounds(580, 670, 200, 50);
		money.setFocusable(false);
		
		addMoney = new JButton("+");
		addMoney.setFont(new Font("Arial", Font.PLAIN, 30));
		addMoney.setBounds(530, 670, 50, 50);
		addMoney.setBackground(Color.DARK_GRAY);
		addMoney.setForeground(Color.WHITE);
		addMoney.setBorder(BorderFactory.createEtchedBorder());
		addMoney.setFocusable(false);
		addMoney.addActionListener(this);
//--------------------------------------------------------------------------------------------
		orderList= new JButton("ORDER LIST");
		orderList.setFont(new Font("Arial", Font.BOLD, 16));
		orderList.setBackground(new Color(0x7c573e));
		orderList.setForeground(Color.white);
		orderList.setBounds(800, 10, 150, 50);
		orderList.setBorderPainted(false);
		orderList.setFocusable(false);
		orderList.addActionListener(this);
//--------------------------------------------------------------------------------------------
		add(brugge);
		add(cCake);
		add(brown);
		add(cCookies);
		add(donuts);
		add(chur);
		add(clear);
		add(money);
		add(addMoney);
		add(orderList);
		setVisible(true);
	}

	public void leftSide()
	{
		//1st choice
//---------------------------------------------------------------------------------------------------
		brugge = new JPanel();
		brugge.setBounds(50, 70, 250, 200);
		brugge.setLayout(null);
		brugge.setBackground(new Color(0xb48768));

		im = new ImageIcon("baguette.jpg");
		brug = new JLabel();
		brug.setIcon(im);
		brug.setBounds(10, 10, 100, 150);
		brugge.add(brug);
		
		brug= new JLabel("Baguette");
		brug.setForeground(Color.BLACK);
		brug.setFont(new Font("Constantia", Font.PLAIN, 20));
		brug.setBounds(130, 10, 100, 100);
		brugge.add(brug);
		
		f.b1[1] = new JButton("ADD");
		f.b1[1].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[1].setBackground(new Color(0x7c573e));
		f.b1[1].setForeground(Color.white);
		f.b1[1].setBounds(160, 140, 70, 50);
		f.b1[1].setBorderPainted(false);
		f.b1[1].setFocusable(false);
		f.b1[1].addActionListener(this);
		brugge.add(f.b1[1]);
		
		brugPrice = new JLabel("Php 88.00");
		brugPrice.setForeground(Color.BLACK);
		brugPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		brugPrice.setBounds(130, 40, 100, 100);
		brugge.add(brugPrice);
		
		f.sT1[1] = new JLabel("Stock: " + f.tempStock1[1]);
		f.sT1[1].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[1].setForeground(Color.WHITE);
		f.sT1[1].setBounds(20, 130, 100, 100);
		brugge.add(f.sT1[1]);
//--------------------------------------------------------------------------------------------

		//2nd choice
//---------------------------------------------------------------------------------------------------
		cCake = new JPanel();
		cCake.setBounds(50,350, 250, 200);
		cCake.setLayout(null);
		cCake.setBackground(new Color(0xb48768));

		im1 = new ImageIcon("cheeseCake.jpg");
		cCake1 = new JLabel();
		cCake1.setIcon(im1);
		cCake1.setBounds(10, 10, 100, 150);
		cCake.add(cCake1);
		
		cCake1= new JLabel("Cheese Cake");
		cCake1.setForeground(Color.BLACK);
		cCake1.setFont(new Font("Constantia", Font.PLAIN, 20));
		cCake1.setBounds(130, 5, 200, 100);
		cCake.add(cCake1);
		
		f.b1[2] = new JButton("ADD");
		f.b1[2].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[2].setBackground(new Color(0x7c573e));
		f.b1[2].setForeground(Color.white);
		f.b1[2].setBounds(160, 140, 70, 50);
		f.b1[2].setBorderPainted(false);
		f.b1[2].setFocusable(false);
		f.b1[2].addActionListener(this);
		cCake.add(f.b1[2]);
		
		ccakePrice = new JLabel("Php 123.00");
		ccakePrice.setForeground(Color.BLACK);
		ccakePrice.setFont(new Font("Constantia", Font.PLAIN,16));
		ccakePrice.setBounds(130, 40, 100, 100);
		cCake.add(ccakePrice);
		
		f.sT1[2] = new JLabel("Stock: " + f.tempStock1[2]);
		f.sT1[2].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[2].setForeground(Color.WHITE);
		f.sT1[2].setBounds(20, 130, 100, 100);
		cCake.add(f.sT1[2]);
//--------------------------------------------------------------------------------------------
}
	public void center()
	{
		//3rd choice
//---------------------------------------------------------------------------------------------------
		brown = new JPanel();
		brown.setBounds(380, 70, 250, 200);
		brown.setLayout(null);
		brown.setBackground(new Color(0xb48768));

		im2 = new ImageIcon("brownies.jpg");
		brown1= new JLabel();
		brown1.setIcon(im2);
		brown1.setBounds(10, 10, 100, 150);
		brown.add(brown1);
		
		brown1= new JLabel("Brownies");
		brown1.setForeground(Color.BLACK);
		brown1.setFont(new Font("Constantia", Font.PLAIN, 20));
		brown1.setBounds(130, 10, 100, 100);
		brown.add(brown1);
		
		f.b1[3] = new JButton("ADD");
		f.b1[3].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[3].setBackground(new Color(0x7c573e));
		f.b1[3].setForeground(Color.white);
		f.b1[3].setBounds(160, 140, 70, 50);
		f.b1[3].setBorderPainted(false);
		f.b1[3].setFocusable(false);
		f.b1[3].addActionListener(this);
		brown.add(f.b1[3]);
		
		brownPrice = new JLabel("Php 98.00");
		brownPrice.setForeground(Color.BLACK);
		brownPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		brownPrice.setBounds(130, 40, 100, 100);
		brown.add(brownPrice);
		
		f.sT1[3] = new JLabel("Stock: " +  f.tempStock1[3]);
		f.sT1[3].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[3].setForeground(Color.WHITE);
		f.sT1[3].setBounds(20, 130, 100, 100);
		brown.add(f.sT1[3]);
//--------------------------------------------------------------------------------------------

		//4th choice
//---------------------------------------------------------------------------------------------------
		cCookies = new JPanel();
		cCookies.setBounds(380,350, 250, 200);
		cCookies.setLayout(null);
		cCookies.setBackground(new Color(0xb48768));

		im3 = new ImageIcon("cCookies.jpg");
		cCookies1 = new JLabel();
		cCookies1.setIcon(im3);
		cCookies1.setBounds(10, 10, 100, 150);
		cCookies.add(cCookies1);
		
		cCookies1= new JLabel("Chocolate Cookies");
		cCookies1.setForeground(Color.BLACK);
		cCookies1.setFont(new Font("Constantia", Font.PLAIN, 17));
		cCookies1.setBounds(115, 10, 200, 100);
		cCookies.add(cCookies1);

		f.b1[4] = new JButton("ADD");
		f.b1[4].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[4].setBackground(new Color(0x7c573e));
		f.b1[4].setForeground(Color.white);
		f.b1[4].setBounds(160, 140, 70, 50);
		f.b1[4].setBorderPainted(false);
		f.b1[4].setFocusable(false);
		f.b1[4].addActionListener(this);
		cCookies.add(f.b1[4]);
		
		ccookiesPrice = new JLabel("Php 89.00");
		ccookiesPrice.setForeground(Color.BLACK);
		ccookiesPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		ccookiesPrice.setBounds(130, 40, 100, 100);
		cCookies.add(ccookiesPrice);
		
		f.sT1[4] = new JLabel("Stock: " + f.tempStock1[4]);
		f.sT1[4].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[4].setForeground(Color.WHITE);
		f.sT1[4].setBounds(20, 130, 100, 100);
		cCookies.add(f.sT1[4]);
//-------------------------------------------------------------------------------------------
	}
	public void rightSide()
	{
		//5th choice
//---------------------------------------------------------------------------------------------------
		donuts = new JPanel();
		donuts.setBounds(700, 70, 250, 200);
		donuts.setLayout(null);
		donuts.setBackground(new Color(0xb48768));

		im4 = new ImageIcon("donuts.jpg");
		donuts1= new JLabel();
		donuts1.setIcon(im4);
		donuts1.setBounds(10, 10, 100, 150);
		donuts.add(donuts1);
		
		donuts1= new JLabel("Donuts");
		donuts1.setForeground(Color.BLACK);
		donuts1.setFont(new Font("Constantia", Font.PLAIN, 20));
		donuts1.setBounds(130, 10, 100, 100);
		donuts.add(donuts1);
		
		f.b1[5] = new JButton("ADD");
		f.b1[5].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[5].setBackground(new Color(0x7c573e));
		f.b1[5].setForeground(Color.white);
		f.b1[5].setBounds(160, 140, 70, 50);
		f.b1[5].setBorderPainted(false);
		f.b1[5].setFocusable(false);
		f.b1[5].addActionListener(this);
		donuts.add(f.b1[5]);
		
		donutsPrice = new JLabel("Php 50.00");
		donutsPrice.setForeground(Color.BLACK);
		donutsPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		donutsPrice.setBounds(130, 40, 100, 100);
		donuts.add(donutsPrice);
		
		f.sT1[5] = new JLabel("Stock: " +  f.tempStock1[5]);
		f.sT1[5].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[5].setForeground(Color.WHITE);
		f.sT1[5].setBounds(20, 130, 100, 100);
		donuts.add(f.sT1[5]);
//--------------------------------------------------------------------------------------------

		//6th choice
//---------------------------------------------------------------------------------------------------
		chur = new JPanel();
		chur.setBounds(700,350, 250, 200);
		chur.setLayout(null);
		chur.setBackground(new Color(0xb48768));

		im5 = new ImageIcon("churros.jpg");
		chur1 = new JLabel();
		chur1.setIcon(im5);
		chur1.setBounds(10, 10, 100, 150);
		chur.add(chur1);
		
		chur1= new JLabel("Churros");
		chur1.setForeground(Color.BLACK);
		chur1.setFont(new Font("Constantia", Font.PLAIN, 20));
		chur1.setBounds(130, 5, 200, 100);
		chur.add(chur1);
		
		f.b1[6] = new JButton("ADD");
		f.b1[6].setFont(new Font("Arial", Font.BOLD, 16));
		f.b1[6].setBackground(new Color(0x7c573e));
		f.b1[6].setForeground(Color.white);
		f.b1[6].setBounds(160, 140, 70, 50);
		f.b1[6].setBorderPainted(false);
		f.b1[6].setFocusable(false);
		f.b1[6].addActionListener(this);
		chur.add(f.b1[6]);	
		
		churPrice = new JLabel("Php 30.00");
		churPrice.setForeground(Color.BLACK);
		churPrice.setFont(new Font("Constantia", Font.PLAIN,16));
		churPrice.setBounds(130, 40, 100, 100);
		chur.add(churPrice);
		
		f.sT1[6] = new JLabel("Stock: " +  f.tempStock1[6]);
		f.sT1[6].setFont(new Font("Constantia",Font.PLAIN,20));
		f.sT1[6].setForeground(Color.WHITE);
		f.sT1[6].setBounds(20, 130, 100, 100);
		chur.add(f.sT1[6]);
//-------------------------------------------------------------------------------------------
	}
	
	public void use(ActionEvent e) {
		if(e.getSource()== f.b1[1])
		{
			desNum = 1;
			dessertOrder();
		}
		if (e.getSource()==f.b1[2])
		{
			desNum = 2;
			dessertOrder();
		}
		if(e.getSource()==f.b1[3])
		{
			desNum = 3;
			dessertOrder();
		}
		if (e.getSource()==f.b1[4])
		{
			desNum = 4;
			dessertOrder();
		}
		if(e.getSource()==f.b1[5])
		{
			desNum = 5;
			dessertOrder();
		}
		if (e.getSource()==f.b1[6])
		{
			desNum = 6;
			dessertOrder();
		}
		if(e.getSource() == clear)
		{
			Frame[] frames = Frame.getFrames();	
			for (Frame frame : frames) {
				    frame.dispose();
				}
			JOptionPane.showMessageDialog(null, "THANK YOU FOR DINING");
		}
		if (e.getSource() == orderList)
		{
			new Cart(f);
		}
		if(e.getSource() == checkOut)
		{ 
			if(f.total <= f.money1)
			{
				new receipt(f);
			}else 
			{
				JOptionPane.showMessageDialog(null, "Your money is not enough!");
				money();
			}
		}
		if(e.getSource() == addButton)
		{
			desFr.dispose();
		}
		if(e.getSource() == addMoney)
		{
			money();
		}
		if(e.getSource() == returnBut)
		{
			desFr.dispose();
		}
		back.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
						second s = new second(f);
						s.setVisible(true);
					}
			
				});
	}
	public void dessertOrder()
	{
		quanti =1; 
		
		desFr = new JFrame();
		desFr.setSize(400, 400);
		desFr.getContentPane().setBackground(new Color(0xceb19c));
		desFr.setResizable(false);
		desFr.setLayout(null);
		desFr.setLocationRelativeTo(null);
	//-------------------------------------------------------------------
		switch(desNum)
		{
		case 1: prices = 88; orTxt = "Baguette\t";break;
		case 2: prices = 123; orTxt = "Cheese Cake";break;
		case 3: prices = 98; orTxt = "Brownies\t"; break;
		case 4: prices = 89; orTxt = "Chocolate Cookies";break;
		case 5: prices = 50; orTxt = "Donuts\t";break;
		case 6: prices = 30; orTxt = "Churros\t";break;
		}
		desFr.setTitle(orTxt);
		
		//background Panel
		desPan = new JPanel();
		desPan.setBounds(0, 0, 400, 400);
		desPan.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		desPan.setBorder(BorderFactory.createEtchedBorder());
		desPan.setBackground(new Color(0xceb19c));
		
		quantityTxt = new JLabel("QUANTITY");
		quantityTxt.setForeground(Color.BLACK);
		quantityTxt.setFont(new Font("Tahoma", Font.BOLD,20));
		desPan.add(quantityTxt);
		
		//design sa panel
			LeftButton = new JButton("<");
			LeftButton.setFont(new Font("Tahoma", Font.BOLD,20));
			LeftButton.setBackground(new Color(0xb48768));
			LeftButton.setForeground(Color.white);
			LeftButton.setBounds(40, 120, 50, 50);
			LeftButton.setBorder(BorderFactory.createEtchedBorder());
			LeftButton.setFocusable(false);
			LeftButton.addActionListener(this);
			
			RightButton = new JButton(">");
			RightButton.setFont(new Font("Tahoma", Font.BOLD,20));
			RightButton.setBackground(new Color(0xb48768));
			RightButton.setForeground(Color.white);
			RightButton.setBounds(300, 120, 50, 50);
			RightButton.setBorder(BorderFactory.createEtchedBorder());
			RightButton.setFocusable(false);
			RightButton.addActionListener(this);
			
				returnBut = new JButton("RETURN");
				returnBut.setFont(new Font("Tahoma", Font.PLAIN, 20));
				returnBut.setBounds(220, 260, 100, 50);
				returnBut.setBackground(new Color(0x7c573e));
				returnBut.setForeground(Color.WHITE);
				returnBut.setBorder(BorderFactory.createEtchedBorder());
				returnBut.setFocusable(false);
				returnBut.addActionListener(this);
				
				addButton = new JButton("ADD");
				addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				addButton.setBounds(60, 260, 100, 50);
				addButton.setBackground(new Color(0x7c573e));
				addButton.setForeground(Color.white);
				addButton.setBorder(BorderFactory.createEtchedBorder());
				addButton.setFocusable(false);
				addButton.addActionListener(this);
				
	//--------------------------------------------------------------
				JTextField text = new JTextField();
				text.setBounds(160, 120, 80,50);
				text.setEditable(false);
				text.setFont(new Font("Courier New",Font.BOLD,30));
				text.setText(String.valueOf(quanti));
				text.setHorizontalAlignment(JTextField.CENTER);
					
						LeftButton.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent event)
									{
										if (quanti > 0)
										{
											quanti -= 1;
											text.setText(String.valueOf(quanti));
										}
									}
								});
						RightButton.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent event)
									{
										quanti += 1;
										text.setText(String.valueOf(quanti));
									}
								});
	//---------------------------------------------------------------
		desFr.add(text);
		desFr.add(LeftButton);
		desFr.add(RightButton);
		desFr.add(addButton);
		desFr.add(returnBut);
		desFr.add(desPan);
		desFr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		use(e);
		if (e.getSource() == addButton)
		{
				desFr.dispose();
				for(int i = 1; i < 10; i++) {
					if(i == desNum) stocks(i);
				}
			}
		
	}
	private void stocks(int i ) {
		if(f.tempStock1[i] == 0) {
			switch(i) {
				case 1 -> infoStock("BAGUETTE", 1);
				case 2 -> infoStock("CHEESE CAKE", 2);
				case 3 -> infoStock("BROWNIES", 3);
				case 4 -> infoStock("CHOCOLATE COOKIES", 4);
				case 5 -> infoStock("DONUTS", 5);
				case 6 -> infoStock("CHURROS", 6);
			}
		} else if(f.tempStock1[i] < quanti) {
			JOptionPane.showMessageDialog(null, "NOT ENOUGH STOCK!");
		} else {
			f.tempStock1[i] -= quanti;
			f.sT1[i].setText("Stock: " + f.tempStock1[i]);
			cart();
		}
	}
	private void infoStock(String order, int i) {
			JOptionPane.showMessageDialog(null, order + " IS OUT OF STOCK!"); 
			f.button[i].setEnabled(false);
		}
	public void cart()
	{
		String order = " - " + quanti +" "+orTxt +"\t\t" + "₱ " + prices * quanti + ".00";
		f.order.add(order);
		f.desPrice.add(prices * quanti);
		f.temp.add(desNum);
	}
	public void money()
	{	
		for(int i = 0; i<f.desPrice.size(); i++)
		{
			f.total += f.desPrice.get(i);
		}f.desPrice.clear();
		for(int a= 0; a<f.orderPrice.size(); a++)
		{
			f.total += f.orderPrice.get(a);
		}f.orderPrice.clear();
		int mon = 0;
		try {
			mon = Integer.parseInt(JOptionPane.showInputDialog(null, "Total of " + f.total));
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "ADD MONEY HERE", "MONEY", JOptionPane.WARNING_MESSAGE);
		}
		f.money1 += mon;
		money.setText("  MONEY: ₱ " + f.money1 + ".00");
	}
	
}