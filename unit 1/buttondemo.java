import java.awt.*;
class buttondemo extends Frame
{
	buttondemo()
	{
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		setLayout(f1);
		Button b1=new Button("ok");
		Button b2=new Button("cancel");
		Button b3=new Button();
		b3.setLabel("retry");
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		buttondemo f1=new buttondemo();
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setTitle("myframe");
	}
}