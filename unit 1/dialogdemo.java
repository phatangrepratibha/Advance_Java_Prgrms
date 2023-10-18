import java.awt.*;
class dialogdemo extends Frame
{
	public static void main(String args[])
	{
		dialogdemo dl =new dialogdemo();
		dl.setSize(500,500);
		dl.setVisible(true);
		dl.setTitle("mydialog");
		
		Dialog dd=new Dialog(dl,true);
		dd.setLayout(new FlowLayout());
		dd.add(new Button("yes"));
		dd.add(new Button("no"));
		dd.add(new Button("cancel"));
		dd.setVisible(true);
		dd.setSize(300,300);
	}
}
		
		
		
