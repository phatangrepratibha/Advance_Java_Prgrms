import java.awt.*;
import java.awt.event.*;
class listdemo extends Frame implements ActionListener
{
	
	List l1,l2;
	Button b1;
	Label l3,l4;
	listdemo()
	{
		setLayout(null);
		setBackground(Color.blue);
	    l1=new List(3);
		l1.add("c");
		l1.add("c++");
		l1.add("java");
		l1.add("ajava");
		l1.add("python");
		l1.add("html");
		
		l2=new List(3,true);
		l2.add("korea");
		l2.add("india");
		l2.add("america");
		l2.add("australia");
		l2.add("england");
		l2.add("srilanka");
		b1=new Button("show");
		l3=new Label("                                 ");
		l4=new Label("                                                                    ");
		l1.setBounds(50,70,100,50);
		l3.setBounds(180,70,300,50);
		l2.setBounds(50,200,100,50);
		l4.setBounds(180,200,300,50);
		b1.setBounds(50,300,150,50);
		
		add(l1);add(l3);
		add(l2);add(l4);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String lang=l1.getSelectedItem();
		String country[]=l2.getSelectedItems();
		l3.setText("selected lang is " +lang);
		
		String str="";
		for(int i=0;i<country.length;i++)
		{
			str=str+country[i]+",";
		}
		l4.setText(str);
		
	}
	public static void main(String args[])
	{
		listdemo d1=new listdemo();
		d1.setVisible(true);
		d1.setTitle("choice control");
		d1.setSize(500,500);
	}
}