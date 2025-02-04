# IT ACADEMY BACKEND JAVA SPECIALIZATION
## SPRINT 1 TASK 8 - Lambdas LVL 1

## Summary

This exercise explores functional programming concepts in Java, including lambda expressions, method references, functional interfaces, and working with lists of strings.

## Exercise 1

### Functionalities

- Given a list of Strings, write a method that returns a new list containing only the strings that contain the letter 'o'.
- Print the resulting list to the console.

## Exercise 2

### Functionalities

- Similar to Exercise 1, but now the method should return a list of strings that contain the letter 'o' *and* have a length greater than 5 characters.
- Print the resulting list to the console.

## Exercise 3

### Functionalities

- Create a list containing the names of the months of the year.
- Print all the elements of the list to the console using a lambda expression.

## Exercise 4

### Functionalities

- Perform the same printing operation as in Exercise 3, but this time using a method reference instead of a lambda expression.

## Exercise 5

### Functionalities

- Create a functional interface with a method named `getPiValue()` that returns a `double`.
- In the `main()` method of the main class, instantiate the interface and assign it the value 3.1415.
- Invoke the `getPiValue()` method and print the result to the console.

## Exercise 6

### Functionalities

- Create a list containing both numbers and strings.
- Sort the list based on the length of the strings, from shortest to longest.  Numbers should be treated as having a length of 0 for comparison purposes or handled appropriately for your sorting logic.
- Print the sorted list.

## Exercise 7

### Functionalities

- Using the same list from Exercise 6, sort it in reverse order, from longest string to shortest.
- Print the sorted list.

## Exercise 8

### Functionalities

- Create a functional interface that contains a method named `reverse()`. This method should take a String as input and return a String.
- In the `main()` method of the main class, inject the body of the method into the created interface using a lambda expression, so that it returns the same string it receives as a parameter, but reversed.
- Invoke the instance of the interface, passing it a string, and check if the result is correct.

## Technologies

- Java JDK 22 (or specify your JDK version)
- IntelliJ IDEA (or specify your IDE)
- Git
- GitHub

## How to run it

Clone the repository or download the zip file and run it in your favorite IDE. Run the main class to execute the exercises and observe the output in the console.
