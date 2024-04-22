package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class SearchHotelPageObjects {
    WebDriver driver;
    public SearchHotelPageObjects(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);//

    }
    @FindBy(xpath= "//option[.='Paris']")
    private WebElement location;
    @FindBy(xpath = "//option[.='Hotel Hervey']")
    private WebElement hotels;
    @FindBy(css = "[value='Double']")
    private WebElement RoomType;
    @FindBy(xpath = "//select[@id='room_nos']/option[.='2 - Two']")
    private WebElement NumberOFRooms;
    @FindBy(id = "datepick_in")
    private WebElement ChekInDate;
    @FindBy(id = "datepick_out")
    private WebElement ChekOutDate;
    @FindBy(xpath = "//select[@id='adult_room']/option[.='2 - Two']")
    private WebElement AdultsPerRoom;
    @FindBy(xpath = "//select[@id='child_room']/option[.='1 - One']")
    private WebElement ChildrenPerRoom;
    @FindBy(xpath ="//input[@id='Submit']")
    private WebElement search;

    public WebElement getLocation() {
        return location;
    }

    public WebElement getHotels() {
        return hotels;
    }

    public WebElement getRoomType() {
        return RoomType; // Case-sensitive, should be RoomType
    }

    public WebElement getNumberOfRooms() {
        return NumberOFRooms; // Consider using a more descriptive name (e.g., getNumRooms)
    }

    public WebElement getCheckInDate() {
        return ChekInDate; // Consider using a more standard spelling (e.g., getCheckInDate)
    }

    public WebElement getCheckOutDate() {
        return ChekOutDate; // Consider using a more standard spelling (e.g., getCheckOutDate)
    }

    public WebElement getAdultsPerRoom() {
        return AdultsPerRoom;
    }

    public WebElement getChildrenPerRoom() {
        return ChildrenPerRoom;
    }

    public WebElement getClickSearchButton() {
        return search;
    }

    public void SelectLocation()
    {
        if (getLocation().isDisplayed())
        {
            System.out.println("Location Found");
            getLocation().click();
           // getLocation().sendKeys(Keys.ARROW_DOWN);
         //   getLocation().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Location not Found");
            fail();
        }
    }
    public void SelectHotel()
    {
        if (getHotels().isDisplayed())
        {
            System.out.println("Hotel Found");
            getHotels().click();
            // getLocation().sendKeys(Keys.ARROW_DOWN);
          //  getHotels().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Hotels not Found");
            fail();

        }
    }
    public void RoomType()
    {
        if (getRoomType().isDisplayed())
        {
            System.out.println("RoomType Found");
            getRoomType().click();
            // getLocation().sendKeys(Keys.ARROW_DOWN);
//            getRoomType().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Room not Found");
            fail();

        }
    }
    public void NumRooms()
    {
        if (getNumberOfRooms().isDisplayed())
        {
            System.out.println("RoomType Found");
            getNumberOfRooms().click();
            // getLocation().sendKeys(Keys.ARROW_DOWN);
           // getNumberOfRooms().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Room not Found");
            fail();

        }
    }


    public void SelectDate(String Date)
    {
        if (getCheckInDate().isDisplayed())
        {
            System.out.println("Date Found");
            getCheckInDate().clear();
            getCheckInDate().sendKeys(Date);
            // getLocation().sendKeys(Keys.ARROW_DOWN);
         //   getCheckInDate().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Hotels not Found");
            fail();

        }
    }
    public void CheckOutDate(String Date)
    {
        if (getCheckOutDate().isDisplayed())
        {
            System.out.println("date Confrimed");
            getCheckOutDate().clear();
            getCheckOutDate().sendKeys(Date);
            // getLocation().sendKeys(Keys.ARROW_DOWN);
          //  getCheckOutDate().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Hotels not Found");
            fail();

        }
    }
    public void NumberOfAdults()
    {
        if (getAdultsPerRoom().isDisplayed())
        {
            System.out.println("adults Confrimed");
            getAdultsPerRoom().click();
            // getLocation().sendKeys(Keys.ARROW_DOWN);
          //  getAdultsPerRoom().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Adults not Found");
            fail();

        }
    }
    public void NumberOfChildren()
    {
        if (getChildrenPerRoom().isDisplayed())
        {
            System.out.println("Children Confrimed");
            getChildrenPerRoom().click();
            // getLocation().sendKeys(Keys.ARROW_DOWN);
          //  getChildrenPerRoom().sendKeys(Keys.ENTER);
            assertTrue(true);
        }
        else
        {
            System.out.println("Children not Found");
            fail();

        }
    }
    public void Search()
    {
        if (getClickSearchButton().isDisplayed())
        {
            System.out.println("Search Button");
            getClickSearchButton().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Search Button not Found");
            fail();

        }
    }
    public void DisplayBooking()
    {
        System.out.println(getHotels()+"Hotel Name"+getLocation()+"\tLocation"+getNumberOfRooms()+"Rooms"+getCheckInDate()+"Arrival Date"+getCheckOutDate()+
                getRoomType()+"Room Type"+getChildrenPerRoom()+"");
    }



}
