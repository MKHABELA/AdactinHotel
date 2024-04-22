package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion.*;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class LoginPageObject {
    WebDriver driver;
    public LoginPageObject(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);//helps with inspections


    }

    @FindBy(id ="username")
    private WebElement usernameTXT;
    @FindBy(id ="password")
    private WebElement passwordTXT;

    @FindBy(id ="login")
    private WebElement loginBtn;

    public WebElement getUsernameTXT()
    {
       return usernameTXT;
    }
    public WebElement getpasswordTXT()
    {
        return passwordTXT;
    }
    public WebElement getLoginBtn()
    {
        return loginBtn;
    }

    public void EnterUsrName(String username)
    {
        if (getUsernameTXT().isDisplayed())
        {
            System.out.println("UuserName Found");
            getUsernameTXT().sendKeys(username);
          assertTrue(true);
        }
        else
        {
            System.out.println("Useruname not Found");
         fail();

        }
    }
    public void EnterPassword(String password)
    {
        if (getpasswordTXT().isDisplayed())
        {
            System.out.println("Incorrect Password");
            getpasswordTXT().sendKeys(password);
            assertTrue(true);
        }
        else
        {
            System.out.println("Password not Found");
            fail();

        }
    }
    public void ClickLogin()
    {
        if (getLoginBtn().isDisplayed())
        {
            System.out.println("Login Found");
            getLoginBtn().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Button not Found");
            fail();

        }
    }
}
