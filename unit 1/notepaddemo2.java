import java.awt.*;
import java.awt.event.*;
class notepaddemo2 extends Frame implements ActionListener
{
	MenuItem m12,m13;
	notepaddemo2()
	{
	setBackground(Color.pink);
	  MenuBar msb=new MenuBar();
	  
      Menu m1=new Menu("File");
	  MenuItem m11=new MenuItem("New");
	  m12=new MenuItem("Open");
	  m13=new MenuItem("Save");
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
	 
	 m12.addActionListener(this);
	 m13.addActionListener(this);
	 
	 	  
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m12)
		{
			FileDialog fd=new FileDialog(this,"Simran open",FileDialog.LOAD);
			fd.setVisible(true);
			
		}
		
		else
		{
			FileDialog fd1=new FileDialog(this,"Simran save",FileDialog.SAVE);
			fd1.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		notepaddemo2 d1=new notepaddemo2();
		d1.setVisible(true);
		d1.setSize(800,600);
		d1.setTitle("Notepad");
	}
}