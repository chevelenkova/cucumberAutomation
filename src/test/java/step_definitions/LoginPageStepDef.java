package step_definitions;

import io.cucumber.java.en.Given;
import pages.LoginVytruckPage;
import utilities.ConfigurationReader;

import static utilities.Driver.getDriver;

public class LoginStepDef {
    LoginVytruckPage loginVytruckPage = new LoginVytruckPage();
    @Given("user with {string} and {string} is on Home page")
    public void userWithAndIsOnHomePage(String userName, String password) {
        getDriver().get(ConfigurationReader.getProperty("env"));
        loginVytruckPage.username.sendKeys(userName);
        loginVytruckPage.password.sendKeys(password);
        loginVytruckPage.submitBtn.click();
    }
}
