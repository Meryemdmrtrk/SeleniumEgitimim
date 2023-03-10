package day02_driverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.diver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        // sayfayı tam ekran yapalım
        driver.manage().window().maximize();
        System.out.println("maximize window boyutları : "+driver.manage().window().getSize());
        System.out.println("maximize window konum : "+driver.manage().window().getPosition());

        Thread.sleep(3000);

         driver.manage().window().fullscreen();
        System.out.println("fullscreen winddow boyutları"+driver.manage().window().getSize());
        System.out.println("fullscreen window konumu: "+driver.manage().window().getPosition());

        // browseri ıstedigimiz konuma ve boyuta getirelim


        Thread.sleep(3000);
       driver.manage().window().setPosition(new Point(100,100));
       driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(3000);
         driver.close();








    }
}
