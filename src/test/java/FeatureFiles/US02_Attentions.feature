Feature: Add-Edit-Delete operations in the Attentions

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

  Scenario: Add a new Attestation in the Attestations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameAttestation | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Attestation which is already added in the Attestations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameAttestation | Ress61 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Attestation in the Attestations Page
    When Fill out the form
      | nameSearch | Ress61 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | editButton |
    And Fill out the form
      | nameAttestation | Ress6161 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the added Attestation in the Attestations Page
    When Fill out the form
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the Attestation which is already deleted in the Attestations Page
    When Fill out the form
      | nameSearch | Ress6161 |
    And Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”