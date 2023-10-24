import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    @Test //Tag for running script below
    public void open_browser(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
    }

    @Test //Tag for running script below
    public void get_title(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        //Get form
        driver.findElement(By.xpath("/*contains")).isDisplayed();
        driver.findElement(By.cssSelector("#button")).isDisplayed();

        driver.close();
    }
}
