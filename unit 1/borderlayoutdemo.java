import java.awt.*;
class borderlayoutdemo extends Frame
{
	borderlayoutdemo()
	{
		BorderLayout bl=new BorderLayout(20,20);
		
		setLayout(bl);
		Button b1=new Button("east button");
		Button b2=new Button("west button");
		Button b3=new Button("north button");
		Button b4=new Button("south button");
		TextArea t1=new TextArea(50,40);
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(t1,BorderLayout.CENTER);
		
		
	}
 public static void main(String args[])
   {
     borderlayoutdemo f1=new  borderlayoutdemo();
	 f1.setVisible(true);
	 f1.setTitle("borderlayout");
	 f1.setSize(500,500);
	 
   }
}