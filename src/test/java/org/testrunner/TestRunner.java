package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Cucumber Feature\\Navigation.Feature",
		"src\\test\\resources\\Cucumber Feature\\Second_ContactPage.Feature"},monochrome = true,dryRun = false,snippets = SnippetType.CAMELCASE,
glue= {"org.stepdefinition"})
public class TestRunner {

}
