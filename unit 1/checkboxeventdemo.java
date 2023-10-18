import java.awt.*;
import java.awt.event.*;
class checkboxeventdemo extends Frame implements ItemListener 
{
	CheckboxGroup cbg;
	Checkbox c1,c2,c3;
	Label l1;
	
	checkboxeventdemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.pink);
		l1=new Label("                                             ");
	    cbg=new CheckboxGroup();
		c1=new Checkbox("male",false,cbg);
		c2=new Checkbox("female",false,cbg);
		c3=new Checkbox("other",false,cbg);
		add(c1);
		add(c2);
		add(c3);
		add(l1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		l1.setText("u have selected option:"+cbg.getSelectedCheckbox().getLabel());
	}
	public static void main(String args[])
	{
		checkboxeventdemo p1=new checkboxeventdemo();
		p1.setSize(600,600);
		p1.setTitle("color change");
		p1.setVisible(true);
	}
}
