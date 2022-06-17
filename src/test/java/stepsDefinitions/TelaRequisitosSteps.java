package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaRequisitosPage;
import utils.Utils;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TelaRequisitosSteps {

	@Quando("o usuario acionar o botao conhecer requisitos")
	public void oUsuarioAcionarOBotaoConhecerRequisitos() throws InterruptedException {
	    Na(TelaRequisitosPage.class).acionarOBotaoTelaRequisitos();
	}
	@Entao("o sistema abre a tela de requisitos")
	public void oSistemaAbreATelaDeRequisitos() {
		Utils.callSleep(10000);
		assertEquals("Gostou do projeto e quer contribuir?", driver.findElement(By.xpath("//p[contains(.,'Gostou do projeto e quer contribuir?')]")).getText());
	}

	@Quando("acionar o botao requisitos login")
	public void acionarAOpcaoRequisitosLogin() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarOBotaoRequisitosLogin();
	}

	@Quando("acionar a opcao requisitos pagamento")
	public void acionarAOpcaoRequisitosPagamento() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarOBotaoRequisitosPagamento();
	}
	
	@Entao("o sistema mostra os requisitos pagamento")
	public void oSistemaMostraOsRequisitosPagamento() {
		assertEquals("- Em desenvolvimento" , driver.findElement(By.xpath("(//div[contains(.,'- Em desenvolvimento')])[5]")).getText());
	}

	@Quando("acionar a opcao requisitos saque")
	public void acionarAOpcaoRequisitosSaque() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarOBotaoRequisitosSaque();
	}
	
	@Entao("o sistema mostra os requisitos saque")
	public void oSistemaMostraOsRequisitos() {
		assertEquals("- Em desenvolvimento" , driver.findElement(By.xpath("(//div[contains(.,'- Em desenvolvimento')])[5]")).getText());
	}

	@Quando("acionar o botao repositorio")
	public void acionarOBotaoRepositorio() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarOBotaoRepositorio();
	}

	@Entao("o sistema mostra o repositorio")
	public void oSistemaMostraORepositorio() {
		Utils.callSleep(10000);
		assertEquals( "About" , driver.findElement(By.xpath("//h2[@class='mb-3 h4'][contains(.,'About')]")).getText());
	}
	
	@Quando("acionar o botao icone bugBank")
	public void acionarOBotaoIconeBugBank() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarOBotaoIconeBugBank();
	}

	@Quando("acionar na tela de requisitos o botao voltar")
	public void acionarNaTelaDeRequisitosOBotaoVoltar() throws InterruptedException {
		Na(TelaRequisitosPage.class).acionarNaTelaDeRequisitosOBotaoVoltar();
	}

}
