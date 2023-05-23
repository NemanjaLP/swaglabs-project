package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public static WebDriver driver;


    public static By userNameField = By.cssSelector("input[placeholder='Username']");
    public static By passwordField = By.id("password");
    public static By logInButton = By.xpath("//input[@type='submit']");

    public static By errorMessage = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
    public static By emptyPasswordInputFieldErrorMessage = By.xpath("//*[text()='Epic sadface: Password is required']");
    public static By emptyUsernameInputFieldErrorMessage = By.xpath("//*[text()='Epic sadface: Username is required']");

    public LogInPage(WebDriver driver){
        this.driver = driver;

    }


    public void enterUserNameText (String EnterUserName){

        driver.findElement(userNameField).sendKeys(EnterUserName);

    }

    public void enterPassword(String enterPassword){

        driver.findElement(passwordField).sendKeys(enterPassword);

    }

    public void clickONLogInButton(){

        driver.findElement(logInButton).click();
    }

    public String getErrorMessage(){

        return driver.findElement(errorMessage).getText();
    }

    public String getEmptyUsernameInputFieldErrorMessage(){

        return driver.findElement(emptyUsernameInputFieldErrorMessage).getText();
    }

    public String getEmptyPasswordInputFieldErrorMessage(){

        return driver.findElement(emptyPasswordInputFieldErrorMessage).getText();

    }

    public void logInWithValidData(){
        driver.findElement(userNameField).sendKeys("standard_user");
        driver.findElement(passwordField).sendKeys("secret_sauce");
        driver.findElement(logInButton).click();
    }












}
