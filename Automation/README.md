# Automation Project (Serenity BDD + Cucumber + Selenium)
Framework de automatización E2E basado en **Serenity BDD**, **Cucumber (Gherkin)** y **Selenium WebDriver** con **Java + Gradle**.  
Incluye patrón **Page Object**, capa de **Steps** y utilidades reutilizables para validaciones.

---

## ✅ Tech Stack

- **Java**
- **Gradle**
- **Serenity BDD**
- **Cucumber**
- **Selenium WebDriver**
- **Firefox / Chrome**
- **Gherkin (.feature)**

---

## Tech Stack

- Java 11+
- Gradle
- Serenity BDD
- Cucumber
- Selenium WebDriver
- Gherkin
- Firefox / Chrome

---

## Ejection
./gradlew clean test

## Generar Reporte
./gradlew aggregate



## 📁 Estructura del proyecto

```bash
OpenCardTest/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ com.demo.automation.page/
│  │  │     ├─ base/                 # BasePage y comportamientos comunes
│  │  │     ├─ models/               # Modelos de datos (ContactData, PostalData, UserData)
│  │  │     ├─ pageobjet/            # Page Objects (ej: RegisterHomePage)
│  │  │     ├─ steps/                # Steps de negocio (RegisterHomePageStep)
│  │  │     └─ utils/                # Utilidades (SpecialMetods)
│  │  └─ resources/
│  │     ├─ chrome/                  # Drivers o recursos para Chrome
│  │     └─ firefox/                 # Drivers o recursos para Firefox (geckodriver.exe)
│  └─ test/
│     ├─ java/
│     │  └─ com.demo.automations/
│     │     ├─ runner/               # Runner Cucumber/Serenity
│     │     └─ stepdefinitions/      # Step Definitions (RegisterDefinitions)
│     └─ resources/
│        ├─ features/                # Features Gherkin
│        │  └─ RegistrarUsuario.feature
│        └─ ...
├─ build.gradle
├─ serenity.properties
├─ gradlew / gradlew.bat
└─ build/reports/serenity            # Reportes
