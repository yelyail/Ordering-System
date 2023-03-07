package cceProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Cart extends JFrame implements ActionListener{
	// FOR CART FRAME
		JButton clearButton, retButton;
		JLabel ttlText;
		JScrollPane scroll;
		JTextArea txt;
//--------------------------------------------------------------------------------------------
		//price
			String order;
			int total1=0, total2=0;
			int total=0;
		
			first f;
		Cart(first f)
		{
			this.f=f;
			new JFrame ();
			setSize(600, 600);
			getContentPane().setBackground(new Color(0xceb19c));
			setResizable(false);
			setLayout(null);
			setLocationRelativeTo(null);
			
		//-------------------------------------------------------------------------------------------------
			txt = new JTextArea();
			txt.setEditable(false);
			txt.setFont(new Font("Courier New",Font.BOLD,20));
			txt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			txt.setBackground(new Color(0xDADADA));

			totalBill();
			coffeeList();
			
			scroll = new JScrollPane(txt);
			scroll.setBounds(0, 0, 580, 480);
			scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			clearButton = new JButton("CLEAR");
			clearButton.setFont(new Font("Arial", Font.BOLD, 20));
			clearButton.setBounds(10, 500, 100, 50);
			clearButton.setBackground(new Color(0x8D0303));
			clearButton.setForeground(Color.WHITE);
			clearButton.setBorder(BorderFactory.createEtchedBorder());
			clearButton.setFocusable(false);
			clearButton.addActionListener(this);
			
			retButton = new JButton("RETURN");
			retButton.setFont(new Font("Arial", Font.BOLD, 20));
			retButton.setBounds(115, 500, 100, 50);
			retButton.setBackground(new Color(0x8D0303));
			retButton.setForeground(Color.WHITE);
			retButton.setBorder(BorderFactory.createEtchedBorder());
			retButton.setFocusable(false);
			retButton.addActionListener(this);
			
			ttlText = new JLabel();
			ttlText.setText("TOTAL: " + f.total + ".00" );
			ttlText.setBackground(new Color(0x8D0303));
			ttlText.setForeground(Color.black);
			ttlText.setFont(new Font("Arial", Font.BOLD,20));
			ttlText.setBounds(330,475, 300, 100);
			
	//---------------------------------------------------------------------------------add frame
			add(ttlText);
			add(clearButton);
			add(retButton);
			add(scroll);
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == clearButton)
			{
				resetCart();
			}
			if(e.getSource() == retButton)
			{
				dispose();
			}
			
		}
		public void coffeeList()
		{	
			String order = (f.order.toString().replaceAll("^.|.$", "").replace(", ", "\n"));
			if(order.isEmpty())
			{
				txt.setText("Your cart is empty.");
			}else
			{
				txt.setText(order);
			}
		}
		private void Bill() { 
			for(int i = 0; i < f.orderPrice.size(); i++) {
				f.total += f.orderPrice.get(i);
			}
			f.orderPrice.clear();
		}
		private void Bill1() { 
			for(int i = 0; i < f.desPrice.size(); i++) {
				f.total += f.desPrice.get(i);
			}f.desPrice.clear();
		}
		public void totalBill()
		{
			Bill();
			Bill1();
		}
		public void resetCart()
		{ 
			for(int i = 1; i < 10; i++) {
				f.tempStock[i] = f.origStock[i];
				f.stockText[i].setText("Stock: " + f.tempStock[i]);
					if(f.tempStock[i] != 0)
						f.button[i].setEnabled(true);
					else if(f.tempStock[i] == 0)
						f.button[i].setEnabled(false);
			}
			f.order.clear();
			f.orderPrice.clear();
			f.desPrice.clear();
			txt.setText("Your cart is empty.");
			ttlText.setText("TOTAL: " + total);
			ttlText.setFont(new Font("Arial", Font.BOLD,20));
			f.total=0;
				
		}
}
