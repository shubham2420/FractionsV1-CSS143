# FractionsV1-CSS143

Summary

In this assignment, you will build a program using techniques from previous CSS courses that counts unique fractions. No new constructs from our readings are expected, and as such, you can complete this program with just a handful of lines (12-25) of code in just one main function. (But do NOT feel that your code needs to be that short!) Note that the use of methods will improve your design and improve your grade. You will need to use loops, ifs, comments, etc., (in other words, structured programming) to complete this assignment and achieve the outcomes listed below. Included below is a sample execution of your program as well as a list of outcomes your program is to implement; notice reduction of fractions is optional in this version of the assignment. Do NOT build any classes (other than your driver, obviously). You are NOT allowed to use any of Java's built-in abstract data types like ArrayList or HashMap or any of that stuff. Just use the kinds of stuff that you used in CSS 142. This is meant to be a reminder of what you did there.

Introduction

Your project is to read in a series of fractions from a text file, which will have each line formatted as follows: “A/B”. A sample text file is listed below, and the purpose of your program is to read in each fraction and count the number of occurrences for the current fraction. When all the input is consumed (or as the input is consumed), your program will print out its list of unique fraction and their corresponding count – see the output below (and you may assume no blank lines or misleading characters; see the text file link on the website for one of the actual inputs I’ll use when testing your submission).

Sample Input File

fractions.txtPreview the document

Sample Text Input 6/3

7/3

6/3

12/6

Sample Console Output 6/3 has a count of 3

7/3 has a count of 1

NOTE: it is also fine (though not required) if your program simplifies the fractions so that the output is:

2/1 has a count of 3

7/3 has a count of 1

---But either way, 6/3 and 12/6 count as the same fraction, so you do need some mechanism for determining if two fractions that look different are actually the same. The only optional part of the assignment is how you display them in the end.

Questions

Answer the following questions using multi-line comments in your code, at the top. (5%)

Can you complete this without using arrays? What is the least number of variables you can use to solve this problem? Can you use just one array to solve this? What would the data type be of that array? What does it mean to make a class so another class is inside (or part of) the first class, so that it is composed of other data types? What does "composition" mean in that case? How is it done? What are some solutions to the reduction problem other than Euclid's GCD algorithm?

Notes & Hints

Be sure to put code that gets lengthy into its own method! This assignment is particularly guiding in the outcomes section; expect future assignments to test your ability to build your own programming contract for the problem at hand. Test your code as you add features (either methods or variables) incrementally, making sure your small change works as you envisioned it to. Try to keep in mind basic “structured programming” principles such as modular design (ie, decompose complex tasks into individual methods), good variable & methods names (self-documenting code), and comments. Consider reading one line at a time (with scanner.nextLine()), and using the split (Links to an external site.) function (defined in class String) to give you an array with two elements in it (the numerator and denominator, respectively) Don’t wait till the last minute to get help from the instructor, the TA, or our lab tutors!
