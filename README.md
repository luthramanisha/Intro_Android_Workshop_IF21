# Introduction to Android Operating System for Informatica Feminale 2016 in Bremen

## Why learn Android ?

Android is now the world's most popular mobile platform. It powers millions of mobile devices and provides a flexibility to enjoy applications and games from the open marketplace.

Here are some features of Android, what makes it so fascinating:
* Open source community:
New vendors can opt for Android mobile operating system anytime. Developers can build innovative applications and distribute them instantly.
* Open marketplace:
One million applications are now available on Google Play Store, with a range of education apps, health apps, games apps and many other utility apps.
* Dozens of job opportunities:
Looking at the android market, there is a revolution of job propects for android developers.
* Easy learning curve and community support:
With Java and XML mostly used coding languages, it becomes very easy to learn android. Also, looking at its wide use there is a lot of support one can get from the community.

### What we will learn?
* Basics to quick start. An insight into the android stack.
* Android's main building blocks.
* Useful APIs of Android.
* Some short tutorials.
* Time to design your innovative mobile apps

## Steps to quick-start
I would ask all of you to setup development environment in your notebooks. This would allows us to quickly learn and start designing apps in the workshop. Following guide will help you in the installation.

* Install 
  * [Git] (https://git-scm.com/downloads)
  * [Java] (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  * Option 1 (Preferable): Needs quite a space ~1.5GB on your notebook. Make sure you have this space available.
    * [Android Studio] (https://developer.android.com/studio/index.html)
    (This will take a while to setup)
  * Option 2: If you already have eclipse.
    * [Eclipse + ADT] (https://developer.android.com/studio/tools/sdk/eclipse-adt.html)
    * [Step by step guide] (http://stackoverflow.com/questions/27418096/where-can-i-download-eclipse-android-bundle)

### Pre-installed android sdk
If you already have played around with android before, and want to learn about the latest version, please update your sdk version by `android-sdk-manager`. Here, are the steps you would take to update your existing sdk:
  * Launch `SDK Manager`.
  * Select latest Android SDK Tools, Platform Tools, SDK Build-tools, API 21-23. Since, we would certainly need the minimum sdk compatibility upto API 21 (Android 5.0.1) as all of us are not so update conscious :) 

### Troubleshooting
  * Java : 
    [Environment Path] (https://docs.oracle.com/javase/tutorial/essential/environment/paths.html)
  * Android Studio : 
    if it is very slow, try re-configuring the memory allocation at ` $ANDROIDSTUDIOHOME/bin/studio.exe.vmoptions `, e.g.,:

     ```
      -Xms512m
      -Xmx1024m
      ```
  * Eclipse : 
    if it is very slow, try re-configuring the memory allocation at `$ECLIPSEHOME/eclipse.ini`, e.g.,:

      ```
      -Xms512m
      -Xmx1024m
      ```
  * To help you quick-start Android, some USB drivers can be availed from [here] (https://github.com/manishaluthra/Intro_Android_Workshop_IF16/tree/master/USB_Drivers).
  
  Others can download manufacturer specific drivers from [here] (https://developer.android.com/studio/run/oem-usb.html#Drivers).

## In-workshop Exercise

### List of some ideas for Android apps
[Here] (https://github.com/manishaluthra/awesome-app-ideas) you can find a forked repository of cool ideas for Android apps. You can of course think of your own idea as well. Its fine if it comprises of:

* 1-2 activities
* 1-2 layouts
* use of intent
* some use of UI elements taught in the workshop (Day II)
* java source (logic of your idea)

It need not be something very big or comprehensive but just to demonstrate that you understood features taught in the workshop.

#### Color picker
Have a look [here] (https://github.com/QuadFlask/colorpicker)

## Grading scheme (for ECTS)

* Participation: 10% 
* In-workshop Exercises : 40% 
* Final Demo: 10% 
* Post-workshop Exercises : 40% 

## Some useful links
* [Official website] (https://developer.android.com/index.html)
* [API guide] (https://developer.android.com/guide/index.html)
* Books
  * [By Ed Burnette] (https://www.amazon.de/Hello-Android-Introducing-Development-Platform/dp/1680500376/ref=sr_1_1?ie=UTF8&qid=1469994179&sr=8-1&keywords=Hello%2C+Android%3A+Introducing+Google%27s+Mobile+Development+Platform)
  * [Cookbook] (https://www.amazon.de/Android-Application-Development-Cookbook-Second/dp/1785886193/ref=sr_1_1?ie=UTF8&qid=1469994286&sr=8-1&keywords=Android+Application+Development)
  * [Android App Testing] (https://www.amazon.de/Learning-Android-Application-Testing-Blundell/dp/1784395331/ref=sr_1_13?ie=UTF8&qid=1469994286&sr=8-13&keywords=Android+Application+Development)
  * [Gradle e-Book for Android ] (https://github.com/manishaluthra/Intro_Android_Workshop_IF16/tree/master/Gradle-eBook4Android)

