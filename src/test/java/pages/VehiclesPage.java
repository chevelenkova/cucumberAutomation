package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VehiclesPage extends BasePage {


    @FindBy(xpath = "//a[contains(@title,'With this button')]")
    public WebElement exportGrid;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement CSVOption;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement XLSXOption;

    @FindBy(xpath = "//i[@class='fa-repeat']")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsButton;

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement dropdownSettings;

    public int winHeight = Driver.getDriver().manage().window().getSize().getHeight();
    public int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
}
