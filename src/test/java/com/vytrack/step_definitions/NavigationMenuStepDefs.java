package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("log in page");
    }

    @Given("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        System.out.println("password and user name");
    }

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("fleet vehicles");
    }

    @Then("the url should be expected Fleet url")
    public void the_url_should_be_expected_Fleet_url() {
        System.out.println("fleet url");
    }

    @When("the user navigates Marketing Campaigns")
    public void the_user_navigates_Marketing_Campaigns() {
        System.out.println("marketing campaign");
    }

    @Then("the url should be expected Campaigns url")
    public void the_url_should_be_expected_Campaigns_url() {
        System.out.println("campaign url");
    }

    @When("the user navigates Activities - Calendar events")
    public void the_user_navigates_Activities_Calendar_events() {
        System.out.println("calender events");
    }

    @Then("the url should be expected Activities url")
    public void the_url_should_be_expected_Activities_url() {
        System.out.println("activate url");
    }






}
