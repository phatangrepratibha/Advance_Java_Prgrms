import java.awt.*;
class notepaddemo extends Frame
{

	notepaddemo()
	{
	setBackground(Color.pink);
	  MenuBar msb=new MenuBar();
	  
      Menu m1=new Menu("File");
	  MenuItem m11=new MenuItem("New");
	  MenuItem m12=new MenuItem("Open");
	  MenuItem m13=new MenuItem("Save");
	  m1.add(m11);
	  m1.add(m12);
	  m1.add(m13);
	  
      Menu m2=new Menu("Edit");
	  MenuItem m21=new MenuItem("Cut");
	  MenuItem m22=new MenuItem("Copy");
	  MenuItem m23=new MenuItem("paste");
	  m2.add(m21);
	  m2.add(m22);
	  m2.add(m23);
	  
	  Menu m3=new Menu("View");
	  Menu m31=new Menu("Zoom");
	  MenuItem m311=new MenuItem("Zoom In");
	  MenuItem m312=new MenuItem("Zoom Out");
	  MenuItem m313=new MenuItem("Restore Default Zoom");
	  
	  m31.add(m311);
	  m31.add(m312);
	  m31.add(m313);
	  
	  CheckboxMenuItem m32=new CheckboxMenuItem("Status Bar");
	  MenuItem m33=new MenuItem("Word Wrap");
	  m3.add(m31);
	  m3.add(m32);
	  m3.add(m33);
	  
	 msb.add(m1);
	 msb.add(m2);
	 msb.add(m3);
	 
	 setMenuBar(msb);
	 	  
	}
	public static void main(String args[])
	{
		notepaddemo d1=new notepaddemo();
		d1.setVisible(true);
		d1.setSize(800,600);
		d1.setTitle("Notepad");
	}
}