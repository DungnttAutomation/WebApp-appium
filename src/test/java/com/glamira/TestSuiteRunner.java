package com.glamira;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/HomePage", plugin = { "json:target/TestSuiteRunner.json",
        "pretty" }, glue = { "com.glamira.base", "com.glamira.steps" })
public class TestSuiteRunner {
}