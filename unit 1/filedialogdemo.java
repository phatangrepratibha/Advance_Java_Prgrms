import java.awt.*;
import java.awt.event.*;
class filedialogdemo extends Frame implements ActionListener
{
	Button b1,b2;
	filedialogdemo()
	{
		setLayout(new FlowLayout());
		b1=new Button("open file dialog");
		b2=new Button("save file dialog");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
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
		filedialogdemo dl =new filedialogdemo();
		dl.setSize(500,500);
		dl.setVisible(true);
		dl.setTitle("myfiledialog");
	}
}