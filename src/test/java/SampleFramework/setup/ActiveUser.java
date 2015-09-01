package SampleFramework.setup;


//import static com.mobweb.test.DriverScript.CONFIG;

//import static com.mobweb.test.DriverScript.CONFIG;

import java.net.MalformedURLException;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;





import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SampleFramework.pageobjects.PageObjects;
import SampleFramework.utils.Keyword;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ActiveUser {


	public static WebDriver driver;
	public static Keyword user;
	public static PageObjects Obj = new PageObjects();
	


	@Before
	public void setup_ios_tablet() throws MalformedURLException,
			InterruptedException {

	

		driver = new FirefoxDriver();
		//scenario = result;
	
		PageFactory.initElements(new AppiumFieldDecorator(ActiveUser.driver),
				Obj);

		driver.get("http://www.target.com");

	}
	
	

	
	@After
	public void tearDown(Scenario result) throws Exception {

		if (result.isFailed()) {
			result.write("ScreenShot taken for failed step ");
			byte[] screenshot = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES);
			result.embed(screenshot, "image/png");
		}
        Thread.sleep(2000);
		driver.quit();
	}
}
	




