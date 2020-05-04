#language: pt
#encoding: utf-8
@AtivartUsuario
Funcionalidade: Ativar novo usuário no sistema
  Como um usuário recém cadastrado  
  Eu quero realizar a ativação do cadastro 
  De modo que possa acessar meu cadastro

  @ativar @Usuario @cadastro @sucesso
  Esquema do Cenário: Ativar cadastro no sitema
    Dado Acessar a página registrar novo usuário
    E Informar o email do usuário <email>
    E Informar a senha do usuário <senha>
    E Repetir a senha do usuário <senhaRepete>
    E Aceitar a leitura do Termo
    E Solicitar a realização do novo cadastro de usuário
    E Sistema exibe a mensagem de cadastro com sucesso
    E Sistema exibe Botão de acessar seu email cadastrado para ativação
    Quando Solicitar o acesso ao email cadastrado para ativação
    E Informar o email cadastrado <email>
    E Informar a senha do email cadastrado <senha>
    E Acessar o email enviado para ativação
    E Solicitar a ativação pelo link no email
    Então Sistema redireciona para página de ativação no sistema
    E Sistema exibe a mensagem de ativação de usuário com sucesso <mensagem>
    E Página do teste é fechada

    Exemplos: 
      | email                      | senha       | senhaRepete   |    mensagem   |
      | "qaautomation@gmail.com"   | "inicial"   | "inicial"     | "Gratulacje!" |
