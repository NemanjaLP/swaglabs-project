import Pages.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;


    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LogInPage logInPage = new LogInPage(driver);
    }
    @AfterClass
    public static void afterClass() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
