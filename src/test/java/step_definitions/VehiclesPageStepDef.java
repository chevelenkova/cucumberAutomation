package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.LoginVytruckPage;
import pages.VehiclesPage;
import utilities.ConfigurationReader;

import static utilities.Driver.*;

public class ExportGrid_Refresh_Reset_Step_Def {

    LoginVytruckPage loginVytruckPage = new LoginVytruckPage();
    BasePage basePage = new BasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();






    @Then("user should be able to click Export Grid dropdown")
    public void user_should_be_able_to_click_export_grid_dropdown() {
        vehiclesPage.exportGrid.click();
        Assert.assertTrue("Grid Button is not clickable", vehiclesPage.CSVOption.isDisplayed() && vehiclesPage.XLSXOption.isDisplayed());
    }

    @Then("Export Grid dropdown should be in the left of the page")
    public void exportGridDropdownShouldBeInTheLeftOfThePage() {
        int exportGridHeight = vehiclesPage.exportGrid.getLocation().getX();
        int exportGridWidth = vehiclesPage.exportGrid.getLocation().getY();
        Assert.assertTrue("GridExport location verification failed", exportGridHeight < vehiclesPage.winHeight / 2 && exportGridWidth < vehiclesPage.winWidth / 2);

    }

    @Then("user should be able to click on Refresh button")
    public void userShouldBeAbleToClickOnRefreshButton() {
        vehiclesPage.exportGrid.click();
        Assert.assertTrue("Dropdown options are not displayed", vehiclesPage.CSVOption.isDisplayed() && vehiclesPage.XLSXOption.isDisplayed());
        vehiclesPage.refreshBtn.click();
        Assert.assertTrue("User is not able to click on refresh button", !vehiclesPage.CSVOption.isDisplayed() && !vehiclesPage.XLSXOption.isDisplayed());
    }

    @Then("user should be able to click on Reset button")
    public void userShouldBeAbleToClickOnResetButton() {
        vehiclesPage.exportGrid.click();
        Assert.assertTrue("Dropdown options are not displayed", vehiclesPage.CSVOption.isDisplayed() && vehiclesPage.XLSXOption.isDisplayed());
        vehiclesPage.resetBtn.click();
        Assert.assertTrue("User is not able to click on reset button", !vehiclesPage.CSVOption.isDisplayed() && !vehiclesPage.XLSXOption.isDisplayed());

    }

    @Then("user should be able to click on Grid Settings Button")
    public void userShouldBeAbleToClickOnGridSettingsButton() {
        vehiclesPage.gridSettingsButton.click();
        Assert.assertTrue("Grid settings button is not clickable", vehiclesPage.dropdownSettings.isDisplayed());
    }

    @Then("user should see Refresh Button on the left of ResetButton and Grid Settings should be on the right side")
    public void user_should_see_refresh_button_on_the_left_of_reset_button_and_grid_settings_should_be_on_the_right_side() {
        Assert.assertTrue("Reset button position verification failed", vehiclesPage.refreshBtn.getLocation().getX() < vehiclesPage.resetBtn.getLocation().getX() && vehiclesPage.resetBtn.getLocation().getX() < vehiclesPage.gridSettingsButton.getLocation().getX());
    }

    @Then("Grid Settings button should be in the right of the page")
    public void grid_settings_button_should_be_in_the_right_of_the_page() {
        Assert.assertTrue("Grid Settings button position verification failed", vehiclesPage.gridSettingsButton.getLocation().getX()>vehiclesPage.winWidth/2);
    }




}
