import java.awt.*;
import java.awt.event.*;
class choicedemo extends Frame implements ItemListener
{
	Choice c1;
	Label l1;
	choicedemo()
	{
		setLayout(new FlowLayout());
		c1=new Choice();
		l1=new Label("                                        ");
		c1.add("korea");
		c1.add("china");
		c1.add("america");
		c1.add("akole");
		add(c1);
		add(l1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str=c1.getSelectedItem();
		l1.setText("u have entered "+ str);
	}
	public static void main(String args[])
	{
		choicedemo d1=new choicedemo();
		d1.setVisible(true);
		d1.setTitle("choice control");
		d1.setSize(500,500);
	}
}