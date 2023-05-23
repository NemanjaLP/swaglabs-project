import Pages.CartPage;
import Pages.LogInPage;
import Pages.ProductListPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveProductsFromCartTest extends BaseTest {

    CartPage cartPage = new CartPage(driver);
    ProductListPage productListPage = new ProductListPage(driver);

    LogInPage logInPage = new LogInPage(driver);


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        logInPage.logInWithValidData();
        productListPage.addBackpackItemtoShopCart();
        productListPage.addFleeceJacketItemToShopCart();
        productListPage.goToShopCart();
    }


    @Test
    public void removeItems() {
        boolean ItemOne = cartPage.SauceLabsFleeceJacketItem();
        boolean expectedItemOne = false;
        boolean ItemTwo = cartPage.SauceLabsBackpackItem();
        boolean expectedItemTwo = false;
        driver.findElement(cartPage.removeFleeceJacketItem).click();
        driver.findElement(cartPage.removeBackpackItem).click();
        assertTrue("Product is still there", ItemOne == expectedItemOne);
        assertFalse("Product is still there", ItemTwo != expectedItemTwo);


    }





}