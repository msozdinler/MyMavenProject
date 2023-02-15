package technostudyB7.day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to saucedemo.com
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Log in with valid credentials
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // Add Sauce Labs Backpack to cart
        WebElement backpackButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpackButton.click();

        // Go back to products page
        WebElement backToProductsButton = driver.findElement(By.cssSelector("header_secondary_container"));
        backToProductsButton.click();

        // Add Sauce Labs Bolt T-Shirt to cart
        WebElement boltTshirtButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        boltTshirtButton.click();

        // Go to cart
        WebElement cartButton = driver.findElement(By.cssSelector("shopping_cart_link"));
        cartButton.click();

        // Proceed to checkout
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        // Fill out the checkout form
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        WebElement zipField = driver.findElement(By.id("postal-code"));
        WebElement continueButton = driver.findElement(By.id("continue"));

        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Doe");
        zipField.sendKeys("12345");
        continueButton.click();

        // Check if products are displayed on the checkout overview page
        WebElement backpackItem = driver.findElement(By.cssSelector(".cart_item:nth-of-type(1) .inventory_item_name"));
        WebElement tshirtItem = driver.findElement(By.cssSelector(".cart_item:nth-of-type(2) .inventory_item_name"));

        if (backpackItem.getText().equals("Sauce Labs Backpack") && tshirtItem.getText().equals("Sauce Labs Bolt T-Shirt")) {
            System.out.println("Products added to cart successfully!");
        } else {
            System.out.println("Error: Products not displayed on checkout overview page");
        }

        // Close the browser
        driver.quit();
    }
}

