package SampleFramework.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class PageObjects {

	@FindBy(xpath = "//*[@id='MainMenu']//a[text()='electronics & office']")
	public WebElement mainmenu;
	
	@FindBy(xpath = "//*[@id='MainMenu']//a[text()='home theater audio']")
	public WebElement submenu;
	
	@FindBy(xpath = "//*[@id='prodTitle-medium-1-1']/h3/img")
	public WebElement firstProduct;
	
	@FindBy(xpath = "//*[@id='addToCart']")
	public WebElement addtocartBtn;
	
	@FindBy(xpath = "//*[@id='singleItemList']/li/div[2]/a")
	public WebElement addtocartProdTitle;
	
	@FindBy(xpath = "//a[@title='remove item from cart']")
	public WebElement removeItem;

	@FindBy(xpath = "//*[@id='ViewYourCartLink']")
	public WebElement viewcart;
	
	@FindBy(xpath = "//*[@id='ProductDetailsTop']/div[2]/div[1]/h2/span")
	public WebElement PDPTitle;
}
