Feature: Mentutor Feature Test

  @Tugas
  Scenario: Get all users with authorization
    Given Get all users with authorization
    When Send get all users request
    Then Status code should be 200 OK

    @Tugas
    Scenario: Get all users without authorization
      Given Get all users without authorization
      When Send get all users request
      Then Status code should be 400 Bad Request