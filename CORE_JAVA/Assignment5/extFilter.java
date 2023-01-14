
import java.io.*;
public class extFilter implements FilenameFilter
{
	String ext;
	
	public extFilter(String e)
	{
		ext=e;
	}
	
	public boolean accept(File dir,String name)
	{
		return name.endsWith(ext);
	}
	
}
