package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimuladorInvestimentoPoupançaPage {
	private WebDriver driver;

	private By valorAplicar = By.id("valorAplicar");
	private By valorInvestir = By.id("valorInvestir");
	private By tempoPoupar = By.id("tempo");
	private By btnSimular = By.cssSelector(
			"body.vsc-initialized:nth-child(12) div.conteudoGeral.conteudoGeralCompleto.clearfix:nth-child(3) div.centro div.conteudoPrincipal.clearfix div.formularioBloco div.conteudoBloco div.blocoSimular form.formGeral.formGeraInvestimento div.simuladorOpcoes.clearfix:nth-child(5) ul.opcoes.clearfix li.simular:nth-child(2) > button.btn.btnAmarelo.btnSimular");
	private By mensagemOrientacao = By.cssSelector("#valorAplicar-error");
	private By blocoResultadoSimulacao = By.cssSelector("body > div.conteudoGeral.conteudoGeralCompleto.clearfix > div > div > div.formularioBloco.formularioBlocoResultado > div > div.blocoResultadoSimulacao");
			
	public SimuladorInvestimentoPoupançaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setValorAplicar() {

		float valorAplicarInput = generateRandomIntIntRange(0, 100);
		driver.findElement(valorAplicar).sendKeys(Float.toString(valorAplicarInput));
		
		if (valorAplicarInput < 20) {
			driver.findElement(mensagemOrientacao).isDisplayed();
		}
		
	}

	public void setValorPoupar() {

		int valorInvestirInput = generateRandomIntIntRange(0, 100);
		driver.findElement(valorInvestir).sendKeys(Float.toString(valorInvestirInput));
		
		if (valorInvestirInput < 20) {
			driver.findElement(mensagemOrientacao).isDisplayed();
		}
	}
	
	public String getMensagemOrientacao() {

		return driver.findElement(mensagemOrientacao).getText();
	}
	
	public void setTempoPoupar() {

		int tempoPouparInput = generateRandomIntIntRange(1, 12);
		driver.findElement(tempoPoupar).sendKeys(Float.toString(tempoPouparInput));
	}

	public void clickBtnSimulador() {

		driver.findElement(btnSimular).click();
	}
	
	public String getBloqueResultadoSimulador() {

		return driver.findElement(blocoResultadoSimulacao).getText();
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
