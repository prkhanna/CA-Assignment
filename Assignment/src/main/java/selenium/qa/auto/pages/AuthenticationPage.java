package selenium.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class AuthenticationPage {
	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	public static WebElement creatAccountBtn;
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	
	public static WebElement newEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement existingEmail;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	 public static WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")
	public static WebElement signInButton;

	@FindBy(how = How.XPATH, using = "//div[@id = 'create_account_error']")
	WebElement errorMessage;


	
}
