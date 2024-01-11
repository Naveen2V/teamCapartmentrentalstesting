import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageTestCase {
   public WebDriver driver = new ChromeDriver();
    @BeforeEach
    public void setUp(){

        driver.get("http://127.0.0.1:5500/TimeTrackerfe/Login.html");
    }
    @Test
    public void log(){
        driver.findElement(By.id("UserId")).sendKeys("Vishnu");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.className("login-button")).click();
    }

    @Test
    public void log1(){
        driver.findElement(By.id("UserId")).sendKeys("V");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.className("login-button")).click();
    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
