package testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RealizarLogoutSteps {

	private WebDriver driver;
	private String emailXpath = "//input[@name='login[email]']";
	private String senhaXpath = "//input[@name='login[password]']";
	private String btnLoginXpath = "//button[@type='submit'][1]";

	@Dado("^Acessar a qualquer página de login no sistema$")
	public void acessar_a_qualquer_página_de_login_no_sistema()
			throws Throwable {

		String baseUrl = "https://www.otodom.pl/konto/?ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index";
		System.setProperty("webdriver.chrome.driver",
				"/home/sampaio/workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@Dado("^Informar o email \"(.*?)\"$")
	public void informar_o_email_emial(String email) throws Throwable {
		driver.findElement(By.xpath(emailXpath)).clear();
		driver.findElement(By.xpath(emailXpath)).sendKeys(email);

	}

	@Dado("^Informar a senha \"(.*?)\"$")
	public void informar_a_senha(String senha) throws Throwable {

		driver.findElement(By.xpath(senhaXpath)).clear();
		driver.findElement(By.xpath(senhaXpath)).sendKeys(senha);

	}

	@Dado("^Solicitar o login$")
	public void solicitar_o_login() throws Throwable {

		driver.findElement(By.xpath(btnLoginXpath)).click();
	}

	@Quando("^Solicitar a saída do sistema no link Sair$")
	public void solicitar_a_saída_do_sistema_no_link_Sair() throws Throwable {

		WebElement myDynamicElement1 = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//*[@id='user_items']/a")));// #user_items > a

		if (myDynamicElement1.isDisplayed()) {
			myDynamicElement1.click();
			myDynamicElement1.findElement(By.xpath("//*[@id='logout']"))
					.click();
		}
	}
	
	@Então("^Sistema redireciona para página principal com link Minha Conta$")
	public void sitema_redireciona_para_página_principal_com_link_Minha_Conta() throws Throwable {
		
		String titlePage = driver.getTitle();
		String titleExpect = "Moje konto • www.otodom.pl";	
		assertEquals(titlePage, titleExpect);
		
		String urlRedirecionada = driver.getCurrentUrl();
		String urlExpect = "https://www.otodom.pl/mojekonto/";
		assertEquals(urlRedirecionada,urlExpect);
	}

	@Então("^Página atual é fechada$")
	public void página_atual_é_fechada() throws Throwable {

		driver.quit();
	}
}
