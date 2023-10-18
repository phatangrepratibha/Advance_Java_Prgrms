import java.awt.*;
class textfieldsemo extends Frame
{
	textfieldsemo()
	{
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		setLayout(f1);
		setBackground(Color.pink);
		setForeground(Color.red);
		TextField tf1=new TextField(30);
		TextField tf2=new TextField(30);
		add(tf1);
		add(tf2);
	}
	public static void main(String args[])
	{
		textfieldsemo t1=new textfieldsemo();
		t1.setVisible(true);
		t1.setSize(500,500);
		t1.setTitle("textframe");
	}
}
