import java.awt.*;
class gridlayoutdemo extends Frame
{
	gridlayoutdemo()
	{
		GridLayout gl=new GridLayout(5,5);	
		setLayout(gl);
		for(int i=0;i<=25;i++)
		{
			add(new Button("Button"+i));
		}
		
		
	}
 public static void main(String args[])
   {
     gridlayoutdemo f1=new  gridlayoutdemo();
	 f1.setVisible(true);
	 f1.setTitle("mygridlayout");
	 f1.setSize(500,500);
	 
   }
}