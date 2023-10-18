import java.awt.*;
class textareademo extends Frame 
{
	textareademo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
	TextArea t1=new TextArea("enter comments here",100,50,TextArea.SCROLLBARS_BOTH);
	add(t1);
	}
	
	
	public static void main(String args[])
	{
		textareademo d1=new textareademo();
		d1.setVisible(true);
		d1.setTitle("textarea control");
		d1.setSize(500,500);
	}
}