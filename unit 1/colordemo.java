import java.awt.*;
import java.awt.event.*;
class colordemo extends Frame implements ActionListener
{
	
	Button b1,b2,b3,b4;
	
	colordemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
				
		
	    b1=new Button("pink");
	    b2=new Button("red");
	    b3=new Button("yellow");
		b4=new Button("green");	
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			setBackground(Color.pink);
		}
		else if(ae.getSource()==b2)
		{
			setBackground(Color.red);
		}
		else if(ae.getSource()==b3)
		{
			setBackground(Color.yellow);
		}
		else if(ae.getSource()==b4)
		{
			setBackground(Color.green);
		}
			
	}
	public static void main(String args[])
	{
		colordemo p1=new colordemo();
		p1.setSize(600,600);
		p1.setTitle("color change");
		p1.setVisible(true);
	}
}
		
