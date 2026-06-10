public class Lecture65{
    public static void main(String[] args) {
        /*
            How a Java program is executed

            Step 1: Compilation

            javac Lecture65.java

            => Lecture65.java -> Lecture65.class

            The .class file contains bytecode.


            Step 2: Execution

            java Lecture65

            => JVM loads and executes Lecture65.class

            The same bytecode can run on different operating
            systems as long as a JVM is available.
            */


            /*
            Packages

            Import a specific class:

            import java.util.Scanner;

            Import all classes from a package:

            import java.util.*;

            Using a fully qualified class name:

            java.util.Scanner sc =
                    new java.util.Scanner(System.in);
            */


            /*
            Package creation

            If the source file contains:

            package mypackage;

            Then:

            javac -d . Demo.java

            creates the required package directory structure
            and stores Demo.class inside it.

            javac -d . *.java


            compiles all Java files and creates their
            corresponding package directories.
        */ 
    }
}