package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_TitleUrlTest {
    /*
    1-youtube.com'a gidin
    2-sayfa başlığı video kelimesi içeriyor mu ona bakın
    3-driver'ı kapatın
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");

        String yotubeTitle = driver.getTitle();
        System.out.println("youtubun sayfa başlığı : " + yotubeTitle);

        if(yotubeTitle.toLowerCase().contains("youtube")){
            System.out.println("istediğimiz kelimeyi içeriyor");
        }else{
            System.out.println("istediğimiz kelimeyi içermiyor");

        }
        driver.quit();






    }







}
