package technostudyB7.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static technostudyB7.Utilities.UtilityClass.driver;

public class openRMS_Project extends UtilityClass {


    /**
     done * 1- Go to "https://demo.openmrs.org/openmrs/login.htm".
     done * 2- Try to log in with username="Admin" and password="Admin123"
     *         without choosing a location and verify that the error
     *         message is "You must choose a location!".
     done * 3- Enter the same username and password.
     done * 4- Hover over the location names one by one and check if
     *         the background color changes.
     done * 5- Choose one of the locations randomly and click on
     *         "Log In" button.
     done * 6- Click on the location icon
     done * 7- Click on every location one by one and check if it is
     *         among the locations on the login page and current location changes.
     * done 8- Verify that admin button is displayed
     * done 9- Hover over "Admin" button and verify that "My Account"
     *         button is displayed.
     * done 10- Click on "My Account" button and verify that the title of
     *         the page is "My Account".
     done * 11- Click on "My Languages" button.
     done * 12- Verify that the title of the page is "My Languages"
     done * 13- Select a random language from the drop down menu.
     * 14- Check and uncheck the boxes one by one. Verify
     *     that the box is checked and unchecked each time.
     * 15- Check all of the boxes and verify that they are all checked
     * 16- Click on The "Save" button and verify error message is
     *     displayed.
     *
     */


    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        WebElement loginErrorMessage = driver.findElement(By.id("sessionLocationError"));
        String actLoginErrorMessage = loginErrorMessage.getText();
        String expLoginErrorMessage = "You must choose a location!";
        if (actLoginErrorMessage.equals(expLoginErrorMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        List<WebElement> locationNames = driver.findElements(By.cssSelector("[id='sessionLocation']>li"));
        Actions actions = new Actions(driver);
        Action hoverOverLocationNames;

        for (int i = 0; i < locationNames.size(); i++) {
            String beforeHover = locationNames.get(i).getCssValue("background-color");
            System.out.println("Before case: " + beforeHover);

            hoverOverLocationNames = actions.moveToElement(locationNames.get(i)).build();
            hoverOverLocationNames.perform();

            wait.until(ExpectedConditions.visibilityOf(locationNames.get(i)));
            String afterHover = locationNames.get(i).getCssValue("background-color");
            System.out.println("After case: " + beforeHover);

            if (!(beforeHover.equals(afterHover))){
                System.out.println("The background color has changed");
            }
        }

        int randomIndex = (int)(Math.random() * locationNames.size());
        locationNames.get(randomIndex).click();
        loginButton.click();

        List<WebElement> locationNamesNewPage = driver.findElements(By.cssSelector("[class='select']>li"));

        WebElement locationButton;

        for (int i = 0; i < locationNamesNewPage.size(); i++) {

            locationButton= driver.findElement(By.id("selected-location"));
            locationButton.click();

            String actNewLocationButton = locationNamesNewPage.get(i).getText();
            locationNamesNewPage.get(i).click();

            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            locationButton= driver.findElement(By.id("selected-location"));
            locationButton.click();
            String expLocationText = locationButton.getText();

            System.out.println("Actual: " + actNewLocationButton);
            System.out.println("Expected: " + expLocationText);
            System.out.println();

            locationNamesNewPage.get(i).click();
        }

//        locating the admin button

        WebElement adminButton = driver.findElement(By.xpath("//li[@class='nav-item identifier']"));
//        WebElement adminButton = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]"));
        Action hoverOverAdminButton = actions.moveToElement(adminButton).build();
        hoverOverAdminButton.perform();
        System.out.println("Admin button is displayed: " + adminButton.isDisplayed());

//        <a id="" href="/openmrs/adminui/myaccount/myAccount.page">
//                                    My Account
//                                </a>

        WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\"user-account-menu\"]/li/a"));
        System.out.println("My Account button is displayed: " + myAccountButton.isDisplayed());
        myAccountButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "My Account";

        if (expectedTitle.equals(actualTitle)){
            System.out.println("The verification is done for My Account Page: PASS");
        }else{
            System.out.println("The verification is not done for My Account Page: FAIL");
        }

        System.out.println();

//        locating the my languages button
        WebElement myLanguagesButton = driver.findElement(By.cssSelector("i[class='icon-cog']"));
        myLanguagesButton.click();

        String actualTitleMyLanguagesPage = driver.getTitle();
        String expectedTitleMyLanguagesPage = "My Languages";

        if (expectedTitleMyLanguagesPage.equals(actualTitleMyLanguagesPage)){
            System.out.println("The verification is done for My Languages Page: PASS");
        }else{
            System.out.println("The verification is not done My Languages Page: FAIL");
        }

        System.out.println();

//        locating the language drop down menu
//        <select id="default-locale-field" name="defaultLocale" title="The User Interface will be displayed in selected language">
//
//            <option value="">&nbsp;</option>
//
//
//            <option value="en_GB">English (United Kingdom)</option>
//
//            <option value="es">Spanish</option>
//
//            <option value="fr">French</option>
//
//            <option value="it">Italian</option>
//
//            <option value="pt_BR">Portuguese (Brazil)</option>
//
//    </select>

//        we need to find a way to get the size of the list automatically

//        [id="default-locale-field"]>option+option
//        List<WebElement> dropdownLangauges = driver.findElements(By.cssSelector("[id=\"default-locale-field\"]>option+option"));
        WebElement languageDropdown = driver.findElement(By.xpath("//*[@id=\"default-locale-field\"]"));

        Random rand2 = new Random();
        int languageRandomInteger = rand2.nextInt(5)+1;
        Select languageDropdownMenu = new Select(languageDropdown);

        languageDropdownMenu.selectByIndex(languageRandomInteger);

//        checking and unchecking the checkboxes one by one
//        locating the checkboxes
//        <input type="checkbox" name="proficientLocales" value="en">

//        (//input[@type='checkbox'])[6]
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@id=\"content\"]/div/form/div[1]/input\n"));
        System.out.println(checkBoxes.get(2).getText());

        for (int i = 0; i < 5; i++) {

        }


    }

}
