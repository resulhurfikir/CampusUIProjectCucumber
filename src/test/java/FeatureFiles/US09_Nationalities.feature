Feature: Add-Edit-Delete operations in the Nationalities

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | setup         |
      | parameters    |
      | nationalities |

  Scenario: Add a new nationality in the Nationalities Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add nationality which is already added in the Nationalities Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added nationality in the Nationalities Page
    When Send key in Dialog
      | searchName | Ress61 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | editButton |
    And Fill out the form
      | nameInput2 | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Give up deleting the nationality by clicking Cancel on Nationalities Page
    When Send key in Dialog
      | searchName | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | cancelButton |
    Then Verify that the searched 'Ress6161' still on the list

  Scenario: Delete the added nationality in the Nationalities Page
    When Send key in Dialog
      | searchName | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

