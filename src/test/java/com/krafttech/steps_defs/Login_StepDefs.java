package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    
    
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        // System.out.println("bahar geliyor oleeey!!");
        String url = ConfigurationReader.get("url");
     Driver.get().get(url);
    }

    @When("The user enters valid credentials that belongs to Mike")
    public void the_user_enters_valid_credentials_that_belongs_to_Mike() {
       // System.out.println("kesinlikle zayıflamalısın!!");
        loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println(" bu işi çok iyi öğren!!");
        Assert.assertTrue(dashboardPage.dashboardPageSubTitle.isDisplayed());
    }

    @When("The user enters valid credentials that belongs to Jack")
    public void the_user_enters_valid_credentials_that_belongs_to_Jack() {
        //System.out.println(" cucumber öğreniyorum");
        loginPage.loginAsJhon();
    }
    @When("The user enters valid credentials that belongs to Eddie Murphy")
    public void the_user_enters_valid_credentials_that_belongs_to_Eddie_Murphy() {
        //System.out.println("Enter valid credentials that belongs to Sebastian");
        loginPage.loginAsEddie();
    }

    @When("The user enters valid credentials that belongs to Morgan Freeman")
    public void the_user_enters_valid_credentials_that_belongs_to_Morgan_Freeman() {
        // System.out.println("Enter valid credentials that belongs to SDET");
        loginPage.loginAsMorgan();
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String email, String password) {
        loginPage.login(email, password);
        BrowserUtils.waitFor(3);
    }


    @Then("The user name should be {string}")
    public void the_user_name_should_be(String expectedUsername) {
        String actualUsername = dashboardPage.userAccountName.getText();
        Assert.assertEquals(expectedUsername,actualUsername);
    }

    @Then("Verify that {string} is visible on the dashboard")
    public void verifyThatIsVisibleOnTheDashboard(String arg0) {

    }

    @When("The user enters valid credentials that belongs to Sebastian")
    public void theUserEntersValidCredentialsThatBelongsToSebastian() {
    }

    @When("The user enters valid credentials that belongs to SDET")
    public void theUserEntersValidCredentialsThatBelongsToSDET() {

    }
}





