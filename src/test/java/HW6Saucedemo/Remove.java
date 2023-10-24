package HW6Saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove {
    @Test
    public void success_remove_case() {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/cart.html";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        //Open cart page
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
        //Click remove from cart
        driver.findElement(By.xpath("//remove-sauce-labs-bike-light")).click();
    }
}
