import javax.swing.*;
import java.awt.*;
class jtooltiptext extends JFrame
{
  jtooltiptext()
  {
	  Container c=getContentPane();
	  c.setLayout(new FlowLayout());
	  JButton b1=new JButton("Simran");
	  b1.setToolTipText("This is swing button");
	  c.add(b1);
  }
  public static void main(String args[])
	{
		jtooltiptext f1=new jtooltiptext();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my jtooltiptextbar");
		
	}
}