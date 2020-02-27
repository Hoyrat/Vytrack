package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@db") //it will run only for @db
    public void setUpDatabase(){
        System.out.println("\tCONNECTION DATABASE");
    }
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE\n ");
    }

    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }

    @After("@store_manager") //this works only for store_manager
    public void tearDownStoreManager(){
        System.out.println("\tthis is coming from AFTER STORE MANAGER\n");
    }

    @After("@db")
    public void tearDownDatabase(){
        System.out.println("\tCLOSING DATABASE CONNECTION");
    }
    }
