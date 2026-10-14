Android Login and Registration App
A simple Android application built with Kotlin and Jetpack Compose. The app demonstrates a login and registration interface with navigation between the two screens.

Features
Login screen

Registration screen

Navigation between Login and Register using Jetpack Compose Navigation

Reusable form-field component

Material 3 UI components

Edge-to-edge layout support

Tech Stack
Language: Kotlin

UI: Jetpack Compose

Design components: Material 3

Navigation: Navigation Compose

Build system: Gradle with Kotlin DSL

IDE: Android Studio

Project Structure
Plaintext
.
.
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/a24012021022_prac5_final/
│           │   ├── MainActivity.kt
│           │   ├── AppNavigation.kt
│           │   ├── LoginScreen.kt
│           │   ├── RegisterScreen.kt
│           │   ├── FormField.kt
│           │   └── ui/theme/
│           ├── res/
│           └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

Android SDK 35

JDK 11-compatible setup

Android device or emulator running Android 8.0 or later

How to Run
Download or clone this repository.

Open the project folder in Android Studio.

Allow Gradle to sync and download the required dependencies.

Select an Android emulator or connect an Android device with USB debugging enabled.

Click Run to build and launch the app.

App Navigation
The app starts on the Login screen. Users can navigate to the Register screen using the navigation controls provided in the UI.

Configuration
The app module is configured with:

minSdk: 26

compileSdk: 35

targetSdk: 35

versionName: 1.0

Notes
This project is intended for learning and practical work with Android development, Kotlin, Jetpack Compose, and screen navigation.

Review LoginScreen.kt and RegisterScreen.kt for the current form behavior.

A UI login or registration form does not automatically provide secure account management. For real authentication, connect the app to a backend and store passwords securely on the server; do not store plain-text passwords in the app.

Author
Name: Vansh Joshi

Enrollment Number: 24012021022

Subject: Mobile Application Development

Practical Number: 5
