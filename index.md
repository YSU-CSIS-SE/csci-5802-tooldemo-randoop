# Randoop Write-up

As stated by it's creators:  
Do you love writing unit tests to find bugs in your programs? Or, would you prefer that the tests were written for you automatically?  

Randoop is a program that automatically generates JUnit test files for Java classes. Randoop
outputs two kinds of tests:

* Error-Revealing Tests: Tests that detect bugs in the current code
* Regression Tests: Tests that can be used to detect other bugs

Usually, the user fixes all errors that appear in error-revealing tests and then rerun randoop
until it does not generate any error-revealing tests.

Randoop is still being used today by companies like ABB and Microsoft. Randoop has had 
many successful applications, especially on library classes like java.util.

## Installation

To install randoop, a user simply has to do the following:

* Go to https://randoop.github.io/randoop/   (Hey, it's a github project page!)
* Click the button to download the latest release, and get the "randoop-all" version of the zip file.
* Uncompress randoop and make note of it's filepath.
* Test it by typing in the following:  
java -ea -classpath "linux file path and name to randoop.jar" randoop.main.Main help  

## Running Randoop

##### NOTE: The Windows path separator is ";" - Linux path separator is ":" -- In Windows if path argument does not contains white space, the "quotes" are optional.  

Randoop does not include a GUI component, so Randoop will be run from the command line. To run 
Randoop, we use a command-line command similar to this example:

````
java -classpath bin;RANDOOP_PATH\randoop-all-3.0.10.jar randoop.main.Main gentests -testclass=guessapp.GuessLogic
````
The command can be broken down into the following components:

* **java** - Calls the JVM enviroment  
* **-classpath** - Adds a classpath to the java environment. For this program specifically, we are
 going to add the path to randoop-all-3.0.10 and the path to the class files being tested  
* **randoop.main.Main** - Invokes Randoop's main class   
* **gentests** - The command that generates unit tests  
* **testclass=\<classname\>** - Specifies the class that Randoop will generate tests for  

Note - If the class being tested is part of a package, the classpath always contains the 
directory where you would expect to see the first part of the package name as a subdirectory.
When entering the desired class in **testclass**, it should be fully qualified by the package name
(e.g. guessapp.GuessLogic).

## Command-line Options

Randoop includes several command-line options that allows the user to tailor the way Randoop runs
and modify the test files output by Randoop. The following list includes a few examples:

* **--junit-output-dir=\<classpath\>** - Change the destination of the generated test files
* **--dont-output-tests=\<boolean\>** - Run test generation without output
* **--timelimit=\<int\>** - Forces Randoop to stop generate tests after a period of time
* **--outputlimit=\<int\>** - Limits the number of regression and error-revealing tests
* **--omitmethods=\<regex\>** - Prevents tests being generated for methods whose name matches the
regular expression given
* **--inputlimit=\<int\>** - Limits the number of test method candidates generated internally
* **--forbid-null=\<boolean\>** - Forbids Randoop from using null as input to methods or constructors
* **--testsperfile=\<int\>** - Limits the number of tests to write to each JUnit file
* **--error-test-basename=\<string\>** - Choose the base name of the JUnit file containing error-revealing
tests
* **--regression-test-basename=\<string\>** - Choose the base name for the JUnt file containing 
regression tests 

## Exception Handling

We can use the command line to alter how Randoop handles exceptions. For example:

* **--npe-on-null-input=\<enum\>** - Expectation for a NullPointer Exception

* **--oom-exception=\<enum\>** - Expectation for an OutOfMemory Exception

* **--sof-exception=\<enum\>** - Expectation for a StackOverflow Exception

Enum values:
    -**ERROR** Occurrence of exception reveals an error  
    -**EXPECTED** Occurrence of exception is expected behavior  
    -**INVALID** Occurrence of exception indicates an invalid test   

 
