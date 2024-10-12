package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    public static WebDriver driver;
    public static By continueShoppingButton = By.id("continue-shopping");
    public static By checkoutButton = By.id("checkout");
    public static By removeBikelightItem = By.id("remove-sauce-labs-bike-light");
    public static By removeBoltTShirtItem = By.id("remove-sauce-labs-bolt-t-shirt");
    public static By removeOnesieItem = By.id("remove-sauce-labs-onesie");
    public static By removeTestAllThingsTShirtItem = By.id("remove-test.allthethings()-t-shirt-(red)");
    public static By removeFleeceJacketItem = By.cssSelector("button[name='remove-sauce-labs-fleece-jacket']");
    public static By removeBackpackItem = By.id("remove-sauce-labs-backpack");
    public static By priceForBackpackItem=By.xpath("//div[text()='29.99']");
    public static By priceForFleeceJacketItem=By.xpath("//div[text()='49.99']");
    public static By priceForBikeLightItem=By.xpath("//div[text()='9.99']");
    public static By priceForOnesieItem=By.xpath("//div[text()='7.99']");
    public static By priceForBoltTshirtItem=By.xpath("//div[text()='15.99']");
    public double priceForBikeLight = 9.99;
    public double priceForBoltTShirt = 15.99;
    public static By fleeceJacketItem = By.id("item_5_title_link");
    public static By backpackItem = By.id("item_4_title_link");
    public static By onesieItem = By.id("item_2_title_link");
    public static  By testAllTheThingsTShirtItem = By.id("item_3_title_link");
    public static By boltTShirtItem = By.id("item_1_title_link");
    public static By bikerLightItem = By.id("item_0_title_link");


    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean SauceLabsFleeceJacketItem() {
        return false;
    }

    public boolean SauceLabsBackpackItem() {
        return false;
    }


    public void clickCheckoutButton(){

        driver.findElement(checkoutButton).click();
    }
}
