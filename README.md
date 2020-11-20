Refactoring Golf
================

Refactoring Golf is a game designed to stretch your refactoring muscles and get you to explore your IDE to see what’s really possible using shortcuts and automation.

This repo contains a number of 'rounds', each equivalent to a 'hole' of a golf game. Your goal is to (as safely and efficiently as possible) refactor the Round\_N\_A code to look like the Round\_N\_B code. You must aim to do it in as few “strokes” as possible. A stroke is essentially a change made to the code, and every stroke costs you points.

You should count your score as follows:

- 1 point for every change made to the code using a shortcut or automated IDE feature (e.g., automated refactoring, code template, or Find/Replace).
- 2 points for every manual edit. Note that a single “edit” could cover multiple lines of code.
- Double points for every change made while the code is failing the tests from the previous change.
- Zero points for code formatting (e.g., deleting whitespace or optimizing imports).
- Allow yourselves a maximum of two attempts at each round to determine your best score.


Credits
-------

This code is based on an exercise designed by Jason Gorman [RefactoringGolfJava](https://github.com/jasongorman/RefactoringGolfJava)
