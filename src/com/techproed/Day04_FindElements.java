package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

         List<WebElement> listem = driver.findElements(By.tagName("a"));


         /*

         for(int i=0; i<listem.size(); i++){
             WebElement elemanlarım = listem.get(i);
             System.out.println(elemanlarım.getText());
        }

          */
        for(WebElement elemanlarım : listem){
            System.out.println(elemanlarım.getText());
        }


    }

}
