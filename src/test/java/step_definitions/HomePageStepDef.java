package step_definitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import static utilities.Driver.getDriver;

public class HomePageStepDef {
    BasePage basePage = new BasePage();
    @When("user clicks on Vehicle under Fleet module")
    public void user_clicks_on_vehicle_under_fleet_module() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(basePage.FleetModule).perform();
        basePage.VehicleModule.click();

    }
}
