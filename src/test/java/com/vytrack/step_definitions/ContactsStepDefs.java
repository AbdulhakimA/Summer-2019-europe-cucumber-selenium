package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {



    @Then("the user should see following menu option")
    public void the_user_should_see_following_menu_option(List<String> menuOption) {
        System.out.println("menuOption.size = " + menuOption.size());
        System.out.println("MenuOption" + menuOption);

        BrowserUtils.waitFor(2);
        DashboardPage dashboardPage =new DashboardPage();

        List<String> ActualMenuOption = BrowserUtils.getElementsText(dashboardPage.menuOptions);

        Assert.assertEquals(menuOption,ActualMenuOption);

    }

    @When("the user logs in using following credential")
    public void the_user_logs_in_using_following_credential(Map<String,String> userData) {

        LoginPage loginPage =new LoginPage();
        loginPage.login(userData.get("username"),userData.get("password"));

        //verify fullname on the top right corner from website

        DashboardPage dashboardPage = new DashboardPage();

        BrowserUtils.waitFor(3);

        Assert.assertEquals(dashboardPage.getUserName(),userData.get("firstname")+" "+ userData.get("lastname"));



    }
    @When("the user click the {string} from contacts")
    public void the_user_click_the_from_contacts(String email) {
        BrowserUtils.waitFor(2);
        //click the row with the email
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.getContactEmail(email).click();
    }
    @Then("the information should be the same with database")
    public void the_information_should_be_the_same_with_database() {
        BrowserUtils.waitFor(3);
    }


}
