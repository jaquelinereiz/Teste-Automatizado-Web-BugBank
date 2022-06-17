package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaTransferenciaPage;
import utils.Utils;

public class TelaTransferenciaSteps {
	@Quando("acionar o botao transferencia")
	public void clicarNoBotaoTransferencias() {
	    Na(TelaTransferenciaPage.class).acionarOBotaoTransferencia();
	}
	
	@Entao("a tela de transferencias sera exibida")
	public void aTelaDeTransferenciasSeraExibida() {
		Utils.callSleep(10000);
		assertEquals("Número da conta", driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[1]/div[1]/label")).getText());
	}

	@Quando("informar o campo numero da conta {string}")
	public void informarOCampoNumeroDaConta(String conta) {
	    Na(TelaTransferenciaPage.class).informarOCampoNumeroDaConta(conta);
	}

	@Quando("informar o campo digito {string}")
	public void informarNoCampoDigito(String digito) {
	    Na(TelaTransferenciaPage.class).informarOCampoNumeroDigito(digito);
	}
	
	@Quando("nao informar o campo valor da transferencia")
	public void informarNoCampoValorDaTransferencia() {
		Na(TelaTransferenciaPage.class).naoInformarOCampoValorDaTransferencia();
	}
	
	@Quando("informar o campo descricao {string}")
	public void informarNoCampoDescricao(String descricao) {
		Na(TelaTransferenciaPage.class).informarOCampoDescricao(descricao);
	}
	
	@Quando("acionar o botao transferir agora")
	public void clicarNoBotaoTransferirAgora() {
		Na(TelaTransferenciaPage.class).acionarOBotaoTransferirAgora();
	}
	
	@Entao("o sistema exibe o alerta para inserir um valor")
	public void oSistemaExibeOAlertaParaInserirUmValor() {
		Utils.callSleep(10000);
		assertEquals("transferValue must be a `number` type, but the final value was: `NaN` (cast from the value `\"\"`).", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[2]/p")).getText());
	}
	
	@Quando("informar o campo valor da transferencia {string}")
	public void informarOCampoValorDaTransferencia(String transferencia) {
		Na(TelaTransferenciaPage.class).informarOCampoValorDaTransferencia(transferencia);
	}
	
	@Entao("o sistema exibe o alerta de conta invalida ou inexistente")
	public void oSistemaExibeOAlertaContaInvalidaOuInexistente() {
		Utils.callSleep(10000);
		assertEquals("Conta inválida ou inexistente", driver.findElement(By.xpath("//p[contains(@id,'modalText')]")).getText());
	}
	
	@Quando("acionar o botao voltar")
	public void acionarOBotaoVoltar() {
		Utils.callSleep(10000);
	    Na(TelaTransferenciaPage.class).acionarOBotaoVoltar();
	}
	
	@Entao("o sistema volta para a tela home")
	public void oSistemaVoltaParaATelaHome() {
		Utils.callSleep(10000);
		assertEquals("bem vindo ao BugBank :)", driver.findElement(By.xpath("//p[text()='bem vindo ao BugBank :)']")).getText());
	}
	
	@Quando("acionar o icone bugbank")
	public void acionarOIconeBugbank() {
		Utils.callSleep(10000);
	    Na(TelaTransferenciaPage.class).acionarOIconeBugbank();
	}

}
