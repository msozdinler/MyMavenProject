package technostudyB7.EmptyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class RadioButton extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/");

        WebElement elements = driver.findElement(By.className("card-body"));
        elements.click();

        WebElement clickRadioButton = driver.findElement(By.id("item-2"));
        clickRadioButton.click();

        WebElement clickAnswerButton = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        clickAnswerButton.click();

       // WebElement clickAnswerButton = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        //clickAnswerButton.click();

        driver.quit();



    }
}
