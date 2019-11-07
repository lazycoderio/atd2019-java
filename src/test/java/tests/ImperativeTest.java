package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperativeTest extends BaseTest{


    @Test
    public void imperativeTest() {
        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        HomePage homePage = new HomePage(driver);
        homePage.getUsername().sendKeys(username);
        homePage.getPassword().sendKeys(password);
        homePage.getSubmit().click();

        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }


}
