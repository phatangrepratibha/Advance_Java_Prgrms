import javax.swing.*;
import java.awt.*;

class jtable extends JFrame
{
	jtable()
	{
      Container c=getContentPane();
	  c.setLayout(new FlowLayout());
	  String colHeads[]={"Roll","Name","Marks"};
	  String data[][]={
		               {"12","dennis","80"},
					   {"13","bjrane","60"},
					   {"14","james","70"},
					   {"15","yang","90"},
					   {"16","lisa","100"}};
					   
	   JTable t1=new JTable(data,colHeads);				   
					   
	 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	 int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	 
	 JScrollPane jsp=new JScrollPane(t1,v,h);
	 c.add(jsp);
	  
	}


	public static void main(String args[])
	{
		jtable  jtb=new jtable ();
		jtb.setVisible(true);
		jtb.setSize(500,500);
		jtb.setTitle("my jscrollpane");

	}


}