import javax.swing.*;
import java.awt.*;
class jcheckboxdemo extends JFrame
{
	jcheckboxdemo()
	{
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		JCheckBox jch1=new JCheckBox("c lang");
		JCheckBox jch2=new JCheckBox("c++ lang");
		JCheckBox jch3=new JCheckBox("java lang",true);
		c.add(jch1);
		c.add(jch2);
		c.add(jch3);
	}
	public static void main(String args[])
	{
		jcheckboxdemo ch1=new jcheckboxdemo();
		ch1.setVisible(true);
		ch1.setSize(500,500);
		ch1.setTitle("my jcheckbox");
	}
}