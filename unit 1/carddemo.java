import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class carddemo  extends JFrame implements ActionListener
{
	CardLayout c1;
	Container c;
	carddemo()
	{
		c1=new CardLayout();
		setLayout(c1);
		
		c=getContentPane();
		
		JButton b1=new JButton("c lang");
		JButton b2=new JButton("c++ lang");
		JButton b3=new JButton("java lang");
		JButton b4=new JButton("advance java lang");
		JButton b5=new JButton("python lang");
		
		c.add(b1,"button1");
		c.add(b2,"button2");
		c.add(b3,"button3");
		c.add(b4,"button4");
		c.add(b5,"button5");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	c1.next(c);	
	}
		

	public static void main(String args[])
{
    carddemo m1=new carddemo();
	m1.setSize(500,500);
	m1.setVisible(true);
	m1.setTitle("mycard");
}
}