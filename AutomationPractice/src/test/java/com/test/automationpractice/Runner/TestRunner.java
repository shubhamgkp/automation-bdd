package com.test.automationpractice.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFiles",glue="com.automationpractice.stepdefinition",
format = {"pretty", "html:Reports/cucumber-html-report/Report.html"}, monochrome=true,tags = "@Test")
public class TestRunner {

}
