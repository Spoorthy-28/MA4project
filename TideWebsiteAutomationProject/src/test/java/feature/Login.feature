Feature: Check Whether Antibacterial text is present in the search result

Scenario Outline: validate text in search result
Given invoke the chrome driver
And navigate to "https://qaclickacademy.com/" site
And click on search field
When user enters <text> and clicks on find icon
Then verify if that <text> is present in the search results

Examples:
|text		 |
|Antibacterial|