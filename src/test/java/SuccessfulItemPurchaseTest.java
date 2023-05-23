import Pages.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SuccessfulItemPurchaseTest extends BaseTest{



    LogInPage logInPage = new LogInPage(driver);
    CartPage cartPage = new CartPage(driver);
    ProductListPage productListPage = new ProductListPage(driver);
    InformationPage informationPage = new InformationPage(driver);
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        logInPage.logInWithValidData();

    }


    @Test
    public void successesfullPurchase() {
        productListPage.addBoltTShirtToShopCart();
        productListPage.addBikelightItemToShopCart();
        productListPage.goToShopCart();
        cartPage.clickCheckoutButton();
        informationPage.fillInformationFieldsWithValidData();
        informationPage.clickOnContinueButton();
        checkoutOverviewPage.clickOnFinishButton();
        driver.findElement(checkoutCompletePage.messageForSuccessfulPurchase).getText();
        String expectedMessage = "Thank you for your order!";
        String actualMessage = driver.findElement(checkoutCompletePage.messageForSuccessfulPurchase).getText();
        assertTrue("Message is incorect",actualMessage.equals(expectedMessage));



    }
}
