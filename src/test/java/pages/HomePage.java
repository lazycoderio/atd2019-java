package pages;

import Data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By submit = By.className("btn_action");

    public HomePage visit() {
        goTo("https://www.saucedemo.com/");
        return new HomePage(driver);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void signIn(User user) {
        type(user.getUsername(), username);
        type(user.getPassword(), password);
        click(submit);
    }


    // These are here for previous exercises
    public WebElement getUsername() {
        return driver.findElement(username);
    }
    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getSubmit() {
        return driver.findElement(By.className("btn_action"));
    }

}
