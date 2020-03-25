package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{

        //variables
        private By _desktop = By.xpath("//li[@class='inactive']//a[contains(@href,'desktops')]");
        public void verifyUserOnComputerPage()
        {
            assertURL("computers");
        }


        //click on desktop
        public void clickOnDesktop()
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickOnElement(_desktop);
        }
    }



