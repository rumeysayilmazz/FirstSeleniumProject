package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Alistirma2 {
    //1-ilk önce google.coma gidelim
    //2- youtube.coma gidelim
    //3- google.coma geri dönelim
    //4- youtube.coma forward ile tekrar gidelim
    //5- bulunduğumuz sayfsyı yenileyelim
    //6-dirverı kapatalım
    // driverı maxsimize edelim


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.navigate().to("http://youtube.com");
        driver.navigate().back(); // google sayfasına geri döndü
        driver.navigate().forward(); // youtube.coma tekrar gidecek
        driver.navigate().refresh(); // bulunduğu sayfayı yeniledi

        driver.close();


    }
}
