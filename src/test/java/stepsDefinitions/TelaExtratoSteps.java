package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaExtratoPage;
import utils.Utils;

public class TelaExtratoSteps {
	
	@Quando("acionar o botao extrato")
	public void acionarOBotaoExtrato() {
	    Na(TelaExtratoPage.class).acionarOBotaoExtrato();
	}
	
	@Entao("a tela de extrato sera exibida")
	public void aTelaDeExtratoSeraExibida() {
		Utils.callSleep(10000);
		assertEquals("Saldo disponível", driver.findElement(By.xpath("//p[contains(@class,'LabelText-sc-7n8vh8-10 UPwdn')]")).getText());
	}
	
	@Quando("acionar o botao voltar na tela extrato")
	public void acionarOBotaoTelaExtratoVoltar() {
	    Na(TelaExtratoPage.class).acionarOBotaoTelaExtratoVoltar();
	}

}
