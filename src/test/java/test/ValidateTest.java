package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.ValidatePage;
import util.BrowserFactory;

public class ValidateTest {
	WebDriver driver;
	
	@Test
	public void toggleAllCheckBox() throws InterruptedException {
		
		//to interact driver with BrowserFactory 
		driver = BrowserFactory.init();
		
		ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
		validatePage.checkAllElements();
		
		if (validatePage.checkIfAllElementsAreChecked() == true)
		{
			System.out.println("All Checked Now");
		}
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void removeSingleListItem() throws InterruptedException
	{
		driver = BrowserFactory.init();
		ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
		
		validatePage.removeFirstItem();
		
		if(validatePage.checkIfFirstItemIsRemoved() == true)
		{
			System.out.println("First item is removed");
		}else {
			System.out.println("First item is NOT removed");
		}
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test
	public void removeAllItems() throws InterruptedException
	{
		driver = BrowserFactory.init();
		ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
		
		validatePage.removeAllItems();
		if(validatePage.checkIfAllItemAreRemoved() == true) 
		{
			System.out.println("All item are removed");
		}else {
			System.out.println("All item are NOT removed");
		}
		Thread.sleep(2000);
		driver.close();
	}
	
	}
