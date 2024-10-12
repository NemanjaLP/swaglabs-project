import Pages.LogInPage;
import Pages.ProductListPage;
import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckingSocialMediaLinksTest extends BaseTest{

    ProductListPage productListPage = new ProductListPage(driver);

    LogInPage logInPage = new LogInPage(driver);



    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        logInPage.logInWithValidData();
    }


    @Test
    @Description("Testing the footer Twitter link functionality")
    public void checkOfTwitterLink() throws InterruptedException {


        driver.findElement(productListPage.twitterIcon).click();
        Thread.sleep(2000);
        String mainWindowHandle = driver.getWindowHandle();
        ArrayList<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        tabHandles.remove(mainWindowHandle);
        driver.switchTo().window(tabHandles.get(0));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://twitter.com/saucelabs";
        assertTrue("URL is incorect",actualURL.equals(expectedURL));
        driver.get("https://www.saucedemo.com/");
    }


    @Test
    @Description("Testing the footer Facebook link functionality")
    public void checkOfFacebookLink() throws InterruptedException {


        driver.findElement(productListPage.facebookIcon).click();
        Thread.sleep(2000);
        String mainWindowHandle = driver.getWindowHandle();
        ArrayList<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        tabHandles.remove(mainWindowHandle);
        driver.switchTo().window(tabHandles.get(0));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/saucelabs";
        assertTrue("URL is incorect",actualURL.equals(expectedURL));


        driver.get("https://www.saucedemo.com/");
    }

    @Test
    @Description("Testing the footer Linkedin link functionality")
    public void checkOfLinkedinLink() throws InterruptedException {

        driver.findElement(productListPage.linkedinIcon).click();
        Thread.sleep(2000);
        String mainWindowHandle = driver.getWindowHandle();
        ArrayList<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        tabHandles.remove(mainWindowHandle);
        driver.switchTo().window(tabHandles.get(0));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.linkedin.com/company/sauce-labs/";
        String alsoExpectedURL = "https://www.linkedin.com/authwall?trk=gf&trkInfo=AQH-idneYGO-ywAAAYgf5cF44iiVsC_2BkUOanxCmoSdzU0v0ZtWCusi1p2VFh4AG5K_Ke5jscx1UhZmAANlIrzXsnV7uOUQ6VTq_MYaX6TeHGYx4bUQQp_FW-bKYnpA4km3gXk=&original_referer=https://www.linkedin.com/company/sauce-labs/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F%3Foriginal_referer%3D";
        assertEquals(actualURL,alsoExpectedURL);
    }
}
