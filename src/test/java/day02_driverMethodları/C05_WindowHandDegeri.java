package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandDegeri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());// CDwindiv-C98BA9BE4C20B7A6CF86FE120B09A887

        driver=new ChromeDriver();
        driver.manage().window().maximize()
        System.out.println(driver.getWindowHandle());


        Thread.sleep(3000);
        driver.quit();






    }
}
