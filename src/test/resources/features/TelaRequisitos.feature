#language: pt
#enconding: UTF-8

@end2end
Funcionalidade: Verificar os requisitos
		
@abrirTelaRequisitos
Cenario: abrir a tela de conheca nossos requisitos
	Quando o usuario acionar o botao conhecer requisitos
	Entao o sistema abre a tela de requisitos
	
@requisitoPagamento
Cenario: abrir os requisitos de pagamento
	Quando o usuario acionar o botao conhecer requisitos
	E acionar a opcao requisitos pagamento
	Entao o sistema mostra os requisitos pagamento
	
@requisitoSaque
Cenario: abrir os requisitos de saque
	Quando o usuario acionar o botao conhecer requisitos
	E acionar a opcao requisitos saque
	Entao o sistema mostra os requisitos saque
	
@acessarRepositorio
Cenario: abrir o repositorio do projeto
	Quando o usuario acionar o botao conhecer requisitos
	E acionar o botao repositorio
	Entao o sistema mostra o repositorio
	
@botaoBugBankRequisitos
Cenario: abrir o repositorio do projeto
	Quando o usuario acionar o botao conhecer requisitos
	E acionar o botao icone bugBank
	Entao o sistema exibe a tela de acesso
	
@botaoVoltarRequisitos
Cenario: abrir o repositorio do projeto
	Quando o usuario acionar o botao conhecer requisitos
	E acionar na tela de requisitos o botao voltar
	Entao o sistema exibe a tela de acesso