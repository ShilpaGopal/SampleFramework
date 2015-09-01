package SampleFramework.trigger;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//ios_webkit_debug_proxy -c 276931117a128e022d2f056772b28f024ded6fbe:27753 -d
//appium -U 276931117a128e022d2f056772b28f024ded6fbe --app com.bytearc.SafariLauncher
//node /lib/server/main.js -U 276931117a128e022d2f056772b28f024ded6fbe



//node /Users/z062943/Documents/workspace/mWebBdd/appium/lib/server/main.js -U f493478486127465f7b52f00bc1b517ae7e1761d --app com.bytearc.SafariLauncher
//node ios-webkit-debug-proxy-launcher.js -c f493478486127465f7b52f00bc1b517ae7e1761d:27753 -d
//@CartSniff,@CLPSniff,@PDPSniff,@SLPSniff,@GAMSniff,@CheckoutSniff,@FlexibleFulfilmentSniff

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:SampleFramework" }, strict = true, plugin = {

		"pretty","rerun:target/rerun.txt", "html:target/html", "json:target/cucumber.json" }, glue = { "SampleFramework" }, tags = { "@Scenario" })
public class TriggerTest extends AbstractTestNGCucumberTests  {


}
