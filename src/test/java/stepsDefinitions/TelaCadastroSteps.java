package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaCadastroPage;
import utils.Utils;

public class TelaCadastroSteps {
	@Quando("o usuario nao informar na tela de registro no campo email")
	public void oUsuarioNaoInformarOCampoEmail() {
	    Na(TelaCadastroPage.class).naoInformarOCampoRegistroEmail();
		}
	
	@Quando("o usuario nao informar na tela de registro o campo senha")
	public void naoInformarOCampoSenha() {
	    Na(TelaCadastroPage.class).naoInformarOCampoRegistroSenha();
		}
	
	@Quando("o usuario nao informar na tela de registro o campo confirmacao senha")
	public void naoInformarOCampoConfirmacaoSenha() {
	    Na(TelaCadastroPage.class).naoInformarOCampoConfirmacaoSenha();
		}
	
	@Entao("o campo email senha e confirmacao apresenta alerta de campo obrigatorio")
	public void oCampoEmailApresentaMensagemDeCampoObrigatorio() {
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/p")).getText());
		
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/p")).getText());
		
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[5]/div/p")).getText());
		}

	@Entao("^o sistema exibe a modal de confirmacao cadastrar$")
	public void oSistemaExibeAModalDeConfirmacaoCadastrar() throws Throwable {
		Utils.callSleep(10000);
		assertTrue( driver.findElement(By.xpath("//a[contains(.,'Fechar')]")).isDisplayed());
	}
	
	
}
