package fps.regression_mainsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fps.objectpages.CarritoPage;
import fps.objectpages.Header;
import fps.objectpages.HomePage;
import fps.objectpages.LoginPage;
import fps.objectpages.ProductoPage;
import fps.utility.Init;
import fps.utility.Utility;


public class Functional_Sprint4 {
	@BeforeClass
	public void iniciar(){	
		Init.Initiate("firefox");
	}
	
	@Test (enabled = true, priority=1)
	public void redondeoPrecioProducto() {
		
	
		}
	
}
