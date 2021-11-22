package pages;

import base.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class LoginPage {
    WebDriver driver;

    public LoginPage(){
        //driver = PageDriver.getDriver();
        driver = PageDriver.getCurrentDriver();

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    @CacheLookup
    public WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    public WebElement signIn;

    /*@FindBy(how = How.ID, using = "name")
    public List<WebElement> items_name;

    @FindBys( //and operator
            {
                    @FindBy(id="x"),
                    @FindBy(css="y")
            }
    )
    public List<WebElement> items;

    @FindAll( //or operator
            {
                    @FindBy(id="x"),
                    @FindBy(css="y")
            }
    )
    public List<WebElement> itemsList;*/

    public void login(String username, String Password){
        /*userName =  driver.findElement(By.id("user-name"));
        password =  driver.findElement(By.id("password"));
        signIn =  driver.findElement(By.id("login-button"));*/
        userName.sendKeys(username);
        password.sendKeys(Password);
        signIn.click();
    }

    public WebElement getElementBasedOntext(String text){
        return driver.findElement(By.xpath("//[contains(text(), '"+text+"']"));
    }

}
