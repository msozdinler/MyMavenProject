package technostudyB7.day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import technostudyB7.Utilities.UtilityClass;

public class getCssValue extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com");

        //<input autocomplete="off" name="keyword" type="text"
        // class="col-xs-20 searchformInput keyword"
        // id="inputValEnter" onkeypress="clickGo(event, this)"
        // placeholder="" value="" strtindx="" endindx="">

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.getAttribute("autocomplete"); // We reached autocomplete attribute
        System.out.println("getAttribute(autocomplete) "+searchInput.getAttribute("autocomplete"));

        searchInput.getAttribute("name"); // We reached name attribute
        System.out.println("getAttribute(name) "+searchInput.getAttribute("name"));

        searchInput.getAttribute("id"); // We reached id attribute
        System.out.println(searchInput.getAttribute("id"));

        searchInput.getCssValue("background"); // We got background value css value
        System.out.println(searchInput.getCssValue("background"));

        searchInput.getCssValue("font-family"); // We got font-family css value
        System.out.println(searchInput.getCssValue("font-family"));

        searchInput.getCssValue("color");
        System.out.println(searchInput.getCssValue("color"));




    }
}



