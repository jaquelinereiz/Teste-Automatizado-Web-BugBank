package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaTransferenciaPage {
	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]/div[1]/a")
	public WebElement botaoTransferencia;
	
	@FindBy(xpath = "//input[contains(@type,'accountNumber')]")
	public WebElement campoNumeroDaConta;
	
	@FindBy(name = "digit")
	public WebElement campoNumeroDigito;
	
	@FindBy(xpath = "//input[contains(@type,'transferValue')]")
	public WebElement campoValorTransferencia;
	
	@FindBy(xpath = "//input[contains(@type,'description')]")
	public WebElement campoDescricao;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement botaoTransferirAgora;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/a/span/img")
	public WebElement iconeBugBank;
	
	@FindBy(xpath = "//a[@id='btnBack']")
	public WebElement botaoTelaTransferenciaVoltar;
	
	
	public void acionarOBotaoTransferencia() {
		botaoTransferencia.click();
	}
	
	public void informarOCampoNumeroDaConta(String conta) {
		campoNumeroDaConta.sendKeys(conta);
	}
	
	public void informarOCampoNumeroDigito(String digito) {
		campoNumeroDigito.sendKeys(digito);
	}
	
	public void informarOCampoValorDaTransferencia(String Transferencia) {
		campoValorTransferencia.sendKeys(Transferencia);
	}
	
	public void informarOCampoDescricao(String descricao) {
		campoDescricao.sendKeys(descricao);
	}
	
	public void acionarOBotaoTransferirAgora() {
		botaoTransferirAgora.click();
	}
	
	public void naoInformarOCampoValorDaTransferencia() {
		campoValorTransferencia.click();
	}
	
	public void acionarOIconeBugbank() {
		iconeBugBank.click();
	}
	
	public void acionarOBotaoVoltar() {
		botaoTelaTransferenciaVoltar.click();
	}
}
