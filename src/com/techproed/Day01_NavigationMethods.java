package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigationMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driverı tüm sayfaya kaplatıyoruz
        driver.manage().window().maximize();

        driver.get("http://google.com");

        // amazon sayfasına gitmemize yarıyor.  get metodu ile aynı görevi görüyor
        driver.navigate().to("http://amazon.com");

        //gittiğiz sayadan bir öncesine geriye döndük
        driver.navigate().back();

        //öncesine dönmüş olduğumuz sayfadan ileriye eski haline gittik
        driver.navigate().forward();
        driver.close();

        // bulunduğu sayfayı yeniler
        driver.navigate().refresh();








    }

}
