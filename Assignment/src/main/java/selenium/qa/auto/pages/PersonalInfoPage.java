package selenium.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class PersonalInfoPage {

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//input[@id = 'id_gender1']")
	public static WebElement titleRadio;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_firstname']")
	public static WebElement firstName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_lastname']")
	public static WebElement lastName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'email']")
	public static WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@id = 'passwd']")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id = 'address1']")
	public static	WebElement address;
	@FindBy(how = How.XPATH, using = "//input[@id = 'city']")
	public static WebElement city;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_state']")
	public static WebElement state;
	@FindBy(how = How.XPATH, using = "//input[@id = 'postcode']")
	public static WebElement zipcode;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_country']")
	public static WebElement country;
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone_mobile']")
	public static WebElement phoneMobile;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submitAccount']")
	public static WebElement registerButton;
}
