package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        // sisteme webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler

        WebDriver driver = new ChromeDriver();
        // bilgisayarimizdaki Chrome browser'in otomasyonla calisacak bir kopyasini olusturur
        // Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        // System.setProperty("webdriver.safari.driver","safari driver'in dosya yolu");

        // Olusturdugumuz driver objesi bizim elimiz, gozumuz gibidir

        driver.get("https://www.amazon.com.tr"); // istenen url'e bizi goturur
        // www yazmasak da calisir ancak https:// yazmazsak calismaz

        System.out.println(driver.getTitle()); // bize title'i dondurur
        // Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); // gidilen url'i dondurur
        // https://www.amazon.com.tr/

        System.out.println(driver.getPageSource());
        // gidilen web sayfasinin kaynak kodlarini dondurur

        System.out.println(driver.getWindowHandle()); // AD3766143D645AB91CA36C1F9CE0E570
        // acilan her bir pencere verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles()); // [2CFB97969134927BCE811AF50BFA0D41]
        // eger driver calisirken birden fazla pencere veya tab olusturduysa
        // acilan tum windows/tab'lerin unique hash code'larini bir set olarak dondurur

        Thread.sleep(3000); // mili saniye olarak yazdigimiz rakam sayi suresince kodu bekletir
        driver.close(); // acilan browser'i kapatir


    }
}
