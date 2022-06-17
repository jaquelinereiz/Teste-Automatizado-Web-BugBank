package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaCadastroPage {
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input") 
	public WebElement campoRegistroEmail;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/input") 
	public WebElement campoRegistroSenha;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/form/div[5]/div/input") 
	public WebElement campoConfirmacaoSenha;
	
	
	public void naoInformarOCampoRegistroEmail() {
		campoRegistroEmail.clear();
	}
	
	public void naoInformarOCampoRegistroSenha() {
		campoRegistroSenha.clear();
	}
	
	public void naoInformarOCampoConfirmacaoSenha() {
		campoConfirmacaoSenha.clear();
	}
}
