package test.java.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogin {
	
	private WebDriver driver;

	@Given("^Abrir Chrome$")
	public void abrir_Chrome() throws Throwable {
		System.out.println("Este paso abre el navegador Google Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diego\\eclipse-workspaceNuevo\\Evaluacion_Final\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/Evaluacion_Final/login.jsp");
	}

	@When("^Ingresa Username \"([^\"]*)\" y Password \"([^\"]*)\"$")
	public void ingresa_Username_y_Password(String arg1, String arg2) throws Throwable {
		System.out.println("En este paso se ingresan las credenciales del usuario");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("diego");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("diego");
	}

	@Then("^Inicia sesion$")
	public void inicia_sesion() throws Throwable {
		System.out.println("Este paso inicia sesion con los datos ingresados desde el archivo MyTest.feature");
		WebElement login = driver.findElement(By.name("login"));
		login.submit();
	}
}
