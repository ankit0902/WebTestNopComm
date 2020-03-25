package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    //variables
    private By _enteEemail = By.className("email");
    String emailAddress = "ankit.dhanorkar@gmail.com";
    private By _login = By.xpath("//input[@value='Log in']");
    private By _password = By.id("Password");
    String password ="Abcd1234";



    public void userEnterLoginDetails()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //user enter email address
        sendKeys(_enteEemail,emailAddress);
        //enter password
        sendKeys(_password,password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click on login
        clickOnElement(_login);
    }

}
