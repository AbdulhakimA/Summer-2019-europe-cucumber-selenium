package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //where our feature are located
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions/",
        dryRun = false
       // tags = "@hello and not @wip"



)







public class CukesRunner {





}
