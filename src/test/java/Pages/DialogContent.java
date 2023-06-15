package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//span[text()='Section']")
    public WebElement section;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement FormAddBtn;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    public WebElement noDisplayMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@data-placeholder='Name']/input")
    public WebElement nameInput;

    @FindBy(xpath = " //ms-text-field/input[@data-placeholder='Name']")
    public WebElement searchName;

    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    public WebElement nameAttestation;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement nameSearch;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "(//tr/td[2])")
    public List<WebElement> myDataOnList;

    @FindBy(tagName = "ms-edit-button")
    public WebElement lastItemEditBtn;

    @FindBy(css = "svg[data-icon='pen-to-square']")
    public WebElement editButton;

    @FindBy(css = "[data-icon='trash-can']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath="//span[text()=' Cancel ']")
    public WebElement cancelButton;

    @FindBy(tagName = "ms-delete-button")
    public WebElement lastItemDeleteBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput2;

    @FindBy(css = "dynamic-view[class='ng-star-inserted']")
    public WebElement dynamicMessage;

    @FindBy(xpath = "//ms-text-field/input")
    public WebElement descriptionInputSearch;

    @FindBy(css = "[formcontrolname='description']>input")
    public WebElement descriptionInput;

    @FindBy(css = "[formcontrolname='code']>input")
    public WebElement integrationInput;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    public WebElement documentNameInput;

    @FindBy(xpath = "((//mat-select[@role='combobox'])[3]//div)[3]")
    public  WebElement stage;

    @FindBy(xpath = "(//div[@role='listbox']//span)[1]")
    public WebElement  studentRegistration;

    @FindBy(xpath = "(//div[@role='listbox']//span)[2]")
    public WebElement  examination;

    @FindBy(xpath = "(//div[contains(@class,'form-field')]//mat-select[@role='combobox'])[2]/div")
    public WebElement fieldType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
    public WebElement optionLogical;

    @FindBy(xpath="(//td[contains(@class,'mat-cell')])[2]")
    public WebElement searchResult;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='capacity']/input")
    public WebElement capacity;

    @FindBy(css="[formcontrolname='order']>input")
    public WebElement order;

    @FindBy(xpath="//span[@class='mat-option-text'] ")
    public WebElement nextGrade;

    @FindBy(xpath = "//tr[@role='row']/td[2]")
    public List<WebElement> nameList;

    @FindBy(css = "[role='columnheader']")
    public WebElement orderSearchName;

    public WebElement getSearchResult() {
        return searchResult;
    }

    public WebElement getWebElement(String element) {
        switch (element) {
            case "addButton": return addButton;
            case "saveButton": return saveButton;
            case "nameInput": return nameInput;
            case "nameAttestation": return nameAttestation;
            case "codeInput": return codeInput;
            case "section": return section;
            case "shortName": return shortName;
            case "FormAddBtn": return FormAddBtn;
            case "lastItemEditBtn": return lastItemEditBtn;
            case "lastItemDeleteBtn": return lastItemDeleteBtn;
            case "deleteDialogBtn": return deleteDialogBtn;
            case "searchButton": return searchButton;
            case "editButton": return editButton;
            case "deleteButton": return deleteButton;
            case "deleteConfirmButton": return deleteConfirmButton;
            case "nameInput2":return nameInput2;
            case "dynamicMessage": return dynamicMessage;
            case "nameSearch" : return nameSearch;
            case "descriptionInputSearch" : return descriptionInputSearch;
            case "priorityCode" : return priorityCode;
            case "toggleBar" : return toggleBar;
            case "integrationInput" : return integrationInput;
            case "descriptionInput" : return descriptionInput;
            case "fieldType" : return fieldType;
            case "optionLogical" : return optionLogical;
            case "searchName" : return searchName;
            case "cancelButton" : return cancelButton;
            case "capacity" : return capacity;
            case "order" : return order;
            case "nextGrade" : return nextGrade;
            case "documentNameInput" : return documentNameInput;
            case "stage" : return stage;
            case "studentRegistration" : return studentRegistration;
            case "examination" : return examination;
        }
        return null;
    }
    public List<WebElement> getMyDataOnList() {
        return myDataOnList;
    }
}
