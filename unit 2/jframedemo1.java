import javax.swing.*;
class jframedemo1 extends JFrame
{
	jframedemo1(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		jframedemo1 f1=new jframedemo1("my jframe2");
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}