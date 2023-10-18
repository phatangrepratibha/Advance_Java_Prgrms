import javax.swing.*;
class jframedemo extends JFrame
{
	jframedemo()
	{
		
	}
	public static void main(String args[])
	{
		jframedemo f1=new jframedemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle(" my jframe");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}