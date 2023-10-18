import java.awt.*;
class checkboxdemo extends Frame
{
	checkboxdemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.pink);
		Checkbox c1=new Checkbox("india",true);
		Checkbox c2=new Checkbox("korea");
		Checkbox c3=new Checkbox("america");
		add(c1);
		add(c2);
		add(c3);
		
	}
	public static void main(String args[])
	{
		checkboxdemo p1=new checkboxdemo();
		p1.setSize(600,600);
		p1.setTitle("color change");
		p1.setVisible(true);
	}
}
