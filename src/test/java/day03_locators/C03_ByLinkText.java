package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        // amazon anasayfasına gidin
        //Gift Cards Linkini tıklayın
        //Gift Cards sayfasına gittigini test edin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // WebElement HediyeKartıLinki= driver.findElement(By.LinkText("HediyeKartı));

        Thread.sleep(4000);

        driver.get("https:/www.amazon.com");
        WebElement HediyeKartıLinki=driver.findElement(By.linkText("Hediye Kartı"));
        HediyeKartıLinki.click();

         // istenen sayfaya gittigini test etmek icin
        // titkle'in Gift Crad icerdigini test edebiliriz

         String exceptedKelime="Hediye Kartı";
         String actualTitle=driver.getTitle();

         if (actualTitle.contains(exceptedKelime)){
             System.out.println("Hediye Kartı testi PASSED");
         }else {
             System.out.println("Hediye Kartı testi FAILED");
         }

           driver.close();
    }
}
