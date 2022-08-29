package tests;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.HomePage;
import pages.JourneyDetailsPage;
import pages.PaymentPage;

public class BooktransferTicket extends TestBase{
	
	HomePage homePageObject;
	JourneyDetailsPage journeyDetailsPageObject;
	PaymentPage paymentPageObject;
	
	
	String from = ReadProperties.data.getProperty("from");
	String toDestination = ReadProperties.data.getProperty("toDestination");
	String day = ReadProperties.data.getProperty("day");
	String mobileNo = ReadProperties.data.getProperty("mobileNo");
	String email = ReadProperties.data.getProperty("email");
	String passengerName = ReadProperties.data.getProperty("passengerName");
	String gender = ReadProperties.data.getProperty("gender");
	String passengerAge = ReadProperties.data.getProperty("passengerAge");
	String concession = ReadProperties.data.getProperty("concession");
	String cardNumber = ReadProperties.data.getProperty("cardNumber");
	String expirationMonth = ReadProperties.data.getProperty("expirationMonth");
	String expirationYear = ReadProperties.data.getProperty("expirationYear");
	String cvv = ReadProperties.data.getProperty("cvv");
	String cardHolderName = ReadProperties.data.getProperty("cardHolderName");
	
	@Test()
	public void bootkransferTicket()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		homePageObject = new HomePage(driver);
		wait.until(ExpectedConditions.visibilityOf(homePageObject.list));
		homePageObject.selectDestination(from, toDestination);
		
		wait.until(ExpectedConditions.visibilityOf(homePageObject.nextMonthBtn));
		homePageObject.clickOnNextMonthBtn();
		homePageObject.selectDayFromCalendarTable(day);
		homePageObject.clickOnCloseAdsBtn();
		wait.until(ExpectedConditions.visibilityOf(homePageObject.searchForBusBtn));

		driver.manage().window().maximize();
		homePageObject.clickOnSearchForBusBtn();
		driver.manage().window().setSize(new Dimension(1024,768));
		homePageObject.clickOnCloseAdsBtn();
		
		js.executeScript("arguments[0].click()", homePageObject.selectSeatsBtn);
		
		journeyDetailsPageObject = new JourneyDetailsPage(driver);
		
		wait.until(ExpectedConditions.visibilityOf(journeyDetailsPageObject.boardingPoint));
		journeyDetailsPageObject.selectBoardingPoint();
		
		wait.until(ExpectedConditions.visibilityOf(journeyDetailsPageObject.droppingPoint));
		journeyDetailsPageObject.selectDroppingPoint();
		
		wait.until(ExpectedConditions.visibilityOf(journeyDetailsPageObject.mobileNoTxBox));
		journeyDetailsPageObject.setMobileNo(mobileNo);
		journeyDetailsPageObject.setEmail(email);
		journeyDetailsPageObject.clickOnSeatNumber();
		
		wait.until(ExpectedConditions.visibilityOf(journeyDetailsPageObject.passengerNameTxtBox));
		journeyDetailsPageObject.setPassengerName(passengerName);
		journeyDetailsPageObject.selectGender(gender);
		journeyDetailsPageObject.setPassengerAge(passengerAge);
		journeyDetailsPageObject.selectConcession(concession);
		journeyDetailsPageObject.clickOnMakePaymentBtn();
		
		paymentPageObject = new PaymentPage(driver);
		wait.until(ExpectedConditions.visibilityOf(paymentPageObject.cardNumberTxtBox));
		paymentPageObject.setCardNumber(cardNumber);
		paymentPageObject.selectExpirationMonth(expirationMonth);
		paymentPageObject.selectExpirationYear(expirationYear);
		paymentPageObject.setCvv(cvv);
		paymentPageObject.setCardHolderName(cardHolderName);
		
	}

}
