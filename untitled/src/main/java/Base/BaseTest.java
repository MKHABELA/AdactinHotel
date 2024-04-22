package Base;

import Pages.LoginPageObject;
import Pages.SearchHotelPageObjects;
import Utilities.PropertyReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeoutException;

import java.net.URL;


public class BaseTest {
    WebDriver driver ;
    protected LoginPageObject loginPageObject;
    protected SearchHotelPageObjects searchHotelPageObjects;
    protected PropertyReader prop = new PropertyReader();

    @BeforeTest
    protected void setup()
    {
        WebDriverManager.chromedriver().setup();// labrary that carries out the management(setup, download or mantain)
        driver = new ChromeDriver();//it allows me to navigate throughout the browser
        driver.manage().window().maximize();// am maximizing the window to fill my screen

       ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(prop.ReadItem("url"));
        loginPageObject = new LoginPageObject(driver);
        searchHotelPageObjects = new SearchHotelPageObjects(driver);


    }
    @AfterTest
    protected void finish()
    {
        System.out.println("browser closing successfully");
        driver.quit();
    }
}
