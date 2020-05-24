package selenium.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Order {
	
	@FindBy(how= How.XPATH, using ="//span[text()= 'Proceed to checkout']") public static WebElement summarycheckout;
	@FindBy(how= How.XPATH, using ="//input[@name= 'cgv']") public static WebElement acceptCheckbox;
	@FindBy(how= How.XPATH, using ="//button[@name= 'processCarrier']") public static WebElement shippingSubmitBtn;
	
	@FindBy(how= How.XPATH, using ="//i[@class= 'icon-plus']") public static WebElement plusIcon;
	@FindBy(how= How.XPATH, using ="//input[@name='qty']") public static WebElement quantityText;
	@FindBy(how= How.XPATH, using ="//button[@name= 'Submit']")  public static WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "//span[@title = 'Close window']") public static WebElement closeWindow;
	
	@FindBy(how= How.XPATH, using ="//a[@title= 'Proceed to checkout']") public static  WebElement productCheckout;
	
	@FindBy(how= How.XPATH, using ="//span[text()= 'Proceed to checkout']") public static WebElement product2checkout;
	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Pay by bank wire']") public static WebElement payWireBtn;
	@FindBy(how = How.XPATH, using = "//button[@type= 'submit' and @class ='button btn btn-default button-medium']") public static WebElement paymentSubmitBtn;
	@FindBy(how = How.XPATH, using = "//strong[text() = 'Your order on My Store is complete.']") public static WebElement paymentConfirmationText;
     
	
	@FindBy(how = How.XPATH, using = "//button[@name= 'processAddress']") public static WebElement myacctCheckout;
}
