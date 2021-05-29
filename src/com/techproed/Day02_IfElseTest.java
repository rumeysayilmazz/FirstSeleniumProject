package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElseTest {
    /*
    1. Create a class : Day02_IfElseTest
2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube”
olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Navigate to https://www.amazon.com/
5. Navigate back to youtube
6. Refresh the page
7. Navigate forward to amazon
8. Maximize the window
9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Quit the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\G6HP\\Downloads\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //8. Maximize the window
        driver.manage().window().maximize();

        //2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube”
        //olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
        //yazdirin.
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println("youtube'nin title : " + youtubeTitle);
        if(youtubeTitle.contains("youtube")){
            System.out.println(" title istediğimiz kelimeyi içeriyor");
        }else{
            System.out.println("gerçek başlık : " + youtubeTitle);

        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtube sayfasının url'si : " + youtubeUrl);

        if(youtubeUrl.contains("youtube")){
            System.out.println("url istediğimiz kelimeyi içeriyor");
        }else{
            System.out.println("gerçek url : " + youtubeUrl);
        }


       //4. Daha sonra Navigate to https://www.amazon.com/
        driver.navigate().to("http://amazon.com");
        //5. Navigate back to youtube
        driver.navigate().back();// youtube sayfasını göreceğim
        //6. Refresh the page
        driver.navigate().refresh(); // youtube sayfasını göreceğim
        //7. Navigate forward to amazon
        driver.navigate().forward(); // amazon sayfasını göreceğim

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String amazonTitle = driver.getTitle();
        System.out.println("amazon.com'un title'ı : " + amazonTitle);

        if(amazonTitle.contains("Amazon")){
            System.out.println("istediğimiz kelimeyi içeriyor");
        }else{
            System.out.println("gerçek başlık : " + amazonTitle);
        }



        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        String amazonUrl = driver.getCurrentUrl();
        System.out.println("amazon.com'un url'si : " + amazonUrl);

        if(amazonUrl.contains("https://www.amazon.com/")){
            System.out.println("isrediğimiz adresi içeriyor");
        }else{
            System.out.println("gerçek adres : " + amazonUrl);
        }


        //11.Quit the browser

        driver.quit();


    }





}