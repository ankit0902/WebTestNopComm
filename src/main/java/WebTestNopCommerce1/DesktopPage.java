package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class DesktopPage extends Utils {

      //variable,locators
        private By _clickOnItemToRefer = By.xpath("//div[@class='picture']//a//img[contains(@title,'VANQUISH 3')]");
        //method to verify user is on desktop page

        public void verifyUserIsOnDesktopPage()
        {
            assertURL("desktops");
        }

        //user click on item to refer
        public void userSelectItemToReferFriend ()

        {
            clickOnElement(_clickOnItemToRefer);

        }


    }


