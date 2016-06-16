package fps.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import fps.utility.Init;

public class CarritoPage {
	
	public static By removeicon = By.id("removeEntry_0");
	public static By agegraruncupon = By.xpath("html/body/main/div/div[3]/div[4]/div[1]/div/button");
	public static By mensajeproductoremovido = By.xpath("html/body/main/div/div[2]/div");
	public static By preciototal = By.xpath("html/body/main/div/div[3]/div[2]/div[2]/div/dl/dl/dd[1]/h4/b");	
	public static By mensajenoincluyenimpuestos = By.xpath("html/body/main/div/div[3]/div[2]/div[2]/div/dl/dl/dt[2]/small");
	public static By realizarcomprabutton = By.xpath("html/body/main/div/div[3]/div[2]/div[2]/div/dl/button");
	public static By imagenproducto1 = By.xpath("html/body/main/div/div[3]/div[1]/table/tbody/tr/td[1]/a/img");
	public static By precioproducto1 = By.xpath("html/body/main/div/div[3]/div[1]/table/tbody/tr/td[5]/b");
	public static By cantidadtextfield = By.id("quantity_0");
	public static By tituloproducto1 = By.xpath("html/body/main/div/div[3]/div[1]/table/tbody/tr/td[2]/h5/a");
	
	public static void removerproducto(){
		Init.driver.findElement(removeicon).click();
	}
	
	public static String vercantidadtotal(){
		String cant_total = Init.driver.findElement(cantidadtextfield).getText();
		System.out.println(cant_total);
		return cant_total;
	}
	
	public static void realizarcompra(){
		Init.driver.findElement(realizarcomprabutton).click();
	}
	
	public static String obtenerPrecioProducto1(){
		String precioproduct = Init.driver.findElement(precioproducto1).getAttribute("value");
		return precioproduct;	
	}
	public static String retornartituloproducto(){
		String tituloproducto = Init.driver.findElement(tituloproducto1).getText();
		System.out.println(tituloproducto);
		return tituloproducto;
	}
	
	public static String obtenerPrecioTotal(){
		String precio_total = Init.driver.findElement(preciototal).getText();
		System.out.println("El pecio total del carrito es "+ precio_total);
		return precio_total;
	}
	
	public static void vaciarCarrito(){
		
		removerproducto();
	}
	
}
