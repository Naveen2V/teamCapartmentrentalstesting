import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DetailsTestCases {
    public WebDriver driver = new EdgeDriver();
    @BeforeEach
    public void setUp(){

        driver.get("http://127.0.0.1:5500/TimeTrackerfe/Login.html");
    }
    @Test


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
