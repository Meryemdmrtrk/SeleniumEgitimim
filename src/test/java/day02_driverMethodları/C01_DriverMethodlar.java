package day02_driverMethodları;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class C01_DriverMethodlar {
    public static void main(String[] args) throws InterruptedException {

        // biz browser'ları olusturdugumuz driver sayesinde otomate edebiliyoruz
        // Bunun icin her testin basında mutlaka driver objesi olusturacagız

     System.setProperty("webdiver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
         // açılan sayfanın baslığının amazon icerdigini test edin

        Thread.sleep(5000);
        driver.close();

        String exceptedKelime="amazon";
        String actualResult=driver.getTitle();

        if (actualResult.contains(exceptedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title amazon icermiyo,tes FAILD");
        }




        }

    }

