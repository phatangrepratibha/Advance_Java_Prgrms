import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jradiobuttonevent extends JFrame implements ItemListener
{
	JRadioButton jr1,jr2,jr3;
	JLabel l1;
	jradiobuttonevent()
	{
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
	    jr1=new JRadioButton("Male");
		jr2=new JRadioButton("Female");
		jr3=new JRadioButton("Other");
		ButtonGroup bg=new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		
		l1=new JLabel("                                          ");
		
		c.add(jr1);
		c.add(jr2);
		c.add(jr3);
		c.add(l1);
		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(jr1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are Male");
		}
		else if(jr2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are Female");
		}
		else if(jr3.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are Other");
		}
	}
	
	public static void main(String args[])
	{
		jradiobuttonevent ch1=new jradiobuttonevent();
		ch1.setVisible(true);
		ch1.setSize(500,500);
		ch1.setTitle("my jradiobuttonevent");
	}
}