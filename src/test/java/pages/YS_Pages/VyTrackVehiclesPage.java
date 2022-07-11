package pages.YS_Pages;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VyTrackVehiclesPage {

    public VyTrackVehiclesPage(){
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

    @FindBy(xpath = "(//a[@href='/account'])[1]")
    public WebElement accounts;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span" )
    public WebElement fleet;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='btn-group']/a")
    public WebElement exportGridDropdown;

    public boolean ifButtonOnTheLeft(String firstBtn, String secondBtn){
        boolean check = false;
        String xpath = "//a[@title='" + firstBtn + "']/..//preceding-sibling::a[@title='" + secondBtn + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        if(element.isDisplayed()){
            check = true;
        }
        return check;
    }

    public boolean ifButtonOnTheRight(String firstBtn, String secondBtn){
        boolean check = false;
        String xpath = "//a[@title='" + firstBtn + "']/..//following-sibling::a[@title='" + secondBtn + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        if(element.isDisplayed()){
            check = true;
        }
        return check;
    }

    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement resetBtn;

    @FindBy(xpath = "//div[@class='column-manager dropdown']/a")
    public WebElement gridSetBtn;
}
