package selenium.qa.auto.helper;




import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionlLibrary {
	
	
	WebDriver driver;

	public FunctionlLibrary(WebDriver driver) {
		this.driver = driver;
	}
	public static HashMap<String,String> ReadPropertiesFile() {
        File file = new File("conf.properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, String> AUT_Properties = new HashMap<String, String>();
        Enumeration KeyValues = prop.keys();
        while (KeyValues.hasMoreElements()) {
            String key = (String) KeyValues.nextElement();
            String value = prop.getProperty(key);
            AUT_Properties.put(key, value);
        }
        return AUT_Properties;
    }

	
	 public void elementClick(WebElement element) {
	        try {
	            if(isElementPresent(element)) {
	                waitElementToBeClickable(element);
	                element.click();
	            }
	        } catch (Exception e) {
	            fail("The element is not found");
	        }
	    }
	 
	 //To check whether an element is present or not
	    public boolean isElementPresent(WebElement element) {
	        boolean blnResult = false;
	        if (element.isDisplayed())
	            blnResult = true;
	        else
	            blnResult = false;
	        return blnResult;
	    }
	    
	    public void waitElementToBeClickable(WebElement element) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, 60);
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	        } catch (NoSuchElementException e) {
	            fail("Element is not present");
	        } catch (Exception e) {
	            fail("Wait for the element is not working");
	        }
	    }
	    
	    public void elementSendKeys(WebElement element, String data) {
	        try {
	            waitElementToBeClickable(element);
	            element.clear();
	            element.sendKeys(data);
	        } catch (java.util.NoSuchElementException e) {
	            fail("Textbox element is not present");
	        } catch (Exception e) {
	            fail("The textbox can not be edited");
	        }
	    }
	    
	    
	    public boolean selectByText(WebElement locator, String text) {
	        try {
	            new Select(locator).selectByVisibleText(text);
	            return true;
	        }
	        catch (Exception e) {
	            //verificationErrors.append(e.toString());
	          fail("Could not find element");
	            return false;
	        }
	    }
	    
	    
	    public void switchFrame() {
	    	WebElement abc = driver.findElement(By.className("fancybox-iframe"));
	 		driver.switchTo().frame(abc);
	    }
	    
	    public void switchToParentFrame(){
	    	driver.switchTo().parentFrame();
	    
	    }
	    
	    public void simpleClick(WebElement element) {
	    	element.click();
	    }
}
