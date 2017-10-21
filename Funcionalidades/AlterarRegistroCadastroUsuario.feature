#language: pt
#encoding: utf-8
@AterarCadastroUsuario
Funcionalidade: Alterar a senha do usuário
  Como um usuário registrado no sistema
  Eu quero alterar a senha
  De modo que possa acessar o sistema 

  @Usuario @AlteraCadastro @Senha
  Esquema do Cenário: Alterar senha já cadastrada no sistema
    Dado Acessar a página de alterar senha no sistema
    E Informar a senha atual <senhaAtual>
    E Informar a nova senha <senhaNova>
    E Informar a senha novamente <senhaRepete>
    Quando Solicitar a alteração para a nova senha
    Então Sistema informa que a senha  foi alterada no sistema <mensagem>

    Exemplos: 
      | senhaAtual | senhaNova   | senhaRepete |
      | "teste2"   | "novaSenha" |          55 |
