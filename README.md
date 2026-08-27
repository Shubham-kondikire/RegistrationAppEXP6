# RegistrationApp

A simple Android registration page built with basic Views:
TextView, EditText, Button, ImageButton, CheckBox, ToggleButton, RadioButton, RadioGroup.

## How to open in Android Studio

1. Unzip this folder anywhere on your computer.
2. Open Android Studio → File → Open → select the `RegistrationApp` folder.
3. Android Studio will say the Gradle wrapper is missing / offer to configure Gradle —
   click "OK" / "Use Gradle from: 'Android Studio'" (or let it auto-download the wrapper).
   This is normal since the wrapper's binary jar isn't included in this zip.
4. Wait for Gradle sync to finish (first sync can take a few minutes).
5. Run the app on an emulator or device using the green Run ▶ button.

## What's inside

- `app/src/main/res/layout/activity_main.xml` – the registration form layout
- `app/src/main/java/.../MainActivity.java` – click handling and validation logic
- Fields: Full Name, Email, Password (EditText)
- Gender selection (RadioGroup + RadioButton)
- Notifications toggle (ToggleButton)
- Terms & Conditions acceptance (CheckBox)
- Profile picture button (ImageButton)
- Register button (Button) that validates input and shows a summary Toast
