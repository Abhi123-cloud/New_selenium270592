package constancts;

public final class fremworkConstants 
{
	private static final String chromeDriverpath = System.getProperty(("user.dir")+
            "D:\\New chrome Driver\\chromedriver-win32\\chromedriver.exe");
	
	public static String getChromeDriver()
	{
		return chromeDriverpath;
	}
}
