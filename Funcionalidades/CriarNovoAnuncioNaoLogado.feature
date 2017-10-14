#language: pt
#encoding: utf-8

@SemLoginCamposObrigatorios
Funcionalidade: Ativar novo anuncio sem login campos obrigatorios
  Como um usuario nao tenho login no sistema
  Eu quero criar um novo anuncio aprnas com os campos obrigatorios
  De modo que possa gerencia anuncios novos sem login

  @CategoriaApartamentoAluguel
  Esquema do Cenário: Criar anuncio sem login
    Dado Acessar a página criar anúncios grátis categoria apartamento aluguel férias
    E Informar o título do anúncio <titulo>
    E Informar o preço <preco>
    E Informar a metragem <metragem>
    E Selecionar o número de quartos <quarto>
    E Marcar o tipo de vendedor senhorio
    E Informar a localização do apartamento <localizacao>
    E Informar a descrição do anúncio <descricao>
    E Informar o meu nome <nome>
    E Informar o meu email <email>
    E Aceitar as regras "sim"
    Quando Solicitar a visualização do anúncio
    Então Sistema informa que foi criado uma prévia do anúncio <mensagem>

    Exemplos: 
      | titulo       | preco | metragem | quarto | localizacao      | descricao                                              | nome   | email                         | mensagem                                                                                |
      | "Apto teste" |   900 |       55 |      2 | "Radom, Mazovia" | "Descricao tem que ter no mínimo cinquenta caracteres" | "Rosa" | "qachallengept5555@gmail.com" | "To jest podgląd Twojego ogłoszenia - tak będzie ono prezentowane w Otodom po dodaniu." |
