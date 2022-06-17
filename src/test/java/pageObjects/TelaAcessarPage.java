package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class TelaAcessarPage {
	
	@FindBy(xpath = "(//input[contains(@type,'email')])[1]") 
	public WebElement campoAcessoEmail;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input") 
	public WebElement campoRegistroEmail;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input") 
	public WebElement campoAcessoEmailInvalido;
	
	@FindBy(xpath = "//input[contains(@type,'name')]")
	public WebElement campoRegistroNome;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input")
	public WebElement campoRegistroSenha;
	
	@FindBy(xpath = "(//input[contains(@type,'password')])[1]") 
	public WebElement campoAcessoSenha;
	
	@FindBy(xpath = "//input[contains(@name,'passwordConfirmation')]")
	public WebElement campoRegistroConfirmarSenha;
	
	
//	@FindBy(id = "modalText")
//	public WebElement mensagemRegistroContaCriadaComSucesso;
	
	@FindBy(xpath = "(//p[@class='input__warging'])[1]")
	public WebElement mensagemCampoObrigatorio;

	
	
	@FindBy(xpath = "//button[text()='Cadastrar']")
	public WebElement botaoRegistroCadastrar;
	
	@FindBy(xpath = "//button[text()='Registrar']")
	public WebElement botaoRegistrar;
	
	@FindBy(xpath = "//label[contains(@id,'toggleAddBalance')]")
	public WebElement botaoRegistroCriarContaComSaldo;
	
	@FindBy(xpath = "//a[@id='btnExit']")
	public WebElement botaoSair;
	
	@FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
	public WebElement botaoAcessoAcessar;
	
	@FindBy(xpath = "//a[contains(.,'x')]")
	public WebElement botaoRegistroFechar;
	
	
	
	public void informarOCampoAcessoEmail(String email) {
		campoAcessoEmail.sendKeys(email);
	}
	
	public void informarOCampoAcessoSenha(String senha) {
		campoAcessoSenha.sendKeys(senha);
	}
	
	public void acionarOBotaoAcessar() {
		botaoAcessoAcessar.click();
	}
	
	public void naoInformarOCampoAcessoEmail() {
		campoAcessoEmail.clear();;
	}
	
	public void naoInformarOCampoAcessoSenha() {
		campoAcessoSenha.clear();
	}
	
	public void informarOCampoAcessoEmailInvalido(String email) {
		campoAcessoEmailInvalido.sendKeys(email);
	}
	
	public void acionarOBotaoRegistrar() {
		botaoRegistrar.click();
	}
	
	public void informarOCampoRegistroEmail(String email) {
		campoRegistroEmail.sendKeys(email);
	}
	
	public void informarOCampoRegistroNome(String nome) {
		campoRegistroNome.sendKeys(nome);
	}
	
	public void informarOCampoRegistroSenha(String senha) {
		campoRegistroSenha.sendKeys(senha);
	}
	
	public void informarOCampoRegistroConfirmarSenha(String senha) {
		campoRegistroConfirmarSenha.sendKeys(senha);
	}
	
	public void acionarOBotaoRegistroCriarContaComSaldo() {
		botaoRegistroCriarContaComSaldo.click();
	}
	
	public void acionarOBotaoRegistroCadastrar() {
		botaoRegistroCadastrar.click();
	}
	
	public void acionarOBotaoRegistroFechar() throws InterruptedException {
		Utils.callSleep(10000);
		botaoRegistroFechar.click();
	}
	
	
	public void clicarNoBotaoSair() throws InterruptedException {
		Utils.callSleep(10000);
		botaoSair.click();
	}
}
