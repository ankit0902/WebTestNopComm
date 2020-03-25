package WebTestNopCommerce1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

    public class CameraPhotosPage extends Utils
    {
        //variables,locators
        private By _dropDown = By.id("products-orderby");
        private String priceHighToLOw = "Price: High to Low";
        //user select price high to low from drop down box
        public void useSelectFromPositionPriceHighToLow()

        {
            selectFromDropDownByText(_dropDown, priceHighToLOw);
        }
        public void pricesFromElement() {

            //to catch all web elements into list
            List<WebElement> myList = driver.findElements(By.className("prices"));

            //myList contains all the web elements
            //if you want to get all elements text into array list
            List<String> all_elements_text = new ArrayList<>();

            for (int i = 0; i < myList.size(); i++) {

                //loading text of each element in to array all_elements_text
                all_elements_text.add(myList.get(i).getText());

                //to print directly
                System.out.println(myList.get(i).getText());
            }

        }
    }

