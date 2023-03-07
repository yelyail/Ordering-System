package cceProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class receipt extends JFrame{
	JLabel rece1, imgLb,address, name, refe, pNum;
	JTextArea txt, nam;
	JPanel logo, receipt, dateTime;
	JScrollPane scroll ;
	ImageIcon imgLogo;
	
	static LocalDate Date = LocalDate.now();
	static LocalTime Time =LocalTime.now();
	static String pay;
	
	first f;
	
	receipt(first f) 
	{ 
		Frame[] frames = Frame.getFrames();	
		for (Frame frame : frames) {
			    frame.dispose();
			}
		this.f=f;
	 java.util.Random rand = new java.util.Random();
	 long randomNumber = rand.nextLong(1000000000);
	 @SuppressWarnings("unused")
	int rando = rand.nextInt(20);
//------------------------------------------------------------------------------------------
		new JFrame();
		setSize(400,600);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
//----------------------------------------------------------------------------------------------
		logo = new JPanel();
		logo.setBounds(0, 0, 120, 100);
		logo.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
		logo.setBackground(Color.WHITE);
		
		imgLogo = new ImageIcon("logo.jpg");
		imgLb = new JLabel();
		imgLb.setIcon(imgLogo);
		logo.add(imgLb);
//---------------------------------------------------------------------------------------
		pNum = new JLabel();
		pNum.setText("Phone Number: (223) 678-2345");
		pNum.setForeground(Color.black);
		pNum.setFont(new Font("Monospaced", Font.PLAIN,12));
		pNum.setBounds(120, 40, 300, 50);
		
		name = new JLabel();
		name.setText("EL CAFE ES AMOR");
		name.setForeground(Color.black);
		name.setFont(new Font("Monospaced", Font.BOLD,18));
		name.setBounds(140, 10, 200, 50);
		
		address = new JLabel();
		address.setText("Matina, Davao City");
		address.setForeground(Color.black);
		address.setFont(new Font("Monospaced", Font.PLAIN,16));
		address.setBounds(138, 25, 300, 50);
		
		refe = new JLabel();
		refe.setText("Reference #: " + randomNumber);
		refe.setForeground(Color.black);
		refe.setFont(new Font("Monospaced", Font.PLAIN,14));
		refe.setBounds(110, 70, 300, 50);
//---------------------------------------------------------------------------------------
		receipt = new JPanel();
		receipt.setBounds(0, 120, 400, 440);
		receipt.setLayout(new FlowLayout(FlowLayout.CENTER, -10,10));
		
		txt = new JTextArea();
		txt.setEditable(false);
		txt.setFont(new Font("Monospaced",Font.PLAIN,14));
		txt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		Bill();
		Bill1();
		coffeeList();
		
		scroll = new JScrollPane(txt);
		scroll.setBounds(0, 120, 400, 440);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//-------------------------------------------------------------------------------------------------------
		//add to frame
		add(pNum);
		add(name);
		add(address);
		add(refe);
		add(scroll);
		add(receipt);
		add(logo);
		setVisible(true);
//---------------------------------------------------------------------------------------	
	}
		
			public void coffeeList()
				{
				String order = (f.order.toString().replaceAll("^.|.$", "\n********************************************\n").replace(", ", "\n"));
				if (order.isEmpty()) {
					txt.setText(" Your cart is empty.");
				} else {
					txt.setText(order + "\n\t    Sub Total: ₱" + f.total + "\n\t\tTotal: ₱"+f.total
							+"\n\t\tCash:  ₱" + f.money1
							+"\n  \tChange =====>  ₱" + (f.money1 - f.total)
							+ "\n********************************************\n*******THIS IS YOUR OFFICIAL RECEIPT!*******\n"
							+ "\tTHANK YOU FOR DRINKING WITH ME^-^\n"
							+" " + Date +"  "+ Time  );
				}
			}
			private void Bill() { 
					for(int i = 0; i < f.orderPrice.size(); i++) {
						f.total += f.orderPrice.get(i);
					}f.orderPrice.clear();
			}
			private void Bill1() { 
				for(int i = 0; i < f.desPrice.size(); i++) {
					f.total += f.desPrice.get(i);
				}f.desPrice.clear();
			}
			
}
