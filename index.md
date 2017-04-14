
---
layout: markdown
title: Randoop
theme: jekyll-theme-time-machine
---
### Welcome to GitHub Pages.This automatic page generator is the easiest way to create beautiful pages for all of your projects. Author your page content here [using GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/), select a template crafted by a designer, and publish. After your page is generated, you can check out the new `gh-pages` branch locally. If you’re using GitHub Desktop, simply sync your repository and you’ll see the new branch.### Designer TemplatesWe’ve crafted some handsome templates for you to use. Go ahead and click 'Continue to layouts' to browse through them. You can easily go back to edit your page before publishing. After publishing your page, you can revisit the page generator and switch to another theme. Your Page content will be preserved.### Creating pages manuallyIf you prefer to not use the automatic generator, push a branch named `gh-pages` to your repository to create a page manually. In addition to supporting regular HTML content, GitHub Pages support Jekyll, a simple, blog aware static site generator. Jekyll makes it easy to create site-wide headers and footers without having to copy them across every page. It also offers intelligent blog support and other advanced templating features.### Authors and ContributorsYou can @mention a GitHub username to generate a link to their profile. The resulting `<a>` element will link to the contributor’s GitHub Profile. For example: In 2007, Chris Wanstrath (@defunkt), PJ Hyett (@pjhyett), and Tom Preston-Werner (@mojombo) founded GitHub.### Support or ContactHaving trouble with Pages? Check out our [documentation](https://help.github.com/pages) or [contact support](https://github.com/contact) and we’ll help you sort it out.
# Randoop Write-up
As stated by it's creators:  
Do you love writing unit tests to find bugs in your programs? Or, would you prefer that the tests were written for you automatically?  

Randoop is a program that automatically generates JUnit test files for Java classes. Randoop
outputs two kinds of tests:

* Error-Revealing Tests: Tests that detect bugs in the current code
* Regression Tests: Tests that can be used to detect other bugs

Usually, the user fixes all errors that appear in error-revealing tests and then rerun randoop
until it does not generate any error-revealing tests.

## Installation

To install randoop, a user simply has to do the following:

* Go to https://randoop.github.io/randoop/   (Hey, it's a github project page!)
* Click the button to download the latest release, and get the "randoop-all" version of the zip file.
* Uncompress randoop and make note of it's filepath.
* Test it by typing in the following:  
java -ea -classpath "linux file path and name to randoop.jar" randoop.main.Main help  

## Running Randoop

#### NOTE: The Windows path separator is ";" - Linux path separator is ":" -- In Windows if cp argument does not contains white space, the "quotes" is optional.  

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
* **testclass=<classname>** - Specifies the class that Randoop will generate tests for  

Note - If the class being tested is part of a package, the classpath always contains the 
directory where you would expect to see the first part of the package name as a subdirectory.
When entering the desired class in **testclass**, it should be fully qualified by the package name
(e.g. guessapp.GuessLogic).

## Command-line Options

Randoop includes several command-line options that allows the user to tailor the way Randoop runs
and modify the test files output by Randoop. The follwoing list includes a few exmaples

* **--junit-output-dir=<classpath>** - Change the destination of the generated test files
* **--dont-output-tests=<boolean>** - Run test generation without output
* **--timelimit=<int>** - Forces Randoop to stop generate tests after a period of time
* **--outputlimit=<int>** - Limits the number of regression and error-revealing tests
* **--omitmethods=<regex>** - Prevents tests being generated for methods whose name matches the
regular expression given
* **--inputlimit=<int>** - Limits the number of test method candidates generated internally
* **--forbid-null=<boolean>** - Forbids Randoop from using null as input to methods or constructors
* **--testsperfile=<int>** - Limits the number of tests to write to each JUnit file
* **--error-test-basename=<string>** - Choose the base name of the JUnit file containing error-revealing
tests
* **--regression-test-basename=<string>** - Choose the base name for the JUnt file containing 
regression tests 

 
## Use Case 1

GuessApp is a simple game that generates a random number between 1 and 10 and records how long it
takes for the user to guess the correct number. The project includes two files: GuessLogic.java,
a source file that contains the internal logic of the game, and GuessApp.java, a main file that 
that calls the GuessLogic class. For this example, we will be running Randoop on GuessLogic.class.

The first use case was run on the GuessLogic class in the GuessApp project. The command used to
invoke Randoop on GuessLogic.class is listed below.

````
java -classpath C:\randoop-3.0.10\randoop-all-3.0.10.jar;C:\User\esplin\Documents\NetBeansProjects\GuessApp\build\classes randoop.main.Main gentests --testclass=guessapp.GuessLogic
````

The first thing Randoop did was generate test inputs for each of the test files. By the end,
Randoop had generated 1016988 normal method executions and 6748 exceptional method executions.
The average method execution time for nomal termination was 0.0901 and the average method execution
time for exceptional termination was 0.101. The number of regression tests created was 35028.

