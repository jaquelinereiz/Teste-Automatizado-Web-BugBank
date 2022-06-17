#language: pt
#enconding: UTF-8

@end2end
Funcionalidade: Verificar tela de transferencia
		
@telaDeTransferencia	
Cenario: Visualizar tela transferencia
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234" 
	E acionar o botao transferencia
	Entao a tela de transferencias sera exibida
	
@transferenciaSemValor
Cenario: tentar fazer uma transferencia com valor de transacao vazio
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao transferencia
	E informar o campo numero da conta "6789"
	E informar o campo digito "1"
	E nao informar o campo valor da transferencia
	E informar o campo descricao "aqui tem uma descricao!"
	E acionar o botao transferir agora
	Entao o sistema exibe o alerta para inserir um valor
	
@contaInexistente
Cenario: tentar fazer uma transferencia para uma conta inexistente
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao transferencia
	E informar o campo numero da conta "4848"
	E informar o campo digito "2"
	E informar o campo valor da transferencia "172"
	E informar o campo descricao "aqui tem uma descricao!"
	E acionar o botao transferir agora
	Entao o sistema exibe o alerta de conta invalida ou inexistente
	
@botaoVoltarTelaTransferencia	
Cenario: acionar o botao voltar na pagina de transferencia
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234" 
	E acionar o botao transferencia
	E acionar o botao voltar
	Entao o sistema volta para a tela home
	
@iconeBugbankTelaTransferencia
Cenario: acionar o icone bugbank na tela de transferencia
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234" 
	E acionar o botao transferencia
	E acionar o icone bugbank
	Entao o sistema volta para a tela home
	
