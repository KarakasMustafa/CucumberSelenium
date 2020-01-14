package com.vytrack.classNotes;

public class CucumberBeginningNotes {
    /*
    Gherkin is not a programming language, its a collection of keywords that are used to write test scenarios.

    Feature: Login                       ==> user story title
    As a user, I want to be able to login to vytrack
    under different roles with username and password

        Scenario: Login as store manager
         Given user is on the login page
         Then user logs in as store manager
         And user verifies that "Dashboard" page subtitle is displayed


    we can use Feature only once inside the feature file but multiple scenarios.

    And we implement the codes inside the step_definitions package by getting help from the Cucumber runner

    #################################################################

    in cucumber, we can create


     */

    /*
    12/19/2019

        Background is a pre-condition for every test scenario in one particular feature file. Instead of repeating same
        test steps for every scenario, we can put these steps into background.

        Flow of execution:

        hook ==>    background  ==>

     */
}
