import javax.swing.*;
import java.awt.*;
class jprogressbar extends JFrame
{
	JProgressBar jsb;
	jprogressbar()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		jsb=new JProgressBar(0,3000);	
		jsb.setStringPainted(true);
		jsb.setBounds(120,150,200,40);
		jsb.setValue(1000);
		c.add(jsb);
		
	}
	void setProgressBarValue()
	{
		int i=0;
		while(i<=3000)
		{
			jsb.setValue(i);
			i=i+20;
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
	public static void main(String args[])
	{
		jprogressbar f1=new jprogressbar();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my jprogressbar");
		f1.setProgressBarValue();
	}
}