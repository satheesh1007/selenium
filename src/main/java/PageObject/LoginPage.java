package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private static final By USERNAME = By.xpath("//input[@placeholder='Username']");
    private static final By PASSWORD = By.xpath("(//input[@placeholder='Password'])[1]");
    private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");


    public LoginPage(WebDriver rdriver) {
        driver = rdriver;
    }


    public void fillUsername(String usernames) {

        driver.findElement(USERNAME).clear();
        driver.findElement(USERNAME).sendKeys(usernames);
    }

    public void fillPassword(String passwords) {
        driver.findElement(PASSWORD).clear();
        driver.findElement(PASSWORD).sendKeys(passwords);
    }

    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}