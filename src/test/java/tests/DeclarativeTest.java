package tests;

import Data.User;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeclarativeTest extends BaseTest{
    @Test
    public void declarativeTest() {
        HomePage homePage = new HomePage(driver).visit();
        User user = User.valid();

        homePage.signIn(user);

        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.onPage());
    }
}
