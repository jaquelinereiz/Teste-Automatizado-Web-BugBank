package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class TelaRequisitosPage {
	@FindBy(xpath = "//a[contains(@class,'styles__Link-sc-osobjw-0 xzjxU')]")
	public WebElement botaoTelaRequisitos;
	
	@FindBy(xpath = "//div[contains(@id,'accordionLogin')]")
	public WebElement botaoRequisitosLogin;
	
	@FindBy(xpath = "//div[@id='accordionPagamento']")
	public WebElement botaoRequisitosPagamento;
	
	@FindBy(xpath = "//div[contains(@id,'accordionSaque')]")
	public WebElement botaoRequisitosSaque;
	
	@FindBy(xpath = "//a[contains(@id,'linkGithub')]")
	public WebElement botaoRepositorio;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/a/span/img")
	public WebElement botaoIconeBugBank;
	
	@FindBy(xpath = "//a[@id='btnBack']")
	public WebElement botaoTelaRequisitosVoltar;
	
	public void acionarOBotaoTelaRequisitos() throws InterruptedException {
		Utils.callSleep(10000);
		botaoTelaRequisitos.click();
	}
	
	public void acionarOBotaoRequisitosLogin() throws InterruptedException {
		Utils.callSleep(10000);
		botaoRequisitosLogin.click();
	}
	
	public void acionarOBotaoRequisitosPagamento() throws InterruptedException {
		Utils.callSleep(10000);
		botaoRequisitosPagamento.click();
	}
	
	public void acionarOBotaoRequisitosSaque() throws InterruptedException {
		Utils.callSleep(10000);
		botaoRequisitosSaque.click();
	}
	
	public void acionarOBotaoRepositorio() throws InterruptedException {
		Utils.callSleep(10000);
		botaoRepositorio.click();
	}
	
	public void acionarOBotaoIconeBugBank() throws InterruptedException {
		Utils.callSleep(10000);
		botaoIconeBugBank.click();
	}
	
	public void acionarNaTelaDeRequisitosOBotaoVoltar() throws InterruptedException {
		Utils.callSleep(10000);
		botaoTelaRequisitosVoltar.click();
	}
}
