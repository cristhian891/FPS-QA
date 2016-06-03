package fps.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Init {

public static WebDriver driver;
	
	public static void Initiate(String browser){
		
		if(browser.equals("chrome")){
			
		File src = new File("/Users/talosdigital/Documents/Testing tools/Selenium/chromedriver");
		System.setProperty("webdriver.chrome.driver", src.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://52.21.204.62:9002/fspstorefront/fspSite/es/MXN/login");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		}else if(browser.equals("firefox")){
			
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://52.21.204.62:9002/fspstorefront/fspSite/es/MXN/?site=fspSite#");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}else if(browser.equals("phantomjs")){
			
		File src = new File("/Users/talosdigital/Documents/Testing tools/PhantomJS/phantomjs-2.1.1-macosx/bin/phantomjs");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		driver = new PhantomJSDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://52.21.204.62:9002/fspstorefront/fspSite/es/MXN/login");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		}
	}
	public static void quit(){
		
		driver.quit();
	}
}
