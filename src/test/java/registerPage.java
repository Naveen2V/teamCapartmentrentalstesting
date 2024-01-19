import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class registerPage {
    public static void main(String[] args) {
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website you want to test
        driver.get("");

        // Find an element using its ID and perform an action (e.g., click)
        driver.findElement(By.id("firstname")).sendKeys("Akash");
        driver.findElement(By.name("lastname")).sendKeys("Anand");
        driver.findElement(By.id("email")).sendKeys("akashanandnair7777@gmail.com");
        driver.findElement(By.name("Contact")).sendKeys("9698608236");
        driver.findElement(By.name("password")).sendKeys("P@ssw0rd");

        driver.findElement(By.className("submit")).submit();
        // Close the browser
        driver.quit();
    }
}
