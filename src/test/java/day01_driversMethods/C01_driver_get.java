package day01_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        // windiws olanlar sonunda .exe yazmalı,mac'de buna gerek yok

        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.amazon.com");
        Thread.sleep(5000);
        driver.close();


        /*
        1- Selenium jar dosyalarını ve chromedriver 'ini manuel olarak sisteme
        tanıtmıs olduk

        Eger firefox veya safari ile calısmamız gerekirse bu defa da
         onların  driver'lerini indirip,manuel olarak
         10. satırda olan driverleri tanımlamalıyız

         2- 13. satırda ChromeDriver() constructor 'ını kullanarak bir obje olusturduk
         bu objeyi kullanmazsak bile bu satırdan dolayı bir bos browser acılır

         3- driver.get(url) driver'i yazdıgımız url'e goturur
         url yazaeken www yazmasak dahi calısır ancak https://  yazmazsak method calısmaz




          */



    }
}
