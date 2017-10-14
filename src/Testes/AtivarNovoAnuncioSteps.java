package Testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.*;

public class AtivarNovoAnuncioSteps {

	private WebDriver driver;

	@Dado("^Acessar a página criar anúncios grátis categoria apartamento aluguel férias$")
	public void acessar_a_página_criar_anúncios_grátis_categoria_apartamento_aluguel_férias()
			throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"/home/sampaio/workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.otodom.pl/wynajem/mieszkanie/nowe-ogloszenie/");

		// Close Pop Up
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(
				By.cssSelector("div.gtm-survey__close.js-gtm-survey-close"))
				.click();

	}

	@Dado("^Informar o título do anúncio \"(.*?)\"$")
	public void informar_o_título_do_anúncio(String titulo) throws Throwable {

		driver.findElement(By.xpath("//input[@data-maxtext='50']")).clear();
		driver.findElement(By.xpath("//input[@data-maxtext='50']")).sendKeys(
				titulo);
	}

	@Dado("^Informar o preço (\\d+)$")
	public void informar_o_preço(int preco) throws Throwable {

		driver.findElement(By.xpath("//input[@name='data[param_price][1]']"))
				.clear();
		driver.findElement(By.xpath("//input[@name='data[param_price][1]']"))
				.sendKeys(String.valueOf(preco));

	}

	@Dado("^Informar a metragem (\\d+)$")
	public void informar_a_metragem(int metragem) throws Throwable {

		driver.findElement(By.xpath("//input[@id='param7']")).clear();
		driver.findElement(By.xpath("//input[@id='param7']")).sendKeys(
				String.valueOf(metragem));

	}

	@Dado("^Selecionar o número de quartos (\\d+)$")
	public void selecionar_o_número_de_quartos(int quarto) throws Throwable {

		Select selecionaQuarto = new Select(driver.findElement(By
				.xpath("//select[@id='param57']")));
		selecionaQuarto.selectByVisibleText(String.valueOf(quarto));

	}

	@Dado("^Marcar o tipo de vendedor senhorio$")
	public void marcar_o_tipo_de_vendedor_senhorio() throws Throwable {

		WebElement checkTipoVendedor = driver.findElement(By
				.cssSelector("input[value=private]"));
		if (!checkTipoVendedor.isSelected()) {
			driver.findElement(By.xpath("//label[@for='checkbox-owner']"))
					.click();
		}
	}

	@Dado("^Informar a localização do apartamento \"(.*?)\"$")
	public void informar_a_localização_do_apartamento(String localizacao)
			throws Throwable {

		driver.findElement(By.xpath("//select[@id='param15']//option[1]"))
				.click();
	}

	@Dado("^Informar a descrição do anúncio \"(.*?)\"$")
	public void informar_a_descrição_do_anúncio(String descricao)
			throws Throwable {

		driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.xpath("//body")).sendKeys(descricao);

	}

	@Dado("^Informar o meu nome \"(.*?)\"$")
	public void informar_o_meu_nome(String nome) throws Throwable {

		driver.findElement(By.xpath("//input[@id='add-person']")).clear();
		driver.findElement(By.xpath("//input[@id='add-person']"))
				.sendKeys(nome);
	}

	@Dado("^Informar o meu email \"(.*?)\"$")
	public void informar_o_meu_email(String email) throws Throwable {

		driver.findElement(By.xpath("//input[@id='add-email']")).clear();
		driver.findElement(By.xpath("//input[@id='add-email']"))
				.sendKeys(email);

	}

	@Dado("^Aceitar as regras \"(.*?)\"$")
	public void aceitar_as_regras(String arg1) throws Throwable {

		WebElement checkAceitaRegras = driver.findElement(By
				.xpath("//label[@for='agreement']"));
		if (!checkAceitaRegras.isSelected()) {

			driver.findElement(By.xpath("//label[@for='agreement']")).click();
		}
	}

	@Quando("^Solicitar a visualização do anúncio$")
	public void solicitar_a_visualização_do_anúncio() throws Throwable {

		// driver.findElement(By.cssSelector("span.preview-link")).click();
		driver.findElement(By.xpath("//span[@id='preview-link']")).click();
	}

	@Então("^Sistema informa que foi criado uma prévia do anúncio \"(.*?)\"$")
	public void sistema_informa_que_foi_criado_uma_prévia_do_anúncio(
			String mensagem) throws Throwable {

		String mensagemPreVisualizacao = driver
				.findElement(
						By.xpath("//div[contains(@class,'col-md-9 col-md-height col-middle')]"))
				.getText();
		assertTrue(mensagemPreVisualizacao.contains(mensagem));

		driver.quit();

	}
}
