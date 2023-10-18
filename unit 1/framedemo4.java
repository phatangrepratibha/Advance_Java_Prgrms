import java.awt.*;
class framedemo4 extends Frame
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		g.drawString("welcome to my frame",150,250);
	}
	public static void main(String args[])
	{
		framedemo4 f1=new framedemo4();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my frame");
	}
}
