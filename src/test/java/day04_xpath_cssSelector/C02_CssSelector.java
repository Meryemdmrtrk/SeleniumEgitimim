package day04_xpath_cssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","src/drivers/Chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com/");

       // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

      //  5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedMetin= "Spend less";
        String actualTitle=driver.getTitle();




      //  6- Gift Cards sekmesine basin


      //  7- Birthday butonuna basin
      //a[@aria-label=‘Birthday’]
      //  8- Best Seller bolumunden ilk urunu tiklayin
                //li[@class=‘a-carousel-card acswidget-carousel__card’])[1]
      //  9- Gift card details’den 25 $’i secin
                        //button[@id=‘gc-mini-picker-amount-1’])[1]
      //  10-Urun ucretinin 25$ oldugunu test edin
       // 11-Sayfayi kapatin










           Thread.sleep(3000);
           driver.close();
    }
}
