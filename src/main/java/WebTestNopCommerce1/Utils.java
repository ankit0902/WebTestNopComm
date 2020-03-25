package WebTestNopCommerce1;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage
{
    //method to click on element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //method to enter text
    public static void sendKeys(By by ,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //method to get text from url
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //time stamp method to create unique number
    public static String timeStamp()
    {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    //method for explicit wait
    public static void waitForClickable(By by,int time)
    {
        WebDriverWait Wait = new WebDriverWait(driver,time);
        Wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //method to get text from element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //Assert method to see Expected = Actual
    public static void assertTextMessage(String message ,String expected,By by)
    {
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected,"Failed");
    }

    //method to check url contains specific text
    public static void urlContains(String text)
    {
        driver.getPageSource().contains(text);
    }


    //for Time dealy
    public static void timeDelay(int time){
        try {
            Thread.sleep(time *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //method to select from drop down by text
    public void selectFromDropDownByText(By by ,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //to scroll and click
    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    //To select from drop down box by value
    public static void selectFromDropdownByValue(By by,String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }


    //To select from drop down box by text
    public static void selectFromDropdownByText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //To get text and verify from list
    public void getTextFromListAndVerify(By by,String c) {
        //creating obj of soft assert class->for multiple values check
        SoftAssert softAssert = new SoftAssert();
        //creating list and finding value
        List<WebElement> allProduct = driver.findElements(by);
        //for each loop for product comparision
        for (WebElement product : allProduct) {
            //to print price
            System.out.println(product.getText());
            //to verify sign
            softAssert.assertTrue(product.getText().contains(c),"price does not contain "+ c);
        }
        softAssert.assertAll();
    }
        public static void takeScreenShot(String fileName) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // The below mention will save the screenshot in a D-drive with test method name
            try {
                FileUtils.copyFile(scrFile, new File("src/test/Resources/Screenshot/" + fileName + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}