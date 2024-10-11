package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutOverviewPage {
    public static WebDriver driver;
    public static By finishPurchaseButton = By.id("finish");
    public static  By cancelButton = By.id("cancel");
    public static By taxPriceSampleForTest = By.xpath("//div[text()='2,08']");
    public double taxPriceSample = 2.08;


    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnFinishButton(){

        driver.findElement(finishPurchaseButton).click();
    }




















}
