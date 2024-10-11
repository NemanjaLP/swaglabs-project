import Pages.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckingTotalPriceTest extends BaseTest{

    LogInPage logInPage = new LogInPage(driver);
    CartPage cartPage = new CartPage(driver);
    ProductListPage productListPage = new ProductListPage(driver);
    InformationPage informationPage = new InformationPage(driver);
    CartPage cartPagee = new CartPage(driver);
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        logInPage.logInWithValidData();
    }

    @Test
    public void TotalPriceCheck() {
        productListPage.addBoltTShirtToShopCart();
        productListPage.addBikelightItemToShopCart();
        productListPage.goToShopCart();
        cartPagee.clickCheckoutButton();
        informationPage.fillInformationFieldsWithValidData();
        informationPage.clickOnContinueButton();
        double firstItemPrice= (double) cartPage.priceForBoltTShirt;
        double secondItemPrice= (double) cartPage.priceForBikeLight;
        double taxPrice= (double) checkoutOverviewPage.taxPriceSample;
        double totalPrice=firstItemPrice+secondItemPrice+taxPrice;
        assertEquals(28.06,totalPrice,0.1);
    }
}
