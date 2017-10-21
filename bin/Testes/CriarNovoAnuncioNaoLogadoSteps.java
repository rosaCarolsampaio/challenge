package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.*;

public class CriarNovoAnuncioNaoLogadoSteps {

	private WebDriver driver;
	private String popupCss = "div.gtm-survey__close.js-gtm-survey-close";//xpath /html/body/div[13]/div
	private String metragemXpath = "//input[@id='param7']";
	private String tituloXpath = "//input[@data-maxtext='50']";
	private String precoXpath = "//input[@name='data[param_price][1]']";
	private String quartoXpath = "//select[@id='param57']";
	private String vendedorXpath = ".//*[@id='private-business-div']/div[1]/div/label";
	private String localizacaoXpath = ".//*[@id='newOffer']/fieldset[3]/div[1]/div[1]/div/span/span[1]/span";
	private String localizacaoXpathOption = "//div[contains(.,'Radom, mazowieckie')]";
	private String descricaoXpath = ".//*[@id='wysiwyg_tbl']/tbody/tr[2]/td";
	private String nomeXpath = "//input[@id='add-person']";
	private String emailXpath = "//input[@id='add-email']";
	private String regrasXpath = ".//*[@id='accept']/div/label";
	private String btnVisualizacaoXpath = "//*[@id='preview-link']";
	private String MensagemXpath = "//div[contains(@class,'col-md-9 col-md-height col-middle')]";

	@Dado("^Acessar a página criar anúncios grátis categoria apartamento aluguel férias$")
	public void acessar_a_página_criar_anúncios_grátis_categoria_apartamento_aluguel_férias()
			throws Throwable {
		String baseUrl = "https://www.otodom.pl/wynajem/mieszkanie/nowe-ogloszenie/";

		System.setProperty("webdriver.chrome.driver",
				"/home/sampaio/workspace/selenium/chromedriver");

		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		// Close PopUp
		/*WebElement popup = driver.findElement(By.cssSelector(popupCss));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(popup));
		popup.click();*/

	}

	@Dado("^Informar o título do anúncio \"(.*?)\"$")
	public void informar_o_título_do_anúncio(String titulo) throws Throwable {

		driver.findElement(By.xpath(tituloXpath)).clear();
		driver.findElement(By.xpath(tituloXpath)).sendKeys(titulo);
	}

	@Dado("^Informar o preço (\\d+)$")
	public void informar_o_preço(int preco) throws Throwable {

		driver.findElement(By.xpath(precoXpath)).clear();
		driver.findElement(By.xpath(precoXpath))
				.sendKeys(String.valueOf(preco));
	}

	@Dado("^Informar a metragem (\\d+)$")
	public void informar_a_metragem(int metragem) throws Throwable {

		driver.findElement(By.xpath(metragemXpath)).clear();
		driver.findElement(By.xpath(metragemXpath)).sendKeys(
				String.valueOf(metragem));
	}

	@Dado("^Selecionar o número de quartos (\\d+)$")
	public void selecionar_o_número_de_quartos(int quarto) throws Throwable {

		Select selecionaQuarto = new Select(driver.findElement(By
				.xpath(quartoXpath)));
		selecionaQuarto.selectByVisibleText(String.valueOf(quarto));
	}

	@Dado("^Marcar o tipo de vendedor senhorio$")
	public void marcar_o_tipo_de_vendedor_senhorio() throws Throwable {

		WebElement checkTipoVendedor = driver.findElement(By
				.xpath(vendedorXpath));
		if (!checkTipoVendedor.isSelected()) {

			Actions actionsVendedor = new Actions(driver);
			actionsVendedor.moveToElement(checkTipoVendedor).click().build()
					.perform();
		}
	}

	@Dado("^Informar a localização do apartamento \"(.*?)\"$")
	public void informar_a_localização_do_apartamento(String localizacao)
			throws Throwable {

		WebElement selectLocalizacao = driver.findElement(By
				.xpath(localizacaoXpath));
		if (!selectLocalizacao.isSelected()) {

			selectLocalizacao.sendKeys(localizacao);

			Actions actionsLocalizacao = new Actions(driver);
			actionsLocalizacao.moveToElement(selectLocalizacao).click()
					.sendKeys(localizacao).perform();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath(localizacaoXpathOption)).click();
		}
	}

	@Dado("^Informar a descrição do anúncio \"(.*?)\"$")
	public void informar_a_descrição_do_anúncio(String descricao)
			throws Throwable {

		WebElement textAreaDescricao = driver.findElement(By
				.xpath(descricaoXpath));
		if (!textAreaDescricao.isSelected()) {

			Actions actionsDescricao = new Actions(driver);
			actionsDescricao.moveToElement(textAreaDescricao).click()
					.sendKeys(descricao).build().perform();
		}
	}

	@Dado("^Informar o meu nome \"(.*?)\"$")
	public void informar_o_meu_nome(String nome) throws Throwable {

		driver.findElement(By.xpath(nomeXpath)).clear();
		driver.findElement(By.xpath(nomeXpath)).sendKeys(nome);
	}

	@Dado("^Informar o meu email \"(.*?)\"$")
	public void informar_o_meu_email(String email) throws Throwable {

		driver.findElement(By.xpath(emailXpath)).clear();
		driver.findElement(By.xpath(emailXpath)).sendKeys(email);
	}

	@Dado("^Aceitar as regras$")
	public void aceitar_as_regras() throws Throwable {

		WebElement checkAceitaRegras = driver
				.findElement(By.xpath(regrasXpath));
		if (!checkAceitaRegras.isSelected()) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments [0].click()", checkAceitaRegras);
		}
	}

	@Quando("^Solicitar a visualização do anúncio$")
	public void solicitar_a_visualização_do_anúncio() throws Throwable {

		WebElement btnVisualizacao = driver.findElement(By
				.xpath(btnVisualizacaoXpath));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments [0].click()", btnVisualizacao);

	}

	@Então("^Sistema informa que foi criado uma prévia do anúncio \"(.*?)\"$")
	public void sistema_informa_que_foi_criado_uma_prévia_do_anúncio(
			String mensagem) throws Throwable {

		String mensagemPreVisualizacao = driver.findElement(
				By.xpath(MensagemXpath)).getText();
		assertTrue(mensagemPreVisualizacao.contains(mensagem));
	}

	@Então("^Página é fechada$")
	public void página_é_fechada() throws Throwable {

		driver.quit();
	}
}
