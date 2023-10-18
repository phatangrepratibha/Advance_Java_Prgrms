import javax.swing.*;
import java.awt.*;

class panel1 extends Panel
{
   panel1()
   {
       setLayout(new FlowLayout());
	   JButton b1=new JButton("ok");
	   JButton b2=new JButton("cancel");
	   JButton b3=new JButton("retry");
	   add(b1);
	   add(b2);
	   add(b3);
   }
}

class panel2 extends Panel
{
   panel2()
   {
      setLayout(new FlowLayout());
	  JRadioButton b1=new JRadioButton("Male");
	  JRadioButton b2=new JRadioButton("Female");
	  JRadioButton b3=new JRadioButton("Other");
	   add(b1);
	   add(b2);
	   add(b3);
   }
}

class panel3 extends Panel
{
   panel3()
   {
      setLayout(new FlowLayout());
	  JTextField b1=new JTextField("First Name");
	  JTextField b2=new JTextField("Middle Name");
	  JTextField b3=new JTextField("Last Name");
	   add(b1);
	   add(b2);
	   add(b3);
   }
}
class jtabbedpanedemo extends JFrame
{
	jtabbedpanedemo()
	{
		Container c=getContentPane();
		panel1 p1=new panel1();
		panel2 p2=new panel2();
		panel3 p3=new panel3();
		
		JTabbedPane jt=new JTabbedPane();
		jt.addTab("tab1",p1);
		jt.addTab("tab2",p2);
		jt.addTab("tab3",p3);
		
		c.add(jt);
	}
	public static void main(String args[])
	{
		jtabbedpanedemo jtb=new jtabbedpanedemo();
		jtb.setVisible(true);
		jtb.setSize(500,500);
		jtb.setTitle("my tabbedpane");
		
	}
		
		
}
