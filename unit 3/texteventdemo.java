import java.awt.*;
import java.awt.event.*;
class texteventdemo extends Frame implements TextListener
{
	TextField tf1;
	Label l1;
	Label l2;
   texteventdemo()
   {
      FlowLayout f1=new FlowLayout();
	  setLayout(f1);
	  tf1=new TextField(30);
	  l1=new Label("                                      ");
	  l2=new Label("                                                                    ");
	 
	  add(tf1);
	  add(l1);
	  add(l2);
	  tf1.addTextListener(this);
   }
   public void textValueChanged(TextEvent te)
   {
	   l1.setText("Typing...");
	   l2.setText(tf1.getText());
	  
	   
   }
   public static void main(String args[])
   {
     texteventdemo td=new texteventdemo();
	 td.setSize(500,500);
	 td.setVisible(true);
	 td.setTitle("textevent");
   }
}