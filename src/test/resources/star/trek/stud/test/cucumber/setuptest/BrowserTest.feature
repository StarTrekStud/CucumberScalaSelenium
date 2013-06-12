Feature: Test browser interaction

    Scenario: Search on yahoo
    Given I am on the 'http://www.yahoo.com' page
    When I enter the search term 'testing'
        And I submit the search
    Then I should be shown results for the search term 'testing'