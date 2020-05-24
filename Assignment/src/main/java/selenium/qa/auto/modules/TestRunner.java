package selenium.qa.auto.modules;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;



@CucumberOptions(dryRun = false, monochrome = true,
// = "src/main/java/com/auto/qa/stepdefination",
//glue = {"com.auto.qa.stepdefination"}, this will not be able to call the 
//hooks hence we do not need to provide the package for step defination or place hooks in step defination
glue = {""},
 features = {"src/test/java/resources/features"}

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
