# Multiple Functionality Application
It is an application which provides you with multiple functions in the same app. <br> Like, opening a website, sending an email, sending a message etc.

## Features :
1. **Show Website:** <br>
In this function, you can just enter a URL, and the application will open the same for you in your favorite browser. <br>
2. **Show Map Location:** <br>
In this function, you can see the location of *The White House*. But you can change the location to any other place you want to. <br>
3. **Sending Email:** <br>
This will ask you for the email address you want to send the email to, the subject for the mail, and the message which you want to send the person. After you hit *MAIL*, it will 
ask you that through which app do you want to send the mail (for e.g. Mail, Gmail, HotMail etc.). <br>
4. **Sending Image:**<br>
You can send image to various apps like snapchat, Instagram, Whatsapp, PicsArt etc.<br>
5. **Sending Message:**<br>
You can enter the phone number of the person you want to text, the message, and then hit enter. It would automatically open the default messaging application 
provided in the phones, and send the text using that.
6. **Call a Number:**<br>
You can enter a phone number and hit call. It will then automatically call the person. 

# Install Pre-requisites

1. Download the Android IDE: Android Studio (you may need to install java by following the prompts)
  a. Optional: Install the Android SDK: ``` brew install android-sdk ``` , Select the SDK that ```brew``` logged out back in the previous command
2. Open this project with in Android Studio IDE
3. The IDE will complain about *"Gradle sync failed".* Just follow what it says.
4. Once the IDE stops giving suggestions go to **Tools -> Android -> SDK Manager** and do what the SDK Manager says.
5. Once the SDK Manager stops giving suggestions, use it to install the Google Repository and the Android Support Repository.

# How do you use this repository?
Clone or download this repo<br>
```
https://github.com/anjalisi/MultifunctionalityApp
```
After that you can simply take the files and paste it in the required folders. Et Voila !

# Setup Virtual Device
## Running on a virtual device
1. Open the AVD Manager (***Tools -> Android -> AVD Manager***).
2. Create a new Virtual Device. The size/model doesn't matter that much
3. Select a system image that has both a _x86_64 ABI and Google Play Services_.
4. Finish and Click Play!
