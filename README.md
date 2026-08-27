Experiment 6: Working with Basic UI Widgets in Android (User Registration Form)

Student Details
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102
Experiment No.: 6

Aim
To develop an Android application that demonstrates the use of basic UI widgets by designing a User Registration form.

Objective
The objective of this experiment is to understand how to use basic Views such as EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup, and to handle user input and validation using event listeners.

Concept / Technology Used
UI Widgets
Android provides a set of basic Views that allow users to enter data and make selections:

EditText – used to accept text input such as name, email, and password.
Button / ImageButton – used to trigger actions such as registration or image selection.
CheckBox – used for a single yes/no choice (e.g., accepting Terms and Conditions).
ToggleButton – used to switch a setting between two states (ON/OFF).
RadioButton / RadioGroup – used to select one option among multiple mutually exclusive choices (e.g., Gender).
TextInputLayout – a Material Components wrapper around EditText that adds floating hints, icons, and a password-visibility toggle.

Input values are read using getText(), isChecked(), and getCheckedRadioButtonId(), and are validated inside a click listener before showing a summary to the user.

Example:

java
btnRegister.setOnClickListener(v -> registerUser());

private void registerUser() {
    String name = etFullName.getText().toString().trim();
    if (name.isEmpty()) {
        etFullName.setError("Name is required");
        etFullName.requestFocus();
        return;
    }
    ...
    Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
}

Scenario
The application displays a registration form inside a card layout. The user enters their Full Name, Email, and Password, selects their Gender, toggles a Notifications switch, and accepts the Terms and Conditions. On clicking "Register", the app validates each field in order and, if all inputs are valid, displays a summary of the entered details as a Toast message.

Application Flow

MainActivity
     |
     | Enter Name, Email, Password
     ↓
Select Gender (RadioGroup)
     |
     ↓
Toggle Notifications (ToggleButton)
     |
     ↓
Check "Terms and Conditions" (CheckBox)
     |
     ↓
Click "Register" Button
     |
     ↓
Validate Fields (Name → Email → Password → Gender → Terms)
     |
     ↓
Show Summary (Toast)

Software Requirements

Android Studio
Java
Android SDK
Gradle
Android Emulator or Physical Android Device

Technologies Used

Java
EditText / TextInputLayout
Button / ImageButton
CheckBox
ToggleButton
RadioButton / RadioGroup
CardView
XML Layouts
Android Manifest

Project Folder and File Structure

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
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
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

Important Files and Their Purpose

MainActivity.java – Links all Views using findViewById(), sets click listeners on the ImageButton and Register button, and validates and reads form data.
activity_main.xml – Defines the registration form UI: gradient header, profile picture ImageButton, input fields, Gender RadioGroup, Notifications ToggleButton, Terms CheckBox, and Register Button, inside a CardView.
AndroidManifest.xml – Declares the MainActivity as the launcher activity.
build.gradle – Contains the Android application build configuration and required dependencies (AppCompat, Material Components, CardView).

Working / Implementation
1. Link Views
All Views (EditText, RadioGroup, ToggleButton, CheckBox, Button, ImageButton) are linked to the layout using findViewById() in onCreate().

2. Handle ImageButton Click
Tapping the profile ImageButton shows a placeholder Toast for picking a profile picture.

3. Validate and Register
On clicking "Register", the app checks Name, Email, and Password for empty values, ensures a Gender is selected, and confirms the Terms checkbox is checked, before building and displaying a summary Toast that includes the entered name, email, gender, and notification preference.

Click "Register"
     ↓
Validate Name → Email → Password
     ↓
Check Gender Selection
     ↓
Check Terms Acceptance
     ↓
Show Summary Toast

Test Cases

Test Case 1: Empty Field Validation
Test Objective
To verify that the app shows an error when a required field is left empty.

Test Steps

Leave the Full Name field empty.
Click the "Register" button.

Expected Result
An inline error "Name is required" should appear on the Full Name field, and focus should move to it.

Actual Result
The error message appeared as expected and focus moved to the Full Name field.

Status
PASS ✅

Test Case 2: Gender and Terms Validation
Test Objective
To verify that the app prompts the user when Gender is not selected or Terms are not accepted.

Test Steps

Fill in Name, Email, and Password.
Leave Gender unselected and click "Register".
Select a Gender, leave the Terms checkbox unchecked, and click "Register" again.

Expected Result
A Toast should prompt "Please select your gender" first, and "You must accept the Terms and Conditions" after Gender is selected.

Actual Result
Both Toast messages appeared as expected at the correct steps.

Status
PASS ✅

Test Case 3: Successful Registration
Test Objective
To verify that a summary is displayed when all fields are valid.

