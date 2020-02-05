
  Feature: Account types


    Scenario: Driver user
       Given the user logged in as a "Driver"
       When the user navigates "Activities" "Calendar Events"
       Then the title should contains "Calendar Events - Activities"


    Scenario: sales manager user
       Given the user logged in as a "sales manager"
       When the user navigates "Customers" "Accounts"
       Then the title should contains "Accounts - Customers"



   Scenario: store manager
           Given the user logged in as a "store manager"
           When the user navigates "Marketing" "Campaigns"
           Then the title should contains "All - Campaigns - Marketing"




           Scenario Outline: Login with different users <usertypes>
             Given the user logged in as a "<usertypes>"
             When the user navigates "<tab>" "<module>"
             Then the title should contains "<title>"

             Examples:
            |usertypes    |  tab       |module         |title                       |
            |driver       |Activities  |Calendar Events|Calendar Events - Activities|
            |sales manager|Customers   |Accounts       |Accounts - Customers        |
            |store manager|Marketing   |Campaigns      |Campaigns - Marketing       |

    @wip
    Scenario: Contacts test with email
      Given the user logged in as a "store manager"
      And the user navigates "Customers" "Contacts"
      When the user click the "mbrackstone9@example.com" from contacts
      Then the information should be the same with database

