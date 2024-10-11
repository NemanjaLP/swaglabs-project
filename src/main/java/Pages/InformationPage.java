package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {

    public static WebDriver driver;
    public static By firstNameInputField = By.id("first-name");
    public static By lastNameInputField = By.id("last-name");
    public static By zipCodeInputField = By.id("postal-code");
    public static By continueButton = By.id("continue");
    public static  By hamburgerMenuButton = By.id("react-burger-menu-btn");
    public static  By allItemsSidebarLink = By.id("inventory_sidebar_link");
    public static By aboutSidebarLink = By.id("about_sidebar_link");
    public static By logOutSidebarLink = By.id("logout_sidebar_link");
    public static By resetAppStateLink = By.id("reset_sidebar_link");


    public InformationPage(WebDriver driver){
        this.driver = driver;
    }


    public void fillInformationFieldsWithValidData(){
        driver.findElement(firstNameInputField).sendKeys("Nemanja");
        driver.findElement(lastNameInputField).sendKeys("Lakic Pesic");
        driver.findElement(zipCodeInputField).sendKeys("11080");
    }

    public void clickOnContinueButton(){

        driver.findElement(continueButton).click();
    }



}
