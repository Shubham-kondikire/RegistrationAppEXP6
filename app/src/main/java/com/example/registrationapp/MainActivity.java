package com.example.registrationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFullName, etEmail, etPassword;
    private RadioGroup rgGender;
    private ToggleButton toggleNotify;
    private CheckBox cbTerms;
    private Button btnRegister;
    private ImageButton imgBtnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link views to XML using findViewById
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        rgGender = findViewById(R.id.rgGender);
        toggleNotify = findViewById(R.id.toggleNotify);
        cbTerms = findViewById(R.id.cbTerms);
        btnRegister = findViewById(R.id.btnRegister);
        imgBtnProfile = findViewById(R.id.imgBtnProfile);

        // ImageButton click - placeholder action for choosing a profile picture
        imgBtnProfile.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Profile picture picker tapped", Toast.LENGTH_SHORT).show());

        // Register button click - validate and show a summary
        btnRegister.setOnClickListener(v -> registerUser());
    }

    private void registerUser() {
        String name = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (name.isEmpty()) {
            etFullName.setError("Name is required");
            etFullName.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            etEmail.setError("Email is required");
            etEmail.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            etPassword.setError("Password is required");
            etPassword.requestFocus();
            return;
        }

        int selectedGenderId = rgGender.getCheckedRadioButtonId();
        if (selectedGenderId == -1) {
            Toast.makeText(this, "Please select your gender", Toast.LENGTH_SHORT).show();
            return;
        }
        RadioButton selectedGenderBtn = findViewById(selectedGenderId);
        String gender = selectedGenderBtn.getText().toString();

        if (!cbTerms.isChecked()) {
            Toast.makeText(this, "You must accept the Terms and Conditions", Toast.LENGTH_SHORT).show();
            return;
        }

        boolean notificationsOn = toggleNotify.isChecked();

        String summary = "Name: " + name +
                "\nEmail: " + email +
                "\nGender: " + gender +
                "\nNotifications: " + (notificationsOn ? "Enabled" : "Disabled") +
                "\nRegistration successful!";

        Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
    }
}
