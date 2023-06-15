Feature: Add-Edit-Delete operations in the Positions

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | positions      |

  Scenario: Add a new Position in the Positions Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Position which is already added in the Positions Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Position in the Positions Page
    When Send key in Dialog
      | nameSearch | Ress61 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | editButton |
    And Fill out the form
      | nameInput2 | Ress6161 |
      | shortName  | Ress61   |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the added Position in the Positions Page
    When Send key in Dialog
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the Position which is already deleted in the Positions Page
    When Send key in Dialog
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”



