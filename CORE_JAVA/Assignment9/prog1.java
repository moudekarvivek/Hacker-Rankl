import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class prog1 extends JFrame implements ActionListener,KeyListener
{

	JLabel l1,l2,l3,l4,l22,l33,l44;
	JTextField t1;
	JButton b1,b2;
	int n;
	prog1()
	{
		JFrame f=new JFrame("prog1");
		f.setSize(400,400);
		f.setLayout(new GridLayout(5,2));
		l1=new JLabel("Decimal");
		t1=new JTextField(10);
		t1.addKeyListener(this);
		l2=new JLabel("Binary");
		l22=new JLabel();
		
		l3=new JLabel("Octal");
		l33=new JLabel();
		l4=new JLabel("Hexadecimal");
		l44=new JLabel();
		b1=new JButton("Convert");
		b1.addActionListener(this);
		
		b2=new JButton("Exit");
		b2.addActionListener(this);
		
		//t1.setEditable();
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(l22);
		f.add(l3);
		f.add(l33);
		f.add(l4);
		f.add(l44);
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{	if(ae.getSource()==b1)
		{
			n=Integer.valueOf(t1.getText());
			l22.setText(Integer.toBinaryString(n));
			l33.setText(Integer.toOctalString(n));
			l44.setText(Integer.toHexString(n));
		}	
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}
	public void keyTyped(KeyEvent ke)
	{
		char ch=ke.getKeyChar();
		
		if((ch>='0' && ch<='9')||ch=='\b' ||ch==(char)127)
		{
			t1.setEditable(true);
		}
		else
			t1.setEditable(false);
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void keyPressed(KeyEvent ke)
	{
	}
	public static void main(String[] args)
	{
		prog1 p=new prog1();
		
	}			
}
