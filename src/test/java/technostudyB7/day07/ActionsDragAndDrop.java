package technostudyB7.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsDragAndDrop extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //<div class="dragableBox" id="box3" dragableelement="2"
        // style="visibility: visible;">Washington</div>
        WebElement washington = driver.findElement(By.id("box3"));

        System.out.println(washington.getCssValue("background-color"));// checked the initial background color

        WebElement unitedStates = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);

        Action dragAndDropWashington = actions.dragAndDrop(washington,unitedStates).build();
        dragAndDropWashington.perform();

        System.out.println(washington.getCssValue("background-color")); // checked the last background color


        //<div class="dragableBox" id="box4" dragableelement="3"
        // style="visibility: visible;">Copenhagen</div>

        WebElement copenhagen = driver.findElement(By.id("box4"));

        //<div id="box104" class="dragableBoxRight">Denmark</div>
        WebElement denmark = driver.findElement(By.id("box104"));

        Action dragAndDropCopenhagen = actions.dragAndDrop(copenhagen,denmark).build();
        dragAndDropCopenhagen.perform();
    }
}