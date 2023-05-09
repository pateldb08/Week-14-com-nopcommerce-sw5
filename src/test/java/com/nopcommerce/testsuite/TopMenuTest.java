package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {
        homePage.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = computerPage.verifyComputerText();
        Assert.assertEquals(actualMessage, expectedMessage, "Computers page not display");
    }
}

