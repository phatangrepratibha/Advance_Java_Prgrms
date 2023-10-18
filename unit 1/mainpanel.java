import java.awt.*;
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
 class mainpanel extends Frame
{
	mainpanel()
	{
      FlowLayout f1=new FlowLayout();
      setLayout(f1);
      Label l1=new Label("this is frame window");
      Button b1=new Button("frame button");
      add(l1);
      add(b1);
	  
	  paneldemo p=new paneldemo();
	  add(p);
	  
	}

public static void main(String args[])
{
	mainpanel mp=new mainpanel();
	mp.setSize(500,500);
	mp.setVisible(true);
	mp.setTitle("mypanel");
}
}


	
 