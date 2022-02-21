# Automate_Android_Calculator-Appium

A testing repository for Native Android Calculator application is written in Java using Appium.

1. [Technology](#technology)
2. [Prerequisite](#prerequisite)
3. [How to run this project](#How-to-run-this-project)

### Technology
- Java 11
- Gradle
- Appium
- JUnit

### Prerequisite
Before executing tests, the following software needs to be set up:
1. jdk 1.8 or above
2. Android SDK and tools
3. Appium server

All the paths for libraries should be added to ```PATH``` system environment variable:
- ANDROID_HOME
- JAVA_HOME
- GRADLE_HOME


### How to run this project
1. Clone the project
2. Start the appium server
3. Connect android device to computer with USB
4. Set the debug mode on from android device
5. Allow connection from android device
6. Make sure the android device is unlocked
7. Open terminal from the directory
8. Give following command:
```
gradle clean test
```
