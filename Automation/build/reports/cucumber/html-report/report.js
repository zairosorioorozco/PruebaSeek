$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RegistrarUsuario.feature");
formatter.feature({
  "name": "Registro de usuario",
  "description": "  Como visitante del sistema\n  Quiero registrarme en la plataforma\n  Para poder acceder con una cuenta propia",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC-01 — Registro exitoso con datos válidos",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@registro"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "name": "el usuario se encuentra en la página de registro",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterDefinitions.el_usuario_se_encuentra_en_la_página_de_registro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completa el formulario de contacto con:",
  "rows": [
    {
      "cells": [
        "nombre",
        "apellido",
        "telefono",
        "correoElectronico"
      ]
    },
    {
      "cells": [
        "QA",
        "User",
        "3001234567",
        "qa.user001@mail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "RegisterDefinitions.completa_el_formulario_de_contacto_con(ContactData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completa la información postal con:",
  "rows": [
    {
      "cells": [
        "Direccion",
        "Ciudad",
        "Estado",
        "CodigoPostal",
        "Pais"
      ]
    },
    {
      "cells": [
        "Calle 123 #45-67",
        "GUATEMALA",
        "Cundinamarca",
        "110111",
        "COLOMBIA"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterDefinitions.completa_la_información_postal_con(PostalData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completa la información del usuario con:",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "ConfirmPassword"
      ]
    },
    {
      "cells": [
        "qa_user_001",
        "Qa#12345678",
        "Qa#12345678"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterDefinitions.completa_la_información_del_usuario_con(UserData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona el botón Enviar",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterDefinitions.presiona_el_botón()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestra un mensaje de confirmación",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterDefinitions.se_muestra_un_mensaje_de_confirmación()"
});
formatter.result({
  "status": "passed"
});
});