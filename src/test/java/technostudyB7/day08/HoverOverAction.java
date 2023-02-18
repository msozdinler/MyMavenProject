package technostudyB7.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.time.Duration;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");

       //<span id="catnav-primary-link-10855" class="wt-text-black" role="menuitem" aria-haspopup="true" tabindex="0">
        //
        //                               Jewellery &amp; Accessories
        //
        //                       </span>

        WebElement jewelery = driver.findElement(By.id("catnav-primary-link-10855"));

        Actions actions = new Actions(driver);

        Action hoverOverJeweleryAction = actions.moveToElement(jewelery).build();
        hoverOverJeweleryAction.perform();


        WebDriverWait wait = new WebDriverWait(driver,3);
        WebElement earrings = driver.findElement(By.id("side-nav-category-link-10896"));
        wait.until(ExpectedConditions.visibilityOf(earrings));

        Action hoverOverEarningsAction = actions.moveToElement(earrings).build();
        hoverOverEarningsAction.perform();

       WebElement clipOnEarring = driver.findElement(By.id("catnav-l3-10904"));
       clipOnEarring.click();

       String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl.contains("clip-on-earrings"));

        quitDriver(4);

    }
}
