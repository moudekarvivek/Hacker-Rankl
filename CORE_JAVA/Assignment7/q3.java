1//Font Family
import java.awt.*;
import java.applet.*;

/*
<applet code="q3" width=600 height=600>
</applet>
*/
public class q3 extends Applet
{

	public void paint(Graphics g)
	{
		String font="";
		String fontAvail[];
		int x=10;
		int y=10;
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontAvail=ge.getAvailableFontFamilyNames();
		for(int i=0;i<fontAvail.length;i++)
		{
			font=fontAvail[i]+" ";
			g.drawString(font,x,y);
			y=y+10;
			
		}
	}
}
