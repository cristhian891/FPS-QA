package fps.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import fps.utility.Init;

public class CarritoPage {
	
	public static By removeicon = By.id("removeEntry_0");
	
	public static By agegraruncupon = By.xpath("html/body/main/div/div[3]/div[4]/div[1]/div/button");
	
	public static By continuarcomprandopopoupbutton = By.xpath("html/body/main/div/div[3]/div[4]/div[2]/div[1]/button");
	
	public static By realizarcomprabutton = By.xpath("html/body/main/div/div[3]/div[4]/div[2]/div[2]/button");
	
	public static By mensajeproductoremovido = By.xpath("html/body/main/div/div[2]/div");
	
	public static By preciototal = By.xpath("html/body/main/div/div[3]/div[5]/ul/li/div/div[1]/div[2]/div[4]/div");
	
	public static By cantidadtextfield = By.id("quantity_0");
	
	public static By mensajenoincluyenimpuestos = By.xpath("html/body/main/div/div[3]/div[8]/div/div[5]");
	
	public static By realizarcomprarbutton = By.xpath("html/body/main/div/div[3]/div[9]/div[2]/div/div[2]/div[2]/button");
	
	public static By continuarcomprandobutton = By.xpath("html/body/main/div/div[3]/div[9]/div[2]/div/div[2]/div[1]/button");
	
	
	public static void removerproducto(){
		
		Init.driver.findElement(removeicon).click();
	}
	
	public static void aumentarcantidad(String cant){
		
		Init.driver.findElement(cantidadtextfield).sendKeys(Keys.BACK_SPACE);
		Init.driver.findElement(cantidadtextfield).sendKeys(cant);
		Init.driver.findElement(cantidadtextfield).sendKeys(Keys.ENTER);
	}
	
	public static String vercantidadtotal(){
		String cant_total = Init.driver.findElement(cantidadtextfield).getAttribute("value");
		return cant_total;
	}
	
	public static void realizarcompra(){
		Init.driver.findElement(realizarcomprarbutton).click();
	}
}
