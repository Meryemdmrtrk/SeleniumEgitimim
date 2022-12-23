package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodları
{
    public static void main(String[] args) throws InterruptedException {

        //Biz browser'şeri olusturdugumuz driver sayesinde otomate edebiliyoruz
        // Bunun icin her testin basında mutlaka driver objesş olusturacagız


        System.setProperty("webdriver.chrome.diver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
       //acılan sayfanın baslıgının amazon icerdigini test edin

        String exceptedKelime="amazon";
        String actualRasult= driver.getTitle();

        if (actualRasult.contains(exceptedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title amazon icermiyor, test FAILED");

        }

        // gittiginiz sayfanın URL 'inin  https://www.amazon.com/ oldugunu test edin

         String expectedUrl="https://www.amazon.com/";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }


       Thread.sleep(5000);
         driver.close();














    }
}
