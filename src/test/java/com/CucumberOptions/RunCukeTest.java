package com.CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/java/com/features",
  glue = "com/StepDefinitions",
  tags = { "@vagas" }
//    tags = { "not @wip","not @notImplemented" },
)
public class RunCukeTest {

}