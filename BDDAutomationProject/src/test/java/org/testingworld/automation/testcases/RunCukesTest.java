package org.testingworld.automation.testcases;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json","junit:target/cucumber-results.xml"},features={"scr.test.resources"})
public class RunCukesTest {

}
