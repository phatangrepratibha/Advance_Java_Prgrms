import java.awt.*;
import java.awt.event.*;
class calculatordemo extends Frame implements ActionListener
{
	Label l4;
	Button b1,b2,b3,b4;
	TextField tf1,tf2,tf3;
	calculatordemo()
	{
		setLayout(null);
		setBackground(Color.pink);		
		Label l1=new Label("calculator");
		l1.setForeground(Color.red);
		Font f1=new Font("Arial black",Font.BOLD,20);
		l1.setFont(f1);
		Label l2=new Label("Enter 1st no");
	    setForeground(Color.black);
		/*Font f2=new Font("Arial black",Font.BOLD,15);
		setFont(f2);*/
		tf1=new TextField(30);
		Label l3=new Label("Enter 2nd no");
	    tf2=new TextField(30);
		l4=new Label("Result");
		tf3=new TextField(30);
	    b1=new Button("add");
	    b2=new Button("sub");
	    b3=new Button("mul");
		b4=new Button("div");
	
		l1.setBounds(150,50,500,80);
		l2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		l3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		l4.setBounds(50,320,180,40);
		tf3.setBounds(260,320,160,40);
		b1.setBounds(50,400,70,50);
		b2.setBounds(150,400,70,50);
		b3.setBounds(250,400,70,50);
		b4.setBounds(350,400,70,50);
		
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);		
		add(l4);
		add(tf3);
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
		int x=Integer.parseInt(tf1.getText());
		int y=Integer.parseInt(tf2.getText());
		int z;
		if(ae.getSource()==b1)
		{
			z=x+y;
			tf3.setText(""+z);
		}
		else if(ae.getSource()==b2)
		{
			z=x-y;
			tf3.setText(""+z);
		}
		else if(ae.getSource()==b3)
		{
			z=x*y;
			tf3.setText(""+z);
		}
		else if(ae.getSource()==b4)
		{
			z=x/y;
			tf3.setText(""+z);
		}
	}
	public static void main(String args[])
	{
		calculatordemo p1=new calculatordemo();
		p1.setSize(600,600);
		p1.setTitle("login form");
		p1.setVisible(true);
	}
}
		
