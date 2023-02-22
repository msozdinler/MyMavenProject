package technostudyB7.EmptyFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import technostudyB7.Utilities.UtilityClass;

public class Test extends UtilityClass {
    public static void main(String[] args) {


        driver.get("https://demoqa.com/");
        driver.navigate().to("https://demoqa.com/text-box");

        WebElement fullNameElement = driver.findElement(By.id("userName"));
        fullNameElement.click();
        fullNameElement.sendKeys("Mert Sozdinler");

        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("mertsozdinler@hotmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Toronto");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Izmir");

        //<button id="submit" type="button" class="btn btn-primary">Submit</button>
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        quitDriver(3);
    }
}
