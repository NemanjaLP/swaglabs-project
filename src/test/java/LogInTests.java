import Pages.LogInPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogInTests extends BaseTest{


    LogInPage loginpage = new LogInPage(driver);


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");

    }



    @Test
    public void logInWithValidData() {
        loginpage.enterUserNameText("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickONLogInButton();
        String expectedResult =  "https://www.saucedemo.com/inventory.html";
        String actualResult = driver.getCurrentUrl();
        assertTrue("The current URL is not good",actualResult.equals(expectedResult));
        driver.navigate().back();

    }

    @Test
    public void logInWithValidUsernameAndInvalidPassword() {
        loginpage.enterUserNameText("standard_user");
        loginpage.enterPassword("testing");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }

    @Test
    public void logInWithInvalidUsernameAndValidPassword() {
        loginpage.enterUserNameText("tester");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));
    }

    @Test
    public void logInWithInvalidUsernameAndInvalidPassword() {
        loginpage.enterUserNameText("tester");
        loginpage.enterPassword("testing");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }

    @Test
    public void logInWithValidUsernameAndEmptyPasswordInputField() {
        loginpage.enterUserNameText("standard_user");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Password is required";
        String actualMessage = loginpage.getEmptyPasswordInputFieldErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }


    @Test
    public void logInWithValidPasswordAndEmptyUsernameInputField() {
        loginpage.enterPassword("secret_sauce");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username is required";
        String actualMessage = loginpage.getEmptyUsernameInputFieldErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }
}
