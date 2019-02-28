package com.StepDefinitions;

import cucumber.api.java8.En;

public class EnviarCurriculo implements En {
  public EnviarCurriculo() {
    Given("^que o usuario esta na (página|pagina) inicial do site da (zup|Zup)$", (String arg0, String arg1) -> {
      // verificar pelo titulo
    });
    When("^o (usuario|usuário) clicar em PORT$", (String arg0) -> {
      // findByText ou findByValue, nao lembro
    });
    And("^descer a (página|pagina) até o (botao|botão) 'Veja Nossas Vagas'$", (String arg0, String arg1) -> {
      // runscript de scroll(#pixels)
    });
    And("^clicar no (botao|botão) 'Veja Nossas Vagas'$", (String arg0) -> {
      // findByText ou findByValue, nao lembro
    });
    And("^clicar na vaga \"([^\"]*)\"$", (String arg0) -> {
      //nome da vaga variavel pra testar mais de um link
    });
    And("^clicar em ENVIE SEU CURRÍCULO$", () -> {
      // nome fixo para nao generalizar o step de clique
    });
    And("^inserir o email \"([^\"]*)\" no campo de email$", (String arg0) -> {
      // findElement
      // send
    });
    And("^clicar em CONTINUAR$", () -> {
      // findByText ou findByValue, nao lembro
    });
    Then("^a (pagina|pagina) carregada deve conter um título \"([^\"]*)\"$", (String arg0, String arg1) -> {
      // assert getElement(header).getText == arg0
    });
    And("^apresentar o email \"([^\"]*)\" fornecido$", (String arg0) -> {
      // findElement
      // assert getValue == arg0
    });
    And("^apresentar um campo com o (título|titulo) 'Confirme seu endereço de email'$", (String arg0) -> {

    });
    Given("^que o usuario esta na pagina da vaga 'DESENVOLVEDOR BACKEND PYTHON PLENO'$", () -> {
    });
  }
}
