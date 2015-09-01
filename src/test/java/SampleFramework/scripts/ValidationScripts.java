package SampleFramework.scripts;

import static SampleFramework.setup.ActiveUser.*;
import static org.junit.Assert.fail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ValidationScripts {

	public String expectedTitle,observedTitle;
	
	@Given("^Guest is on home page$")
	public void guest_is_on_home_page() throws Throwable {

		Thread.sleep(3000);

		Actions action=new Actions(driver);
		action.moveToElement(Obj.mainmenu).build().perform();
		
		Thread.sleep(6000);
		
		Obj.submenu.click();
		
		Thread.sleep(5000);
		
		Obj.firstProduct.click();
		
		Thread.sleep(5000);
		expectedTitle=Obj.PDPTitle.getText();
		
		Thread.sleep(5000);
		
		Obj.addtocartBtn.click();
		
		Thread.sleep(5000);
		observedTitle=Obj.addtocartProdTitle.getText();
		
		Assert.assertEquals(expectedTitle, observedTitle);
		Obj.viewcart.click();
		
		Thread.sleep(5000);
		
		Obj.removeItem.click();
		
		Thread.sleep(7000);
	}

}
