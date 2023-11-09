Feature: Login Functionality
  Scenario: Successful Login
    Given the user is on the login screen
    When the user fills in the "CPF" field with "valid_cpf"
    And the user fills in the "Senha" field with "valid_password"
    And the user clicks the "Entrar" button
    Then the system should redirect to the menu screen

  Scenario: Invalid Login
    Given the user is on the login screen
    When the user fills in the "CPF" field with "invalid_cpf"
    And the user fills in the "Senha" field with "invalid_password"
    And the user clicks the "Entrar" button
    Then the system should display an error message
