package fps.utility;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utility {
	
	public static boolean checkElement (By ele){
		
		boolean present;
		
		try{
			
			Init.driver.findElement(ele);
			System.out.println("Element found.Test Passed");
			present = true;
		}
		catch(Exception e){
			
			e.getMessage();
			System.out.println("Element was not found. Test Failed. ERROR");
			present = false;
		}
		
		return present;

	}
	public static void captureScreenshot(WebDriver driver, String filename){
		
		try {
			TakesScreenshot ss = (TakesScreenshot)driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/"+ filename + ".png"));
			System.out.println("Screenshot taken");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Not able to take screenshot"+ e.getMessage());
		} 

	}
	
	public static void scrollUp () throws InterruptedException{
		
		JavascriptExecutor jse = (JavascriptExecutor)Init.driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);
	}
	
	public static void scrollDown () throws InterruptedException{
		
		JavascriptExecutor jse = (JavascriptExecutor)Init.driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
	}
	

}
