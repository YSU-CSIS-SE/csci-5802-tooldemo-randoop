# Randoop Use Cases

We will be running randoop on two example programs and one open source project.

## Program 1: GuessApp

For the GuessApp program, we will be illustrating the following use cases:

* Default - Generating JUnit for the GuessLogic.class file using default settings    
* -junit-output-dir=<classpath> - Generate JUnit and specify the folder the testing files will be saved in
* --timelimit=<int> - Generate JUnit for a specified timelimit
* --outputlimit=<int> - Generate JUnit while limiting the number of regression and error-revealing
tests to ouptut  
* --omitmethods=<method name> - Generate JUnit tests that omit specific methods.

The Frogger program includes multiple classes, so we will be using it to
illustrating the following use case:

* --classlist - Generate JUnit tests for several classes listed in a textfile.

For the JFreeChart program, we will illustrate how to use Randoop to develop JUnit test files for
an opensource project

