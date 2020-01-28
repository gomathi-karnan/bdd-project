package bdd_project;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/bdd_project/feature files",glue="bdd_project" , tags="@smoktest,@regtest" ,
plugin={"pretty", "html:target/cucumber" ,"json:target/cucumber.json" , "testng:target/cukes.xml" } , dryRun=true, strict=false,
monochrome=true)
public class runner extends AbstractTestNGCucumberTests {

}
