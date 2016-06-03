package fps.objectpages;

import org.openqa.selenium.By;

import fps.utility.Init;

public class CatalogoPage {

	public static By agregaralcarritobutton = By.xpath
			("html/body/main/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div[2]/form/button");
	
	public static By realizarcomprabutton = By.xpath("html/body/div[3]/div[1]/div[2]/div[2]/div[1]/div/a[1]");
	
	public static By continuarcomprandobutton = By.xpath("html/body/div[3]/div[1]/div[2]/div[2]/div[1]/div/a[2]");
	
	
	
	
	public static void agregaralCarrito(){
		Init.driver.findElement(agregaralcarritobutton).click();
	}
	
	public static void confirmariralcarrito(){
		
		Init.driver.findElement(realizarcomprabutton).click();
	}
	
	public static void confirmarcontinuarcomprando(){
		
		Init.driver.findElement(continuarcomprandobutton).click();
	}
}
