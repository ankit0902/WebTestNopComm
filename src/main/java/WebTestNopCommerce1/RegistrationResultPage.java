package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {

    private String expected = "Your registration complete";
    private By _actualRegistrationSuccessMessage = By.cssSelector("div.result");
    public void verifyUserSeeRegistrationSuccessMessage()
    {   //verify user is on RegistrationResult page
        assertURL("registerresult");

        //Assert to check registration complete message
        assertTextMessage("pass",expected,_actualRegistrationSuccessMessage);

    }
}
