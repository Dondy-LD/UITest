package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {
	public static WebDriver driver;
	
	public static void openBaidu() throws InterruptedException {
        //封装打开首页
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Jenkins\\workspace\\UITest\\src\\main\\resources\\chromedriver.exe");
        String Url = "https://www.baidu.com";
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public static void refresh(){
        //封装刷新浏览器
        driver.navigate().refresh();
    }
    
    public static void quit(){
        //封装结束driver
        driver.quit();
    }
}
