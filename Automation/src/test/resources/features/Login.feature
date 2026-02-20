Feature: Login

  @smoke @login
  Scenario: TC-Login-01 — Login exitoso con credenciales válidas
    Given el usuario se encuentra en la página de login
    When ingresa el username y password válidos
      | username    | password    |
      | qa_user_002 | Qa#12345678 |
    And presiona el botón Submit
    Then el usuario ingresa correctamente al sistema