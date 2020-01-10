@vehicle_costs
  Feature: create vehicle costs

    Scenario: create vehicle costs
      Given user is on the login page
      And user logs in as store manager
      Then user navigates to "Fleet" then to "Vehicle Costs"
      And user click on "Create Vehicle Costs" button
      Then user adds new vehicle costs information:

      |Type               |Price      |Date            |Description    |
      |Road Assistance    | 1000      | Jan 2, 2020    | Flat Tire     |
      |Tax Roll           | 3000      | Dec 25, 2019   | Tax money     |