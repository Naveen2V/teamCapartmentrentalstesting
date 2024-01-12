import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePageTestCases {
    public WebDriver driver = new EdgeDriver();
    @BeforeEach
    public void setUp(){

        driver.get("http://127.0.0.1:5500/TimeTrackerfe/Login.html");
    }
    @Test
    @Tag("Home Page Launch and Content Display")
    public void log() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Apartment Image Visibility for All Users")
    public void log1() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Login Menu Option Functionality")
    public void log2() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Registration Menu Option Functionality")
    public void log3() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Apartment Search Filter Functionality")
    public void log4() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    @Tag("Additional Apartment Search Filter Functionality for Admin")
    public void log5() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Additional Apartment Search Filter Functionality for Registered Users")
    public void log6() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    @Tag("Viewing and Searching Functionality for New Users")
    public void log7() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    @Tag(" Registered User Ability to Choose Apartments based on Specific Criteria")
    public void log8() {
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
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
