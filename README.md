# BasicDanceNYC

# Dance NYC (Basic Version) - Java Code README

## Overview

This README provides an overview of the Java code for the **Dance NYC (Basic Version)** mobile application. This version of the app serves as a foundation for a more comprehensive platform aimed at helping users find dance classes in New York City. The Java code includes activities, adapters, and layouts that enable users to search and browse dance classes.

## Key Components

The Java code consists of several key components:

1. **Activities**: The app includes several activities, such as the `MainActivity`, `DayButton`, `DaySelected`, `TeacherButton`, and `TeacherSelected` activities, each responsible for specific functionalities within the app.

2. **DanceClass Class**: The `DanceClass` class is used to model dance classes, including details like the class name, dance style, teacher, day, time, school, and an associated image resource.

3. **ClassLibrary**: The `ClassLibrary` class is a singleton class that manages a list of dance classes. It initializes the list with sample data for demonstration purposes.

4. **Adapters**: The app uses adapters like `TeacherButtonAdapter` to populate RecyclerViews with dance class information. The `TeacherButtonAdapter` also includes a click listener to handle user interactions with teacher names.

5. **Layouts**: The `res/layout` directory contains XML layout files that define the user interface of the app. These layouts determine how data is presented to users.

## App Functionality

The app's Java code provides the following functionality:

- **Day-Based Search**: The `DayButton` activity allows users to select their preferred day of the week, which then leads to a list of dance classes available on that day in the `DaySelected` activity.

- **Teacher-Based Search**: The `TeacherButton` activity displays a list of unique dance teachers, and users can click on a teacher to see the classes taught by that instructor in the `TeacherSelected` activity.

- **Data Management**: The `ClassLibrary` class manages a list of `DanceClass` objects. This list is used to populate the app with sample dance class data.

- **User Interface**: The app's user interface is designed to be user-friendly and easy to navigate, allowing users to explore and select dance classes based on their preferences.

## How to Use the Code

1. **Project Setup**: The Java code is part of an Android app project. To use the code, set up an Android development environment, and create an Android project with the provided Java files.

2. **Run on an Emulator or Device**: Build and run the app on an Android emulator or a physical Android device to test and interact with the functionality provided by the Java code.

## Future Development

The Java code of the Dance NYC (Basic Version) app is the starting point for a broader vision. Future development may include:

- Integrating a web scraping component to fetch real dance class data from multiple sources.
- Adding features like search by dance style or location.
- Improving user experience and design elements for a more polished app.

This codebase can serve as a foundation for expanding the app into a comprehensive platform for dance class scheduling and making dance classes more accessible and convenient for the dance community in New York City.

*Note: The code for the Dance NYC (Basic Version) app is available in the provided Java source code files.*
