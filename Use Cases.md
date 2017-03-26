# Randoop Use Cases

We will be running randoop on two example programs and one open source project.

## Use Case 1: GuessApp Project

Title: Randoop JUnit generation  
 
Desired Outcome: Generate a series of JUnit test files for the GuessLogic class in the GuessApp
project

Primary Actor: Java Developer

Precondition: User has compiled the java source code and created a class file

Postcondition: JUnit test files are generated for the designated class file

Scenario:
1. Open the console  
2. Change the directory to the destination of the JUnit test files  
3. Use a console command to call the randoop program and run it on the class file
4. The system reads the class and lists all methods found by Randoop
5. The system begins generating test functions for each method in the class file
6. The system ouputs the file names for the test files and the names of the test methods
7. The system places the test files in the current directory

Alternate Course A:
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found   

Alternate Course B:   
B4. The system cannot find the class file listed    
B5. The system prints a message informing the user that the class file cannot be found

Alternate Course C:   
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found   

## Use Case 2: Frogger Project

Title: Randoop JUnit generation  
 
Desired Outcome: Generate a series of JUnit test files for multiple class files

Primary Actor: Java Developer

Precondition: User has compiled the java source code and created all of the class files

Postcondition: JUnit test files are generated for all the classes in the project

Scenario:
1. The user writes a text file that will list all the class files that will have test files generated
2. Open the console  
3. Change the directory to the destination of the JUnit test files  
4. Use a console command to call the randoop program and run it on the text file
5. The system reads the text file and finds the list of classes to be tested
6. The system reads the classes and lists all methods found by Randoop
7. The system begins generating test functions for each method in the class files
8. The system ouputs the file names for the test files and the names of the test methods
9. The system places the test files in the current directory

Alternate Course A:
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found   

Alternate Course B:   
B4. The system cannot find a class file listed in the text file    
B5. The system prints a message informing the user that the class file cannot be found

Alternate Course C:   
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found   

Use Case 3: JFreeChart

Desired Outcome: Generate a series of JUnit test files for multiple class files with only a set 
number of tests per file 

Primary Actor: Java Developer

Precondition: User has compiled the java source code and created the necessary class files

Postcondition: JUnit test files are generated for all the classes in the project

Scenario:
1. The user writes a text file that will list all the class files that will have test files generated
2. Open the console  
3. Change the directory to the location that the test files would be saved  
4. Use a console command to call the randoop program and run it on the text file
5. User uses the **--testsperfile=<int>** command to specify the number of tests per JUnit file
6. The system reads the text file and finds the list of classes to be tested
7. The system reads the classes and lists all methods found by Randoop
8. The system begins generating test functions for each method in the class file
9. The system ouputs the file names for the test files and the names of the test methods
10. The system places the test files in the current directory

Alternate Course A:
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found   

Alternate Course B:   
B4. The system cannot find a class file listed in the text file    
B5. The system prints a message informing the user that the class file cannot be found

Alternate Course C:   
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found  

Constructing the Command Line:
i. Enter **java** to call java.exe     
ii. Use the **-classpath** command to add the location of randoop-all-3.0.10.jar and the 
classes being used to create the JUnit test to the classpath     
iii. Enter **randoop.main.Main** to call Randoop's main class
iv. Enter **gentests** to invoke the test generating fuction of randoop
v. Enter **testclass=<class file>** to designate the class file to generate JUnit tests for

Example:

````
java -classpath bin;RANDOOP_PATH\randoop-all-3.0.10.jar randoop.main.Main gentests -testfile = guessapp.GuessLogic
````

Extensions:
3a. User enters **-junit-output-dir=<classpath>** to change the destination of the test files
3b. User enters **--timelimit=<int>** to force Randoop to stop generate tests after a period of time
3c. User enters **--outputlimit=<int>** to limit the number of regression and error-revealing tests
3d. User enters **--omitmethods=<methodname>** to prevent tests being generated for a specific method
 

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

