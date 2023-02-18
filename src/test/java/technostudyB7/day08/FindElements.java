package technostudyB7.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import javax.lang.model.element.Element;
import java.util.List;

public class FindElements extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        List<WebElement> videoTitles = driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.get(10).getText());

    }
}
