package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/resources/features/fleet",   // path to features
            glue = "com/vytrack/step_definitions",          // path to step definitions
            dryRun = false ,                // dryRun is false by default, switch it to true and it will not run
            tags = "@vehicle_costs" ,         // this step executes the one that annotated, will ignore other scenarios.
            plugin = {"html:target/default-cucumber-reports",
            "json:target/cucumber.json",
            "rerun:target/rerun.txt"         // to generate txt file with failed scenarios
            }
)

public class CucumberRunner {

}
