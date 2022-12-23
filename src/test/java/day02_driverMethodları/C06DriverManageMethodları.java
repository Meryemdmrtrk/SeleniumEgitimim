package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06DriverManageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.diver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitly wait gittigimiz sayfa acılıncaya veya aradıgımız webelementbulununcaya kadar
        // driver'in bekleyecegi max sureyi belirler

        //Bu dortlu test methodunun basına yazılacak










    }
}
