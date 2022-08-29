package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul")
	public WebElement list;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/a[2]")
	public WebElement nextMonthBtn;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table")
	WebElement calendarTable;
	
	@FindBy(id = "corover-close-btn")
	WebElement closeAdsBtn;
	
	@FindBy(xpath = "//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]")
	public WebElement searchForBusBtn;
	
	@FindBy(id = "SrvcSelectBtnForward0")
	public WebElement selectSeatsBtn;
	
	public void selectDestination(String from, String toDestination)
	{
		selectFromList(list, from+" - "+toDestination, "li");
	}
	public void clickOnNextMonthBtn()
	{
		nextMonthBtn.click();
	}
	public void selectDayFromCalendarTable(String day)
	{
		selectFromList(calendarTable, day, "td");
	}
	public void clickOnCloseAdsBtn()
	{
		closeAdsBtn.click();
	}
	public void clickOnSearchForBusBtn()
	{
		searchForBusBtn.click();
	}
	public void clickOnSelectSeatsBtn()
	{
		selectSeatsBtn.click();
	}

}
