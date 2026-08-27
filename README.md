# Experiment 6: Working with Basic UI Widgets in Android

## User Registration Form

### Student Details

**Name:** Shubham Shivaji Kondikire
**USN:** 25MCAR0102
**Experiment No.:** 6

---

## Aim

To develop an Android application that demonstrates the use of basic UI widgets by designing and implementing a User Registration Form.

---

## Objective

The objective of this experiment is to understand and implement basic Android UI widgets and handle user input and validation using event listeners.

The application demonstrates the use of:

* EditText
* Button
* ImageButton
* CheckBox
* ToggleButton
* RadioButton
* RadioGroup
* TextInputLayout
* CardView
* XML Layouts

---

## Concept / Technology Used

### UI Widgets

Android provides several basic UI widgets that allow users to enter information and make selections.

### EditText

`EditText` is used to accept text input from the user, such as:

* Full Name
* Email
* Password

### Button

`Button` is used to perform an action when the user clicks it. In this application, the Register button validates the entered information and displays a registration summary.

### ImageButton

`ImageButton` is a button that displays an image. It is used as a profile picture button in the registration form.

### CheckBox

`CheckBox` allows the user to select or deselect an option independently. In this application, it is used for accepting the Terms and Conditions.

### ToggleButton

`ToggleButton` provides two states, ON and OFF. It is used to enable or disable notification preferences.

### RadioButton and RadioGroup

`RadioButton` allows the user to select one option. Multiple RadioButtons are placed inside a `RadioGroup` to ensure that only one option can be selected.

In this application, RadioButtons are used for selecting Gender.

### TextInputLayout

`TextInputLayout` is a Material Components wrapper around an input field. It provides features such as floating hints, input icons, error messages, and password visibility controls.

### CardView

`CardView` is used to provide a card-style container for the registration form and improve the overall user interface design.

---

## Input Handling and Validation

Input values are retrieved using Android methods such as:

* `getText()`
* `isChecked()`
* `getCheckedRadioButtonId()`

The input values are validated inside button click listeners before displaying the registration summary.

### Example

```java
btnRegister.setOnClickListener(v -> registerUser());

private void registerUser() {
    String name = etFullName.getText().toString().trim();

    if (name.isEmpty()) {
        etFullName.setError("Name is required");
        etFullName.requestFocus();
        return;
    }

    // Additional validation

    Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
}
```

---

# Scenario

The application displays a User Registration Form inside a card layout.

The user can:

1. Enter their Full Name.
2. Enter their Email.
3. Enter their Password.
4. Select their Gender.
5. Enable or disable Notifications.
6. Accept the Terms and Conditions.
7. Click the Register button.

When the Register button is clicked, the application validates all required fields in sequence.

If all the entered information is valid, a Toast message displays a summary of the registration details.

---

# Application Flow

```text
MainActivity
     |
     ↓
Enter Name, Email, Password
     |
     ↓
Select Gender using RadioGroup
     |
     ↓
Toggle Notifications
     |
     ↓
Accept Terms and Conditions
     |
     ↓
Click "Register"
     |
     ↓
Validate Fields
(Name → Email → Password → Gender → Terms)
     |
     ↓
Show Registration Summary
     |
     ↓
Toast Message
```

---

# Software Requirements

* Android Studio
* Java
* Android SDK
* Gradle
* Android Emulator or Physical Android Device

---

# Technologies Used

| Technology / Component | Purpose                         |
| ---------------------- | ------------------------------- |
| Java                   | Application logic               |
| XML                    | User interface design           |
| EditText               | Text input                      |
| TextInputLayout        | Enhanced input fields           |
| Button                 | Registration action             |
| ImageButton            | Profile picture action          |
| CheckBox               | Terms and Conditions            |
| ToggleButton           | Notification setting            |
| RadioButton            | Gender selection                |
| RadioGroup             | Grouping gender options         |
| CardView               | Card-based UI                   |
| Android Manifest       | Application configuration       |
| Gradle                 | Build and dependency management |

