# Randoop Use Cases

We will be running randoop on two example programs and one open source project.

## Use Case 1: GuessApp Project

**Title:**   Randoop JUnit generation  
 
**Desired Outcome:** Generate a series of JUnit test files for a class file

**Primary Actor:** Java Developer

**Precondition:** User has compiled the java source code and created a class file

**Postcondition:** JUnit test files are generated for the designated class file

**Scenario:**
1. Open the console  
2. Change the directory to the destination of the JUnit test files  
3. Use a console command to call the randoop program and run it on the class file   
  -The console command should add classpathes that piont to the randoop-all-3.0.10.jar file and the location of the class file
4. The system reads the class and lists all methods found by Randoop
5. The system begins generating test functions for each method in the class file
6. The system ouputs the file names for the test files and the names of the test methods
7. The system places the test files in the current directory

**Alternate Course A:**    
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found   

**Alternate Course B:**   
B4. The system cannot find the class file listed    
B5. The system prints a message informing the user that the class file cannot be found

**Alternate Course C:**   
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found   

## Use Case 2: Frogger Project

**Title:** Randoop JUnit generation  
 
**Desired Outcome:** Generate a series of JUnit test files for multiple class files

**Primary Actor:** Java Developer

**Precondition:** User has compiled the java source code and created all of the class files

**Postcondition:** JUnit test files are generated for all the classes in the project

**Scenario:**
1. The user writes a text file that will list all the class files that will have test files generated
2. Open the console  
3. Change the directory to the destination of the JUnit test files  
4. Use a console command to call the randoop program and run it on the text file    
  -The console command should add classpathes that piont to the randoop-all-3.0.10.jar file and the location of the class files
5. The system reads the text file and finds the list of classes to be tested
6. The system reads the classes and lists all methods found by Randoop
7. The system begins generating test functions for each method in the class files
8. The system ouputs the file names for the test files and the names of the test methods
9. The system places the test files in the current directory

**Alternate Course A:**    
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found   

**Alternate Course B:**        
B4. The system cannot find a class file listed in the text file    
B5. The system prints a message informing the user that the class file cannot be found

**Alternate Course C:**          
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found   

## Use Case 3: JFreeChart

**Desired Outcome:** Generate a series of JUnit test files for the project's library files with only a set 
number of tests per file 

**Primary Actor:** Java Developer

**Precondition:** User has compiled the java source code and created the necessary class files

**Postcondition:** JUnit test files are generated for all the classes in the project

**Scenario:**
1. The user writes a text file that will list all the class files that will have test files generated
2. Open the console   
3. Change the directory to the destination of the test files    
4. Use a console command to call the randoop program and run it on the text file    
 -The console command should add classpathes that piont to the randoop-all-3.0.10.jar file and the .jar file containing the library classes     
5. User uses the **--testsperfile=\<int>** command to specify the number of tests per JUnit file
6. The system reads the text file and finds the list of classes to be tested    
7. The system reads the classes and lists all methods found by Randoop  
8. The system begins generating test functions for each method in the class file   
9. The system ouputs the file names for the test files and the names of the test methods    
10. The system places the test files in the current directory    

**Alternate Course A:**     
A4. The system cannot find the Randoop main method    
A5. The system prints an error message informing the user that Randoop.main.Main can't be found      

**Alternate Course B:**        
B4. The system cannot find a class file listed in the text file    
B5. The system prints a message informing the user that the class file cannot be found

**Alternate Course C:**   
C5. The system cannont find other packages imported by the program   
C6. Print an error informing the user that the files could not be found    