Test Steps

Fill in Full Name, Email, and Password.
Select a Gender.
Toggle Notifications ON.
Check "I agree to the Terms and Conditions".
Click "Register".

Expected Result
A Toast summarizing Name, Email, Gender, Notifications status, and "Registration successful!" should be displayed.

Actual Result
The summary Toast appeared successfully with all entered details.

Status
PASS ✅

Output
The application successfully demonstrates the use of basic UI widgets to build a functional, validated registration form.

Output Screenshot
mad exp 6 (1) mad exp 6 (2)

Steps to Run the Project

Open the project in Android Studio.
Allow Gradle synchronization to complete.
Connect an Android device or start an Android Emulator.
Select the application from the Run Configuration.
Click the Run ▶ button.
Fill in the registration form and click "Register" to view the summary.

Requirements
Hardware Requirements

Laptop/Desktop
Android Device or Android Emulator
USB Cable if using a physical Android device

Software Requirements

Android Studio
Java
Android SDK
Gradle

Learning Outcomes
After completing this experiment, the following concepts were understood:

Basic Android UI Widgets (EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, RadioGroup)
TextInputLayout with Material Components
Input validation using event listeners
CardView-based layout design
XML Layouts
Android Manifest

Result
The Android application was successfully developed and executed to demonstrate the use of basic UI widgets in a registration form, including input validation.

Conclusion
The experiment successfully demonstrated how to design a form using EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup, and how to validate user input and display a summary using Toast messages.

Thus, the objective of implementing an Android application using basic UI widgets was successfully achieved.

Student Information
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102

GitHub Repository
Repository Name: RegistrationApp
GitHub Link: https://github.com/Shubham-kondikire/RegistrationApp

Reference

Android Developers – Common UI Widgets
Android Developers – Input Controls
Android Developers – Material Components TextInputLayout

Author
Shubham Shivaji Kondikire
USN: 25MCAR0102

Yeh text format mein hai, exp5 wale format ko exactly follow karke. Screenshot section mein tumhe apne actual output screenshots ke naam/details daalne honge. Chahiye toh isko proper .md file bhi bana sakta hoon.

give me in text so that i can paste it

Experiment 6: Working with Basic UI Widgets in Android (User Registration Form)

Student Details
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102
Experiment No.: 6

Aim
To develop an Android application that demonstrates the use of basic UI widgets by designing a User Registration form.

Objective
The objective of this experiment is to understand how to use basic Views such as EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup, and to handle user input and validation using event listeners.

Concept / Technology Used
UI Widgets
Android provides a set of basic Views that allow users to enter data and make selections:

EditText – used to accept text input such as name, email, and password.
Button / ImageButton – used to trigger actions such as registration or image selection.
CheckBox – used for a single yes/no choice (e.g., accepting Terms and Conditions).
ToggleButton – used to switch a setting between two states (ON/OFF).
RadioButton / RadioGroup – used to select one option among multiple mutually exclusive choices (e.g., Gender).
TextInputLayout – a Material Components wrapper around EditText that adds floating hints, icons, and a password-visibility toggle.

Input values are read using getText(), isChecked(), and getCheckedRadioButtonId(), and are validated inside a click listener before showing a summary to the user.

Example:

btnRegister.setOnClickListener(v -> registerUser());

private void registerUser() {
String name = etFullName.getText().toString().trim();
if (name.isEmpty()) {
etFullName.setError("Name is required");
etFullName.requestFocus();
return;
}
...
Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
}

Scenario
The application displays a registration form inside a card layout. The user enters their Full Name, Email, and Password, selects their Gender, toggles a Notifications switch, and accepts the Terms and Conditions. On clicking "Register", the app validates each field in order and, if all inputs are valid, displays a summary of the entered details as a Toast message.

Application Flow
MainActivity
|
| Enter Name, Email, Password
↓
Select Gender (RadioGroup)
|
↓
Toggle Notifications (ToggleButton)
|
↓
Check "Terms and Conditions" (CheckBox)
|
↓
Click "Register" Button
|
↓
Validate Fields (Name → Email → Password → Gender → Terms)
|
↓
Show Summary (Toast)

Software Requirements
Android Studio
Java
Android SDK
Gradle
Android Emulator or Physical Android Device

Technologies Used
Java
EditText / TextInputLayout
Button / ImageButton
CheckBox
ToggleButton
RadioButton / RadioGroup
CardView
XML Layouts
Android Manifest

