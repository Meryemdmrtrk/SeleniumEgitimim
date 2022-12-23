package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.diver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());

        // pageSource'un MEOW icerdigini test edin

        String pageSource = driver.getPageSource();

        String expectedKelime = "MEOW";

        if (pageSource.contains(expectedKelime)) {
            System.out.println("page source testi PASSED");
        } else {
            System.out.println("Page source testi FAILED, MEOW kelimesi bulunamadı");


        }
    }
}