import java.awt.*;
class flowlayoutdemo extends Frame
{
	flowlayoutdemo()
	{
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT,30,30);
		setLayout(f1);
		Button b1=new Button("ok");
		Button b2=new Button("click");
		Button b3=new Button("submit");
		add(b1);
		add(b2);
		add(b3);
		
		
	}
 public static void main(String args[])
   {
     flowlayoutdemo f1=new  flowlayoutdemo();
	 f1.setVisible(true);
	 f1.setTitle("flowlayout");
	 f1.setSize(500,500);
	 
   }
}