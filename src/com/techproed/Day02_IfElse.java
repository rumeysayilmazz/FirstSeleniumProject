package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();
        System.out.println("amazounu title'ı : " + amazonTitle);

        if(amazonTitle.toLowerCase().contains("elma")){
            System.out.println(amazonTitle + " ' da elma kelimesi geçiyor");

        }else{
            System.out.println(amazonTitle + " ' da elma kelimesi geçmiyor");

        }



    }


}
