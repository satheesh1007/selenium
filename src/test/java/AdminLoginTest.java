import PageObject.AdminUsemanagement;
import PageObject.DashboardPage;
import PageObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AdminLoginTest {
//   private static final By USERNAME = By.xpath("//input[@name='username']");
//   private static final By PASSWORD = By.xpath("//input[@name='password']");
//  private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillUsername("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();

        AdminUsemanagement admindetial =new AdminUsemanagement(driver);

        admindetial.click_admin();

        admindetial.enteruser_name("satheesh");

        admindetial.select_user_role("ESS");

        admindetial.enter_emp_name("SATHEESH KUMAR");

        admindetial.select_status("Enabled");

        admindetial.click_search();

        admindetial.click_reset();
    }



}