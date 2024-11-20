## BD Stickers App

This repository contains the Android code for a basic BD Stickers App with user authentication, a homepage, and a notification section.

**Features:**

* **Splash Screen:** Displays a brief splash screen upon app launch.
* **Login:** Users can log in with their existing credentials.
* **Signup:** Allows users to create new accounts with a username and password.
* **Homepage:**  Provides a main screen with a search bar and notification icon.
* **Notifications:**  Displays a list of recent notifications about new sticker arrivals or promotions.
* **Search Functionality:**  Allows users to search for stickers (not yet implemented).

**Technology:**

* **Android Studio:**  The app is developed using Android Studio.
* **Kotlin:**  The code is written in Kotlin, a modern programming language for Android.
* **JavaFX:**  The user interface (UI) is built using JavaFX.
* **RecyclerView:** The app utilizes RecyclerView for displaying the notification list.

**Structure:**

* **MainActivity.kt:**  Displays the splash screen and starts the login activity after a short delay.
* **Login.kt:** Handles user login and provides a link to the signup activity.
* **Signup.kt:** Handles user registration and provides a link to the login activity.
* **Home.kt:** The main homepage activity, including the search bar and notification icon.
* **NotificationActivity.kt:** Displays the list of notifications.
* **NotificationAdapter.kt:**  Handles the display of each notification item in the RecyclerView.

**Getting Started:**

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/BDStickersApp.git
2. **Open in Android Studio:** Import the project into Android Studio.

3. **Run the app:** Build and run the app on an Android emulator or a connected device.

**Future Improvements:**

* Implement Search: Add functionality to the search bar to allow users to search for stickers.
* API Integration: Integrate with a sticker database API or e-commerce platform to fetch sticker data and manage purchases.
