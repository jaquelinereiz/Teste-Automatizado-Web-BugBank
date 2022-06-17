package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class TelaHomePage {
	
	@FindBy(xpath = "//a[@id='btnExit']")
	public WebElement botaoTelaHomeSair;
	
	@FindBy(xpath = "//*[@id=\"btn-PAGAMENTOS\"]")
	public WebElement botaoPagamento;
	
	@FindBy(xpath = "//*[@id=\"btn-SAQUE\"]")
	public WebElement botaoSaque;
	
	
	public void acionarOBotaoTelaHomeSair() throws InterruptedException {
		Utils.callSleep(10000);
		botaoTelaHomeSair.click();
	}
	
	public void acionarOBotaoPagamento() throws InterruptedException {
		Utils.callSleep(10000);
		botaoPagamento.click();
	}
	
	public void acionarOBotaoSaque() throws InterruptedException {
		Utils.callSleep(10000);
		botaoSaque.click();
	}
}
