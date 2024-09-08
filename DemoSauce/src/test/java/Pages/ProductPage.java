package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement sorting;
    public WebElement az;
    public WebElement za;
    public WebElement lohi;
    public WebElement hilo;
    public WebElement hamburgerMenu;
    public WebElement logout;
    public WebElement shoppingCart;
    public WebElement continueShoppingButton;
    public WebElement addToCart;
    public WebElement checkoutButton;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement postalCode;
    public WebElement continueButton;
    public WebElement finishButton;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getSorting() {
        return driver.findElement(By.className("product_sort_container"));
    }

    public WebElement getAz() {
        WebElement selectElement = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("az");
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        return selectedOption;
    }

    public WebElement getZa() {
        WebElement selectElement = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("za");
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        return selectedOption;
    }

    public WebElement getLohi() {
        WebElement selectElement = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("lohi");
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        return selectedOption;
    }

    public WebElement getHilo() {
        WebElement selectElement = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByValue("hilo");
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        return selectedOption;
    }

    public WebElement getHamburgerMenu() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button"));
    }

    public WebElement getLogout() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    public WebElement getShoppingCart() {
        return driver.findElement(By.cssSelector(".svg-inline--fa.fa-shopping-cart.fa-w-18.fa-3x"));
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[1]"));
    }

    public WebElement getAddToCart() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button"));
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.cssSelector(".btn_action.checkout_button"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.cssSelector(".btn_primary.cart_button"));
    }

    public WebElement getFinishButton() {
        return driver.findElement(By.cssSelector(".btn_action.cart_button"));
    }


    public void sort(){
        getSorting().click();
        getAz().click();
        getZa().click();
        getLohi().click();
        getHilo().click();
    }

    public void logingOut() throws InterruptedException {
        getHamburgerMenu().click();
        Thread.sleep(5000);
        getLogout().click();
    }

    public void goToShoppingCartAndBack() throws InterruptedException {
        Thread.sleep(5000);
        getShoppingCart().click();
        Thread.sleep(4000);
        getContinueShoppingButton().click();
    }

    public void goToShoppingCart() {
        getShoppingCart().click();
    }

    public void addToCart() {
        getAddToCart().click();
    }

    public void checkout() throws InterruptedException {
        getCheckoutButton().click();
        getFirstName().sendKeys("Mima");
        getLastName().sendKeys("Cimburovic");
        getPostalCode().sendKeys("11000");
        getContinueButton().click();
        Thread.sleep(10000);
        getFinishButton().click();
    }
}
