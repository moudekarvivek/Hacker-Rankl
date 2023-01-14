import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class prog2 extends JFrame implements ActionListener
{	JFrame f;
	JLabel l1,l2,l3;
	JComboBox c1;
	String fontAvail[];
	DefaultListModel dlm;
	JRadioButton rb1,rb2;
	JList list;
	JTextField t1;
	JButton b1,b2;
	JPanel p1,p2;
	ButtonGroup g1;
	JScrollPane s;
	
		
	prog2()
	{
		f=new JFrame("Font");
		f.setSize(500,300);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,3,0,50));
		l1=new JLabel("Font");
		
		dlm=new DefaultListModel();
		for(int i=8;i<73;i++)
		{
			dlm.addElement(String.valueOf(i));
		}
		list=new JList(dlm);
		
		
		s=new JScrollPane(list);
		
		t1=new JTextField("Hello Everyone");
		t1.setEditable(false);
		
		l2=new JLabel("Font Style");
	 	
	 	l3=new JLabel("Size");
	
		
		b1=new JButton("Apply");
		b1.addActionListener(this);
		
		b2=new JButton("Exit");
		b2.addActionListener(this);
		
		c1=new JComboBox();
		
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontAvail=ge.getAvailableFontFamilyNames();
		for(int i=0;i<fontAvail.length;i++)
		{
			c1.addItem(fontAvail[i]);
			
		}
		p2=new JPanel();
		p2.setLayout(new GridLayout(2,1));
		
		g1=new ButtonGroup();
		rb1=new JRadioButton("Bold");
		rb1.setActionCommand("Bold");
		g1.add(rb1);
		
		
		rb2=new JRadioButton("Italic");
		rb2.setActionCommand("Italic");
		g1.add(rb2);
		
		p2.add(rb1);
		p2.add(rb2);
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(c1);
		p1.add(p2);
		
		p1.add(s);
		p1.add(t1);
		p1.add(b1);
		p1.add(b2);
		
		f.add(p1);
		
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	if(ae.getSource()==b2)
		{
			System.exit(0);
		}
		else
		{
			String font_family=(String)c1.getSelectedItem();
			String font_style=g1.getSelection().getActionCommand();
			int font_size=Integer.parseInt((String)list.getSelectedValue());
			
			Font font1;
			
			if(font_style.equals("Bold"))
			{
				font1=new Font(font_family,Font.BOLD,font_size);
				
			}
			else
			{
			font1=new Font(font_family,Font.ITALIC,font_size);
			}
			t1.setFont(font1);
		}
	}		
	public static void main(String args[])
	{
		prog2 p=new prog2();
	}
}
