package com.page;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class Baidu_1 {
	
  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  basePage.openBaidu();
  }

  @Test
  public void login() throws InterruptedException {
	  basePage.driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("51testing");
	  basePage.driver.findElement(By.xpath(".//*[@id='su']")).click();
      Thread.sleep(2000);

      Assert.assertTrue(basePage.driver.getPageSource().contains("中国软件测试领跑者"));
      Reporter.log("搜索51testing的测试用例");
  }
  
  @AfterMethod
  public void afterMethod() {
	  basePage.refresh();
  }
}
