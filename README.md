# DGIT Systems Coding Assessment!

This project provides the following APIs and is developed using spring boot, gradle and adding new API for fetching phonenumbers and activating them.

#### Count Words Coding Assignment

Write a program called Count Words that processes a List of Strings and applies the following business rules:

- Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
- Returns all the words longer than 5 characters

#### Hints

- Make sure you implement this test like you would all your production code (Documentation, unit tests, build/packaging, etc.).
- Business rules change and new ones pop up all the time; how will you account for this?
- Please don't input words from standard input, no one likes to type long list of names manually.

Project Repo URL: https://github.com/meera-gkpanicker/dgit-assessment.git

Please follow the below steps to build and run this application built using maven. 
1. Clone the repo and import the same in an IDE eg: Intellij
2. The input for the application can be provided in the file "input.txt" present inside the resources folder.
3. After build completes, run the application using the below command 
>mvn clean install exec:java
4. This will build, package the jar file and run the program CountWords.java

Based on the input data, the output can be seen as shown below both in the console and also in the log file named "dgit-assessment.log"

14:55:24.812 [com.dgit.assessment.CountWords.main()] INFO  com.dgit.assessment.CountWords - Wordcount: 3
14:55:24.813 [com.dgit.assessment.CountWords.main()] INFO  com.dgit.assessment.CountWords - Five Character Count: 50

Alternatively, this project can be directly run from Intellij by running CountWords.java program. 

If business rules change, then only the method countWords in the BusinessRule class has to be updated with 
the latest logic. The configuration and execution remains the same. 
