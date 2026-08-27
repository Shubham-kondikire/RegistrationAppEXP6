# Experiment 6: Basic Views in Android

## Student Details

**Name:** Shubham Shivaji Kondikire  
**USN:** 25MCAR0102  
**Experiment No.:** 6

---

## Aim

To create an Android application using basic Views such as TextView, EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup.

---

## Objective

The objective of this experiment is to understand and implement different basic Android Views and handle user interactions with these UI components.

The application demonstrates how to collect user input from multiple Views and display the entered information together in the application.

---

## Concept / Technology Used

Android provides different View widgets for designing user interfaces and collecting user input.

### TextView

`TextView` is used to display text information to the user.

### EditText

`EditText` allows the user to enter text or other information.

### Button

`Button` is used to perform an action when the user clicks it.

### ImageButton

`ImageButton` is a button that displays an image and performs an action when clicked.

### CheckBox

`CheckBox` allows the user to select or deselect an option. Multiple CheckBoxes can be selected at the same time.

### ToggleButton

`ToggleButton` provides two states, such as ON and OFF.

### RadioButton

`RadioButton` provides selectable options where the user can choose an option.

### RadioGroup

`RadioGroup` groups multiple RadioButtons together and allows the user to select one option from the group.

---

## Scenario

The application demonstrates a basic user input form.

The user can:

1. Enter their name using an `EditText`.
2. Select the agreement option using a `CheckBox`.
3. Change the state of a `ToggleButton`.
4. Select gender using a `RadioGroup` containing `RadioButton` options.
5. Click the Submit button.
6. View all the entered information together in a result `TextView`.
7. Click the `ImageButton` to display a Toast message.

### Application Flow

```text
                    Android Application
                           |
                           ↓
                    MainActivity
                           |
            +--------------+--------------+
            |              |              |
            ↓              ↓              ↓
        Enter Name     Select Options   Select Gender
        EditText        CheckBox        RadioGroup
                           |
                           ↓
                     Toggle Button
                           |
                           ↓
                     Submit Button
                           |
                           ↓
                    Result TextView
```

---

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle
- Android Emulator or Physical Android Device

---

## Technologies Used

- Kotlin
- Android Views
- TextView
- EditText
- Button
- ImageButton
- CheckBox
- ToggleButton
- RadioButton
- RadioGroup
- Toast
- XML Layout
- Android SDK

---

## Project Folder and File Structure

## Project Folder and File Structure

