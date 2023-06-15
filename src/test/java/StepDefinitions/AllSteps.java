package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.List;

public class AllSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }


    @And("Click on the leftnav")
    public void clickOnTheLeftnav(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = ln.getWebElement(btn);
            ln.clickFunction(e);
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = dc.getWebElement(btn);
            dc.clickFunction(e);
        }
    }

    @And("Fill out the form")
    public void fillOutTheForm(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(e, items.get(i).get(1));
        }
    }

    @Then("Verify the notification message that is successfully")
    public void verifyTheNotificationMessageThatIsCreatedSuccessfully() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"),"success");
    }

    @Then("Verify the notification message that is already exist")
    public void verifyTheNotificationMessageThatIsAlreadyExist() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"),"already");
    }

    @When("Send key in Dialog")
    public void sendKeyInDialog(DataTable dt) {
        List<List<String>> items= dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("Click on the stale element in Dialog")
    public void clickOnTheStaleEditButtonInDialog(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = dc.getWebElement(btn);
            dc.waitUntilClickable(dc.getWebElement("searchButton"));
            dc.clickFunction(e);
        }
    }

    @Then("Verify that notification messages “There is no data to display”")
    public void verifyThatNotificationMessagesThereIsNoDataToDisplay() {
        dc.verifyContainsTextFunction(dc.noDisplayMessage, "There is no data to display");
    }

    @And("Select an element on Form")
    public void selectAnElementOnForm(DataTable dt) {
        List<List<String>> dropDown = dt.asLists(String.class);
        for (int i = 0; i < dropDown.size(); i++) {
            WebElement e = dc.getWebElement(dropDown.get(i).get(0));
            dc.clickFunction(e);
            dc.moveToElementAndClick(dc.getWebElement(dropDown.get(i).get(1)));
        }
    }

    @Then("Verify that the searched {string} still on the list")
    public void verifyThatTheSearchedNameStillOnTheList(String str) {
        Assert.assertEquals(dc.getSearchResult().getText(), str);
    }

    @When("Search name and click on the edit button")
    public void searchNameAndClickOnTheEditButton() {
        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Ress61")) {
                dc.clickFunction(dc.editButton);
            }
        }
    }

    @When("Search name and delete the Location")
    public void searchNameAndClickOnTheDeleteButton() {
        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Ress6161")) {
                dc.clickFunction(dc.deleteButton);
                dc.clickFunction(dc.deleteConfirmButton);
            }
        }
    }

    @Then("Verify that the location is already deleted")
    public void verifyThatTheLocationIsAlreadyDeleted() {
        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Ress6161")) {
                Assert.fail("The location is still on the list");
            }
        }
    }

    @And("Select an element on Form Document Types")
    public void selectAnElementOnFormDT(DataTable dt) {
        List<List<String>> dropDown = dt.asLists(String.class);
        for (int i = 0; i < dropDown.size(); i++) {
            WebElement e = dc.getWebElement(dropDown.get(i).get(0));
            dc.clickFunction(e);
            dc.moveToElementAndClick(dc.getWebElement(dropDown.get(i).get(1)));
        }
        Actions actions=new Actions(GWD.getDriver());
        actions.sendKeys(Keys.ESCAPE).build().perform();
    }
}