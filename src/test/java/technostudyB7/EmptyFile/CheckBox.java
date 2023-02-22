package technostudyB7.EmptyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class CheckBox extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/");

        WebElement Elements = driver.findElement(By.className("card-body"));
        Elements.click();

        WebElement CheckBox = driver.findElement(By.id("item-1"));
        CheckBox.click();

        //<button aria-label="Expand all" title="Expand all" type="button"
        // class="rct-option rct-option-expand-all">
        // <svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 24 24"
        // class="rct-icon rct-icon-expand-all" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-2 10h-4v4h-2v-4H7v-2h4V7h2v4h4v2z"></path></svg></button>

        WebElement ClickPlus = driver.findElement(By.cssSelector("button.rct-option-expand-all"));
        ClickPlus.click();

        WebElement ClickAngular = driver.findElement(By.cssSelector("label[for='tree-node-angular']"));
        ClickAngular.click();

        WebElement ClickGeneral = driver.findElement(By.cssSelector("label[for='tree-node-general']"));
        ClickGeneral.click();

        WebElement ClickWordFile = driver.findElement(By.cssSelector("label[for='tree-node-wordFile']"));
        ClickWordFile.click();

        WebElement ClickMinus = driver.findElement(By.cssSelector("button.rct-option-collapse-all"));
        ClickMinus.click();

        driver.quit();


    }
}
