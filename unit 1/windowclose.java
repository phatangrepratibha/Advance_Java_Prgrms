import java.awt.*;
import java.awt.event.*;

class paneldemo extends Panel 
{
    paneldemo()
  {
     FlowLayout f1=new FlowLayout();
     setLayout(f1);
     Label l1=new Label("this is panel window");
     Button b1=new Button("panel button");
     add(l1);
     add(b1);
  }
 }
 class windowclose extends Frame implements WindowListener
{
	windowclose()
	{
      FlowLayout f1=new FlowLayout();
      setLayout(f1);
      Label l1=new Label("this is frame window");
      Button b1=new Button("frame button");
      add(l1);
      add(b1);
	  
	  paneldemo p=new paneldemo();
	  add(p);
	  addWindowListener(this);
	  
	}
	public void windowClosing(WindowEvent we)
	{
		dispose();
		
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void  windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){} 
	public void  windowOpened(WindowEvent we){} 

public static void main(String args[])
{
	windowclose mp=new windowclose();
	mp.setSize(500,500);
	mp.setVisible(true);
	mp.setTitle("mywindowclose");
}
}
