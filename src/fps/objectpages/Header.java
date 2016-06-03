package fps.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import fps.utility.Init;

public class Header {
	
	public static By homeicon = By.xpath("html/body/main/header/div/div[1]/div/a/img");
	
	public static By medicamentosicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[1]/a");
	
	public static By cuidadosaludicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[2]/a");
	
	public static By saludnaturaldicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[3]/a");
	
	public static By vitaminasicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[4]/a");
	
	public static By dermocosmeticosicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[5]/a");
	
	public static By cuidadopersonalicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[6]/a");
	
	public static By bebesicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[7]/a");
	
	public static By alimentosybebidasicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[8]/a");
	
	public static By saludsexualicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[9]/a");
	
	public static By searchbar = By.id("js-site-search-input");
	
	public static By registroequilibriolink = By.xpath("html/body/main/header/div/nav/ul[2]/li[1]/a");
	
	public static By localizadorlink = By.xpath("html/body/main/header/div/nav/ul[2]/li[2]/a");
	
	public static By facturacionlink = By.xpath("html/body/main/header/div/nav/ul[2]/li[3]/a");
	
	
	public static void buscarProducto(String item){
		
		Init.driver.findElement(searchbar).sendKeys(item);
		Init.driver.findElement(searchbar).sendKeys(Keys.ENTER);
	}
	public static void gotoMedicamentos(){
		
		Init.driver.findElement(medicamentosicon).click();
	}
	
	public static void gotoCuidadoSalud(){
		
		Init.driver.findElement(cuidadosaludicon).click();
	}
	
	public static void gotoSaludNatural(){
		
		Init.driver.findElement(cuidadosaludicon).click();
	}
	
	public static void gotoVitaminasyMinerales(){
		
		Init.driver.findElement(vitaminasicon).click();
	}
	
	public static void gotoDermocosmeticos(){
		
		Init.driver.findElement(dermocosmeticosicon).click();
	}
	
	public static void gotoCuidadoPersonal(){
		
		Init.driver.findElement(cuidadopersonalicon).click();
	}
	
	public static void gotoBebes(){
		
		Init.driver.findElement(bebesicon).click();
	}
	
	public static void gotoAlimentosyBebidas(){
		
		Init.driver.findElement(alimentosybebidasicon).click();
	}
	
	public static void gotoSaludSexual(){
		
		Init.driver.findElement(saludsexualicon).click();
	}
	

}
