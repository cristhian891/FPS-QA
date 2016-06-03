package fps.testsuite.sprint3;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fps.objectpages.CarritoPage;
import fps.objectpages.CatalogoPage;
import fps.objectpages.Header;
import fps.utility.Init;
import fps.utility.Utility;


public class CarritoTestCases {
	
	
	@BeforeClass
	public void Iniciar(){
		
		Init.Initiate("firefox");
		
	}
	
	//2853
	@Test (enabled = false)
	public void TC10_removerproductocarrito(){
		
		
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		CarritoPage.removerproducto();
		Utility.checkElement(CarritoPage.mensajeproductoremovido);
			
	}
	
	//2854
	@Test (enabled = false)
	public void TC11_modificarcantidad() throws InterruptedException {
		
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		CarritoPage.aumentarcantidad("2");
		Utility.scrollDown();
		System.out.println(CarritoPage.vercantidadtotal());
		Assert.assertEquals("2", CarritoPage.vercantidadtotal());
		
	}
	
	//2855
	@Test (enabled = false)
	public void TC12_norelcalculodeimpuestos(){
		
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		Utility.checkElement(CarritoPage.mensajenoincluyenimpuestos);
			
	}
	
	//2859
	@Test (enabled = false)
	public void TC14_regresaracarritocreado(){
			
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		Utility.checkElement(CarritoPage.realizarcomprabutton);		
			
	}
		
	//2859
	@Test (enabled = false)
	public void TC15_opcioncontinuarcomprando(){
			
	Header.gotoMedicamentos();
	CatalogoPage.agregaralCarrito();
	CatalogoPage.confirmariralcarrito();
	Utility.checkElement(CarritoPage.continuarcomprandobutton);
			
	}
	
	//2859
	@Test (enabled = true)
	public void TC16_opcionfinalizarcompra(){
		
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		Utility.checkElement(CarritoPage.realizarcomprabutton);
		
		
	}
	
	@Test (enabled = false)
	public void agregarproductosbuscando(){
		
		Header.buscarProducto("JABON BARRA GRISI");
		CatalogoPage.agregaralCarrito();
		CatalogoPage.confirmariralcarrito();
		
	}
	
	@Test (enabled = false)
	public void verificarcarrito(){
		
		Header.gotoMedicamentos();
		CatalogoPage.agregaralCarrito();
		
		
	}
}
