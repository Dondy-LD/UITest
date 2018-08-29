package com.page;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

public class Baidu_2 {
  @Test
  public void login_2() throws InterruptedException {
      WebElement webElement = basePage.driver.findElement(By.xpath(".//*[@id='kw']"));
      webElement.clear();
      webElement.sendKeys("selenium");
      basePage.driver.findElement(By.xpath(".//*[@id='su']")).click();
      Thread.sleep(2000);

      Assert.assertTrue(basePage.driver.getPageSource().contains("浏览器自动化测试框架"));
      Reporter.log("搜索selenium的测试用例");
  }
  @AfterSuite
  public void afterSuite() {
	  basePage.quit();
  }

}
