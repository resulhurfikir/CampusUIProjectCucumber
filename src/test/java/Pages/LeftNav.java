package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement schoolDepartments;

    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement schoolLocations; // merve d ekledi

    @FindBy(xpath = "(//span[text()='Setup']/../fa-icon)[2]")
    private WebElement SetupArrow;

    @FindBy(xpath = "(//span[text()='School Setup']/../fa-icon)[2]")
    private WebElement schoolSetupArrow;

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement hRSetup;

    @FindBy(xpath = "(//span[text()='Setup'])[3]/../fa-icon[2]")
    public WebElement hRSetupArrow;

    @FindBy(xpath = "//span[text()='Attestations']")
    public WebElement attestations;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement educationSetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCat;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccount;

    @FindBy(xpath = "//span[text()='Document Types']")
    public WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    public WebElement getWebElement(String element) {

        switch (element) {
            case "setup": return setup;
            case "schoolSetup": return schoolSetup;
            case "schoolDepartments": return schoolDepartments;
            case "SetupArrow": return SetupArrow;
            case "schoolSetupArrow": return schoolSetupArrow;
            case "humanResources": return humanResources;
            case "hRSetup": return hRSetup;
            case "hRSetupArrow": return hRSetupArrow;
            case "attestations": return attestations;
            case "positions": return positions;
            case "discounts": return discounts;
            case "parameters": return parameters;
            case "fields": return fields;
            case "schoolLocations": return schoolLocations;
            case "gradeLevels": return gradeLevels;
            case "nationalities": return nationalities;
            case "documentTypes": return documentTypes;
            case "positionCategories": return positionCategories;
        }
        return null;
    }
}
