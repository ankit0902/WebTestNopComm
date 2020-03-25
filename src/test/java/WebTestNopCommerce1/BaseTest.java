package WebTestNopCommerce1;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import java.text.SimpleDateFormat;
import java.util.Date;


public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());


    @BeforeMethod
    public void openBrowser ()
    {
        // browserSelector.openBrowser();
        browserSelector.openBrowser();
    }


    @AfterMethod

    public void closeBrowser(ITestResult result) {
        if (!result.isSuccess()){
            takeScreenShot(result.getName()+timeStamp());
        }
        browserSelector.CloseBrowser();
    }
    }