Project Folder and File Structure
RegistrationApp/
│
├── app/
│ │
│ ├── src/
│ │ │
│ │ └── main/
│ │ │
│ │ ├── java/
│ │ │ └── com/example/registrationapp/
│ │ │ └── MainActivity.java
│ │ │
│ │ ├── res/
│ │ │ ├── drawable/
│ │ │ │ ├── bg_header.xml
│ │ │ │ ├── bg_register_btn.xml
│ │ │ │ └── circle_profile_bg.xml
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml
│ │ │ └── values/
│ │ │ ├── colors.xml
│ │ │ ├── strings.xml
│ │ │ └── themes.xml
│ │ │
│ │ └── AndroidManifest.xml
│ │
│ ├── build.gradle
│ └── proguard-rules.pro
│
├── build.gradle
├── gradle.properties
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md

Important Files and Their Purpose
MainActivity.java
Links all Views using findViewById(), sets click listeners on the ImageButton and Register button, and validates and reads form data.

activity_main.xml
Defines the registration form UI: gradient header, profile picture ImageButton, input fields, Gender RadioGroup, Notifications ToggleButton, Terms CheckBox, and Register Button, inside a CardView.

AndroidManifest.xml
Declares the MainActivity as the launcher activity.

build.gradle
Contains the Android application build configuration and required dependencies (AppCompat, Material Components, CardView).

Working / Implementation

Link Views
All Views (EditText, RadioGroup, ToggleButton, CheckBox, Button, ImageButton) are linked to the layout using findViewById() in onCreate().
Handle ImageButton Click
Tapping the profile ImageButton shows a placeholder Toast for picking a profile picture.
Validate and Register
On clicking "Register", the app checks Name, Email, and Password for empty values, ensures a Gender is selected, and confirms the Terms checkbox is checked, before building and displaying a summary Toast that includes the entered name, email, gender, and notification preference.

Click "Register"
↓
Validate Name → Email → Password
↓
Check Gender Selection
↓
Check Terms Acceptance
↓
Show Summary Toast

Test Cases

Test Case 1: Empty Field Validation
Test Objective
To verify that the app shows an error when a required field is left empty.

Test Steps
Leave the Full Name field empty.
Click the "Register" button.

Expected Result
An inline error "Name is required" should appear on the Full Name field, and focus should move to it.

Actual Result
The error message appeared as expected and focus moved to the Full Name field.

Status
PASS ✅

Test Case 2: Gender and Terms Validation
Test Objective
To verify that the app prompts the user when Gender is not selected or Terms are not accepted.

Test Steps
Fill in Name, Email, and Password.
Leave Gender unselected and click "Register".
Select a Gender, leave the Terms checkbox unchecked, and click "Register" again.

Expected Result
A Toast should prompt "Please select your gender" first, and "You must accept the Terms and Conditions" after Gender is selected.

Actual Result
Both Toast messages appeared as expected at the correct steps.

Status
PASS ✅

Test Case 3: Successful Registration
Test Objective
To verify that a summary is displayed when all fields are valid.

Test Steps
Fill in Full Name, Email, and Password.
Select a Gender.
Toggle Notifications ON.
Check "I agree to the Terms and Conditions".
Click "Register".

Expected Result
A Toast summarizing Name, Email, Gender, Notifications status, and "Registration successful!" should be displayed.

Actual Result
The summary Toast appeared successfully with all entered details.

Status
PASS ✅

Output
The application successfully demonstrates the use of basic UI widgets to build a functional, validated registration form.

Output Screenshot
mad exp 6 (1) mad exp 6 (2)

Steps to Run the Project
Open the project in Android Studio.
Allow Gradle synchronization to complete.
Connect an Android device or start an Android Emulator.
Select the application from the Run Configuration.
Click the Run ▶ button.
Fill in the registration form and click "Register" to view the summary.

Requirements
Hardware Requirements
Laptop/Desktop
Android Device or Android Emulator
USB Cable if using a physical Android device

Software Requirements
Android Studio
Java
Android SDK
Gradle

Learning Outcomes
After completing this experiment, the following concepts were understood:

Basic Android UI Widgets (EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, RadioGroup)
TextInputLayout with Material Components
Input validation using event listeners
CardView-based layout design
XML Layouts
Android Manifest

Result
The Android application was successfully developed and executed to demonstrate the use of basic UI widgets in a registration form, including input validation.

Conclusion
The experiment successfully demonstrated how to design a form using EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup, and how to validate user input and display a summary using Toast messages.

Thus, the objective of implementing an Android application using basic UI widgets was successfully achieved.

Student Information
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102

GitHub Repository
Repository Name: RegistrationApp

GitHub Link:
https://github.com/Shubham-kondikire/RegistrationApp

Reference
Android Developers – Common UI Widgets
Android Developers – Input Controls
Android Developers – Material Components TextInputLayout

Author
Shubham Shivaji Kondikire
USN: 25MCAR0102
