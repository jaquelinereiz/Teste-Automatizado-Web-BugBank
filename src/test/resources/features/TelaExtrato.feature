#language: pt
#enconding: UTF-8

@end2end
Funcionalidade: Verificar extrato
		
@verificarExtrato
Cenario: Verficar o extrato
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234" 
	E acionar o botao extrato
	Entao a tela de extrato sera exibida
	
@botaoVoltarTelaExtrato
Cenario: acionar o botao voltar na tela de extrato
	Dado que o usuario realizar acesso "lordLorenzo@gmail.com", "Lorenzo", "lord1234"
	E acionar o botao extrato
	E acionar o botao voltar na tela extrato
	Entao o sistema volta para a tela home