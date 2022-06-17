package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaAcessarPage;
import utils.Utils;

public class TelaAcessarSteps {
	@Quando("o usuario acionar o botao registrar")
	public void oUsuarioClicarNoBotaoRegistrar() {
	    Na(TelaAcessarPage.class).acionarOBotaoRegistrar();
		}
	@Quando("informar na tela de registro o campo email {string}")
	public void informarNoCampoEmail(String email) {
		Na(TelaAcessarPage.class).informarOCampoRegistroEmail(email);
		}
	@Quando("informar na tela de registro o campo nome {string}")
	public void informarNoCampoNome(String nome) {
		Na(TelaAcessarPage.class).informarOCampoRegistroNome(nome);
		}
	@Quando("informar na tela de registro o campo senha {string}")
	public void informarNoCampoSenha(String senha) {
		Na(TelaAcessarPage.class).informarOCampoRegistroSenha(senha);
		}
	@Quando("informar na tela de registro o campo confirmacao senha {string}")
	public void informarNoCampoConfirmacaoSenha(String senha) {
		Na(TelaAcessarPage.class).informarOCampoRegistroConfirmarSenha(senha);
		}
	@Quando("acionar o botao criar conta com saldo")
	public void acionarOBotaoCriarContaComSaldo() {
		Na(TelaAcessarPage.class).acionarOBotaoRegistroCriarContaComSaldo();
		}
	@Quando("acionar o botao cadastrar")
	public void acionarOBotaoCadastrar() {
		Na(TelaAcessarPage.class).acionarOBotaoRegistroCadastrar();
		}
	@Quando("acionar o botao fechar")
	public void acionarOBotaoFechar() throws InterruptedException {
		Na(TelaAcessarPage.class).acionarOBotaoRegistroFechar();
		}

	@Quando("^informar na tela de acesso o campo email \"([^\"]*)\"$")
	public void informarOCampoEmail(String email) throws Throwable {
		Na(TelaAcessarPage.class).informarOCampoAcessoEmail(email);
		}
	@Quando("^informar na tela de acesso o campo senha \"([^\"]*)\"$")
	public void informarOCampoSenha(String senha) throws Throwable {
		Na(TelaAcessarPage.class).informarOCampoAcessoSenha(senha);
		}

	@Quando("acionar o botao acessar")
	public void acionarOBotaoAcessar() {
		Na(TelaAcessarPage.class).acionarOBotaoAcessar();
		}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		Utils.callSleep(10000);
		assertEquals("bem vindo ao BugBank :)", driver.findElement(By.xpath("//p[text()='bem vindo ao BugBank :)']")).getText());
		}
	
	@Quando("o usuario nao informar na tela de acesso o campo email")
	public void oUsuarioNaoInformarOCampoAcessoEmail() {
	    Na(TelaAcessarPage.class).naoInformarOCampoAcessoEmail();
		}
	
	@Quando("nao informar na tela de acesso o campo senha")
	public void naoInformarOCampoAcessoSenha() {
	    Na(TelaAcessarPage.class).naoInformarOCampoAcessoEmail();
		}
	
	@Entao("os campos email e senha apresentam alerta de campo obrigatorio")
	public void osCamposEmailESenhaApresentaMensagemDeCampoObrigatorio() {
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("(//p[@class='input__warging'])[1]")).getText());
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/p")).getText());
		}
	
	@Entao("o campo email apresenta alerta de campo obrigatorio")
	public void oCampoAcessoEmailApresentaAlertaDeCampoObrigatorio() {
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("(//p[@class='input__warging'])[1]")).getText());
		}
	
	@Quando("o usuario informar na tela de acesso um email invalido {string}")
	public void oUsuarioInformarUmEmailInvalido(String email) {
	    Na(TelaAcessarPage.class).informarOCampoAcessoEmailInvalido(email);
		}
	
	@Entao("o campo email apresenta alerta de formato invalido")
	public void oCampoEmailApresentaAlertaDeFormatoInvalido() {
		Utils.callSleep(10000);
		assertEquals("Formato inválido", driver.findElement(By.xpath("//p[contains(.,'Formato inválido')]")).getText());
		}
	
	@Quando("o usuario informar na tela de acesso o campo email {string}")
	public void oUsuarioInformarOCampoEmail(String email) {
	    Na(TelaAcessarPage.class).informarOCampoAcessoEmail(email);
		}
	
	@Quando("nao informar o campo senha")
	public void naoInformarOCampoSenha() {
	    Na(TelaAcessarPage.class).naoInformarOCampoAcessoSenha();
		}
	
	@Entao("o campo senha apresenta alerta de campo obrigatorio")
	public void oCampoSenhaApresentaAlertaDeCampoObrigatorio() {
		Utils.callSleep(10000);
		assertEquals("É campo obrigatório", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/p")).getText());
		}
}
