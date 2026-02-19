package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LocPage {

public LocPage(){PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "(//*[@href='login.php'])[2]")
    public WebElement loginButton;

@FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

@FindBy(xpath = "//*[@name='password']")
    public WebElement password;

@FindBy(xpath = "//*[@type='submit']")
    public WebElement girisButon;
@FindBy (xpath = "//*[@class='fas fa-exclamation-circle me-3 fs-5']")
    public WebElement hataMessage;

@FindBy(xpath = "//*[@href='profile.php']")
    public WebElement profile;

}
