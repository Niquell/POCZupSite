package com.StepDefinitions;

import cucumber.api.java8.En;
import com.automation.ZupSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuscarVaga implements En {
  private ZupSite zupSite = new ZupSite();
  private Actions actions = new Actions(zupSite.getDriver());

  public BuscarVaga() {
    Given("^que o (usuario|usuário) acessa a pagina principal da Zup na parte VemPraZup$", (String arg0) -> {
      zupSite.start();
      // TODO: porque as vezes a pagina nao carrega direito? <- pesquisar
      WebElement portButton = zupSite.getDriver().findElement(By.cssSelector("a[href='http://www.zup.com.br/pt/']"));
      portButton.click();
//      WebElement BotaoVagas = zupSite.getDriver().findElement(By.cssSelector("a[class='nectar-button jumbo see-through-extra-color-gradient-1']"));
//      actions.moveToElement(BotaoVagas);
      // TODO: scrollar ao invez de get()
      zupSite.getDriver().get("http://www.zup.com.br/pt/#Vem%20pra%20Zup");
    });

    When("^o usuario clicar para ver vagas$", () -> {
      WebElement BotaoVagas = zupSite.getDriver().findElement(By.cssSelector("a[class='nectar-button jumbo see-through-extra-color-gradient-1']"));
      Thread.sleep(1500);
      BotaoVagas.click();
//      zupSite.cssSelectWaitAndClick("a[class='nectar-button jumbo see-through-extra-color-gradient-1']");
    });

    Then("^A (pagina|página) carregada deve ter o titulo \"([^\"]*)\"$", (String arg0, String arg1) -> {
      System.out.println(arg0);
    });

    Given("^que o (usuário|usuario) acessa a pagina da vaga \"([^\"]*)\"$", (String arg0, String arg1) -> {
      System.out.println(arg0);
    });

    When("^o (usuario|usuário) fornecer o termo de busca \"([^\"]*)\" e teclar Enter$", (String arg0, String arg1) -> {
      System.out.println(arg0);
    });

    And("^clicar no link da vaga \"([^\"]*)\"$", (String arg0) -> {
      System.out.println(arg0);
    });

    And("^o (usuario|usuário) clicar na vaga \"([^\"]*)\"$", (String arg0, String arg1) -> {
      WebElement element = zupSite.findElement(By.cssSelector("a[href='https://jobs.kenoby.com/zupit/job/desenvolvedor-backend-python-pleno/5c12b9fb12c0b34a6adf09e1']"));
      actions.moveToElement(element);
      actions.perform();
      element.click();
    });
  }
}
