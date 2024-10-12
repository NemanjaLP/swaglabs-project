import Pages.CartPage;
import Pages.LogInPage;
import Pages.ProductListPage;
import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class AddingProductsToShopCartTests extends BaseTest{
    ProductListPage productListPage = new ProductListPage(driver);
    LogInPage loginPage = new LogInPage(driver);
    CartPage cartPage = new CartPage(driver);


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        loginPage.logInWithValidData();
    }

    @Test
    @Description("Testing if the items has been successfully added to the shopping cart")
    public void addingProductsToShopCart() {

        productListPage.addFleeceJacketItemToShopCart();
        productListPage.addBackpackItemtoShopCart();
        productListPage.goToShopCart();
        String expectedUrl = "https://www.saucedemo.com/cart.html";
        String actualUrl = driver.getCurrentUrl();
        assertTrue("Current url is not the right one",actualUrl.equals(expectedUrl));
        boolean itemOne = driver.findElement(By.id("item_5_title_link")).isDisplayed();
        boolean expectedItemOne = true;
        boolean itemTwo = driver.findElement(By.id("item_4_title_link")).isDisplayed();
        boolean expectedItemTwo = true;
        assertTrue("Item one has not been added to a shopping cart",itemOne == expectedItemOne);
        assertTrue("Item two has not been added to a shopping cart",itemTwo == expectedItemTwo);
    }


}
