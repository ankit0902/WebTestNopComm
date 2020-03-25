package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = By.cssSelector("input#FirstName");
    private By _lastName = By.cssSelector("input#LastName");
    private By _email = By.id("Email");
    private By _registerClickable = By.id("register-button");
    private By _password = By.id("Password");
    private By _confirmPassword = By.cssSelector("input#ConfirmPassword");
    private By _registerButton = By.name("register-button");

    private String firstName = "Ankit";
    private String lastName = "Dhanorkar";
    private String timeStamp = timeStamp();
    private String password = "Abcd123";
    private String confirmPassword = "Abcd123";

    //verify user on registration page
    public void verifyUserIsOnRegistrationPage()
    {
        assertURL("register");
    }


    public void userEnterRegistrationDetails()

    {   waitForClickable(_registerClickable,40);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //user enter all registration details
        sendKeys(_firstName, firstName);
        sendKeys(_lastName ,lastName);
        sendKeys(_email,"abcd"+timeStamp+"@gmail.com");
        sendKeys(_password,password);
        sendKeys(_confirmPassword,confirmPassword);
        clickOnElement(_registerButton);

    }

}
