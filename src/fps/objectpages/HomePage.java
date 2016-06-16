package fps.objectpages;

import org.openqa.selenium.By;

import fps.utility.Init;

public class HomePage {
	
	public static By articulo1 = By.xpath("html/body/main/div/div[3]/div[2]/div[1]/div/div[1]/div/a/div[1]/img");
	public static By articulo2 = By.xpath("html/body/main/div/div[3]/div[2]/div[1]/div/div[2]/div/a/div[1]/img");
	public static By articulo3 = By.xpath("html/body/main/div/div[3]/div[2]/div[1]/div/div[3]/div/a/div[1]/img");
	public static By articulo4 = By.xpath("html/body/main/div/div[3]/div[2]/div[1]/div/div[4]/div/a/div[1]/img");
	public static By articulos = By.xpath("html/body/main/div/div[3]/div[2]/div[1]/div/div[5]/div/a/div[1]/img");
	
	// KEFLEX 250MG CODIGO: ITEM 325414
	public static void verproducto1(){
		Init.driver.findElement(articulo1).click();
	}
	// PROSCAR 5MG CODIGO: ITEM 325715
	public static void verproducto2(){
		Init.driver.findElement(articulo2).click();
		
	}
	// PROPACE 10MG CODIGO: ITEM 328796
	public static void verproducto3(){
		Init.driver.findElement(articulo3).click();	
	}
	// MISOPROSTOL 200MC CODIGO: ITEM 335443
	public static void verproducto4(){
		Init.driver.findElement(articulo4).click();	
	}
	// VENDAS ELASTICAS CODIGO: ITEM 335546
	public static void verproducto5(){
		Init.driver.findElement(articulo4).click();	
	}

}
