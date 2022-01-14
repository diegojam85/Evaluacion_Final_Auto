package test.selenium;

import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginIncorrecto {

	private WebDriver driver;

	@Test
	public void f() {
		WebElement user = driver.findElement(By.name("usuario"));
		user.sendKeys("desconocido");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("desconocido");
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expectedData = "Login Incorrecto";
		
		int indexOf = driver.getPageSource().indexOf(expectedData);
		
		assertNotEquals(indexOf, -1);
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Dropbox\\IPLACEX\\Automatizacion_de_Pruebas\\bk\\Evaluacion_Final\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8199/CtaCorriente-0.0.1-SNAPSHOT/login.jsp");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	

}
