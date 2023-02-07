package technostudyB7.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/");

        System.out.println("Title of seleniumeasy page = " + driver.getTitle());
        String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualyTitle = driver.getTitle();

        if (expectedTitle.equals(actualyTitle)) {
            System.out.println("verification is clear : PASS");
            System.out.println(actualyTitle);
        } else {
            System.out.println("verification is failed : FAIL");
            System.out.println(actualyTitle);
        }
        Thread.sleep(3000);
        String teslaURL = "https://www.tesla.com/";
        driver.navigate().to(teslaURL);
        driver.manage().window().maximize();
        driver.close(); // close only one page
        driver.quit(); // close all the page
    }
}
