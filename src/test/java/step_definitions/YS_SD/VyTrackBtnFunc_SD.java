package step_definitions.YS_SD;

import pages.YS_Pages.VyTrackVehiclesPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrackBtnFunc_SD {

    VyTrackVehiclesPage vehiclesPage = new VyTrackVehiclesPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("User enter valid {string} and valid {string}")
    public void user_enter_valid_and_valid(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        vehiclesPage.login(username, password);
    }

    @When("User can click Vehicles button under the Fleet Module")
    public void user_can_click_vehicles_button_under_the_fleet_module() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.fleet));
        actions.moveToElement(vehiclesPage.fleet).perform();
        actions.click(vehiclesPage.vehicles).perform();
    }

    @When("Export Grid dropdown is on the left of the page")
    public void export_grid_dropdown_is_on_the_left_of_the_page() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdown));
        boolean expectedPosition = true;
        boolean actualPosition = vehiclesPage.exportGridDropdown.getLocation().getX() < vehiclesPage.gridSetBtn.getLocation().getX();

        Assert.assertEquals("VALIDATION FAILED", expectedPosition, actualPosition);
    }

    @When("User should be able to click refresh button")
    public void user_should_be_able_to_click_refresh_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshBtn));
        actions.moveToElement(vehiclesPage.refreshBtn).perform();
        actions.click(vehiclesPage.refreshBtn).perform();
    }

    @When("User should be able click reset button")
    public void user_should_be_able_click_reset_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.resetBtn));
        actions.moveToElement(vehiclesPage.resetBtn).perform();
        actions.click(vehiclesPage.resetBtn).perform();
    }

    @When("User should be able to click Grid Settings button")
    public void user_should_be_able_to_click_grid_settings_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.gridSetBtn));
        actions.moveToElement(vehiclesPage.gridSetBtn).perform();
        actions.doubleClick(vehiclesPage.gridSetBtn).perform();
    }

    @Then("{string} button should be on the left side of {string} button")
    public void button_should_be_on_the_left_side_of_button(String refresh, String reset) {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.resetBtn));
        Assert.assertTrue("VALIDATION FAILED",vehiclesPage.ifButtonOnTheLeft(refresh,reset));
    }

    @Then("{string} should be on the right side of the {string} button")
    public void should_be_on_the_right_side_of_the_button(String reset, String gridSettings) {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.gridSetBtn));
        Assert.assertTrue("VALIDATION FAILED",vehiclesPage.ifButtonOnTheRight(gridSettings,reset));
    }

    @Then("Grid Setting button is on the right of the page")
    public void grid_setting_button_is_on_the_right_of_the_page() {
        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.gridSetBtn));
        boolean expectedPosition = true;
        boolean actualPosition = vehiclesPage.gridSetBtn.getLocation().getX() > vehiclesPage.exportGridDropdown.getLocation().getX();

        Assert.assertEquals("VALIDATION FAILED", expectedPosition, actualPosition);
    }
}
