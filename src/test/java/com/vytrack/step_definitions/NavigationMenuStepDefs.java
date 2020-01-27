package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("log in page");


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        System.out.println("password and user name");

        LoginPage loginPage =new LoginPage();
        String userName=ConfigurationReader.get("sales_manager_username");
        String passWord=ConfigurationReader.get("sales_manager_password");
        loginPage.login(userName,passWord);

    }

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {


        String actualTitle=Driver.get().getTitle();
        BrowserUtils.waitFor(4);
        Assert.assertEquals("Dashboard",actualTitle);
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

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        LoginPage loginPage =new LoginPage();

        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle=Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Dashboard",actualTitle);
    }

    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {

        BrowserUtils.waitFor(2);
        new DashboardPage().navigateToModule(tab,module);



    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer E_pageNumber) {

        ContactsPage contactsPage=new ContactsPage();


        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        BrowserUtils.waitFor(2);
        Assert.assertEquals(actualNumber,E_pageNumber);

    }


    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String User) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = null;
        String password = null;

        if(User.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if(User.equals("sales manager")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        }else if(User.equals("store manager")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);



    }

    @Then("the title should contains {string}")
    public void the_title_should_contains(String expectedTitle) {

        BrowserUtils.waitFor(2);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert. assertTrue("Actual Title:"+Driver.get().getTitle(),Driver.get().getTitle().contains(expectedTitle));
    }





}
