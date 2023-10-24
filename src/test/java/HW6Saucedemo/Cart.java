package HW6Saucedemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
    @Test
    public void success_add_to_cart_case() {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/inventory.html";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        //Open dashboard
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
        //Click add to cart
        driver.findElement(By.xpath("//add-to-cart-sauce-labs-backpack")).click();
    }
}
