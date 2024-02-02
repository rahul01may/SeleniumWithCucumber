Feature: Landing page Scenarios 
@OfferPage
Scenario Outline: Search Experience for Product Search in both home and Offers page 

Given Landing to GreenKart page 
When User Search with Shortname <Name> and extract the actual name 
Then user searched for <Name> shortname in offerpage
And validate proiduct name in offerpage matches with Landing page 

Examples:
| Name |
| Tom  |
| Beet |
