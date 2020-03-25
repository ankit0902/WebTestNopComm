package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class WishListPage extends Utils {

    private By _emailFriend = By.xpath("//input[contains(@value,'Email ')]");

    //method to click on Email button
    public void clickOnEmail()
    {
        clickOnElement(_emailFriend);

    }

}
