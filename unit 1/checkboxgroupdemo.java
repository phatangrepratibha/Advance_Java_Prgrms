import java.awt.*;
class checkboxgroupdemo extends Frame
{
	checkboxgroupdemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.pink);
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox c1=new Checkbox("india",false,cbg);
		Checkbox c2=new Checkbox("korea",false,cbg);
		Checkbox c3=new Checkbox("america",false,cbg);
		add(c1);
		add(c2);
		add(c3);
		
	}
	public static void main(String args[])
	{
		checkboxgroupdemo p1=new checkboxgroupdemo();
		p1.setSize(600,600);
		p1.setTitle("color change");
		p1.setVisible(true);
	}
}
