package fps.regression_mainsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fps.objectpages.Header;
import fps.objectpages.LoginPage;
import fps.utility.Init;

public class CerrarSesion {
	
	@BeforeClass
	public void iniciar(){	
		Init.Initiate("firefox");
	}
	
	@AfterClass
	public void terminar(){
		Init.driver.quit();
	}
	@Test(enabled = true)
	public void cerrarSesion(){
		System.out.println("Inicia Sesion");
		Header.gototoLoginPage();
		LoginPage.iniciarsesion("test1@gmail.com", "test4echo");
		Header.desplegrCuentaInfo();
		Header.gotoMiCuenta("cerrarsesion");
		System.out.println("Finaliza sesion");
	}
}
