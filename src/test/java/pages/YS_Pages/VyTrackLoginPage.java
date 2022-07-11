package pages.YS_Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@name='_submit']")
    public WebElement loginBtn;

    public void login(String username, String password){
        loginUsername.sendKeys(username);
        loginPassword.sendKeys(password);
        loginBtn.click();
    }

}
