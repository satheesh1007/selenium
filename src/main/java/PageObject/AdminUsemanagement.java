package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static java.lang.String.format;

public class AdminUsemanagement {

    WebDriver driver;

    private static final String  dropdown ="//div[@role='option'][normalize-space()='%s']";

    @FindBy(xpath = "//span[normalize-space()='Admin']") WebElement admin;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement username;

    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]/" +
            "/div[1]//div[1]//div[1]") WebElement userrole;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']") WebElement emp_name;

    @FindBy(xpath=("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]") ) WebElement status;

    @FindBy(xpath = "//button[normalize-space()='Search']") WebElement search;

    @FindBy(xpath = "//button[normalize-space()='Reset']") WebElement reset;


    public  AdminUsemanagement (WebDriver d){

        driver=d;
        PageFactory.initElements(d,this);
    }

    public void click_admin(){
        admin.click();

    }

    public void enteruser_name (String us_name){
        username.sendKeys(us_name);
    }

    public void select_user_role(String userro){

        userrole.click();

        driver.findElement(By.xpath(format(dropdown,userro))).click();

    }

    public void  enter_emp_name (String emplo_name){

        emp_name.sendKeys(emplo_name);
    }

    public void  select_status (String set_sta){

        status.click();

        driver.findElement(By.xpath(format(dropdown,set_sta))).click();
    }
    public void click_search (){
        search.click();

    }
    public void click_reset (){

        reset.click();
    }


    }


