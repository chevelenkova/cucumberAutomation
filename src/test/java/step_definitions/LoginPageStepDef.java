package step_definitions;

import io.cucumber.java.en.Given;
import pages.LoginVytruckPage;
import utilities.ConfigurationReader;

import static utilities.Driver.getDriver;

public class LoginPageStepDef {

    @Given("user with {string} and {string} is on Home page")
    public void userWithAndIsOnHomePage(String userName, String password) {
        LoginVytruckPage loginVytruckPage = new LoginVytruckPage();
        getDriver().get(ConfigurationReader.getProperty("env"));
        loginVytruckPage.username.sendKeys(userName);
        loginVytruckPage.password.sendKeys(password);
        loginVytruckPage.submitBtn.click();
    }
}
