package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_DersTekrari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("computers");

        WebElement okButonu = driver.findElement(By.id("nav-search-submit-button"));
        okButonu.click();

        WebElement yaziElementi = driver.findElement(By.className("sg-col-inner"));

        //System.out.println(yaziElementi.getText());
        if(yaziElementi.isDisplayed()){
            System.out.println("görüyorum");
        }else{
            System.out.println("görmüyorum");
        }








    }


}
