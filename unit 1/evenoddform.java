import java.awt.*;
import java.awt.event.*;
class evenoddform extends Frame implements ActionListener
{
	
	Button b1;
	TextField tf1,tf2;
	evenoddform()
	{
		setLayout(null);
		setBackground(Color.pink);		
		Label l1=new Label("even odd");
		l1.setForeground(Color.red);
		Font f1=new Font("Arial black",Font.BOLD,20);
		l1.setFont(f1);
		Label l2=new Label("Enter number");
	    setForeground(Color.black);
		/*Font f2=new Font("Arial black",Font.BOLD,15);
		setFont(f2);*/
		tf1=new TextField(30);
		Label l3=new Label("Result");
	    tf2=new TextField(30);	
	    b1=new Button("check");
		l1.setBounds(150,50,500,80);
		l2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		l3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		b1.setBounds(150,340,150,50);

		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no=Integer.parseInt(tf1.getText());
		if(no%2==0)
		{
			tf2.setText("even");
		}
		else
		{
			tf2.setText("odd");
		}
	}
	public static void main(String args[])
	{
		evenoddform p1=new evenoddform();
		p1.setSize(500,500);
		p1.setTitle("login form");
		p1.setVisible(true);
	}
}
		
