package technostudyB7.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class IFrame2 extends UtilityClass {
    public static void main(String[] args) {
        /**
         * Type your name in the input box
         * click the check box
         * print "Not a Friendly Topic"
         * */

        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0); // We are in the first frame
        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Snow");

        driver.switchTo().frame(0); // We are in the inner frame
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());
    }
}
