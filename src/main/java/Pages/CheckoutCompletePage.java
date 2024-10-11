package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    public static WebDriver driver;
    public static By messageForSuccessfulPurchase = By.xpath("//h2[text()='Thank you for your order!']");
    public static By goBackHomeButton = By.id("back-to-products");


    public CheckoutCompletePage(WebDriver driver){

        this.driver = driver;
    }


















}
