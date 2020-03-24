package com.naukri.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/features/naukritestcase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@tc01_login"},
glue = {"com.stepdefiniton"},
monochrome = true
)
public class Runner {

}
