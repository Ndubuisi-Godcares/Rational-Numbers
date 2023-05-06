# Rational-Numbers

This package contains two classes: Main and Rational.

Main
The Main class demonstrates how to handle exceptions in Java. It takes four command line arguments and creates two Rational objects from the first two and last two arguments, respectively. It then performs various arithmetic operations on the Rational objects and prints the results to the console.

If any of the command line arguments cannot be parsed as integers, the program catches the resulting NumberFormatException and prints an error message to the console.

Rational
The Rational class represents a rational number as a fraction of two integers, a numerator and a denominator. It provides methods for performing arithmetic operations on Rational objects and for converting them to doubles, finding their absolute values, and comparing them.

If a Rational object is created with a denominator of zero, the constructor throws an IllegalArgumentException. If the divide method is called with a Rational object whose numerator is zero, it also throws an IllegalArgumentException.

How to Use
To use this package, import it into your Java project and create Rational objects to represent the rational numbers you want to work with. Then use the Rational methods to perform arithmetic operations and compare the Rational objects. If you use the Main class as a template for your own code, be sure to provide command line arguments that can be parsed as integers.
