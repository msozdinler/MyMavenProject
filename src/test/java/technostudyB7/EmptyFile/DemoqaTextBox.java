package technostudyB7.EmptyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class DemoqaTextBox extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/");
        //driver.navigate().to();
        WebElement elements= driver.findElement(By.className("card-body"));
        elements.click();

        WebElement TextBox= driver.findElement(By.className("text"));
        TextBox.click();

        WebElement FullName = driver.findElement(By.id("userName"));
        FullName.click();
        FullName.sendKeys("Mert Sozdinler");

        WebElement Email = driver.findElement(By.id("userEmail"));
        Email.click();
        Email.sendKeys("mertsozdinler@hotmail.com");

        WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
        CurrentAddress.click();
        CurrentAddress.sendKeys("Toronto");

        WebElement PermanentAddress = driver.findElement(By.id("permanentAddress"));
        PermanentAddress.click();
        PermanentAddress.sendKeys("Izmir-Karsiyaka");

        WebElement SubmitButton = driver.findElement(By.id("submit"));
        SubmitButton.click();

        quitDriver(3);







    }
}
