Feature: Admin Update User

  @positive
  Scenario: Update user with valid data and authorization
    Given Update user with valid data and authenticated
    When Send update request
    Then Status code should be 201 Created
