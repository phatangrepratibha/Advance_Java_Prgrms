import javax.swing.*;
import java.awt.*;

class jscrollpane extends JFrame
{
	jscrollpane()
	{
	Container c=getContentPane();
	c.setLayout(new FlowLayout());
	
	JTextArea ta1=new JTextArea(20,25);
	
  int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
  int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
  
  JScrollPane js=new JScrollPane(ta1,v,h);
  
  c.add(js);
	}
	
	
	
	public static void main(String args[])
	{
		jscrollpane jtb=new jscrollpane();
		jtb.setVisible(true);
		jtb.setSize(500,500);
		jtb.setTitle("my jscrollpane");
		
	}
		
		
}
