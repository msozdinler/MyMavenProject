package technostudyB7.EmptyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import javax.swing.text.Utilities;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class FacebookKeySend extends UtilityClass {
    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.facebook.com/");

          //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/" id="u_0_0_Mw" data-testid="open-registration-form-button" rel="async">Create new account</a>

        WebElement CreateNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        CreateNewAccount.click();

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");

        WebElement number = driver.findElement(By.name("reg_email__"));
        number.sendKeys("6675124856");

        WebElement NewPassword = driver.findElement(By.name("reg_passwd__"));
        NewPassword.sendKeys("12345678ABC");

        WebElement month = driver.findElement(By.id("month"));
        Select dropDown1=new Select(month);
        dropDown1.selectByIndex(7);

        WebElement day = driver.findElement(By.id("day"));
        Select dropDown2= new Select(day);
        dropDown2.selectByIndex(0);

        WebElement year = driver.findElement(By.id("year"));
        Select dropDown3= new Select(year);
        dropDown3.selectByValue("1995");

        //WebDriverWait wait = new WebDriverWait(driver,10);



       WebElement maleOptionRadioButton = driver.findElement(By.cssSelector("input[value='-1']"));
        maleOptionRadioButton.click();

        WebElement pronoun= driver.findElement(By.name("preferred_pronoun"));
        Select dropDown=new Select(pronoun);
        dropDown.selectByValue("2");

        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();

    }
}
