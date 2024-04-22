package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class SelectHotel {
    WebDriver driver;
    public SelectHotel(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);//

    }
    @FindBy(xpath = "//input[@value='0']")
    private WebElement Select;

    @FindBy(css = ".login [align='right']")
    private WebElement bookingDetails;

    public WebElement getBookingDetails() {
        return bookingDetails;
    }

    public void BookingDetails(String bookingDetails)
    {
        if (getBookingDetails().isDisplayed())
        {
            System.out.println("Booking Details Found");
            getBookingDetails().getText().toString();
            System.out.println(" "+getBookingDetails());
            assertTrue(true);
        }
        else
        {
            System.out.println("Booking details not Found");
            fail();

        }
    }
}
