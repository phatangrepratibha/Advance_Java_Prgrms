import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jcheckboxevent extends JFrame implements ItemListener
{
	JCheckBox jch1,jch2,jch3;
	JLabel l1;
	jcheckboxevent()
	{
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		jch1=new JCheckBox("c lang");
		jch2=new JCheckBox("c++ lang");
	    jch3=new JCheckBox("java lang",true);
		l1=new JLabel("                                          ");
		
		c.add(jch1);
		c.add(jch2);
		c.add(jch3);
		c.add(l1);
		jch1.addItemListener(this);
		jch2.addItemListener(this);
		jch3.addItemListener(this);	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(jch1.isSelected())
		{
			l1.setText("u hava selected :"+jch1.getText());
		}
		else if(jch2.isSelected())
		{
			l1.setText("u hava selected :"+jch2.getText());
		}
		else if(jch3.isSelected())
		{
			l1.setText("u hava selected :"+jch3.getText());
		}
	}
	
	public static void main(String args[])
	{
		jcheckboxevent ch1=new jcheckboxevent();
		ch1.setVisible(true);
		ch1.setSize(500,500);
		ch1.setTitle("my jcheckbox");
	}
}