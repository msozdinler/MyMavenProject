package technostudyB7.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;



public class ActionClick extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        // <button id="doubleClickBtn" type="button" class="btn btn-primary">Double Click Me</button>

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        Action doubleClickAction = actions.doubleClick(doubleClickButton).build();
        doubleClickAction.perform();
//
//        //<button id="rightClickBtn" type="button" class="btn btn-primary">Right Click Me</button>
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Action rightClickAction = actions.contextClick(rightClickButton).build(); // right click
        rightClickAction.perform();
//
//
//        //<button id="d6mce" type="button" class="btn btn-primary">Click Me</button>
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickAction = actions.click(clickButton).build();
        clickAction.perform();

        // 2nd way of using these Actions

        // DoubleClick
        Action doubleClickAction2 = actions.moveToElement(doubleClickButton).doubleClick().build();
        doubleClickAction2.perform();

        // right click

        Action rightClickAction2 = actions.moveToElement(rightClickButton).contextClick().build();
        rightClickAction2.perform();

        // click

        Action clickAction2 = actions.moveToElement(clickButton).click().build();
        clickAction2.perform();


    }
}
