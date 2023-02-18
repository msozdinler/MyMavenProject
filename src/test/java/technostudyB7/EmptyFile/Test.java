package technostudyB7.EmptyFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //driver.navigate().to("https://www.facebook.com/");
        WebElement Create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        Create.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Selim");

    }
}
