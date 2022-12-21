package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // get ile aynı islevi yapar

        Thread.sleep(3000);
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);
        // yeniden amazon a donelim
        driver.get("https://www.amazon.com");


        Thread.sleep(3000);
        // tekrar wisequarter a donmek istersek

















    }



}
