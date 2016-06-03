package fps.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


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
