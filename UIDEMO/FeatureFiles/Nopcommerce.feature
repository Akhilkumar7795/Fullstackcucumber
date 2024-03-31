Feature: Ordering Products via Application

Scenario: Placing an Order for a Laptop
Given the user is on the login page
When the user searches for a laptop
Then a list of laptops should be visible
And the user selects the first laptop from the list
And places the order for purchase