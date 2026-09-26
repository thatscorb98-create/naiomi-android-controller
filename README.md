# Naomi Android Controller

GitHub-ready starter project for a voice-driven Android controller.

## What this prototype does

- Installs as an Android app.
- Provides an Accessibility Service.
- Can perform gesture scrolling.
- Includes a helper for clicking visible text.
- Opens Android Accessibility settings from the app.

## What still needs to be connected

This prototype does NOT yet connect to an AI model or microphone. The next layer is a secure command bridge that turns voice commands such as:

- "Naomi, scroll down."
- "Scroll up."
- "Tap Search."

into approved controller actions.

For a production build, add authentication, explicit confirmation for sensitive actions, logging, and secure handling of screenshots/audio.

## Build

Open this repository in Android Studio and let Gradle sync. Then run:

`./gradlew assembleDebug`

The APK will be produced under:

`app/build/outputs/apk/debug/`

## Important

Android Accessibility access is powerful. Only enable this service for software you trust.
