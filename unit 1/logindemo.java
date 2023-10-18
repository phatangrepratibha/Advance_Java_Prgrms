import java.awt.*;
import java.awt.event.*;
class logindemo extends Frame implements ActionListener
{
	Label l4;
	Button b1;
	TextField tf1,tf2;
	logindemo()
	{
		setLayout(null);
		setBackground(Color.pink);		
		Label l1=new Label("login form");
		l1.setForeground(Color.red);
		Font f1=new Font("Arial black",Font.BOLD,20);
		l1.setFont(f1);
		Label l2=new Label("Enter Username");
	    setForeground(Color.black);
		/*Font f2=new Font("Arial black",Font.BOLD,15);
		setFont(f2);*/
		tf1=new TextField(30);
		Label l3=new Label("Enter Password");
	    tf2=new TextField(30);
		l4=new Label("       ");
	    b1=new Button("Login");
		tf2.setEchoChar('*');
		l1.setBounds(150,50,500,80);
		l2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		l3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		b1.setBounds(150,340,150,50);
		l4.setBounds(130,400,200,50);
		
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(b1);
		add(l4);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String un=tf1.getText();
		String psw=tf2.getText();
		if(un.equals("simran")&&psw.equals("sim123"))
		{
			l4.setText("login success");
		}
		else
		{
			l4.setText("fail...");
		}
	}
	public static void main(String args[])
	{
		logindemo p1=new logindemo();
		p1.setSize(500,500);
		p1.setTitle("login form");
		p1.setVisible(true);
	}
}
		
