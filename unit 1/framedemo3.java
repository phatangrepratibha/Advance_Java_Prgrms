import java.awt.*;
class framedemo3 extends Frame
{
	framedemo3(String str)
	{
		super(str);
		setBackground(Color.cyan);
		setForeground(Color.red);
		
	}
	public static void main(String args[])
	{
		framedemo3 f1=new framedemo3("myframe");
		f1.setVisible(true);
		f1.setSize(500,500);
		
	}
}
