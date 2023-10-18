import java.awt.*;
import java.awt.event.*;
class panel1 extends Panel
{
   panel1()
   {
      FlowLayout f1=new FlowLayout();
	  setLayout(f1);
	  Button b1=new Button("east region");
	  add(b1);
   }
}   
 class panel2 extends Panel
{
   panel2()
   {
      FlowLayout f1=new FlowLayout();
	  setLayout(f1);
	  Button b1=new Button("west region");
	  add(b1);
   }
}   
   
class panel3 extends Panel
{
   panel3()
   {
      FlowLayout f1=new FlowLayout();
	  setLayout(f1);
	  Button b1=new Button("north region");
	  add(b1);
   } 
}
class panel4 extends Panel
{
   panel4()
   {
      FlowLayout f1=new FlowLayout();
	  setLayout(f1);
	  Button b1=new Button("south region");
	  add(b1);
   }  
} 

class mainpanel2 extends Frame implements ActionListener
{  
Button bt1,bt2,bt3,bt4;
  mainpanel2()
  {
	  BorderLayout b=new BorderLayout();
	  setLayout(b);
	  Panel p=new Panel();
	  bt1=new Button("show panel1");
	  bt2=new Button("show panel2");
	  bt3=new Button("show panel3");
	  bt4=new Button("show panel4");
	  p.add(bt1);
	  p.add(bt2);
	  p.add(bt3);
      p.add(bt4);	 
      add(p,BorderLayout.CENTER);	
	  bt1.addActionListener(this);
	  bt2.addActionListener(this);
	  bt3.addActionListener(this);
	  bt4.addActionListener(this);
	  	  
  }
  
  public void actionPerformed(ActionEvent ae)
  {
	  if(ae.getSource()==bt1)
	  {
		  panel1 p1=new panel1();
		  add(p1,BorderLayout.EAST);
	  }
	  
	   else if(ae.getSource()==bt2)
	  {
		  panel2 p2=new panel2();
		  add(p2,BorderLayout.WEST);
	  }
	  
	   else if(ae.getSource()==bt3)
	  {
		  panel3 p3=new panel3();
		  add(p3,BorderLayout.NORTH);
	  }
	  
	   else if(ae.getSource()==bt4)
	  {
		  panel4 p4=new panel4();
		  add(p4,BorderLayout.SOUTH);
	  }
  }
  
  
 public static void main(String args[])
 {
	mainpanel2 mp=new mainpanel2();
	mp.setSize(500,500);
	mp.setVisible(true);
	mp.setTitle("mypanel2");
 }
}