package selenium.qa.auto.stepdefination;

import static selenium.qa.auto.modules.Hooks.misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import selenium.qa.auto.pages.HomePage;
import selenium.qa.auto.pages.MyAccount;
import selenium.qa.auto.pages.Order;

public class Shopping {
	

	
	@Then("^click on women section$")
	public void click_on_women_section() throws Throwable {
		misc.elementClick(HomePage.womenSection);
	}

	@Then("^click on clothes$")
	public void click_on_clothes() throws Throwable {
		misc.elementClick(HomePage.quickView);
	}

	@Then("^switch the driver$")
	public void switch_the_driver() throws Throwable {
	   misc.switchFrame();
	}

	@Then("^select the quantity$")
	public void select_the_quantity() throws Throwable {
		misc.elementClick(Order.plusIcon);
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		misc.elementClick(Order.addToCart);
	}

	
	
	@Then("^click on checkout button$")
	public void click_on_checkout_button() throws Throwable {
		misc.waitElementToBeClickable(Order.productCheckout);
	   misc.elementClick(Order.productCheckout);
	}


	@Then("^click on again_checkout button$")
	public void click_on_again_checkout_button() throws Throwable {
	   misc.elementClick(Order.product2checkout);
	}

	@Then("^click on address button$")
	public void click_on_address_button() throws Throwable {
		misc.elementClick(Order.myacctCheckout);	
		}

	@Then("^click on terms and condition$")
	public void click_on_terms_and_condition() throws Throwable {
	 System.out.println("Element checkbox clicked");
		misc.simpleClick(Order.acceptCheckbox);
	}

	@Then("^click on summary checkout button$")
	public void click_on_summary_checkout_button() throws Throwable {
	    misc.elementClick(Order.shippingSubmitBtn);
	}
	@Then("^payment of paywire$")
	public void payment_of_paywire() throws Throwable {
	    misc.elementClick(Order.payWireBtn);
	}

	@Then("^click on order confirm$")
	public void click_on_order_confirm() throws Throwable {
	    misc.elementClick(Order.paymentSubmitBtn);
	    }
	
	@Then("^check the confirmation text$")
	public void check_the_confirmation_text() throws Throwable {
		misc.isElementPresent(Order.paymentConfirmationText);
	}

	
	@Then("^click on userAccount$")
	public void click_on_userAccount() throws Throwable {
	  misc.elementClick(HomePage.userLink);
	}

	@Then("^click on order history$")
	public void click_on_order_history() throws Throwable {
		misc.elementClick(MyAccount.orderHistory);
	}

	@Then("^check the total price$")
	public void check_the_total_price() throws Throwable {
		try {
			WebElement body = MyAccount.table.findElement(By.tagName("tbody"));
			List<WebElement> allRows = body.findElements(By.tagName("tr"));
			int totalRow = allRows.size();
			if (totalRow > 0) {
				Assert.assertEquals(MyAccount.historyPrice.getText(), "$58.24");
			}
		} catch (NoSuchElementException e) {
			String expected = "You have not placed any orders.";

			Assert.assertEquals(MyAccount.noOrder.getText(), expected);
		}

	}
	
}
