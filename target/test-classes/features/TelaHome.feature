#language: pt
#enconding: UTF-8


@end2end
Funcionalidade: Interair com a tela home

@acionarBotaoSair
Cenario: sair da tela home para a tela de acesso
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao sair
	Entao o sistema exibe a tela de acesso
	
@acionarBotaoPagamento
Cenario: acionar o botao de pagamentos
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao pagamentos
	Entao o sistema exibe alerta de funcionalidade em desenvolvimento
	
@acionarBotaoSaque
Cenario: acionar o botao de pagamentos
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao saque
	Entao o sistema alerta funcionalidade em desenvolvimento