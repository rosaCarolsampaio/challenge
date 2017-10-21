#language: pt
#encoding: utf-8
@CriarAnuncioSemLoginCamposObrigatorios
Funcionalidade: Criar novo anúncio sem login campos obrigatorios
  Como um visitante no sistema
  Eu quero criar um novo anuncio com os campos obrigatorios
  De modo que possa gerencia anuncios novos sem login

  @AnuncioApartamentoAluguel @Anuncio @SemLogin
  Esquema do Cenário: Criar anúncio sem login
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
    E Aceitar as regras
    Quando Solicitar a visualização do anúncio
    Então Sistema informa que foi criado uma prévia do anúncio <mensagem>
    E Página é fechada

    Exemplos: 
      | titulo       | preco | metragem | quarto | localizacao | descricao                                              | nome   | email                         | mensagem                                                                                |
      | "Apto teste" |   900 |       55 |      2 | "Radom"     | "Descricao tem que ter no mínimo cinquenta caracteres" | "Rosa" | "qachallengept5555@gmail.com" | "To jest podgląd Twojego ogłoszenia - tak będzie ono prezentowane w Otodom po dodaniu." |
