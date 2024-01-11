import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginPageTestCases {
   public WebDriver driver = new EdgeDriver();
    @BeforeEach
    public void setUp(){

        driver.get("http://127.0.0.1:5500/TimeTrackerfe/Login.html");
    }
    @Test
    @Tag("adminlogin")
    public void log(){
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishnu");
    }

    @Test
    @Tag("userlogin")
    public void log1(){
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishn");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("username")).equals("Vishn");
    }

    @Test
    @Tag("userreg")
    public void log2(){
        driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sam");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("andasan");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("samandrasan@gmail.com");
        driver.findElement(By.xpath("//input[@id='Contact']']")).sendKeys("1234567890");
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
