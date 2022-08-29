package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class JourneyDetailsPage extends PageBase{

	public JourneyDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "li.p-2.Forward-boarding.active1")
	public WebElement boardingPoint;
	
	@FindBy(css = "li.p-2.Forward-droping")
	public WebElement droppingPoint;
	
	@FindBy(id = "mobileNo")
	public WebElement mobileNoTxBox;
	
	@FindBy(id = "email")
	WebElement emailIdTxtBox;
	
	@FindBy(id = "Forward98")
	WebElement seatNumber;
	
	@FindBy(id = "passengerNameForward0")
	public WebElement passengerNameTxtBox;
	
	@FindBy(id = "genderCodeIdForward0")
	WebElement genderList;
	
	@FindBy(id = "passengerAgeForward0")
	WebElement passengerAgeTxtBox;
	
	@FindBy(id = "concessionIdsForward0")
	WebElement concessionList;
	
	@FindBy(id = "PgBtn")
	WebElement makePaymentBtn;
	
	public void selectBoardingPoint()
	{
		boardingPoint.click();
	}
	public void selectDroppingPoint()
	{
		droppingPoint.click();
	}
	public void setMobileNo(String mobileNo)
	{
		sendText(mobileNoTxBox, mobileNo);
	}
	public void setEmail(String email)
	{
		sendText(emailIdTxtBox, email);
	}
	public void clickOnSeatNumber()
	{
		seatNumber.click();
	}
	public void setPassengerName(String passengerName)
	{
		sendText(passengerNameTxtBox, passengerName);
	}
	public void selectGender(String gender)
	{
		Select list = new Select(genderList);
		list.selectByVisibleText(gender);
	}
	public void setPassengerAge(String passengerAge)
	{
		sendText(passengerAgeTxtBox, passengerAge);
	}
	public void selectConcession(String concession)
	{
		Select list = new Select(concessionList);
		list.selectByVisibleText(concession);
	}
	public void clickOnMakePaymentBtn()
	{
		makePaymentBtn.click();
	}

}
