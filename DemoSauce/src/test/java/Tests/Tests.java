package Tests;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @Test
    public void loginTest() {
        loginPage.login();
    }

    @Test
    public void sort() {
        loginPage.login();
        productPage.sort();
    }

    @Test
    public void shoppingCart() throws InterruptedException {
        loginPage.login();
        Thread.sleep(5000);
        productPage.goToShoppingCartAndBack();
        Thread.sleep(5000);
    }

    @Test
    public void addToCart() throws InterruptedException {
        loginPage.login();
        productPage.addToCart();
        productPage.goToShoppingCart();
        Thread.sleep(10000);
        productPage.checkout();
    }

    @Test
    public void logout() throws InterruptedException {
        loginPage.login();
        Thread.sleep(10000);
        productPage.logingOut();
    }
}
