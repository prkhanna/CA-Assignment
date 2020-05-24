package selenium.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class HomePage {

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log in to your customer account']")
	public static WebElement signIn;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log me out']")
	public static WebElement signOut;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Women']")
	public static WebElement womenSection;
	@FindBy(how = How.XPATH, using = "//img[@alt= 'Blouse']")
	public static WebElement quickView;

	@FindBy(how = How.XPATH, using = "//a[@title= 'Orders']")
	public static WebElement orderHistory;
	@FindBy(how = How.XPATH, using = "//a[@title= 'View my customer account']")
	public static WebElement userLink;

	
}
