import java.awt.*;
class scrolldemo extends Frame 
{
	scrolldemo()
	{
	setLayout(null);
    setBackground(Color.pink);
	Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
	Scrollbar sb2=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
	sb1.setBackground(Color.blue);
	sb2.setBackground(Color.yellow);
	sb1.setBounds(150,40,50,420);
	sb2.setBounds(10,450,420,50);
	add(sb1);
	add(sb2);
	
	
	}
	
	public static void main(String args[])
	{
		scrolldemo d1=new scrolldemo();
		d1.setVisible(true);
		d1.setTitle("scroll control");
		d1.setSize(500,500);
	}
}