## Use Case 1
[GuessApp Code](https://github.com/YSU-CSIS-SE/csci-5802-tooldemo-randoop/tree/master/GuessApp)

For our first use case we will be using Randoop to generate JUnit for a single class file.

GuessApp is a simple game that generates a random number between 1 and 10 and records how long it
takes for the user to guess the correct number. The project includes two files: GuessLogic.java,
a source file that contains the internal logic of the game, and GuessApp.java, a main file that 
that calls the GuessLogic class. For this example, we will be running Randoop on GuessLogic.class.

The command used to invoke Randoop on GuessLogic.class is listed below.

````
java -classpath C:\randoop-3.0.10\randoop-all-3.0.10.jar;GuessApp\build\classes randoop.main.Main gentests --testclass=guessapp.GuessLogic
````

The first thing Randoop did was generate test inputs for each of the test files. By the end,
Randoop had generated:

* 1016988 normal method executions
* 6748 exceptional method executions
* Average method execution time for nomal termination = 0.0901 s 
* Average method execution time for exceptional termination = 0.101 s 
* 35028 regression tests were created

![Use_Case_1_3](/Use_Case_1_3.png)

![Use_Case_1_2](/Use_Case_1_2.png)

Randoop then generated each of the JUnit test files. Randoop generate 71 test files and placed
them in the bin folder of the GuessApp project.

![Use_Case_1_4](/Use_Case_1_4.png)

The test suite includes 71 test files each named RegressionTest*x*.java (x is the number of the test file).
There is also a file called RegressionTest.java that contains a single class that uses the **@Runwith**
annotatino to run the entire test suite. 

![Use_Case_1_5](/Use_Case_1_5.png)

![Use_Case_1_6](/Use_Case_1_6.png)

The test files themselves have a wide range of test methods, most of which involve inputting
different argument values into the class methods and verifying that each variable contains the 
expected value with assertTrue(), as well as verifying that methods do not accept out of bounds
method arguments by testing for exceptions. The test files also verify that
the toString() method is consistent with the expected variable values.

![Use_Case_1_7](/Use_Case_1_7.png)

## Use Case 2
[Frogger Code](https://github.com/YSU-CSIS-SE/csci-5802-tooldemo-randoop/tree/master/Frogger)

For the second use case we will test running Randoop on several classes at once.

The Frogger project is a game that emulates the original Frogger aracade game. The goal of the
game is for the player to reach the other side of the screen while evading the different enemy
characters. The Frogger project contains seven classes: Character.class, Chaser.class, Hider.class,
Jumper.class, Patroller.class, ThirdTurn.class, and FroggerApp.class. Instead having to enter
multiple **testclass=\<classname\>** commands, a user can create a textfile that includes all of the
class files that the user wants to use to generate tests. The text file **testclasses.txt**
is listed below.

![Use_Case_2_1](/Use_Case_2_1.png)

All the user has to do is place the textfile into the designate classpath and invoke the file
using the command **--classlist=\<textfile\>**. To illustrate this, we will generate tests for the
Frogger class using the following command:

````
java -classpath C:\randoop-3.0.10\randoop-all-3.0.10.jar;Frogger\build\classes randoop.main.Main gentests --classlist=classlist.txt --omitmethods=frogger.Jumper.act
````

Note: We ommited the act method in Jumper.class because the method was nondeterministic and could 
not have reliable test generated.

Randoop first generated test inputs. The difference with Frogger is that, because the project
contains Swing GUI components, Randoop generated several GUI objects (e.g. JLabels, JButtons,
JFrames,etc). Randoop also opened all of the GUI components after creating them,
which meant my computer was littered with hundreds of windows. Luckily, they all closed automatically
after the tests were generated.

![Use_Case_2_2](/Use_Case_2_2.png)

Randoop generated:

* 184000 normal method executions
* 73 exceptional method executions.
* Average method execution time for nomal termination = 0.507s
* Average method execution time for exceptional termination = 69.6s
* 324 regression tests were generated.

![Use_Case_2_4](/Use_Case_2_4.png)

Because Randoop only generated 324 test methods, the program only generated two test files.
RegressionTest.java which uses **@Runwith** to run the rest of the test suite. Because there is
only one test file, RegressionTest.java is not necessary to run the test suite. 

![Use_Case_2_5](/Use_Case_2_5.png)

RegressionTest0.java is
very similar to the test files generated for use case 1. The test methods input
different argument values into the class methods and verifies that each variable contains the 
expected value with assertTrue(). The main differences from the last use case is that some of the
test methods are used to test the GUI objects as well, usually be converting the value of the JFrame
to an integer and asserting that the integer is equal to the expected size of the GUI component
![Use_Case_2_6](/Use_Case_2_6.png)

## Use Case 3
[JFreeChart Code](https://github.com/YSU-CSIS-SE/csci-5802-tooldemo-randoop/tree/master/jfreechart-1.0.19)

For this use case, we are going to test how to run Randoop on a Java library.

JfreeChart is a comprehensive free chart library for the Java platform. We will create a 
*classlist.txt* file that contains the names of all the class files in the JCommon-1.0.23.jar file. 

![Use_Case_3_1](/Use_Case_3_1.png)

The first step was creating the claslist.txt file. This library contains 131 classes, so the process took some time.
After compiling *classlist.txt* we generate the test files using the command

````
java -classpath jfreechart-1.0.19\lib\jcommon-1.0.23.jar;C:\randoop-3.0.10\randoop-all-3.0.10.jar randoop.main.Main gentests --classlist=classlist.txt --testsperfile=10
````

Note: We limited the number of tests per file to 10 in order to keep the number of test methods
per file manageable.

The program begins generating test inputs for the variables in the various
classes. Like use case 2, the program generated several GUI windows when
generating inputs. The program also, oddly enough, tried to send a file to
my printer several times while generating inputs.

Randoop generated:

* 629201 normal method executions
* 303 exceptional method executions
* Average method execution time for normal termination = 0.125s
* Average method execution time for exceptional termination = 60.6s


![Use_Case_3_2](/Use_Case_3_2.png)

The program created 4 error-revealing tests and created 1 ErrorTest file.
The program created 1246 regression tests and created 125 RegressionTest files.

![Use_Case_3_3](/Use_Case_3_3.png)

Like the regression tests, ErrorTest.java is a single class that runs the error-revealing test suite.
The error-revealing tests are constructed just like the regression tests.
The only difference is that the test files include comments telling the
user what error caused the test to fail. For example, test2() in ErrorTest0 includes the comment:

````
// during test generation this statement threw an exception of type java.lang.NullPointerException in error
````

![Use_Case_3_4](/Use_Case_3_4.png)

If JFreeChart was still under development, we would find the source of
these exceptions, edit the source code, and rerun Randoop to see if the 
program generates these errors again.

The regression test files were similar to the previous two use cases. RegressionTest.java runs the
entire test suite.
Each test file contains exactly ten test methods, as was outlined by the 
**testsperfile=10** part of the randoop command. Just like use case 2,
the test methods are used to verify that test variables create the expected
result in the program and uses boolean values to verify that the GUI 
components of JFrame create the correct objects.

![Use_Case_3_5](/Use_Case_3_5.png)

The fact that Randoop was still able to find errors in a finished open source project is impressive.

## Tool Evaluation

We have decided to evaluate the Randoop program based on the following 
criteria:

* **Ease of Use**: Because the program does not include a GUI component, the
user must be atleast somewhat familiar with command-line arguments and 
running java from the console.

* **Options**: The program includes a plethora of options for creating JUnit
tests. The user can customize how many test files are generated, how many
test methods are created, what kinds of methods are tested, how to handle exceptions, etc. The user
has a great deal of flexibility in how they want the JUnit tests to be generated.

* **Adaptability**: Because of the way that Randoop generates tests, it cannot
create tests on methods that are nondeterministic or set static fields. Randoop extends previously
generated tests by adding new methods to them. If one of the subtests throws an exception, then
the test is considered flaky.

For example, if a method's return value is based on a random number generator,
then Randoop will find different results every time it runs the subtest.
When this happens, Randoop stops generating tests for **ALL** methods and the
user has to use the **--log** command to find what method caused the error.

**Efficiency**: Randoop is able to generate a large number of tests very 
quickly, the program is able to generate test in literally less than a
second.

**Installation**: Randoop is very easy to install, all the user has to 
do is unzip the main folder and place it in a directory.

**Learning Curve**: While the program itself is easy to understand, setting
new classpaths so that the program can find the desired class file is
difficult at first. Randoop requires that the classpath contains the
directory where the first part of the package name is a subdirectory. This is not mentioned
in the Randoop manual and outside of this manual there is very little documentation on the program.
Overall, the program requires a great deal of trial and error.

**Scalability:** In order to generate tests for multiple classes, the user
has to create a text file that lists all of the class files. The larger
the project, the longer it takes the user to create this text file. It 
would be more helpful if the program was able to scan a directory for
class files.

**Usability of Tests:** While the program does generate a lot of tests, finding which tests are
useful for describing the behavior of the class is another matter. The program seems to generate a test
for every conceivable test imaginable, and if any of these tests fail, it would be difficult to
determine how the code is affecting that test. 

Overall, while the program does require some command-line knowledge and
has a steep learning curve, the efficiency and customizability of the program
makes it a very convenient way to generate JUnit tests. The program is 
especially good at generating tests files for java libraries. The program
is easy to install as well, so it is very easy for a user to download the
program and try it out for themselves.

The main issue with Randoop is sifting through all of the generated tests to find the tests that
describe the behavior that the user finds useful. To really make Randoop useful, you would need
another program (or very dedicated employee) to search through the test files and compile the most
useful results.
