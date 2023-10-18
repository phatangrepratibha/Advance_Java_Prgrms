import javax.swing.*;
import java.awt.*;
class jimagedemo extends JFrame
{
  jimagedemo()
  {
	  Container c= getContentPane();
	  FlowLayout f1=new FlowLayout();
	  c.setLayout(f1);
	  JLabel l1=new JLabel("Simran");
	  ImageIcon ii=new ImageIcon("C:/Users/supri/OneDrive/Desktop/advance images/prajakta.jpg");
	  JLabel l2=new JLabel(ii);
	  c.add(l1);
	  c.add(l2);
	  
	  
  }
  public static void main(String args[])
  {
	  jimagedemo j1=new jimagedemo();
	  j1.setVisible(true);
	  j1.setSize(500,500);
	  j1.setTitle("my image");
	  
	  
  }
}