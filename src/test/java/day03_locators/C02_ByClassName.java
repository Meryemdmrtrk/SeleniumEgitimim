package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // amazon'a gidip nutella icin arama yapın
        // ilk sayfada cıkan urunlerin icersinde
        //en yuksek fıyatı bulun

        System.setProperty("webdriver.chorme.driver","src/drivers/chormedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          driver.get("https://www.amazon.com");




        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

           // WebElement bir obje oldugundan ,direk yazdırılamaz
        System.out.println(fiyatlarListesi);

        // Bunun icin for-each kullnarak
        // her bir webelement uzerindeki yazıları tek tek yazdırmalıyız

        for (WebElement each: fiyatlarListesi){

            System.out.println(each.getText()+" ");
        }
        // en yuksek bulabilmek icin java bilgimizi kullanmalıyız
        // 1- web elementlerden getTextile fiyatı String olarak alın
        // 2- strıng fiyatı kıyaslama yapabilmek icin Integer2a cevirin
        // 3- enyuksek fiyatı bulup yazdırın

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;

        for (WebElement each: fiyatlarListesi){

            fiyatStr= each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }
        }
        System.out.println("Enyuksek urun fiyatı :"+ enYuksekFiyat);


       Thread.sleep(3000);
        driver.close();
    }
}
