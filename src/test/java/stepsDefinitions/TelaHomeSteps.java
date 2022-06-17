package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaAcessarPage;
import pageObjects.TelaHomePage;
import utils.Utils;


public class TelaHomeSteps {
	@Dado("^que o usuario realizar acesso \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void queOUsuarioRealizarLogin(String email, String nome, String senha) throws Throwable {
		Na(TelaAcessarPage.class).acionarOBotaoRegistrar();
		Na(TelaAcessarPage.class).informarOCampoRegistroEmail(email);
		Na(TelaAcessarPage.class).informarOCampoRegistroNome(nome);
		Na(TelaAcessarPage.class).informarOCampoRegistroSenha(senha);
		Na(TelaAcessarPage.class).informarOCampoRegistroConfirmarSenha(senha);
		Na(TelaAcessarPage.class).acionarOBotaoRegistroCriarContaComSaldo();
		Na(TelaAcessarPage.class).acionarOBotaoRegistroCadastrar();
		Na(TelaAcessarPage.class).acionarOBotaoRegistroFechar();
		Na(TelaAcessarPage.class).informarOCampoAcessoEmail(email);
		Na(TelaAcessarPage.class).informarOCampoAcessoSenha(senha);
		Na(TelaAcessarPage.class).acionarOBotaoAcessar();
	}
	
	@Quando("acionar o botao sair")
	public void clicarNoBotaoSair() throws InterruptedException {
	    Na(TelaHomePage.class).acionarOBotaoTelaHomeSair();
	}
	
	@Entao("o sistema exibe a tela de acesso")
	public void oSistemaExibeATelaDeAcesso() {
		Utils.callSleep(10000);
		assertEquals("O banco com bugs e falhas do seu jeito", driver.findElement(By.xpath("//h1[@class='pages__Title-sc-1ee1f2s-4 cFmqIK']")).getText());
	}

	@Dado("acionar o botao pagamentos")
	public void acionarOBotaoPagamentos() throws InterruptedException {
		Utils.callSleep(10000);
		Na(TelaHomePage.class).acionarOBotaoPagamento();
	}
	
	@Entao("o sistema exibe alerta de funcionalidade em desenvolvimento")
	public void oSistemaExibeAlertaDeFuncionalidadeEmDesenvolvimento() {
		Utils.callSleep(10000);
		assertEquals("Funcionalidade em desenvolvimento", driver.findElement(By.xpath("/html/body/div/div/div[5]/div/div[2]/p")).getText());
	}

	@Dado("acionar o botao saque")
	public void acionarOBotaoSaque() throws InterruptedException {
		Na(TelaHomePage.class).acionarOBotaoSaque();
	}
	
	@Entao("o sistema alerta funcionalidade em desenvolvimento")
	public void oSistemaAlertaFuncionalidadeEmDesenvolvimento() {
		Utils.callSleep(10000);
		assertEquals("Funcionalidade em desenvolvimento", driver.findElement(By.xpath("/html/body/div/div/div[5]/div/div[2]/p")).getText());
	}

}
