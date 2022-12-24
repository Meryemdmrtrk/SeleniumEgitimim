package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");

        // 2-arama kutusunu locate edelim
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // 3-"Samsung headphones" ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
        // 4-Bulunan sonuc sayısını yazdıralım
         WebElement soncYazıElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(soncYazıElementi.getText());
        // 5- ilk urunu tıklayalım
                driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        // 6-sayfadaki tum baslıkları yazdıralım
        driver.navigate().back();
        List<WebElement> basliklarWebElementListesi= driver.findElements(By.xpath("//a[@class ='a-link-normal s-navigation-item']"));
        for (WebElement each: basliklarWebElementListesi
        ) {
            System.out.println(each.getText());
        }
        driver.close();



    }
}
