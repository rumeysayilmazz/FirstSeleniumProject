package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Alistirma {
    /*
    1. Bir class oluşturun : GoogleSearchTest
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    A.google web sayfasına gidin. https://www.google.com/
    b. Search(ara) “city bike”
    c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
    d. “Shopping” e tıklayın.

     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();

        driver.get("http://google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        WebElement goruntulemeSayisi = driver.findElement(By.id("result-stats"));
        String goruntulemeYazisi = goruntulemeSayisi.getText();
        System.out.println("doruntileme yazıs : " + goruntulemeYazisi);


        WebElement alisverisLinki = driver.findElement(By.className("hide-focus-ring"));
        alisverisLinki.click();







    }


}
