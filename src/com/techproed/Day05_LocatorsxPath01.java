package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_LocatorsxPath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();
        /*
        Username : testtechproed@gmail.com
        Password : Test1234!
        */
        //<input type="email" class="form-control" placeholder="Email"
        // data-test="email" name="session[email]" id="session_email">
        ////tagName[@attribute='value'];

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234!");



        WebElement signInButonu = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButonu.click();













    }

}
