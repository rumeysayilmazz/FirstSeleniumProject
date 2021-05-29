package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDersAlistirma {

    // 1. google.coma gidin
    // 2. navigate to metodu ile amazonçcona gidin
    // 3. navigeta back ile geri gelin
    // 4. forward metodu ile tekrar ileri gidin
    // 5. bulunduğunuz sayfayı yenileyin
    // 6. driverı kapatın
    //driverı ekrana kaplatın
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back(); // google sayfasına geri döndü
        driver.navigate().forward(); // amazon.coma tekrar gidecek
        driver.navigate().refresh(); // bulunduğu sayfayı yeniledi

        driver.close();




    }


}
