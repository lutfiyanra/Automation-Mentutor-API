@Tugas
Feature: Post Login Mentor
  @login @positive
  Scenario: Post login mentor with valid value
    Given Post login with all valid value as mentor
    When Send request post login
    Then Should return 200 OK
    And Validate post login valid value json schema