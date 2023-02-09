package technostudyB7.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.seleniumeasy.com");
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement messageBox = driver.findElement(By.id("user-message"));
        messageBox.sendKeys("Hello Selenium");

        WebElement showButton = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        showButton.click();

       WebElement result = driver.findElement(By.id("display"));
        System.out.println(result.getText());

        String expResult = "mert";
        String actResult = result.getText();

        if (expResult.equals(actResult)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println(actResult);
        }



    }
}
