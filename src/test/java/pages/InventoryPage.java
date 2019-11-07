package pages;

import Data.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage {
    private WebDriver driver;
    private static String url = "";

    public static InventoryPage visit(WebDriver driver) {
        driver.get(url);
        return new InventoryPage(driver);
    }

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

}
