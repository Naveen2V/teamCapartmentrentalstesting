import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RequestTestCases {
    public WebDriver driver = new EdgeDriver();
    @BeforeEach
    public void setUp(){

        driver.get("http://127.0.0.1:5500/TimeTrackerfe/Login.html");
    }
    @Test
    @Tag("Reqstatdis")
    public void log() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
    }
    @Test
    @Tag("adminlogout")
    public void log1() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
    }
    @Test
    @Tag("adminlogout")
    public void log2() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
    }
    @Test
    @Tag("adminlogout")
    public void log3() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
    }
    @Test
    @Tag("adminlogout")
    public void log4() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
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
