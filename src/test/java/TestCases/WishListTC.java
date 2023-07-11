package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class WishListTC extends Base {
    @Test(description = "add items in wishlist and search in WishList")
    public void searchForItemInWishListTC01() {
        logInPage = homePage.goToLogInPage();
        logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password")
        );
        computersPage = homePage.gotToComputersPage();
        computersPage.chooseNotebookCategory();
        computersPage.addItemsToWishList();
        //verify that item added to wish list
        computersPage.verifyThatItemAddToWishList();
        //// go to wish list page and scroll to final element
        wishListPage = computersPage.goToWishList();
        wishListPage.scrollToItem();

    }

}
