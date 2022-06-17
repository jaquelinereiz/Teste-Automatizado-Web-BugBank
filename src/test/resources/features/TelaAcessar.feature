#language: pt
#enconding: UTF-8


@end2end
Funcionalidade: Realizar Acesso

@registrarEAcessar
Cenario: Cadastrar usuario e realizar acesso
	Quando o usuario acionar o botao registrar
	E informar na tela de registro o campo email "lordLorenzo@gmail.com"
	E informar na tela de registro o campo nome "Lorenzo"
	E informar na tela de registro o campo senha "lord1234"
	E informar na tela de registro o campo confirmacao senha "lord1234"
	E acionar o botao criar conta com saldo
	E acionar o botao cadastrar
	E acionar o botao fechar
	E informar na tela de acesso o campo email "lordLorenzo@gmail.com"
	E informar na tela de acesso o campo senha "lord1234"
	E acionar o botao acessar
	Entao o sistema exibe o usuario logado

@emailEsenhaVazio
Cenario: logar com campo email e senha vazio
	Quando o usuario nao informar na tela de acesso o campo email
	E nao informar na tela de acesso o campo senha
	E acionar o botao acessar
	Entao os campos email e senha apresentam alerta de campo obrigatorio
	
@emailVazio
Cenario: logar com campo email vazio
	Quando o usuario nao informar na tela de acesso o campo email
	E informar na tela de acesso o campo senha "lord1234"
	E acionar o botao acessar
	Entao o campo email apresenta alerta de campo obrigatorio

@emailInvalido
Cenario: logar com campo email invalido
	Quando o usuario informar na tela de acesso um email invalido "sal@invalido"
	E informar na tela de acesso o campo senha "lord1234"
	E acionar o botao acessar
	Entao o campo email apresenta alerta de formato invalido

@senhaVazio
Cenario: logar com campo senha vazio
	Quando o usuario informar na tela de acesso o campo email "lordLorenzo@gmail.com"
	E nao informar o campo senha
	E acionar o botao acessar
	Entao o campo senha apresenta alerta de campo obrigatorio
	
