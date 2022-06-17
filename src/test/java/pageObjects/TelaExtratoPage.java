package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaExtratoPage {
	
	@FindBy(xpath = "//a[contains(@id,'btn-EXTRATO')]")
	public WebElement botaoExtrato;
	
	@FindBy(xpath = "//a[contains(@id,'btnBack')]")
	public WebElement botaoTelaExtratoVoltar;
	
	public void acionarOBotaoExtrato() {
		botaoExtrato.click();
	}
	
	public void acionarOBotaoTelaExtratoVoltar() {
		botaoTelaExtratoVoltar.click();
	}
	
}