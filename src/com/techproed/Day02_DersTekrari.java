package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DersTekrari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");// google sayfasını görücez
        driver.navigate().to("http://amazon.com"); // amazon sayfasını görücez
        driver.navigate().back(); // google sayfasını görücez
        driver.navigate().forward(); // amazon sayfasını görücez
        driver.navigate().refresh(); // amazon sayasını görücez
        driver.quit();





    }
}
