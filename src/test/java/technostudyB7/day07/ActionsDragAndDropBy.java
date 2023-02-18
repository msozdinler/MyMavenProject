package technostudyB7.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsDragAndDropBy extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        // <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 78.6%;"></span>

        WebElement rightScrollBar = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        Actions actions = new Actions(driver);

        Thread.sleep(3000);
        Action scrollAction = actions.dragAndDropBy(rightScrollBar,100,0).build();
        scrollAction.perform();

        Thread.sleep(3000);
        Action scrollAction2 = actions.dragAndDropBy(rightScrollBar,-150,0).build();
        scrollAction2.perform();
    }
}
