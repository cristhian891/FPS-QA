package fps.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fps.utility.Init;

public class Header {
	
	public static By homeicon = By.xpath("html/body/main/header/div/div[1]/div/a/img");
	
	//----------------- ICONES DE CATEGORIA -------------------//
	public static By medicamentosicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[1]/a");
	public static By equipoybotiquinicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[2]/a");
	public static By saludnaturalicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[3]/a");
	public static By vitaminasicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[4]/a");
	public static By dermocosmeticosicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[5]/a");
	public static By cuidadopersonalicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[6]/a");
	public static By bebesicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[7]/a");
	public static By alimentosybebidasicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[8]/a");
	public static By saludsexualicon = By.xpath("html/body/main/header/div/nav/ul[1]/li[9]/a");
	
	// ------------ LINKS HEADER (TOP)--------------------------//
	public static By searchbar = By.id("js-site-search-input");
	public static By registroequilibriolink = By.xpath("html/body/main/header/div/nav/ul[2]/li[1]/a");
	public static By localizadorlink = By.xpath("html/body/main/header/div/nav/ul[2]/li[2]/a");
	public static By facturacionlink = By.xpath("html/body/main/header/div/nav/ul[2]/li[3]/a");
	public static By carritoicon = By.xpath("html/body/main/header/div/nav/div[3]/a[2]/button");
	public static By cuentaicon = By.xpath("html/body/main/header/div/nav/div[2]/a/button");
	public static By cuentaiconreg = By.xpath("html/body/main/header/div/nav/div[2]/button");
	
	
	//----------- Locators del MINI CART-------------------------//
	
	public static By productocarritotext = By.xpath("html/body/main/header/div/nav/div[3]/div/div/div[1]/div/div/div[2]/p[1]/a");
	public static By eliminarproductobutton = By.xpath("html/body/main/header/div/nav/div[3]/div/div/div[1]/div/div/div[2]/button");
	
	//------------- Locators de Mi Cuenta ----------------------//
	public static By mensajeinicio = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[1]/a");
	public static By miperfilbutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[2]/a");
	public static By direccionesdeenviobutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[3]/a");
	public static By formasdepagobutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[4]/a");
	public static By datosdefacturacionbutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[5]/a");
	public static By programaequilibriobutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[6]/a");
	public static By historialdepedidosbutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[7]/a");
	public static By faqsbutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[8]/a");
	public static By cerrarsesionbutton = By.xpath("html/body/main/header/div/nav/div[2]/ul/li[9]/a");
	

	public static void buscarProducto(String item){	
		Init.driver.findElement(searchbar).sendKeys(item);
		Init.driver.findElement(searchbar).sendKeys(Keys.ENTER);	
	}
	public static void gotoCategoria(String categoria){
		String med = "medicamentos";
		String equip = "equipo";
		String saludn ="saludnatrual";
		String vitam = "vitaminasysuplementos";
		String dermo ="dermocosmeticos";
		String cuidado ="cuidadopersonal";
		String beb ="bebes";
		String alimen ="alimentos";
		String saludsex ="saludsexual";
		
		
		if(categoria.equals(med)){
			Init.driver.findElement(medicamentosicon).click();
		}else if(categoria.equals(equip)){
			Init.driver.findElement(equipoybotiquinicon).click();
		}else if(categoria.equals(saludn)){
			Init.driver.findElement(saludnaturalicon).click();
		}else if(categoria.equals(vitam)){
			Init.driver.findElement(vitaminasicon).click();
		}else if(categoria.equals(dermo)){
			Init.driver.findElement(dermocosmeticosicon).click();
		}else if(categoria.equals(cuidado)){
			Init.driver.findElement(cuidadopersonalicon).click();
		}else if(categoria.equals(beb)){
			Init.driver.findElement(bebesicon).click();
		}else if(categoria.equals(alimen)){
			Init.driver.findElement(alimentosybebidasicon).click();
		}else if(categoria.equals(saludsex)){
			Init.driver.findElement(saludsexualicon).click();
		}
			
	}
	
	
	public static void gotoCarrito(){
		Init.driver.findElement(carritoicon).click();
	}
	public static void gototoLoginPage(){
		Init.driver.findElement(cuentaicon).click();
	}

	public static void gotoHomePage(){	
		Init.driver.findElement(homeicon).click();
	}
	public static void cerrarSesion(){	
		Init.driver.findElement(cerrarsesionbutton).click();
	}
	public static void eliminarproducto(){	
		Init.driver.findElement(eliminarproductobutton).click();
	}
	
	public static void desplegarcarrito(){
		Actions action = new Actions(Init.driver);
		WebElement we = Init.driver.findElement(carritoicon);
		action.moveToElement(we).build().perform();
	}
	
	public static void desplegrCuentaInfo(){
		Actions action = new Actions(Init.driver);
		WebElement nn = Init.driver.findElement(cuentaiconreg);
		action.moveToElement(nn).build().perform();
	}
	
	public static void gotoMiCuenta(String seccion){
		
		if(seccion.equals("miperfil")){
			Init.driver.findElement(miperfilbutton).click();
		}else if(seccion.equals("direcciones")){
			Init.driver.findElement(direccionesdeenviobutton).click();
		}else if(seccion.equals("formasdepago")){
			Init.driver.findElement(formasdepagobutton).click();
		}else if(seccion.equals("datosdefacturacion")){
			Init.driver.findElement(datosdefacturacionbutton).click();
		}else if(seccion.equals("programaequilibrio")){
			Init.driver.findElement(programaequilibriobutton).click();
		}else if(seccion.equals("historialdepedidos")){
			Init.driver.findElement(historialdepedidosbutton).click();
		}else if(seccion.equals("faqs")){
			Init.driver.findElement(faqsbutton).click();
		}else if(seccion.equals("cerrarsesion")){
			Init.driver.findElement(cerrarsesionbutton).click();
		}
	}
}
