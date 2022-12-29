package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public String getPropertydata(String key) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fil = new FileInputStream(autoconstant.propertyfilePath);
		
		p.load(fil);
		
		return p.getProperty(key);
	}
}
