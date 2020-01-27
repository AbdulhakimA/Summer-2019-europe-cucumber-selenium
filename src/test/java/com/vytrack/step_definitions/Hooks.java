package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){

        System.out.println("\tthis is coming from Before BEFORE");
    }

    @After
    public void teardown(Scenario scenario){

        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }



       Driver.closeDriver();

    }


    @After ("@db")
    public void tearDownDataBase(){
        System.out.println("\tClosing Database Connection\n");

    }


    @Before("@db")
    public void setUpDatabase(){
        System.out.println("\tConnection Database");
    }
}
