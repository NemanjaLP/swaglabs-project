import Pages.LogInPage;
import jdk.jfr.Description;
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
    @Description("This test verifies that a user can log in successfully with valid credentials.")
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
    @Description("This test verifies that logging in with an valid username and a invalid password results in the correct error message being displayed.")
    public void logInWithValidUsernameAndInvalidPassword() {
        loginpage.enterUserNameText("standard_user");
        loginpage.enterPassword("testing");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }

    @Test
    @Description("This test verifies that logging in with an invalid username and a valid password results in the correct error message being displayed.")
    public void logInWithInvalidUsernameAndValidPassword() {
        loginpage.enterUserNameText("tester");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));
    }

    @Test
    @Description("This test evaluates the system's response when both the username and password are invalid. It checks that the appropriate error message is displayed")
    public void logInWithInvalidUsernameAndInvalidPassword() {
        loginpage.enterUserNameText("tester");
        loginpage.enterPassword("testing");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginpage.getErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }

    @Test
    @Description("This test checks the application's behavior when the password input field is left empty and the login attempt is made. It asserts that the appropriate error message is displayed")
    public void logInWithValidUsernameAndEmptyPasswordInputField() {
        loginpage.enterUserNameText("standard_user");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Password is required";
        String actualMessage = loginpage.getEmptyPasswordInputFieldErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }


    @Test
    @Description("This test checks the application's behavior when the username input field is left empty and the login attempt is made. It asserts that the appropriate error message is displayed")
    public void logInWithValidPasswordAndEmptyUsernameInputField() {
        loginpage.enterPassword("secret_sauce");
        loginpage.clickONLogInButton();
        String expectedMessage = "Epic sadface: Username is required";
        String actualMessage = loginpage.getEmptyUsernameInputFieldErrorMessage();
        assertTrue("The error message is incorect",actualMessage.equals(expectedMessage));

    }
}
