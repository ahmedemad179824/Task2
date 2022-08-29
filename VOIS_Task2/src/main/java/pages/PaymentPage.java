package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends PageBase{

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "cnumber")
	public WebElement cardNumberTxtBox;
	
	@FindBy(id="expmon")
	WebElement expirationMonthList;
	
	@FindBy(id = "expyr")
	WebElement expirationYearList;
	
	@FindBy(id = "cvv2")
	WebElement cvvTxtBox;
	
	@FindBy(id = "cname2")
	WebElement cardHolderNameTxtBox;
	
	public void setCardNumber(String cardNumber)
	{
		sendText(cardNumberTxtBox, cardNumber);
	}
	public void selectExpirationMonth(String expirationMonth)
	{
		Select list = new Select(expirationMonthList);
		list.selectByVisibleText(expirationMonth);
	}
	public void selectExpirationYear(String expirationYear)
	{
		Select list = new Select(expirationYearList);
		list.selectByVisibleText(expirationYear);
	}
	public void setCvv(String cvv)
	{
		sendText(cvvTxtBox, cvv);
	}
	public void setCardHolderName(String cardHolderName)
	{
		sendText(cardHolderNameTxtBox, cardHolderName);
	}

}
