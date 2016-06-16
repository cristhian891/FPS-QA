package fps.regression_mainsuite;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import fps.objectpages.CarritoPage;
import fps.objectpages.Header;
import fps.objectpages.HomePage;
import fps.objectpages.LoginPage;
import fps.objectpages.ProductoPage;
import fps.utility.Init;
import fps.utility.Utility;


public class Functional_Sprint3 {
	

	@BeforeClass
	public void iniciar(){	
		Init.Initiate("firefox");
	}
	
	@AfterClass
	public void terminar(){
		Init.driver.quit();
	}
	
	// ------------------------------- TEST CASES ----------------------//
	
	// Test Cases para registro e inicio de sesion //
	
	@Test(enabled = false)
	public void registrarNuevoUsuario(){
		Header.gototoLoginPage();
		LoginPage.selectTitulo("002");
		LoginPage.crearcuenta("Roberto", "Suarez", "Gutierrez","test2@gmail.com","test4echo","test4echo");	
	}
	
	
	
	//-------------------------TEST CASES PARA EL CARRITO DE COMPRAS----------------------//
	
	//Issue 2923
	@Test (enabled = true, priority = 1)
	public void redondeodeVouchersPorcentaje(){	
		HomePage.verproducto1();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		Assert.assertEquals(CarritoPage.obtenerPrecioTotal(),"$303.00");
		Header.gotoHomePage();			
	}
	
	
	//Issue 2847
	@Test (enabled = true, priority=2)
	public void mostrarinfodelproducto(){	
		HomePage.verproducto1();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		Assert.assertNotNull(CarritoPage.imagenproducto1);
		Assert.assertNotNull(CarritoPage.precioproducto1);
		Header.gotoHomePage();
	
	}
	//Issue 2848
	@Test (enabled = true, priority=3)
	public void mostrarPreciodelProducto(){	
		
		HomePage.verproducto2();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		Assert.assertNotNull(CarritoPage.imagenproducto1);
		Assert.assertNotNull(CarritoPage.precioproducto1);
		Header.gotoHomePage();
	}
					
	//Issue 2853
	@Test (enabled = true, priority=4)
	public void removerProductodelCarrito(){
		
		HomePage.verproducto2();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		CarritoPage.removerproducto();
		Assert.assertNotNull(CarritoPage.mensajeproductoremovido);	
		Header.gotoHomePage();
		
		}
	//Issue 2854
	@Test (enabled = true, priority = 5)
	public void modificarCantidadProducto(){		
		HomePage.verproducto1();
		ProductoPage.aumentarCantidad();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		Assert.assertEquals(CarritoPage.obtenerPrecioTotal(), "$2,807.20","El precio no corresponde al la cantidad modificada");
		
		
		}
	
	//Issue 2855
	@Test (enabled = true, priority=6)
	public void nohaycalculodeImpuestos(){	
		Header.gotoCarrito();
		Assert.assertNotNull(CarritoPage.mensajenoincluyenimpuestos);
		Header.gotoHomePage();
					
		}
	
	//Issue 2858
	@Test (enabled = true, priority=7)
	public void seguircomprando() throws InterruptedException{
		
		HomePage.verproducto1();
		ProductoPage.agregaralcarrito();
		ProductoPage.seguirComprando();
		Assert.assertTrue(Init.driver.getTitle().contains("Keflex"));
		System.out.println(Init.driver.getTitle());
		Thread.sleep(2000);
		Header.gotoHomePage();
	
		}
	//Issue 2859
	@Test (enabled = true, priority=8)
	public void finalizarCompra() throws InterruptedException{
		HomePage.verproducto2();
		ProductoPage.agregaralcarrito();
		ProductoPage.realizarCompra();
		Assert.assertTrue(Init.driver.getTitle().contains("Carrito"));
		System.out.println(Init.driver.getTitle());
		Header.gotoHomePage();
		Thread.sleep(2000);
		
					
		}
	
	//Issue 2844
	@Test (enabled = true, priority=9)
	public void codigodeProducto8digitos(){		
		HomePage.verproducto1();
		Assert.assertEquals(ProductoPage.vercodigodeproducto(),"ITEM 325414" );
		Header.gotoHomePage();
		}
	
	@Test (enabled = true, priority=10)
	public void eliminarDesdeElMiniCart() {	
		Header.desplegarcarrito();
		Header.eliminarproducto();
		Assert.assertNotNull(Header.productocarritotext);
		}
	
	
	@Test (enabled = true, priority=11)
	public void redondeoPrecioProducto() {	
		HomePage.verproducto2();
		Assert.assertEquals(ProductoPage.obtenerprecioProducto(),"$1,100.35", "El precio del producto NO es correcto");
		}
	
}
