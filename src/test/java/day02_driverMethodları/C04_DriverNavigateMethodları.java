package day02_driverMethodlar─▒;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlar─▒ {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.diver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com");
        // get ile ayn─▒ islevi yapar


        Thread.sleep(3000);
        driver.get("https:/www.wisequarter.com");

        Thread.sleep(3000);
        // yeniden amazona donelim
          driver.navigate().back();


        Thread.sleep(3000);
          // tekrar wiswquarter agitmek istersek
        driver.navigate().forward();


      Thread.sleep(3000);
        driver.quit();




    }
}
