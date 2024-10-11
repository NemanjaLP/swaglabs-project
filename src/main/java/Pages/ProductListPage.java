package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

    public static WebDriver driver;

    public By backpackItem=By.xpath("//div[text()='Sauce Labs Backpack']");
    public By bikeLightItem=By.xpath("//div[text()='Sauce Labs Bike Light']");
    public By boltTshirtItem=By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    public By fleeceJacketItem=By.xpath("//div[text()='Sauce Labs Fleece Jacket']");
    public By onesieItem=By.xpath("//div[text()='Sauce Labs Onesie']");
    public By testAllThingsItem=By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");
    public static By addFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public static By addBackpack = By.name("add-to-cart-sauce-labs-backpack");
    public static By addBoltTShirt = By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static By addBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    public static By addTestAllTheThingsTShirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    public static By addOnesie = By.id("add-to-cart-sauce-labs-onesie");
    public static By cartIcon = By.id("shopping_cart_container");
    public static By TwitterIcon = By.cssSelector("a[href='https://twitter.com/saucelabs']");
    public static By FacebookIcon = By.cssSelector("a[href='https://www.facebook.com/saucelabs']");
    public static By LinkedinIcon = By.cssSelector("a[href='https://www.linkedin.com/company/sauce-labs/']");


    public ProductListPage(WebDriver driver) {

        this.driver = driver;
    }

    public void addFleeceJacketItemToShopCart(){
        driver.findElement(addFleeceJacket).click();
    }

    public void addBackpackItemtoShopCart(){
        driver.findElement(addBackpack).click();
    }

    public void addBoltTShirtToShopCart(){
        driver.findElement(addBoltTShirt).click();
    }

    public void addOnesieItemToShopCart(){
        driver.findElement(addOnesie).click();
    }

    public void addBikelightItemToShopCart(){
        driver.findElement(addBikeLight).click();
    }

    public void addTestAllTheThingsTShirtItemToShopCart(){
        driver.findElement(addTestAllTheThingsTShirt).click();
    }


    public void goToShopCart (){
        driver.findElement(cartIcon).click();

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnTwitterIcon (){
        driver.findElement(TwitterIcon).click();
    }

    public void clickOnFacebookIcon(){
        driver.findElement(FacebookIcon).click();
    }

    public void clickOnLinkedinIcon(){
        driver.findElement(LinkedinIcon).click();
    }
















    }