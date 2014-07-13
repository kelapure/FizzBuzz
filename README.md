FizzBuzz
========

Solve the FizzBuzz problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

Architecture
This application was initially designed as standalone jar file, thereafter transformed to a spring boot application and ultimately became a web application i.e. war file. The code leverages the Java 8 lambda and streams support to solve the FizzBuzz problem. Continous Integration is achieved via the CloudBees-CloudFoundry Integration wherein a git push to the repo. results in a build being triggered and a deployment to CloudFoundry if the build is clean. 

Plan
 1. Create Junit Tests to test the FizzBuzz Problem
 2. Create Implementation class that solves the problem
 3. Create JAX-RS web service that responds to a front end UI
 4. Create a maven/gradle build to build a war file
 5. Push the rest webservice jar to Pivotal WebServices
    - Fork the Java Buildpack to support Java 8 
    - cf push using the -b option to point to the [forked java buildpack](https://github.com/kelapure/java-buildpack.git) 
    - See application pushed to dev space @ http://fizzbuzz-spring-boot.cfapps.io/fizzbuzz
 6. Continous Delivery pipeline for promotion 
    - Fork the CloudBees CloudFoundry ClickStart https://github.com/kelapure/cloudfoundry-spring
    - Change spring-boot project to output war file to overcome CloudBees inability to push jar files 
    - Modify the CloudBees Jenkins build definition to deploy the war file to CloudFoundry
    - On a git commit, CloudBees Jenkins as a service builds the war, runs tests and pushes to http://spring-boot-fizzbuzz-kelapure.cfapps.io/fizzbuzz  

Note
 - Commits have not been squashed. 
 - The promotion of the application across the different spaces (dev--> staging --> production) is a ToDo yet to be addressed
 


