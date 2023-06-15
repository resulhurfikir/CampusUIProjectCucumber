Feature: Add-Edit-Delete operations in the Grade Levels

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | setup       |
      | parameters  |
      | gradeLevels |

  Scenario: Add a new Grade Level in the Grade Levels
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
      | order      | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Grade Level which is already added in the Grade Levels Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
      | order      | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Grade Level in the Grade Levels Page
    When Search name and click on the edit button
    And Fill out the form
      | nameInput2 | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the edited Grade Level in the Grade Levels Page
    When Search name and delete the Location
    Then Verify the notification message that is successfully

  Scenario: Delete the Grade Level which is already deleted in the Grade Levels Page
    Then Verify that the location is already deleted



