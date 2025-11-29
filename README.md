# QA-Automation
Automation test cases for MPP Web Portal

## Overview
This project is a **Selenium Hybrid Framework** designed for scalable and maintainable test automation.
It is built using the **Page Object Model (POM)** design pattern with **TestNG** and **Maven**.

Pre-requisites :
Download Java 8 or above version (Mostly try with 1.8.0_301)
Checked java version with this command java -version
Download IntelliJ Community Edition 2021.3.2 or above
Download Java 8 or above version (Mostly try with 1.8.0_301)
Checked java version with this command java -version
Download IntelliJ Community Edition 2021.3.2 or above

## Getting Started
#Clone the Repository
git clone https://github.com/DEV-PPCP/QA-Automation.git
cd QA-Automation

### Open in IntelliJ IDEA
1. Launch **IntelliJ IDEA**
2. Go to `File > Open`
3. Select the cloned project folder
4. IntelliJ will detect and import Maven dependencies automatically
5. 
## Project Structure
```
src
├── main
│   ├── java          # Core framework classes (Base, Utilities, Drivers)
│   └── resources     # Config files, Reports directory
└── test
    └── java
        └── selenium
            └── MyPhysicianPlan   # Test cases and Page Object classes
```
### From IntelliJ
1. Navigate to:
   ```
   src/test/java/selenium/MemberRegistrationMyPhysicianPlan
   src/test/java/selenium/ValidationsChecksRegistration
   ```
2. Right-click on the test class.
3. Select **Run 'MyPhysicianPlan'**.

## Reports
After test execution, open the following report for results:
```
src/main/resources/report/Automation.html