package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class soru1 {

    /*
      1- amazon.coma gidiniz
      2- o sayfaya geldiğinizi doğrulatınız
      3- eğer o sayfadaysanız keyvord kelimesini aratınız
      4- keyboad kelimeini arattıktan sonra o sayfada olduğnuzu doğrulatın
      5- eğer o sayfadaysanız çıkan sonuçların görünür olduğundan enim olunuz
      6- eğer görünüyorsa ekrana yazdırınız

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();

        driver.get("http:amazon.com");
        String amazonTitle =driver.getTitle();
        if(amazonTitle.contains("Amazon")){

            WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("keyboard");
            aramaKutusu.submit();
            String keyboardBaslik = driver.getTitle();
            if(keyboardBaslik.contains("keyboard")){
                WebElement yazıElementi = driver.findElement(By.tagName("h1"));
                yazıElementi.isDisplayed();
                if(yazıElementi.isDisplayed()){
                    String yazi = yazıElementi.getText();
                    System.out.println(yazi);
                }else{
                    System.out.println("x");
                }
                //String yazi = yazıElementi.getText();
                //System.out.println(yazi);
            }else{
                System.out.println("tekrar sayfayı dene");
            }



        }else{
            System.out.println("tekrar amazon adresine bağlan");

        }









    }


}
