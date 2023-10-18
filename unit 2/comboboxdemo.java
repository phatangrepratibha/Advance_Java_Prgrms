import javax.swing.*;
import java.awt.*;
class comboboxdemo extends JFrame
{
 comboboxdemo()
 {
	Container c=getContentPane();
	FlowLayout f1=new FlowLayout();
	c.setLayout(f1);
	JComboBox jc1=new JComboBox();
	jc1.addItem("c lang");
	jc1.addItem("c++ lang");
	jc1.addItem("java lang");
	jc1.addItem("advance java lang");
	jc1.addItem("python");
	c.add(jc1);
 
 }
  
  public static void main(String args[])
  {
	  comboboxdemo j1=new comboboxdemo();
	  j1.setVisible(true);
	  j1.setSize(500,500);
	  j1.setTitle("my comboboxdemo");
	  
	  
  }
}

