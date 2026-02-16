# language Es
Feature: Registro de usuario
  Como visitante del sistema
  Quiero registrarme en la plataforma
  Para poder acceder con una cuenta propia

  @registro @smoke @TC01
  Scenario: TC-01 — Registro exitoso con datos válidos

    Given el usuario se encuentra en la página de registro

    When completa el formulario de contacto con:
      | nombre | apellido | telefono   | correoElectronico   |
      | QA     | User     | 3001234567 | qa.user001@mail.com |

    And completa la información postal con:
      | Direccion        | Ciudad    | Estado       | CodigoPostal | Pais     |
      | Calle 123 #45-67 | GUATEMALA | Cundinamarca | 110111       | COLOMBIA |

    And completa la información del usuario con:
      | Username    | Password    | ConfirmPassword |
      | qa_user_001 | Qa#12345678 | Qa#12345678     |

    And presiona el botón Enviar
    Then se muestra un mensaje de confirmación

