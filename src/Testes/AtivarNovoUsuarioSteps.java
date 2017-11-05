package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.*;

public class AtivarNovoUsuarioSteps {

	private WebDriver driver;
	private String emailXpath = ".//*[@id='userEmail']";
	private String senhaXpath = ".//*[@id='userPass']";
	private String senhaRepeteXpath = ".//*[@id='userPass-repeat']";
	private String checkLiTermosXpath = ".//*[@id='mainForm']/div[4]/div/div/div/label";
	private String btnCasdastraXpath = ".//*[@id='mainForm']/div[6]/div/button";

	// Acesso ao Gmail
	private String loginGmailID = "identifierId";
	private String btnNextLoginID = "identifierNext";

	private String senhaGmailName = "password";
	private String btnNextSenhaXpath = ".//*[@id='passwordNext']/content/span";
	
	private String pesquisaEmailXpath = "//span[contains(.,'Aktywuj konto')]";
	private String btnAtivarUsuarioEmailXpath = "//a[contains(.,'Aktywuj konto')]";
	
	private String mansagemAtivacaoSucessoXpath = "//h3[contains(.,'Gratulacje!')]";

	@Dado("^Acessar a página registrar novo usuário$")
	public void acessar_a_página_registrar_novo_usuário() throws Throwable {

		String baseUrl = "https://www.otodom.pl/konto/rejestracja/";
		System.setProperty("webdriver.chrome.driver",
				"/home/sampaio/workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Dado("^Informar o email do usuário \"(.*?)\"$")
	public void informar_o_email_do_usuário(String email) throws Throwable {

		driver.findElement(By.xpath(emailXpath)).clear();
		driver.findElement(By.xpath(emailXpath)).sendKeys(email);

	}

	@Dado("^Informar a senha do usuário \"(.*?)\"$")
	public void informar_a_senha_do_usuário(String senha) throws Throwable {

		driver.findElement(By.xpath(senhaXpath)).clear();
		driver.findElement(By.xpath(senhaXpath)).sendKeys(senha);
	}

	@Dado("^Repetir a senha do usuário \"(.*?)\"$")
	public void repetir_a_senha_do_usuário(String senhaRepete) throws Throwable {

		driver.findElement(By.xpath(senhaRepeteXpath)).clear();
		driver.findElement(By.xpath(senhaRepeteXpath)).sendKeys(senhaRepete);
	}

	@Dado("^Aceitar a leitura do Termo$")
	public void aceitar_a_leitura_do_Termo() throws Throwable {

		WebElement checkLiTermo = driver.findElement(By
				.xpath(checkLiTermosXpath));
		if (!checkLiTermo.isSelected()) {

			Actions actionsVendedor = new Actions(driver);
			actionsVendedor.moveToElement(checkLiTermo).click().build()
					.perform();
		}
	}

	@Dado("^Solicitar a realização do novo cadastro de usuário$")
	public void solicitar_a_realização_do_novo_cadastro_de_usuário()
			throws Throwable {
		driver.findElement(By.xpath(btnCasdastraXpath)).click();
	}

	@Dado("^Sistema exibe a mensagem de cadastro com sucesso$")
	public void sistema_exibe_a_mensagem_de_cadastro_com_sucesso()
			throws Throwable {

		WebElement mensagem2 = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("html/body/section/div/div/div/div/h3")));
		if (!mensagem2.isSelected()) {
			Actions actionsMensagem = new Actions(driver);
			actionsMensagem.moveToElement(mensagem2).click().build().perform();
			String mensagemPreVisualizacao = mensagem2.getText();
			assertTrue(mensagemPreVisualizacao
					.contains("Teraz aktywuj swoje konto!"));
		}
	}

	@Dado("^Sistema exibe Botão de acessar seu email cadastrado para ativação$")
	public void sistema_exibe_Botão_de_acessar_seu_email_cadastrado_para_ativação()
			throws Throwable {

		driver.findElement(By.linkText("Sprawdź e-mail")).click();
	}

	@Quando("^Solicitar o acesso ao email cadastrado para ativação$")
	public void solicitar_o_acesso_ao_email_cadastrado_para_ativação()
			throws Throwable {

		String urlRedirecionada = driver.getCurrentUrl();
		assertTrue(urlRedirecionada.contains("mail.google.com"));
	}

	@Quando("^Informar o email cadastrado \"(.*?)\"$")
	public void informar_o_email_cadastrado(String emailGmail) throws Throwable {

		driver.findElement(By.id(loginGmailID)).clear();
		driver.findElement(By.id(loginGmailID)).sendKeys(emailGmail);
		driver.findElement(By.id(btnNextLoginID)).click();
	}

	@Quando("^Informar a senha do email cadastrado \"(.*?)\"$")
	public void informar_a_senha_do_email_cadastrado(String senhaGmail)
			throws Throwable {

		WebElement password = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.presenceOfElementLocated(By
						.name(senhaGmailName)));

		if (!password.isSelected()) {
			Actions actionsPassword = new Actions(driver);
			actionsPassword.moveToElement(password).click()
					.sendKeys(senhaGmail).build().perform();

			driver.findElement(
					By.xpath(btnNextSenhaXpath)).click();
		}
	}

	@Quando("^Acessar o email enviado para ativação$")
	public void acessar_o_email_enviado_para_ativação() throws Throwable {

		WebElement listaEmail = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath(pesquisaEmailXpath)));

		if (!listaEmail.isSelected()) {
			Actions actionsPassword = new Actions(driver);
			actionsPassword.moveToElement(listaEmail).click().build().perform();
		}
	}

	@Quando("^Solicitar a ativação pelo link no email$")
	public void solicitar_a_ativação_pelo_link_no_email() throws Throwable {

		driver.findElement(By.xpath(btnAtivarUsuarioEmailXpath))
				.click();
	}

	@Então("^Sistema redireciona para página de ativação no sistema$")
	public void sistema_redireciona_para_página_de_ativação_no_sistema()
			throws Throwable {

		String urlRedirecionada = driver.getCurrentUrl();
		String urlExpect = "https://www.otodom.pl/";
		assertEquals(urlExpect, urlRedirecionada);
	}

	@Então("^Sistema exibe a mensagem de ativação de usuário com sucesso \"(.*?)\"$")
	public void sistema_exibe_a_mensagem_de_ativação_de_usuário_com_sucesso(
			String mensagem) throws Throwable {

		String mensagemAtivacao = driver.findElement(
				By.xpath(mansagemAtivacaoSucessoXpath)).getText();
		assertTrue(mensagemAtivacao.contains(mensagem));
		
		//titlePage= Potwierdzenie
	}

	@Então("^Página do teste é fechada$")
	public void página_do_teste_é_fechada() throws Throwable {
		driver.quit();
	}
}
