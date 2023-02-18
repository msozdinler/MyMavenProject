package technostudyB7.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ArrowKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        /**
         * Move to element
         * click on the element
         * type b
         * press down arrow key
         * press Enter key
         * */

        //<div class=" css-2b097c-container" id="autoCompleteMultipleContainer">
        // <div class="auto-complete__control css-yk16xz-control">
        // <div class="auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3"><div class="auto-complete__placeholder css-1wa3eu0-placeholder"></div><div class="css-1g6gooi">
        // <div class="auto-complete__input" style="display: inline-block;"><input autocapitalize="none" autocomplete="off" autocorrect="off" id="autoCompleteMultipleInput" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></div></div><div class="auto-complete__indicators css-1wy0on6"><span class="auto-complete__indicator-separator css-1okebmr-indicatorSeparator">
        // </span></div></div></div>

        WebElement input = driver.findElement(By.id("autoCompleteMultipleContainer"));
        Actions actions = new Actions(driver);

        Action typeBAction = actions.moveToElement(input).click().sendKeys("b").build();
        typeBAction.perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Action arrowKeyAction = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        arrowKeyAction.perform();


        quitDriver(4);

    }
}
