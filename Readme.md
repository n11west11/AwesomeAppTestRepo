# Intro
This framework was built off the amazing work done by omprakashchavan01 on https://github.com/omprakashchavan01/appium-cucumberbdd

It was the closest implementation seemingly accomplishing the requested assignment (the only exception is this framework is built off of java not javascript)

This repurposes the framework to use the awesomeapp!

##Technologies you will need to get this working:

- java (built on jre 15)
- maven (brew install maven)
    - this will allow you to download dependencies used in teh framework.
- allure (brew install allure)

Other information on how this was built. 
- The IDE used was intellij, it effectively handled using maven to resolve any dependancies. 
- This was also ran on a Mac. Will probably work on windows, but has not been tested. 

##How to run
To run this framework once you have downloaded all dependancies, open a terminal in the root project folder and run 

- mvn clean install
- allure serve allure-results

##Scenarios and Example
Cucumber Scenarios can be found in src/test/resources
Here's an example

@awesomeapptest\
@issue=2\
Feature: Landing page navigation

Scenario Outline: Landing page tabs \
When I click the "<tab>" tab\
Then I see the "<tab>" page\
Examples:\
| tab |\
| dashboard |\
| settings  |

## Changing run configuration
To change how the application runs (for instance on how to run iOS or Android), go to and update PlatformName and DeviceName in /src/main/resources/config.properties

You can see a demo of this in action on the iOS by watching the iOSDemo.mov

Individual android demos of each scenario are also loaded to the repository. 

##Demos
Demos can be found here https://drive.google.com/drive/folders/1qiwjUr1qMyY0VW6NTqd-if4yKCVb4lk4?usp=sharing