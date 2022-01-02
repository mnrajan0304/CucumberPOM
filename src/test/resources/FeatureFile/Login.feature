@SearchHotel
Feature: verifying Addactin Hotel

Scenario Outline: Selecting all fileds

Given user is on Adactin hotel page
When user should login "<Username>" and "<Password>"
And user should search hotel by "<Location>", "<Hotel>", "<Noofromms>", "<Roomtype>", "<CheckinData>", "<CheckOutdate>","<Adultsroom>" and "<Childroom>"
Then user click on submit buuton

Examples:

|Username|Password|Location|Hotel|Noofromms|Roomtype|CheckinData|CheckOutdate|Adultsroom|Childroom|
|manirajan|Dhoni1234|Sydney|Hotel Sunshine|Double|3 - Three|02/03/2022|03/04/2022|2 - Two|1 - One|

