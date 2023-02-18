package technostudyB7.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static technostudyB7.Utilities.UtilityClass.driver;

public class FindElementExample {
    public static void main(String[] args) {
        /**1- Go to https://www.saucedemo.com/
         2- login with valid credentials
         3- Click on Sauce Labs Backpack and add to the cart
         4- Click on Back To Products
         5- Click on Sauce Labs Bolt T-Shirt and add to the cart
         6- Click on the cart
         7- Click on the Check Out button
         8- Fill the form and click on Continue
         9- Check if you see your products*/

        driver.get("https://www.saucedemo.com/");

        // 2. Login with valid credentials
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        // 3. Add Sauce Labs Backpack to cart
        WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpack.click();

        // 4. Go back to products page
        WebElement backToProducts = driver.findElement(By.cssSelector(".header_secondary_container > div > button"));
        backToProducts.click();

        // 5. Add Sauce Labs Bolt T-Shirt to cart
        WebElement tShirt = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        tShirt.click();

        // 6. Go to cart
        WebElement cart = driver.findElement(By.cssSelector(".shopping_cart_link"));
        cart.click();

        // 7. Click on checkout button
        WebElement checkout = driver.findElement(By.cssSelector(".cart_footer > .checkout_button"));
        checkout.click();

        // 8. Fill the checkout form and click on continue
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        WebElement continueButton = driver.findElement(By.cssSelector(".checkout_buttons > .btn_primary"));

        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        zipCode.sendKeys("12345");
        continueButton.click();

        // 9. Verify that the products are listed on the checkout page
        WebElement product1 = driver.findElement(By.cssSelector(".cart_item:nth-child(1) > .cart_item_label > .item_name"));
        WebElement product2 = driver.findElement(By.cssSelector(".cart_item:nth-child(2) > .cart_item_label > .item_name"));

        String productName1 = product1.getText();
        String productName2 = product2.getText();

        if (productName1.equals("Sauce Labs Backpack") && productName2.equals("Sauce Labs Bolt T-Shirt")) {
            System.out.println("Products are listed on the checkout page");
        } else {
            System.out.println("Products are not listed on the checkout page");
        }

        // Close the browser
        driver.quit();
    }
}

