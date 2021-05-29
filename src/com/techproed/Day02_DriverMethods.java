package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        //amazonun title'ını alır
        String amazonTitle = driver.getTitle();

        // amazonun title'ını yazdırır
        System.out.println("amazonun title'ı : " + amazonTitle);

        // amaznun url'Sini alır
        String amazonUrl = driver.getCurrentUrl();

        //amazonun url'sini yazdırır
        System.out.println("amazonun Url'si : " + amazonUrl);

    }



}
