Feature: Add-Edit-Delete operations in the Document Types

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | setup         |
      | parameters    |
      | documentTypes |

  Scenario: Add a new  Document Types in the Document Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | documentNameInput | Ress61 |
    And Select an element on Form Document Types
      | stage | studentRegistration |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a new  Document Types in the Document Page but negative
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | documentNameInput | Ress61 |
    And Select an element on Form Document Types
      | stage | studentRegistration |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Admin User should  be able to edit same data Document Types
    When Fill out the form
      | nameSearch | Ress61 |
    And Click on the element in Dialog
      | searchButton |
      | editButton   |
    And Fill out the form
      | documentNameInput | Ress6161 |
    And Select an element on Form Document Types
      | stage | examination |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Admin User should  be able to delete same data Document Types
    When Fill out the form
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton        |
      | deleteButton        |
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

  Scenario: Admin User should not  be able to delete same data Document Types
    When Send key in Dialog
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”