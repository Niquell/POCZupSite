package com.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ZupSite extends BasePage {
  public WebDriver getDriver() { return super.getDriver(); }
  private JavascriptExecutor js = (JavascriptExecutor) getDriver();

  public ZupSite (){
    super();
  }

  public void start() {
    getDriver().manage().window().maximize();
    getDriver().get("http://www.zup.com.br/");
  }

//  public void cssSelectWaitAndClick (String selector) {
//
//    WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//    WebElement element = wait.until(visibilityOfElementLocated(By.cssSelector(selector)));
//    element.click();
//  }

  public void scroll(int xpixels, int ypixels) {
    js.executeScript("window.scrollBy(" + xpixels + "," + ypixels + ")");
  }

  public WebElement findElement (By selector) {
    return getDriver().findElement(selector);
  }
}
