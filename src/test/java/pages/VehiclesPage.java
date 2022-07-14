package pages;

import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Year;

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

    @FindBy(xpath = "//span[.='License Plate']")
    public WebElement licensePlate;

    @FindBy(xpath = "//span[.='Tags']")
    public WebElement tags;

    @FindBy(xpath = "//span[.='Driver']")
    public WebElement driver;

    @FindBy(xpath = "//span[.='Location']")
    public WebElement location;

    @FindBy(xpath = "//span[.='Chassis Number']")
    public WebElement chassisNumber;

    @FindBy(xpath = "//span[.='Model Year']")
    public WebElement modelYear;

    @FindBy(xpath = "//span[.='Last Odometer']")
    public WebElement lastOdometer;

    @FindBy(xpath = "//span[.='Immatriculation Date']")
    public WebElement immatriculationDate;

    @FindBy(xpath = "//span[.='First Contract Date']")
    public WebElement firstContractDate;

    @FindBy(xpath = "//span[.='CVVI']")
    public WebElement CVVI;

    @FindBy(xpath = "//span[.='Seats Number']")
    public WebElement seatsNumber;

    @FindBy(xpath = "//span[.='Doors Number']")
    public WebElement doorsNumber;

    @FindBy(xpath = "//span[.='Color']")
    public WebElement color;

    @FindBy(xpath = "//span[.='Transmission']")
    public WebElement transmission;

    @FindBy(xpath = "//span[.='Fuel Type']")
    public WebElement fuelType;

    @FindBy(xpath = "//span[.='CO2 Emissions']")
    public WebElement CO2Emissions;

    @FindBy(xpath = "//span[.='Horsepower']")
    public WebElement horsepower;

    @FindBy(xpath = "//span[.='Horsepower Taxation']")
    public WebElement HorsepowerTaxation;

    @FindBy(xpath = "//span[.='Power (kW)']")
    public WebElement power;



}
