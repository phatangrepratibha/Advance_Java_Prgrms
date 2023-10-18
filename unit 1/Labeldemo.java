import java.awt.*;
class Labeldemo extends Frame
{
	Labeldemo()
	{
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		setLayout(f1);
		Label L1=new Label("name");
		Label L2=new Label("password");
		add(L1);
		add(L2);	
	}
	public static void main(String args[])
	{
		Labeldemo l1=new Labeldemo();
		l1.setSize(500,500);
		l1.setTitle("labelframe");
		l1.setVisible(true);
	}
}
