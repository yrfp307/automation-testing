package HW6Saucedemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void success_login_case() {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        //Open login page
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
        //Input username
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        //Input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //quit
        driver.close();
    }

    @Test
    public void failed_login_case() {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //Apply chrome driver setup
        //Open login page
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
        //Input username
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        //Input invalid password
        driver.findElement(By.id("password")).sendKeys("secretsauce");
        //Click login
        driver.findElement(By.xpath("//login-button[@type='submit']")).click();

        //Error message
        String ErrorLogin = driver.findElement(By.xpath("//div[@role='alert]")).getText();
        Assert.assertEquals(ErrorLogin, "Epic sadface: Username and password do not match any user in this service");

        driver.close();
    }
}
