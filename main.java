package cceProject;

import java.awt.EventQueue;

public class main {
public static void main(String[] args)	{
		EventQueue.invokeLater(new Runnable()	{
			public void run() {
					first f = new first();
					((first) f).setVisible(true);
			}
		});
		}
}
