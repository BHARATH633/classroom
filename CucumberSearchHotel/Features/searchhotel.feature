#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Adactin Application for search hotel
 Background: user
 Given name of username


 
  Scenario Outline: Verifying the search hotel adactin Application
    Given launch Adactin Application
    Given enter username <un>
    When enter password <pwd> 
    When click on login button
    And Search hotel depends on requirement
    And click on search button
    

    Examples: 
      | un           |   pwd |   
      | rameshadepu |     ramesh11 | 
      
