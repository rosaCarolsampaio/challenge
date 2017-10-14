$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CriarNovoAnuncioNaoLogado.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 5,
  "name": "Ativar novo anuncio sem login campos obrigatorios",
  "description": "Como um usuario nao tenho login no sistema\nEu quero criar um novo anuncio aprnas com os campos obrigatorios\nDe modo que possa gerencia anuncios novos sem login",
  "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@SemLoginCamposObrigatorios"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Criar anuncio sem login",
  "description": "",
  "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios;criar-anuncio-sem-login",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@CategoriaApartamentoAluguel"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Acessar a página criar anúncios grátis categoria apartamento aluguel férias",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "Informar o título do anúncio \u003ctitulo\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "Informar o preço \u003cpreco\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "Informar a metragem \u003cmetragem\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "Selecionar o número de quartos \u003cquarto\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "Marcar o tipo de vendedor senhorio",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "Informar a localização do apartamento \u003clocalizacao\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "Informar a descrição do anúncio \u003cdescricao\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "Informar o meu nome \u003cnome\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "Informar o meu email \u003cemail\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "Aceitar as regras \"sim\"",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "Solicitar a visualização do anúncio",
  "keyword": "Quando "
});
formatter.step({
  "line": 24,
  "name": "Sistema informa que foi criado uma prévia do anúncio \u003cmensagem\u003e",
  "keyword": "Então "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios;criar-anuncio-sem-login;",
  "rows": [
    {
      "cells": [
        "titulo",
        "preco",
        "metragem",
        "quarto",
        "localizacao",
        "descricao",
        "nome",
        "email",
        "mensagem"
      ],
      "line": 27,
      "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios;criar-anuncio-sem-login;;1"
    },
    {
      "cells": [
        "\"Apto teste\"",
        "900",
        "55",
        "2",
        "\"Radom, Mazovia\"",
        "\"Descricao tem que ter no mínimo cinquenta caracteres\"",
        "\"Rosa\"",
        "\"qachallengept5555@gmail.com\"",
        "\"To jest podgląd Twojego ogłoszenia - tak będzie ono prezentowane w Otodom po dodaniu.\""
      ],
      "line": 28,
      "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios;criar-anuncio-sem-login;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 28,
  "name": "Criar anuncio sem login",
  "description": "",
  "id": "ativar-novo-anuncio-sem-login-campos-obrigatorios;criar-anuncio-sem-login;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@CategoriaApartamentoAluguel"
    },
    {
      "line": 4,
      "name": "@SemLoginCamposObrigatorios"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Acessar a página criar anúncios grátis categoria apartamento aluguel férias",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "Informar o título do anúncio \"Apto teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "Informar o preço 900",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "Informar a metragem 55",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "Selecionar o número de quartos 2",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "Marcar o tipo de vendedor senhorio",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "Informar a localização do apartamento \"Radom, Mazovia\"",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "Informar a descrição do anúncio \"Descricao tem que ter no mínimo cinquenta caracteres\"",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "Informar o meu nome \"Rosa\"",
  "matchedColumns": [
    6
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "Informar o meu email \"qachallengept5555@gmail.com\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "Aceitar as regras \"sim\"",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "Solicitar a visualização do anúncio",
  "keyword": "Quando "
});
formatter.step({
  "line": 24,
  "name": "Sistema informa que foi criado uma prévia do anúncio \"To jest podgląd Twojego ogłoszenia - tak będzie ono prezentowane w Otodom po dodaniu.\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "AtivarNovoAnuncioSteps.acessar_a_página_criar_anúncios_grátis_categoria_apartamento_aluguel_férias()"
});
formatter.result({
  "duration": 80809241156,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"div.gtm-survey__close.js-gtm-survey-close\"}\n  (Session info: chrome\u003d61.0.3163.79)\n  (Driver info: chromedriver\u003d2.33.506092 (733a02544d189eeb751fe0d7ddca79a0ee28cce4),platform\u003dLinux 4.4.0-93-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 70.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 16:57:40\u0027\nSystem info: host: \u0027rosasampaio\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-93-generic\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506092 (733a02544d189eeb751fe0d7ddca79a0ee28cce4), userDataDir\u003d/tmp/.org.chromium.Chromium.odRrLn}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d61.0.3163.79, platform\u003dLINUX, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: d25a9ab44a11cf0c345506e759b57f7c\n*** Element info: {Using\u003dcss selector, value\u003ddiv.gtm-survey__close.js-gtm-survey-close}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat Testes.AtivarNovoAnuncioSteps.acessar_a_página_criar_anúncios_grátis_categoria_apartamento_aluguel_férias(AtivarNovoAnuncioSteps.java:33)\n\tat ✽.Dado Acessar a página criar anúncios grátis categoria apartamento aluguel férias(CriarNovoAnuncioNaoLogado.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apto teste",
      "offset": 30
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_o_título_do_anúncio(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "900",
      "offset": 17
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_o_preço(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "55",
      "offset": 20
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_a_metragem(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 31
    }
  ],
  "location": "AtivarNovoAnuncioSteps.selecionar_o_número_de_quartos(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtivarNovoAnuncioSteps.marcar_o_tipo_de_vendedor_senhorio()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Radom, Mazovia",
      "offset": 39
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_a_localização_do_apartamento(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Descricao tem que ter no mínimo cinquenta caracteres",
      "offset": 33
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_a_descrição_do_anúncio(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rosa",
      "offset": 21
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_o_meu_nome(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "qachallengept5555@gmail.com",
      "offset": 22
    }
  ],
  "location": "AtivarNovoAnuncioSteps.informar_o_meu_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sim",
      "offset": 19
    }
  ],
  "location": "AtivarNovoAnuncioSteps.aceitar_as_regras(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtivarNovoAnuncioSteps.solicitar_a_visualização_do_anúncio()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "To jest podgląd Twojego ogłoszenia - tak będzie ono prezentowane w Otodom po dodaniu.",
      "offset": 54
    }
  ],
  "location": "AtivarNovoAnuncioSteps.sistema_informa_que_foi_criado_uma_prévia_do_anúncio(String)"
});
formatter.result({
  "status": "skipped"
});
});