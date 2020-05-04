#language: pt
#encoding: utf-8
@LogoutUsuario
Funcionalidade: Realizar logout no sistema
  Como um usuário logado no sistema
  Eu quero realizar logout no sistema
  De modo que possa finalizar meu acesso com segurança

  @Logout @Usuario @sucesso
  Esquema do Cenário: Realizar logout no sitema
    Dado Acessar a qualquer página de login no sistema
    E Informar o email <email>
    E Informar a senha <senha>
    E Solicitar o login
    Quando Solicitar a saída do sistema no link Sair
    Então Sistema redireciona para página principal com link Minha Conta
    E Página atual é fechada

    Exemplos: 
      | email                         | senha   |
      | "qaautomation@gmail.com" | "teste" |
