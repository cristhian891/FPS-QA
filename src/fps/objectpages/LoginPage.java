package fps.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import fps.utility.Init;

public class LoginPage {

	
	//Locators for the login page https://52.21.204.62:9002/fspstorefront/fspSite/es/MXN/login
	
	public static By titulodropdown = By.id("register.title");
	
	public static By nombrefield = By.id("register.firstName");
	
	public static By apellidopaternofield = By.id("register.lastName");
	
	public static By apellidomaternofield = By.id("register.lastNameMaternal");
	
	public static By correoelectronicofield = By.id("register.email");
	
	public static By contraseñafield = By.id("password");
			
	public static By confirmarcontraseñafield = By.id("register.checkPwd");	
	
	public static By registrarbutton = By.xpath("html/body/main/div/div[2]/div[2]/div/form/div[8]/button");
	
	public static By direcciondecorreoelectronicofield = By.id("j_username");
	
	public static By contraseñasigninfield = By.id("j_password");
	
	public static By iniciodesesionbutton = By.xpath("html/body/main/div/div[2]/div[1]/div/form/button");
	
	
			
	public static void selectTitulo(String titulo){
		

		WebElement titulo_dropdown = Init.driver.findElement(titulodropdown);
		Select title = new Select (titulo_dropdown);
		title.selectByValue(titulo);
	}
	
	public static void gotologinpage(){
		
		Init.driver.get("https://52.21.204.62:9002/fspstorefront/fspSite/es/MXN/login");
	}
	
	public static void crearcuenta(){
		
		Init.driver.findElement(nombrefield).sendKeys("Victor");
		Init.driver.findElement(apellidopaternofield).sendKeys("Obama");
		Init.driver.findElement(apellidomaternofield).sendKeys("Hernandez");
		Init.driver.findElement(correoelectronicofield).sendKeys("test2@gmail.com");
		Init.driver.findElement(contraseñafield).sendKeys("farmacia1");
		Init.driver.findElement(confirmarcontraseñafield).sendKeys("farmacia1");
		
	}
	
	public static void iniciarsesion(String username, String password){
		
		Init.driver.findElement(direcciondecorreoelectronicofield).sendKeys(username);
		Init.driver.findElement(contraseñasigninfield).sendKeys(password);
		Init.driver.findElement(iniciodesesionbutton).click();
	}
}


