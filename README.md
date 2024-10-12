# swaglabs-project

## Overview

This project is designed to automate testing of a web application using Selenium, JUnit, and Maven. It demonstrates how to set up and execute tests efficiently, ensuring the reliability and functionality of the website.

## Technologies Used

- **Java**: The primary programming language for test scripts.
- **Maven**: Build automation tool used for managing dependencies and project lifecycle.
- **JUnit**: Testing framework used for writing and running tests.
- **Selenium**: Web testing library used for automating browser actions.

## Prerequisites

- Java JDK (version 8 or above)
- Maven (for dependency management and building the project)

## Project Structure

- pages/ each class in the `pages` package represents a specific page of the web application. These classes typically contain locators and methods that encapsulate actions that can be performed on that page.
- The `tests` package contains JUnit test classes that utilize the page classes to perform automated tests, ensuring that the application's functionality is working as expected.


