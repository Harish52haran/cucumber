package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bro {

	static WebDriver d;
	public static WebDriver open(String dri,String url)
	{
		if(dri.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ll\\chromedriver.exe");
		d=new ChromeDriver();
		}
		d.manage().window().maximize();
		d.get(url);
		
		return d;
	}
}
