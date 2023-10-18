import java.awt.*;
import java.awt.event.*;
class keyeventdemo extends Frame implements KeyListener
{
	TextArea ta1;
  keyeventdemo()
  {
    FlowLayout f1=new FlowLayout();
	setLayout(f1);
	ta1=new TextArea(10,50);
	add(ta1);
	ta1.addKeyListener(this);
	
  }
  public void keyPressed(KeyEvent ke)
  {
	  ta1.setText("key is pressed..");
  }
   public void keyReleased(KeyEvent ke)
  {
	  ta1.setText("key is release..");
  }
   public void keyTyped(KeyEvent ke)
  {
	  ta1.setText("key is typed..");
  }
  public static void main(String args[])
  {
     keyeventdemo kd=new keyeventdemo();
	 kd.setSize(500,500);
	 kd.setVisible(true);
	 kd.setTitle("keyevent");
	 
  }
}