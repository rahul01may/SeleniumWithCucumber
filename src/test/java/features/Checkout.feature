Feature: Checkout and Place Order
@PlaceOrder
Scenario Outline: Search and Add 3 item bag and PlaceOrder

Given Landing to GreenKart page 
When User Search with Shortname <Name> and extract the actual name 
And Add "3" item of the selected product into card 
Then User Proceed to Checkout and validate the <Name> item into checkout page 
And verify user has ability to enter promocode and place the order 
And Select random country and Procced the order

Examples:
| Name |
| Tom  |

