import javax.swing.*;
import java.awt.*;
class jsliderdemo extends JFrame
{
	jsliderdemo()
	{
		Container c=getContentPane();
		c.setLayout(null);
		JSlider js=new JSlider(0,200,50);
		js.setBounds(150,150,180,40);
		js.setMinorTickSpacing(50);
		js.setMajorTickSpacing(50);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		js.setPaintTrack(true);
		
		c.add(js);
	}
	 public static void main(String args[])
	{
		jsliderdemo f1=new jsliderdemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my jsliderdemo");
		
	}
}