Randoop then generated each of the JUnit test files. Randoop generate 71 test files and placed
them in the bin folder of the GuessApp project.

The regression test files are each named RegressionTest*x*.java (x is the number of the test file).
There is also a file called RegressionTest.java that contains a single class thta contains an
**@Runwith** annotation that invokes all of the related test files. This class is used to run all
of the JUnit test files. 

The test files themselves have a wide range of test methods, most of which involve inputing
different argument values into the class methods and verifying that each variable contains the 
expected value with assertTrue(), as well as verifying that methods do not accept out of bounds
method arguments by testing for ArrayIndexOutofBounds exceptions. The test files also verify that
the toString() method is consistent with the expected variable values.

## Use Case 2

The Frogger project is a game that emulates the original Frogger aracade game. The goal of the
game is for the player to reach the other side of the screen while evading the different enemy
characters. The Frogger project contains seven classes: Character.class, Chaser.class, Hider.class,
Jumper.class, Patroller.class, ThirdTurn.class, and FroggerApp.class. Instead having to enter
multiple **testclass=<classname>** commands, a user can create a textfile that includes all of the
class files that the user wants to use to create test files. The text file **testclasses.txt**
is listed below.

All the user has to do is place the textfile into the designate classpath and invoke the file
using the command **--classlist=<textfile>**. To illustrate this, we will generate tests for the
Frogger class using the following command:

````
java -classpath C:\randoop-3.0.10\randoop-all-3.0.10.jar;C:\Users\esplin\Documents\NetBeansProjects\Frogger\build\classes randoop.main.Main gentests --classlist=classlist.txt --omitmethods=frogger.Jumper.act
````

Note: We omited the act method in Jumper.class because the method was nondeterministic and could 
not have test generated.

Randoop first generated test inputs. The difference with Frogger is that, because the project
contains a GUI component, Randoop generated several Java visual objects (e.g. JLabels, JButtons,
JFrames,etc). Randoop would also load all of the GUI components, which slowed my computer down to
a crawl. 

Randoop generated 184000 normal method executions and 73 exceptional method executions.
The average method execution time for nomal termination was 0.507 and the average method execution
time for exceptional termination was 69.6. The number of regression tests created was 324.

Because Randoop only generated 324 tests. The program only generated two test files.
RegressionTest.java is a single class with a @Runwith annoation that invokes all generate test
files (this is unnecessary because there is only one other test file. RegressionTest0.java is
very similar to the test files generated for use case 1. The test methods input
different argument values into the class methods and verify that each variable contains the 
expected value with assertTrue(). The test methods also verify that methods do not accept out of bounds
method arguments by testing for ArrayIndexOutofBounds exceptions. The test files also verify that
the toString() method is consistent with the expected variable values. The main differences
from the last use case is that some of the test methods are used to test variables in the GUI,
such as testing that the cursor location is validate or that VolatileImage objects do not lose
their contents during execution.

## Use Case 3

JfreeChart is a comprehensive free chart library for the Java platform.
For this use case, we will demonstrate how effective Randoop is at document
java libraries. We will create a *classlist.txt* file that contains the
names of all the class files in the JCommon-1.0.23.jar file. 

After compiling classlist.txt (which contains 131 class names) we generate
the test files using the command

````
java -classpath C:\Users\esplin\jfreechart-1.0.19\lib\jcommon-1.0.23.jar;C:\randoop-3.0.10\randoop-all-3.0.10.jar randoop.main.Main gentests --classlist=classlist.txt --testsperfile=10
````

Note: We limited the number of tests per file to ten in order to keep the
number of test files generated manageable.

The program begins generating test inputs for the variables in the various
classes. Like use case 2, the program genrated severl JVM windows when
generating inputs. The program also, oddly enough, tried to send a file to
my printer several times while generating inputs.

Randoop generated 629201 normal method executions and 303 exceptional
method executions. The average method execution time for nomal 
termination was 0.125 and the average method execution time for exceptional
termination is 60.6.

The program created 4 error-revealing tests and created 1 ErrorTest files.
The program created 1246 regression tests and created 125 error test files.
Like the regression tests, ErrorTest.java is a single class that uses a
@Runwith annotation to invoke ErrorTest0.java. RegressionTest.java also
contains a class that uses the @RunWith annotation to invoke the other 125
regression tests.

The error-revealing tests are constructed just like the regression tests.
The only difference is that the test files include comments telling the
user what error caused the test to fail during generation. For example,
test2() in ErrorTest0 includes the comment:

````
// during test generation this statement threw an exception of type java.lang.NullPointerException in error
````

If JFreeChart was still under development, we would find the source of
these exceptions, edit the source code, and rerun Randoop to see if the 
program generates these errors again.