package Steps;

import Base.BaseTest;
import Pages.SearchHotelPageObjects;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

public class Run extends BaseTest {

    ExtentTest test;
    @Test(priority = 1,enabled=true,description="On LoginToTheSystem TestCase")
    public void run() throws InterruptedException {

        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("extentReport.html");

        loginPageObject.EnterUsrName(prop.ReadItem("username"));
        Thread.sleep(4000);
        loginPageObject.EnterPassword(prop.ReadItem("passwaord"));
        Thread.sleep(4000);
        loginPageObject.ClickLogin();
        Thread.sleep(4000);
        searchHotelPageObjects.SelectLocation();
        Thread.sleep(5000);
        searchHotelPageObjects.SelectHotel();
        Thread.sleep(5000);
        searchHotelPageObjects.RoomType();
        Thread.sleep(5000);
        searchHotelPageObjects.NumRooms();
        Thread.sleep(5000);
        searchHotelPageObjects.SelectDate("10/08/2025");
        Thread.sleep(5000);
        searchHotelPageObjects.CheckOutDate("11/08/2025");
        Thread.sleep(5000);
        searchHotelPageObjects.NumberOfAdults();
        Thread.sleep(5000);
        searchHotelPageObjects.NumberOfChildren();
        Thread.sleep(500);
        searchHotelPageObjects.getClickSearchButton().click();


        Thread.sleep(5000);



}}
