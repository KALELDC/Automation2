package com.capacitacion2.capacitacion2.clase8;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = "pretty", features = "sr/test/resourses/Features", glue = "com.capacitacion2.capacitacion2.clase8.steps")

public class Runner {

}
