Feature: Contacts page


  Scenario: Default page number
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Customers" "Contacts"
    Then default page number should be 1


    Scenario: verify Calender events
      Given the user is on the login page
      And the user enter the sales manager information
      When the user navigates "Activities" "Calls"



      Scenario: Menu option
        Given the user logged in as a "driver"
        Then the user should see following menu option
        |Fleet|Customers|Activities|System|


        Scenario: login as a given user
          Given the user is on the login page
          When the user logs in using following credential
          |username        |user1      |
          |user1           |UserUser123|
          |salsemanager123 |John       |
          |storemanager    |Doe        |



  Scenario Outline: login as a given user
    Given the user is on the login page
    When the user logs in using following credential
      |username |<username>        |
      |password |UserUser123       |
      |firstname|<firstname>       |
      |lastname |<lastname>         |

    Examples:

      |username           |firstname  |lastname|
      |user1              |John       |Doe     |
      |salesmanager101    |Peyton      |Harber     |
      |storemanager85       |Marcella bnmbnmbmn      |Huels     |



  Scenario Outline: Login with different users <usertypes>
    Given the user logged in as a "<usertypes>"
    When the user navigates "<tab>" "<module>"
    Then the title should contains "<title>"
    
    Examples:
      | usertypes     | tab        | module          | title                                                              |
      | driver        | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Customers  | Contacts        | Contacts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | System     | Menus           | All - Menus - System                                               |