package fps.testsuite.sprint3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fps.objectpages.CatalogoPage;
import fps.objectpages.Header;
import fps.objectpages.LoginPage;
import fps.utility.Init;

public class RegistroTestCases {
	
	String señora = "0001";
	String señor = "0002";	
	String empresa = "0003";
	String señorseñora = "0004";
	

	@BeforeClass
	public void Iniciar(){
		
		Init.Initiate("firefox");
		
	}
	
	@Test(enabled = false)
	public void TC1_Registrarse(){
		
		
		LoginPage.gotologinpage();
		LoginPage.selectTitulo(señor);
		LoginPage.crearcuenta();	
	}
	
	@Test (enabled = false)
	public void iniciarsesion(){
		
		LoginPage.gotologinpage();
		LoginPage.iniciarsesion("test1@gmai.com", "farmacia1");
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
	}
}
