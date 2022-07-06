package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ValidatePage {
	
	WebDriver driver;
	@FindBy(how = How.NAME, using = "allbox") WebElement CHECK_ALL_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[2]") WebElement FIRST_ELEMENT;
	@FindBy(how = How.NAME, using = "submit")  WebElement SUBMIT_ELEMENT;
		
	public ValidatePage(WebDriver driver) 
	{
		//to establish relationship between validateTest driver & validatePage driver
		this.driver = driver;
	}
    public void checkAllElements() {
		CHECK_ALL_ELEMENT.click();
	}
    
    public boolean checkIfAllElementsAreChecked()
    {
		return CHECK_ALL_ELEMENT.isSelected();
	}
    
    public void removeFirstItem()
    {
    	FIRST_ELEMENT.click();
    	SUBMIT_ELEMENT.click();
    }
    
    public boolean checkIfFirstItemIsRemoved()
    {
    	try 
    	{
    		System.out.println(FIRST_ELEMENT.getText());
    		return false;
    	}
    	catch(Exception ex)
    	{
    		return true;
    	}
    }
    
    public void removeAllItems()
    {
    	CHECK_ALL_ELEMENT.click();
    	SUBMIT_ELEMENT.click();
    }
    
    public boolean checkIfAllItemAreRemoved()
    {
    	
    		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id=\"todos-content\"]//descendant::li"));
    		if(allElements.size()>0) {
    			return false;
    		}else {
    			return true;
    		}
    		
    }
    
    
    
    
     
    
    

}
