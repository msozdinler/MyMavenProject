package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;
import java.util.Set;


public class WindowSwitchExample extends UtilityClass {
    public static void main(String[] args) {
        /***
         * Go to "https://www.selenium.dev/"
         * Click on all the links that opens up on a new tab
         * print their titles and then close those tabs
         */

        driver.get("https://www.selenium.dev/");

        String mainTabId = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        // we opened all the links and then got the titles one by one
//        for (WebElement link : links) {
//            if (!link.getAttribute("href").contains("mailto")) {
//                link.click();
//            }
//        }
//
//        Set<String> idList = driver.getWindowHandles();
//
//        for (String id : idList) {
//            if (!id.equals(mainTabId)) {
//                driver.switchTo().window(id);
//                System.out.println(driver.getTitle());
//                driver.close();
//            }
//            Wait(2);
//        }
//
//        driver.switchTo().window(mainTabId);
//        System.out.println(driver.getTitle());

        // We opened the links and got the titles one by one
        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mailto")) {
                link.click();
                Set<String> idList = driver.getWindowHandles();

                for (String id : idList) {
                    if (!id.equals(mainTabId)) {
                        driver.switchTo().window(id);
                        System.out.println(driver.getTitle());
                        driver.close();
                        driver.switchTo().window(mainTabId);
                    }

                }
            }
        }

        //driver.close();
        driver.quit();
    }
}
