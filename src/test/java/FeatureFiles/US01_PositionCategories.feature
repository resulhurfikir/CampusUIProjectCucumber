Feature: Add-Edit-Delete operations in the Position Categories

  Background:
    Given Navigate to Campus
    And Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | humanResources     |
      | hRSetupArrow       |
      | positionCategories |

  Scenario: As an Admin User I should be able to Add Position Categories Under Human Resources Setup
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: As an Admin User I should be able to Add Position Categories Under Human Resources Setup but Negative
    When  Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: As an Admin User I should be able to Edit Position Categories Under Human Resources Setup
    When Fill out the form
      | searchName | Ress61 |
    And Click on the stale element in Dialog
      | searchButton |
      | editButton   |
    And Fill out the form
      | nameInput2 | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario:As an Admin User I should be able to Delete Position Categories Under Human Resources Setup
    When Fill out the form
      | searchName | Ress6161 |
    And Click on the stale element in Dialog
      | searchButton |
      | deleteButton |
    And Click on the element in Dialog
      | deleteDialogBtn |
    Then Verify the notification message that is successfully

  Scenario: As an Admin User I should be able to Delete Position Categories Under Human Resources Setup but negative
    When Fill out the form
      | searchName | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”
