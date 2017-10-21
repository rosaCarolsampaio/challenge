package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AtivarNovoUsuarioSteps {

	private WebDriver driver;
	private String emailXpath = "//input[@name='login[email]']";
	private String senhaXpath = "//input[@name='login[password]']";
	private String senhaRepeteXpath = "//input[@name='login[repeat_password]']";
	private String btnCasdastraXpath = "//button[@type='submit']";

	@Dado("^Acessar a página registrar novo usuário$")
	public void acessar_a_página_registrar_novo_usuário() throws Throwable {

		String baseUrl = "https://www.otodom.pl/konto/korzysci/";
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

	@Dado("^Confirmar a senha do usuário \"(.*?)\"$")
	public void confirmar_a_senha_do_usuário(String senhaRepete)
			throws Throwable {

		driver.findElement(By.xpath(senhaRepeteXpath)).clear();
		driver.findElement(By.xpath(senhaRepeteXpath)).sendKeys(senhaRepete);
	}

	@Dado("^Aceitar o envio de boletins \"(.*?)\" marcado$")
	public void aceitar_o_envio_de_boletins_marcado(String arg1)
			throws Throwable {

	}

	@Dado("^solicitar a realização do novo cadastro de usuário$")
	public void solicitar_a_realização_do_novo_cadastro_de_usuário()
			throws Throwable {

		driver.findElement(By.xpath(btnCasdastraXpath)).click();
	}

	@Dado("^Sistema exibir a mensagem de cadastro com sucesso$")
	public void sistema_exibir_a_mensagem_de_cadastro_com_sucesso()
			throws Throwable {

	}

	@Dado("^sistema exibir Botão de acessar seu email cadastrado para ativação$")
	public void sistema_exibir_Botão_de_acessar_seu_email_cadastrado_para_ativação()
			throws Throwable {

	}

	@Quando("^Solicitar o acesso ao email cadastrado$")
	public void solicitar_o_acesso_ao_email_cadastrado() throws Throwable {

	}

	@Quando("^Sistema redireciona para a página do email$")
	public void sistema_redireciona_para_a_página_do_email() throws Throwable {

	}

	@Quando("^Solicitar acesso ao email$")
	public void solicitar_acesso_ao_email() throws Throwable {

	}

	@Quando("^Informar o email cadastrado$")
	public void informar_o_email_cadastrado() throws Throwable {

	}

	@Quando("^Informar a senha do email cadastrado$")
	public void informar_a_senha_do_email_cadastrado() throws Throwable {

	}

	@Quando("^Acessar o email enviado para ativação$")
	public void acessar_o_email_enviado_para_ativação() throws Throwable {

	}

	@Quando("^Solicitar a ativação pelo link no email$")
	public void solicitar_a_ativação_pelo_link_no_email() throws Throwable {

	}

	@Então("^Sistema redireciona para página de ativação no sistema$")
	public void sistema_redireciona_para_página_de_ativação_no_sistema()
			throws Throwable {

	}

	@Então("^Sistema exibe a mensagem de ativação de usuário com sucesso \"(.*?)\"$")
	public void sistema_exibe_a_mensagem_de_ativação_de_usuário_com_sucesso(
			String arg1) throws Throwable {

	}

	@Então("^Página  do teste é fechada$")
	public void página_do_teste_é_fechada() throws Throwable {

		driver.quit();
	}

}
