package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement username;
    public WebElement password;
    public WebElement logInButton;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement((By.id("password")));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.id("login-button"));
    }

    public void login() {
        getUsername().sendKeys("standard_user");
        getPassword().sendKeys("secret_sauce");
        getLogInButton().click();
    }
}
