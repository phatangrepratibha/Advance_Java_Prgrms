import java.awt.*;
import java.awt.event.*;
class squaredemo extends Frame implements ActionListener,MouseListener
{
	Label l1,l2;
	TextField tf1,tf2;
	Button b1;
	squaredemo()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		l1=new Label("Enter the number");
		l2=new Label("Result is:");
		tf1=new TextField(20);
		tf2=new TextField(20);
		b1=new Button("find square");
		add(l1);add(tf1);add(l2);add(tf2);add(b1);
		b1.addActionListener(this);
		tf1.addMouseListener(this);
		tf2.addMouseListener(this);
			
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no=Integer.parseInt(tf1.getText());
		int result=no*no;
		tf2.setText(result+"");
		
	}
	public void mouseEntered(MouseEvent me)
	{
		tf1.setText("");
		tf2.setText("");
	}
	public void  mouseExited(MouseEvent me){}
	public void  mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public static void main(String args[])
	{
		squaredemo sq=new squaredemo();
		sq.setVisible(true);
		sq.setSize(500,500);
		sq.setTitle("event program");
	}
}