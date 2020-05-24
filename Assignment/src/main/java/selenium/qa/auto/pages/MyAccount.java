package selenium.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccount {

	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Orders']")public static WebElement orderHistory;
	@FindBy(how = How.XPATH, using = "//*[@id=\"order-list\"]/tbody/tr[1]/td[3]") public static WebElement historyPrice;
	@FindBy(how = How.XPATH, using = "//p[text()='You have not placed any orders.']") public static WebElement noOrder;

	@FindBy(how = How.XPATH, using = "//table[@id='order-list']") public static WebElement table;

}
