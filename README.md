# KeepNotesApp

This is a app where user can add some notes with title, content, and a background color
This app implemented with clean architecture using jetpack compose and kotlin

# Features
1)Can view all the notes which was created by the user. 
2)User can add some filters by date, color, title with ascending and descending  
3)User will be able to edit a note also delete
4)To restore a deteled note user could make use of UNDO feature

# The app has following modules:
This project implemented with clean architecture using use cases structure

1)data-layer: It contains all the data accessing and manipulating components.

2)domain-layer: It contains all model and domain contract

3)presentation-layer: All user interface contract


# Used components and frameworks
In this project, I have used Android Architecture Components and AndroidX
1) Jetpack Compose
2) Dagger-Hilt - Dagger-Hilt is a compile-time framework for dependency injection. It uses no reflection or runtime bytecode generation, does all its analysis at compile-time, and generates plain Java source code.
3) DataBinding -  Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
4) Kotlin Coroutines
5) Kotlin Flows

