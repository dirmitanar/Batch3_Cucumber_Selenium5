package com.krafttech.steps_defs;

import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class My_Task {

    @Then("The user should be able to see text")
    public void the_user_should_be_able_to_see_text() {


    }

    @And("The user navigates to Forms Input menu menu")
    public void theUserNavigatesToFormsInputMenuMenu() {
        System.out.println("ınput menüye girildi");
        BrowserUtils.waitFor(3);
    }

    @Then("The user able to see General Form Elements - Input  text")
    public void theUserAbleToSeeGeneralFormElementsInputText() {
        System.out.println("input görüldü");
        BrowserUtils.waitFor(3);
    }


    @And("The user navigate to Text menu")
    public void theUserNavigateToTextMenu() {
        System.out.println("text menü girildi");
        BrowserUtils.waitFor(3);
    }
    }

