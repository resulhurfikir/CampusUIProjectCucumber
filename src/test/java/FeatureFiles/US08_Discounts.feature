Feature: Add-Edit-Delete operations in the Discounts

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | setup      |
      | parameters |
      | discounts  |

  Scenario: Add a new Discount in the Discounts Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | descriptionInput | Ress61 |
      | integrationInput | 61     |
      | priorityCode     | 61     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Discount which is already added in the Discounts Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | descriptionInput | Ress61 |
      | integrationInput | 61     |
      | priorityCode     | 61     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Discount in the Discount Page
    When Send key in Dialog
      | descriptionInputSearch | Ress61 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | editButton |
    And Fill out the form
      | descriptionInput | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the added Discount in the Discounts Page
    When Send key in Dialog
      | descriptionInputSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the Discount which is already deleted in the Discounts Page
    When Send key in Dialog
      | descriptionInputSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”