```text
RegistrationApp/
│
├── app/
│   │
│   ├── src/
│   │   │
│   │   └── main/
│   │       │
│   │       ├── java/
│   │       │   └── com/example/registrationapp/
│   │       │       └── MainActivity.java
│   │       │
│   │       ├── res/
│   │       │   ├── drawable/
│   │       │   │   ├── bg_header.xml
│   │       │   │   ├── bg_register_btn.xml
│   │       │   │   └── circle_profile_bg.xml
│   │       │   │
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   │
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   ├── build.gradle
│   └── proguard-rules.pro
│
├── build.gradle
├── gradle.properties
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

## Important Files and Their Purpose

### MainActivity.kt

`MainActivity.kt` contains the main application logic and handles interactions with all the basic Views.

It processes:

- Name input
- CheckBox selection
- ToggleButton state
- RadioButton selection
- Submit button click
- ImageButton click
- Result display

---

### activity_main.xml

`activity_main.xml` contains the user interface and includes the basic Android Views used in this experiment.

The layout contains:

- TextView
- EditText
- Button
- ImageButton
- CheckBox
- ToggleButton
- RadioButton
- RadioGroup
- Result TextView

---

### AndroidManifest.xml

`AndroidManifest.xml` contains the basic application configuration and declares the application's Activity.

---

### build.gradle.kts

This file contains the Android application build configuration and required dependencies.

---

## Working / Implementation

### 1. Enter Name

The user enters their name using the `EditText`.

Example:

```text
Shubham Shivaji Kondikire
```

---

### 2. Agreement CheckBox

The user can select the agreement CheckBox.

The application records whether the CheckBox is selected or not.

---

### 3. ToggleButton

The ToggleButton allows the user to switch between two states:

```text
ON
OFF
```

The selected state is included in the result.

---

### 4. Gender Selection

The application uses a `RadioGroup` containing RadioButtons.

The user can select one gender option.

Example:

```text
○ Male
○ Female
```

Only one RadioButton can be selected from the RadioGroup.

---

### 5. Submit Button

When the user clicks the Submit button, the application collects all the entered values and displays them together in the result `TextView`.

The result contains:

```text
Name
Gender
Agreement Status
Toggle Status
```

---

### 6. ImageButton

The application contains an ImageButton.

When the user clicks the ImageButton, a Toast message is displayed:

```text
Image Button Clicked!
```

---

# Test Cases

## Test Case 1: Fill Form and Submit

### Test Objective

To verify that the application correctly collects input from different Views and displays the result.

### Test Steps

1. Launch the application.
2. Enter the name in the EditText.
3. Select the agreement CheckBox.
4. Turn the ToggleButton ON.
5. Select Male using the RadioButton.
6. Click the Submit button.
7. Observe the result section.

### Expected Result

The Result TextView should correctly display:

- Entered name
- Selected gender
- Agreement status
- Toggle status

### Actual Result

The entered values were displayed correctly in the result section.

### Status

**PASS ✅**

---

## Test Case 2: ImageButton Interaction

### Test Objective

To verify that the ImageButton responds correctly when clicked.

### Test Steps

1. Launch the application.
2. Locate the ImageButton.
3. Click the ImageButton.
4. Observe the screen.

### Expected Result

A Toast message should appear:

```text
Image Button Clicked!
```

### Actual Result

The Toast message was displayed successfully.

### Status

**PASS ✅**

---

## Test Case 3: Verify Student Name and USN

### Test Objective

To verify the student's name and USN in the application output.

### Test Data

**Name:** Shubham Shivaji Kondikire  
**USN:** 25MCAR0102

### Test Steps

1. Launch the application.
2. Enter the student's name.
3. Complete the required form inputs.
4. Click Submit.
5. Verify the displayed student information.

### Expected Result

The application should correctly display:

```text
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102
```

### Actual Result

The student's name and USN were verified successfully.

### Status

**PASS ✅**

---

# Output

The application successfully demonstrates the use of basic Android Views including TextView, EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup.

The application collects user input and displays the result after clicking the Submit button.

### Output Screenshot

<img width="720" height="1600" alt="MADEXP6 png" src="https://github.com/user-attachments/assets/78f066fb-c233-4dd0-b98b-8252a3b604cf" />


---

# Steps to Run the Project

1. Open the project in Android Studio.
2. Allow Gradle synchronization to complete.
3. Connect an Android device or start an Android Emulator.
4. Select the application from the Run Configuration.
5. Click the **Run ▶** button.
6. Launch the application.
7. Enter the required information.
8. Select the required options.
9. Click the Submit button.
10. Verify the displayed result.

---

# Requirements

## Hardware Requirements

- Laptop/Desktop
- Android Device or Android Emulator
- USB Cable if using a physical Android device

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle

---

# Learning Outcomes

After completing this experiment, the following concepts were understood:

- TextView
- EditText
- Button
- ImageButton
- CheckBox
- ToggleButton
- RadioButton
- RadioGroup
- Handling user input
- Handling button click events
- Displaying Toast messages
- Displaying dynamic results
- Designing Android UI using XML

---

# Result

The Android application was successfully developed and executed using different basic Android Views.

The application successfully accepts user input, processes the selected options, displays the result, and handles ImageButton interaction.

---

# Conclusion

The experiment successfully demonstrated the use of essential basic Views in Android.

The application uses TextView, EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup to create an interactive user interface.

The experiment also demonstrated how user input from multiple UI components can be collected, processed, and displayed together in the result section.

Thus, the objective of creating an Android application using basic Views was successfully achieved.

---

# Student Information

**Name:** Shubham Shivaji Kondikire  
**USN:** 25MCAR0102

**Experiment:** Experiment 6 – Basic Views in Android

---

# GitHub Repository

**Repository Name:** BasicViewsDemo

**GitHub Link:**

https://github.com/Shubham-kondikire/MADEXP6-main.git

---

# Reference

- Android Developers – Views
- Android Developers – TextView
- Android Developers – EditText
- Android Developers – Buttons
- Android Developers – CheckBox
- Android Developers – RadioButton
- Android Developers – ToggleButton

---

## Author

**Shubham Shivaji Kondikire**

**USN:** 25MCAR0102
