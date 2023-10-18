import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jdialogdemo extends JFrame implements ActionListener
{
	jdialogdemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1=new JButton("Display dialog box");
		c.add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JDialog jd=new JDialog(this,"DialogBox",true);
		jd.add(new JButton("ok"));
		jd.setVisible(true);
		jd.setSize(150,150);
		
	}
	 public static void main(String args[])
	{
		jdialogdemo f1=new jdialogdemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my jdialogdemo");
		
	}
}