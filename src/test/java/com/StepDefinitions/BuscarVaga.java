package com.StepDefinitions;

import cucumber.api.java8.En;
import com.automation.ZupSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@SuppressWarnings("unused")
public class BuscarVaga implements En {
  private final ZupSite zupSite = new ZupSite();
  private final Actions actions = new Actions(zupSite.getDriver());

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
      String selector = "header > h1";
      WebElement title = zupSite.findElement(By.cssSelector(selector));
      assertEquals(title.getText(), arg1);
    });

    Given("^que o (usuario|usuário) acessa a pagina de uma vaga com url \"([^\"]*)\"$", (String arg0, String arg1) -> {
      zupSite.getDriver().get(arg1);
    });

    When("^o (usuario|usuário) fornecer o termo de busca \"([^\"]*)\"$", (String arg0, String arg1) -> {
      WebElement searchBar = zupSite.findElement(By.cssSelector("div[class=fields] > input[class=search-query]"));
      searchBar.sendKeys(arg1);
      Thread.sleep(500);
//      searchBar.sendKeys(Keys.RETURN);
    });

    And("^clicar no link da vaga \"([^\"]*)\"$", (String arg0) -> {
      String selector = "//div[@id='content']//a[contains(text(), '" + arg0 + "')]";
      WebDriverWait wait = new WebDriverWait(zupSite.getDriver(), 10);
      WebElement vacancy;
      //noinspection JoinDeclarationAndAssignmentJava,JoinDeclarationAndAssignmentJava,JoinDeclarationAndAssignmentJava,JoinDeclarationAndAssignmentJava
        vacancy = wait.until(visibilityOfElementLocated(By.xpath(selector)));
      vacancy.click();
    });

    And("^o (usuario|usuário) clicar na vaga \"([^\"]*)\"$", (String arg0, String arg1) -> {
      String selector = "//a[contains(text(),'" + arg1 + "')]";
      WebElement vacancy = zupSite.findElement(By.xpath(selector));
      actions.moveToElement(vacancy);
      actions.perform();
      vacancy.click();
    });
  }
}
