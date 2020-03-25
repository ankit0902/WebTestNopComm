package WebTestNopCommerce1;

import org.openqa.selenium.By;

public class JeweleryPage extends Utils {

    private By _firstJewelery = By.xpath("//div[@data-productid='40']//div[@class='details']//div//input[contains(@value,'compare ')]");
    private By _secondJewelery = By.xpath("//input[contains(@title,'compare ') and contains(@onclick,'41')]");
    private By _comparisionButton = By.xpath("//a[contains(text(),'comparison')]");
    private By _itemToRefer = By.xpath("//input[contains(@onclick,'41/2')]");
    private By _whishListButton =By.xpath("//a[contains(text(),'wishlist')]");

    //verify user on jewelery page
    public void verifyUserOnJeweleryPage()
    {
        assertURL("jewelry");
    }

    public void chooseProductToCompare()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //choose first product to compare
        clickOnElement(_firstJewelery);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //choose second product to compare
        clickOnElement(_secondJewelery);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click on comparision button from green navigation bar
        clickOnElement(_comparisionButton);
    }
}
