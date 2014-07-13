FizzBuzz
========

Solve the FizzBuzz problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

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
    - Modify the CloudBees Jenkins build definition to deploy correctly to CloudFoundry
    - On a git commit, CloudBees Jenkins as a service builds the war, runs tests and pushes to http://spring-boot-fizzbuzz-kelapure.cfapps.io/fizzbuzz  