---

# Project Folder and File Structure

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

---

# Important Files and Their Purpose

## MainActivity.java

`MainActivity.java` contains the main application logic.

It is responsible for:

* Linking UI elements using `findViewById()`.
* Handling ImageButton click events.
* Handling Register button click events.
* Reading user input.
* Validating user input.
* Checking Gender selection.
* Checking Terms and Conditions.
* Checking Notification status.
* Creating and displaying the registration summary.

---

## activity_main.xml

`activity_main.xml` defines the complete registration form interface.

It contains:

* Header section
* Profile picture ImageButton
* Full Name input field
* Email input field
* Password input field
* Gender RadioGroup
* Gender RadioButtons
* Notifications ToggleButton
* Terms and Conditions CheckBox
* Register Button
* CardView-based layout

---

## AndroidManifest.xml

`AndroidManifest.xml` contains the application configuration and declares `MainActivity` as the launcher activity.

---

## build.gradle

The Gradle configuration contains the Android application build settings and required dependencies.

The project uses dependencies for components such as:

* AndroidX/AppCompat
* Material Components
* CardView

---

# Working / Implementation

## 1. Link Views

All required Views are linked to the XML layout using `findViewById()` inside the `onCreate()` method.

Examples include:

```java
EditText etFullName;
EditText etEmail;
EditText etPassword;

RadioGroup radioGroupGender;

ToggleButton toggleNotifications;

CheckBox checkTerms;

Button btnRegister;

ImageButton btnProfile;
```

---

## 2. Handle ImageButton Click

When the user taps the profile ImageButton, a Toast message is displayed indicating that the profile picture selection functionality has been triggered.

Example:

```java
btnProfile.setOnClickListener(v -> {
    Toast.makeText(this,
            "Profile picture selection",
            Toast.LENGTH_SHORT).show();
});
```

---

## 3. Validate and Register

When the user clicks the Register button, the application validates the form fields in the following order:

1. Full Name
2. Email
3. Password
4. Gender
5. Terms and Conditions

If a required field is empty, an error message is displayed and focus is moved to that field.

After successful validation, the application creates a summary containing:

* Name
* Email
* Gender
* Notification preference
* Registration status

The summary is displayed using a Toast message.

---

# Registration Validation Flow

```text
Click "Register"
       |
       ↓
Validate Name
       |
       ↓
Validate Email
       |
       ↓
Validate Password
       |
       ↓
Check Gender Selection
       |
       ↓
Check Terms Acceptance
       |
       ↓
Read Notification Status
       |
       ↓
Create Registration Summary
       |
       ↓
Display Toast Message
```

---

# Test Cases

## Test Case 1: Empty Field Validation

### Test Objective

To verify that the application displays an error when a required field is left empty.

### Test Steps

1. Leave the Full Name field empty.
2. Enter the remaining information if required.
3. Click the **Register** button.

### Expected Result

An inline error message:

```text
Name is required
```

should appear on the Full Name field, and focus should move to the field.

### Actual Result

The error message appeared as expected and focus moved to the Full Name field.

### Status

**PASS ✅**

---

# Test Case 2: Gender and Terms Validation

### Test Objective

To verify that the application prompts the user when Gender is not selected or Terms and Conditions are not accepted.

### Test Steps

1. Fill in Name, Email, and Password.
2. Leave Gender unselected.
3. Click the **Register** button.
4. Select a Gender.
5. Leave the Terms and Conditions checkbox unchecked.
6. Click the **Register** button again.

### Expected Result

The application should first display:

```text
Please select your gender
```

After selecting Gender, it should display:

```text
You must accept the Terms and Conditions
```

if the Terms checkbox remains unchecked.

### Actual Result

Both Toast messages appeared as expected at the appropriate validation steps.

### Status

**PASS ✅**

---

