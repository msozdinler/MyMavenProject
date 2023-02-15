package technostudyB7.Mentoring;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuruTry {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();

        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        wait.until(ExpectedConditions.urlContains("register"));

        WebElement titleDrop = driver.findElement(By.id("user_title"));

        Select selectTitle =  new Select(titleDrop);

        selectTitle.selectByVisibleText("Captain");

        WebElement surname = driver.findElement(By.id("user_surname"));
        surname.sendKeys("Tribianni");

        WebElement phoneInput = driver.findElement(By.id("user_phone"));
        phoneInput.sendKeys("1234567890");

        WebElement yearDropdown = driver.findElement(By.id("user_dateofbirth_1i"));
        Select selectYear = new Select(yearDropdown);

        selectYear.selectByVisibleText("1980");

        WebElement monthDropdown = driver.findElement(By.id("user_dateofbirth_2i"));
        Select selectMonth = new Select(monthDropdown);

        selectMonth.selectByVisibleText("February");

        WebElement dateDropdown = driver.findElement(By.id("user_dateofbirth_3i"));
        Select selectDate = new Select(dateDropdown);

        selectDate.selectByVisibleText("15");

        driver.quit();


    }
}
