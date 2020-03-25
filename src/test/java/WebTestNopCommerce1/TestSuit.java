package WebTestNopCommerce1;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest {


    //created objects for class to call methods
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JeweleryPage jeweleryPage= new JeweleryPage();
    JeweleryComparisionPage jeweleryComparisionPage = new JeweleryComparisionPage();
    WishListPage wishListPage = new WishListPage();
    ComputerPage computerPage= new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    EmailWishLIstPage emailWishList = new EmailWishLIstPage();
    ElectornicPage electronicPage = new ElectornicPage();
    CameraPhotosPage cameraPhotosPage = new CameraPhotosPage();
    LoginPage loginPage = new LoginPage();
    ReferProduct referProduct = new ReferProduct(); //To create object of book page
    BookPage bookPage=new BookPage();
    //To create object of cart page
    CartPage cartPage=new CartPage();
    //To create object of checkout as guest
    CheckoutAsGuest checkoutAsGuest=new CheckoutAsGuest();
    //To create object of fill checkout details
    FillCheckoutDetails fillCheckoutDetails=new FillCheckoutDetails();
    //To create object of checkout result
    CheckoutResult checkoutResult=new CheckoutResult();
    //To create object of news page
    NewsPage newsPage=new NewsPage();
    //To create object of new online store open page
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage=new NewOnlineStoreIsOpenPage();



    //******************************************End of TestCase *******************************************************

    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        //click on Register Button
        homePage.clickOnRegisterButton();
        //verify user on Registration page
        registrationPage.verifyUserIsOnRegistrationPage();
        //fill up registration details
        registrationPage.userEnterRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully()
    {
        //calling method to click on jewelery
        homePage.clickOnJewelery();
        jeweleryPage.verifyUserOnJeweleryPage();
        //calling method to compare product from jeweleryPage
        jeweleryPage.chooseProductToCompare();
        jeweleryComparisionPage.verifyUserIsOnJeweleryComparisionPage();

    }

    //*************************************End of TestCase**********************************************************
    @Test
    public void registeredUserShouldAbleToReferProductToFriend()
    {
        homePage.clickOnLogin();
        loginPage.userEnterLoginDetails();

        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        //calling method to click on email to friend
        referProduct.emailProduct();

        emailWishList.enterEmailAddressOfFriend();
        emailWishList.sendEmailToFriend();
        emailWishList.verifyUserSeeEmailSentMessage();

        //*************************************End of TestCase*******************************************************
    }
    @Test
    public void notRegisteredUserCanNotReferItemToFriend()
    {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        referProduct.emailProduct();
        emailWishList.enterEmailAddressOfFriend();

        //calling method to click on send email
        emailWishList.sendEmailToFriend();
        //verify user see error message
        emailWishList.verifyNotRegisterUserSeeErrorMessage();
    }

    //****************************End of TestCase*******************************************************************
    @Test
    public void userShouldAbleToSortProductHighToLowByPrice()
    {
        homePage.clickOnElectronics();
        electronicPage.clickOnCameraAndPhotos();
        cameraPhotosPage.useSelectFromPositionPriceHighToLow();
        cameraPhotosPage.pricesFromElement();

    }

    //Guest user should able to add new comment on nope commerce website

    @Test
    public void userShouldAbleToAddNewCommentOnNopCommerceWebsite()
    {
        //To click on view news archive
        homePage.ClickOnViewNewsArchive();
        //To click on details
        newsPage.clickOnDetails();
        //To add new comment
        newOnlineStoreIsOpenPage.addNewComment();
        //To verify New comment added
        newOnlineStoreIsOpenPage.verifySuccessMessageOfComment();

    }

//********************************End of TestCase *********************************************************************




    //User should able to change currancy ----------------
    @Test
    public void userShouldAbleToChangeCurrency()
    {
        //To click on currency euro
        homePage.clickCurrencyEuro();
        //To verify Euro sign
        homePage.VerifyPriceHasEuroSign();
        //To click on currency dollar
        homePage.clickCurrencyDollar();
        //To verify Dollar sign
        homePage.VerifyPriceHasDollarSign();

    }

//************************************End of Testcase ***************************************************************


//Verify add to cart button is present on all featured product

    @Test
    public void verifyAddToCartButtonIsPresentOnAllFeaturedProducts()
    {
        //To verify add to cart is present in all featured products
        homePage.verifyAddToCartPresentOnHomepageFeaturedItems();

    }


//************************************End of TestCAse ******************************************************************

}



