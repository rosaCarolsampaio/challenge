#language: pt
#encoding: utf-8
@NovoUsuario
Funcionalidade: Registrar novo usuário
  Como um visitante no sistema
  Eu quero criar um novo registro de usuário
  De modo que possa manter minha conta no sistema

  @novoCadastro @Usuario @sucesso
  Esquema do Cenário: Cadastrar novo usuário
    Dado Acessar a página registrar novo usuário
    E Informar o email do usuário <email>
    E Informar a senha do usuário <senha>
    E Confirmar a senha do usuário <SenhaRepete>
    E Aceitar o termo de uso "X" marcado
    E Aceitar o envio de boletins "X" marcado
    Quando Solicitar a realização do novo cadastro de usuário
    Então Sistema exibe mensagem de cadastro com sucesso <mensagem>
    E Sitema exibe Botão para acessar seu email cadastrado

    Exemplos: 
      | email                   | senha  | senhaRepete | mensagem   |
      | "novousuario@gmail.com" | 123455 |      123455 | "sucesso!" |
