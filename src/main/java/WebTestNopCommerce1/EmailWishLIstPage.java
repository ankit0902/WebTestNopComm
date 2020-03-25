package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class EmailWishLIstPage extends Utils {
    private By _friendEmail = By.id("FriendEmail");
    private By _sendEmail = By.name("send-email");
    String expected = "Your message has been sent." ;
    private By _actual =By.className("result");
    String  _notRegisterExpected = "Enter your email";
    private By _notRegisterActual = By.id("YourEmailAddress-error");

    //enter friend's email address
    public void enterEmailAddressOfFriend()
    {
        sendKeys(_friendEmail,"ankit.dhanorkar201@gmail.com ");
    }
    //click on send email key
    public void sendEmailToFriend(){
        clickOnElement(_sendEmail);
    }

    //Assert to verify registered user see email sent message
    public void verifyUserSeeEmailSentMessage(){
        assertTextMessage("Email not send",expected,_actual);
    }

    //Assert to check non registered user see message
    public void verifyNotRegisterUserSeeErrorMessage()
    {
        assertTextMessage("fail",_notRegisterExpected,_notRegisterActual);
    }



}
