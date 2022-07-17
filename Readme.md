This framework was built off the amazing work done by omprakashchavan01 on https://github.com/omprakashchavan01/appium-cucumberbdd

It was the closest implementation seemingly accomplishing the requested assignment (the only exception is this framework is built off of java not javascript)

This repurposes the framework to use the awesomeapp!

Technologies you will need to get this working:

- java (built on jre 15)
- maven (brew install maven)
    - this will allow you to download dependencies used in teh framework.
- allure (brew install allure)

Other information on how this was built. 
- The IDE used was intellij, it effectively handled using maven to resolve any dependancies. 
- This was also ran on a Mac. Will probably work on windows, but has not been tested. 

To run this framework once you have downloaded all dependancies, open a terminal in the root project folder and run 

- mvn clean install
- allure serve allure-results

Changing run configuration
To change how the application runs (usually via either iOS or Android), go to and update PlatformName and DeviceName in /src/main/resources/config.properties