# Test Case 3: Successful Registration

### Test Objective

To verify that a registration summary is displayed when all fields contain valid information.

### Test Steps

1. Enter Full Name.
2. Enter Email.
3. Enter Password.
4. Select a Gender.
5. Toggle Notifications ON.
6. Check **I agree to the Terms and Conditions**.
7. Click the **Register** button.

### Expected Result

A Toast message should display a summary containing:

* Name
* Email
* Gender
* Notifications status
* Registration successful message

### Actual Result

The summary Toast appeared successfully with all entered details.

### Status

**PASS ✅**

---

# Output

The application successfully demonstrates the use of basic Android UI widgets to create a functional and validated User Registration Form.

The application accepts user input, validates the information, handles different widget selections, and displays a registration summary.

---

# Output Screenshots

<img width="720" height="1600" alt="MAD EXP 6 (1)" src="https://github.com/user-attachments/assets/e5f67820-d271-4755-8e26-828269f354cb" />
<img width="720" height="1600" alt="MAD EXP 6 (2)" src="https://github.com/user-attachments/assets/e8c94c81-609e-48a5-bde7-d15840de758a" />



# Steps to Run the Project

## Step 1: Open the Project

Open **Android Studio**.

Select:

```text
File → Open
```

and choose the `RegistrationApp` project folder.

---

## Step 2: Gradle Synchronization

Allow Android Studio to complete the Gradle synchronization.

Make sure there are no Gradle or dependency errors.

---

## Step 3: Connect Device

You can use either:

* Android Emulator
* Physical Android Device

If using a physical Android device, enable **Developer Options** and **USB Debugging**.

---

## Step 4: Run the Application

Select the application from the Run Configuration.

Click the:

```text
Run ▶
```

button in Android Studio.

---

## Step 5: Test the Registration Form

Enter the required details:

* Full Name
* Email
* Password
* Gender
* Notification preference
* Terms and Conditions

Finally, click **Register**.

The application validates the information and displays the registration summary.

---

# Hardware Requirements

* Laptop/Desktop
* Android Device or Android Emulator
* USB Cable, if using a physical Android device

---

# Software Requirements

* Android Studio
* Java Development Kit (JDK)
* Android SDK
* Gradle
* Android Emulator or Physical Android Device

---

# Learning Outcomes

After completing this experiment, the following concepts were understood:

* Basic Android UI Widgets
* EditText for user input
* Button and ImageButton click handling
* CheckBox for independent selections
* ToggleButton for ON/OFF settings
* RadioButton and RadioGroup for mutually exclusive choices
* TextInputLayout with Material Components
* Input validation using event listeners
* CardView-based UI design
* XML-based Android layouts
* Android Manifest configuration
* Toast messages for displaying information
* Reading user input using Android View methods

---

# Result

The Android application was successfully developed and executed to demonstrate the use of basic UI widgets in a User Registration Form.

The application successfully accepts user input, performs validation, handles widget interactions, and displays the registration details using a Toast message.

---

# Conclusion

The experiment successfully demonstrated how to design and implement a User Registration Form using basic Android UI widgets such as **EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, and RadioGroup**.

The application also demonstrated input validation, event handling, CardView-based UI design, Material Components, and displaying a registration summary using Toast messages.

Thus, the objective of implementing an Android application using basic UI widgets was successfully achieved.

---

# Student Information

**Name:** Shubham Shivaji Kondikire
**USN:** 25MCAR0102
**Experiment:** 6
**Application:** RegistrationApp

---

# GitHub Repository

**Repository Name:** RegistrationApp

**GitHub:** Shubham-kondikire/RegistrationApp

---

# References

1. Android Developers – Common UI Widgets
2. Android Developers – Input Controls
3. Android Developers – Material Components and TextInputLayout
4. Android Developers – User Interface and Layouts

---

# Author

**Shubham Shivaji Kondikire**
**USN:** 25MCAR0102

---
