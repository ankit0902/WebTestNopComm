package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class ReferProduct extends Utils {
    //variable
    private By _clickOnEmailFriend  = By.xpath("//input[@value='Email a friend']");

    //click on email button
    public void emailProduct()
    {
        clickOnElement(_clickOnEmailFriend);
    }
}

