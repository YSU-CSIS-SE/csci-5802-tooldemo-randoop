#### Installing Randoop (Linux)

---

* Got to https://randoop.github.io/randoop/   (Hey, it's a github project page!)
* Click the button to download the latest release, and get the "randoop-all" version of the zip file.
* Uncompress randoop and make note of it's filepath.
* Test it by typing in the following: 
java -ea -classpath "linux file path and name to randoop.jar" randoop.main.Main help  
Example:

```
main@main-VirtualBox:~$ java -ea -classpath /home/main/randoop-all-3.1.2.jar randoop.main.Main help 

Randoop for Java version 3.1.2.

Randoop  is a command-line tool that creates unit tests for Java.
It accepts one of the commands listed below. For the user manual,
please visit https://randoop.github.io/randoop/manual/index.html

Type `help' followed by a command name to see documentation.


Commands:

gentests -- Generates unit tests for a set of classes.

help -- Displays a help message for a given command.
```
