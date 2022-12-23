package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativelLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromdriver.diver","src/drivers/chromedrivers.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
          driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");


        //  2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement sailorElement=driver.findElement(By.xpath("//p[text()=‘Sailor’]"));
        WebElement berlin1=
                driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElement));
           // Baston ın sagı dıyelım

        WebElement bostonElementi=driver.findElement(By.xpath("/p[text()=‘Boston’]"));
              // tarif etmek istediginiz web elementın bir ozellıgını kullanmalısınız
              // ornegin tagName=img


        // Sailor 'in ustundeki diyelim

        //   3 ) Relative locator’larin dogru calistigini test edin
        //id'si pid7_thumb oldugunu test edelim

         String exceptedDegeri="id'si pid7_thumb";
         String actualDegeri=berlin1.getAttribute("Id");

         if (exceptedDegeri.equals(actualDegeri)){
             System.out.println("Relative  locator testi PASSED");
         }else {
             System.out.println("Relative locator testi FAILED");
         }



     driver.close();
    }
}
