import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
class jtreedemo extends JFrame
{
	jtreedemo()
	{
		Container c=getContentPane();
		BorderLayout bl=new BorderLayout();
		c.setLayout(bl);
		
		DefaultMutableTreeNode lang=new DefaultMutableTreeNode("Languages");
		DefaultMutableTreeNode l1=new DefaultMutableTreeNode("Pop");
		DefaultMutableTreeNode l11=new DefaultMutableTreeNode("C Lang");
		DefaultMutableTreeNode l12=new DefaultMutableTreeNode("Pascal");
		DefaultMutableTreeNode l13=new DefaultMutableTreeNode("fortran");
		l1.add(l11);
		l1.add(l12);
		l1.add(l13);
		
		DefaultMutableTreeNode l2=new DefaultMutableTreeNode("Oop");
		DefaultMutableTreeNode l21=new DefaultMutableTreeNode("C++ Lang");
		DefaultMutableTreeNode l22=new DefaultMutableTreeNode("Java Lang");
		DefaultMutableTreeNode l23=new DefaultMutableTreeNode("Python Lang");
		
		l2.add(l21);
		l2.add(l22);
		l2.add(l23);
		
		lang.add(l1);
		lang.add(l2);
		
		JTree jt=new JTree(lang);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane jsp=new JScrollPane(jt,v,h);
		c.add(jsp,BorderLayout.WEST);
		
	}
	public static void main(String args[])
	{
		jtreedemo f1=new jtreedemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("my jtree");
	}
}
		

