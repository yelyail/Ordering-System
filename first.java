package cceProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class first implements ActionListener {
	
	JFrame fr = new JFrame();
	JLabel lb;
	JButton btn = new JButton();
	ImageIcon img ;
	JPanel p; 
	
	ArrayList<String> order = new ArrayList<>();
	ArrayList<Integer> orderPrice = new ArrayList<>();
	ArrayList<Integer> desPrice = new ArrayList<>();
	ArrayList<Integer> temp = new ArrayList<>();
	
	int total ;
	int money1, change1;
	int[] origStock = new int[10];
	int[] tempStock = new int[10];
	int[] tempStock1 = new int[10];
	public JLabel[] stockText = new JLabel[10];
	public JButton[] button = new JButton[10];
	public JLabel[] sT1 = new JLabel[7];
	public JButton[] b1 = new JButton[7];
	
	first()
	{	
		btn = new JButton("CLICK HERE");
		btn.setFont(new Font("Arial", Font.PLAIN, 20));
		btn.setBounds(400, 500, 200, 100);
		btn.setBorder(BorderFactory.createEtchedBorder());
		btn.setBorderPainted(false);
		btn.setBackground(new Color (0xceb19c));
		btn.addActionListener(this);
		//panel 
		firstPanel();
		setStock();
		//FRAME SETTING
		fr = new JFrame("El Cafe es amor");
		fr.setSize(1100, 800);
		fr.setResizable(false);
		fr.setLayout(null);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//-----------------------------------------------------------------------
		//adding to frames
		fr.add(p);fr.add(btn);
		fr.setVisible(true);
	}
	
	private void setStock() {
		for(int i = 0; i < 10; i++) {
			origStock[i] = 10;
			tempStock[i] = origStock[i];
		}
		for(int i = 0; i < 10; i++) {
			origStock[i] = 10;
			tempStock1[i] = origStock[i];
		}
	}
	
	public void firstPanel()
	{
		p = new JPanel();
		p.setBounds(0, 0, 1100, 800);
		p.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p.setBackground(new Color(0xBF9797));
		
		img = new ImageIcon("CCE.jpg");
		lb = new JLabel();
		lb.setIcon(img);
		p.add(lb);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn)
		{
			fr.dispose();
			new second(this);
		}
		
	}
	public void setVisible(boolean b) {
	}

	

}
