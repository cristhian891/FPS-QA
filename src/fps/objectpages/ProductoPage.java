package fps.objectpages;

import org.openqa.selenium.By;

import fps.utility.Init;

public class ProductoPage {
	
	public static By agegaralcarritobutton = By.id("addToCartButton");
	public static By seguircomprandobutton = By.xpath("html/body/div[3]/div/div/div[2]/span/div/div[3]/button");
	public static By realizarcomprabutton = By.xpath("html/body/div[3]/div/div/div[2]/span/div/div[3]/a");
	public static By codigoproducto = By.xpath("html/body/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[1]/span");
	public static By aumentarcantidadbutton = By.xpath("html/body/main/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/span[2]/button");
	public static By disminuircantidadbutton = By.xpath("html/body/main/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/span[1]/button");
	public static By preciodeproducto = By.xpath("html/body/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div");
	
	public static void agregaralcarrito(){
		Init.driver.findElement(agegaralcarritobutton).click();
	}
	
	//----- POPUP methods----------------------------------//
	public static void seguirComprando(){
		Init.driver.findElement(seguircomprandobutton).click();
	}
	public static void realizarCompra(){
		Init.driver.findElement(realizarcomprabutton).click();
	}
	public static String vercodigodeproducto(){
		String codigo = Init.driver.findElement(codigoproducto).getText();
		System.out.println(codigo);
		return codigo;
	}
	public static String obtenerprecioProducto(){
		String precio = Init.driver.findElement(preciodeproducto).getText();
		System.out.println("El precio de este producto es "+ precio);
		return precio;
	}
	public static void aumentarCantidad(){
		Init.driver.findElement(aumentarcantidadbutton).click();
	}
	public static void disminuirCantidad(){
		Init.driver.findElement(disminuircantidadbutton).click();
	}
}
