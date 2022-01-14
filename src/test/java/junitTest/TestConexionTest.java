package test.java.junitTest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConexionTest {

	public TestConexionTest(){
		
	}
	
	@BeforeClass
	public static void setUpClass() {
		
	}
	
	@AfterClass
	public static void tearDownClass() {
		
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testConexion() {
		Assert.assertNotSame(null, getConexion());
	}
	
	public static Connection getConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentas_clientes?useSSL=false","root", "");
			
			return connection;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
