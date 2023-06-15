Feature: Add-Edit-Delete operations in the Locations

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | setup           |
      | schoolSetup     |
      | schoolLocations |

  Scenario: Add a new Location in the Locations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
      | capacity   | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Location which is already added in the Locations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Ress61 |
      | shortName  | Ress   |
      | capacity   | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Location in the Locations Page
    When Search name and click on the edit button
    And Fill out the form
      | nameInput2 | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the edited Location in the Locations Page
    When Search name and delete the Location
    Then Verify the notification message that is successfully

  Scenario: Delete the Location which is already deleted in the Locations Page
    Then Verify that the location is already deleted


























