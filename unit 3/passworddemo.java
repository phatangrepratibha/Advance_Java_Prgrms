import java.awt.*;
import java.awt.event.*;
class passworddemo extends Frame implements ActionListener
{
   TextField tf1;
   Button b1;
  passworddemo()
  {
     setLayout(new FlowLayout());
	 tf1=new TextField(20);
	 b1=new Button("See Password");
	 tf1.setEchoChar('*');
	 add(tf1);
	 add(b1);
	 b1.addActionListener(this);
	 
  }
  public void actionPerformed(ActionEvent ae)
  {
	  String str=ae.getActionCommand();
	  if(str.equals("See Password"))
	  {
		  tf1.setEchoChar('\0');
		  b1.setLabel("Hide Password");
	  }
	  if(str.equals("Hide Password"))
	  {
		  tf1.setEchoChar('*');
		  b1.setLabel("See Password");
	  }
  }
  public static void main(String args[])
  {
    passworddemo pd=new passworddemo();
	pd.setVisible(true);
	pd.setSize(500,500);
	pd.setTitle("password demo");
  }
}