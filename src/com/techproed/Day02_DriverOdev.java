package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    //0-driverı ekranı kaplıcakşekilde kullanalım
    //1-ilk önce google.com'a gidelim
    //2-sayfanın title'ını alalım ekrana yazdıralım
    //3-daha sonra youtube.com'a gidelim
    //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
    //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
    //6-driverımızı kapatalım

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //0-driverı ekranı kaplıcakşekilde kullanalım
        driver.manage().window().maximize();

        //1-ilk önce google.com'a gidelim
        driver.get("http://google.com");

        //2-sayfanın title'ını alalım ekrana yazdıralım
        String googleTitle = driver.getTitle();
        System.out.println("google sayfasının başlığı : " + googleTitle);

        //3-daha sonra youtube.com'a gidelim
        driver.navigate().to("http://youtube.com");

        //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
        String youtubeTitle = driver.getTitle();
        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtube sayfasının title'ı : " + youtubeTitle);
        System.out.println("youtube sayasının url'si : " + youtubeUrl);

        //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("goggle sayfasının url'si : " + googleUrl);

        //6-driverımızı kapatalım
        driver.quit();


    }




}
