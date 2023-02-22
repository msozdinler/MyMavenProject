package technostudyB7.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.UtilityClass;

public class IFrame3 extends UtilityClass {
    public static void main(String[] args) {
        /**
         * Type your name in the input box
         * click the check box
         * print "Not a Friendly Topic"
         * choose the 3rd element from the dropdown menu
         * print "Not a Friendly Topic"
         * */

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // We are in the first frame
        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Snow");

        driver.switchTo().frame(0); // We are in the inner frame
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        //driver.switchTo().defaultContent();

//        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
//        System.out.println(header.getText());

        driver.switchTo().defaultContent().switchTo().frame(1);// We can combine 2 switches

        WebElement animals = driver.findElement(By.id("animals"));
        Select select = new Select(animals);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();
    }
}
