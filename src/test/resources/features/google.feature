@testtag
Feature: Search on google
  As an user
  Creates nothing new

  Scenario: 1. Search for specific word
    Given the google page is opened
    When "word" is inserted
    When click on search button
    Then search results are returned