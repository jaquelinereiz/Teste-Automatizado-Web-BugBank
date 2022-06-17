#language: pt
#enconding: UTF-8

@end2end
Funcionalidade: Verificar tela de registro

@realizarCadastro
Cenario: Realizar cadastro
	Quando o usuario acionar o botao registrar
	E informar na tela de registro o campo email "lordLorenzo@gmail.com"
	E informar na tela de registro o campo nome "Lorenzo"
	E informar na tela de registro o campo senha "lord1234"
	E informar na tela de registro o campo confirmacao senha "lord1234"
	E acionar o botao criar conta com saldo
	E acionar o botao cadastrar
	Entao o sistema exibe a modal de confirmacao cadastrar
		
@emailSenhaEConfirmacaoVazioRegistro
Cenario: registrar com os campos vazios
	Quando o usuario acionar o botao registrar
	E o usuario nao informar na tela de registro no campo email
	E o usuario nao informar na tela de registro o campo senha
	E o usuario nao informar na tela de registro o campo confirmacao senha
	E acionar o botao cadastrar
	Entao o campo email senha e confirmacao apresenta alerta de campo obrigatorio