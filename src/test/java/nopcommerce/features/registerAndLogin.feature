@address
Feature: Register and login

@register_login
  Scenario: Register to system and Login
    Given Open Register page
    And Input to Firstname textbox
    And Input to Lastname textbox
    And Input to Email textbox
    And Input to Password textbox
    And Input to Confirm password textbox
    And Click to Register button
    Then Verify sucessful register message displayed
    When Navigate to Login page
    And Input to loginEmail textbox
    And Input to loginPassword textbox
    And Click to Login button
    Then Verify Home page displayed
    
@new_address
  Scenario Outline: New address
  	Given Open "My account" page
    And Navigate to "Addresses" page
    When Click to "Add new" button
    And Input to "Address_FirstName" text box with value "<FirstName>"
    And Input to "Address_LastName" text box with value "<LastName>"
    And Input to "Address_Email" text box with value "<Email>"
    And Select in "Address.CountryId" dropdown with value "<Country>"
    And Input to "Address_City" text box with value "<City>"
    And Input to "Address_Address1" text box with value "<Address1>"
    And Input to "Address_Address2" text box with value "<Address2>"
    And Input to "Address_ZipPostalCode" text box with value "<ZipCode>"
    And Input to "Address_PhoneNumber" text box with value "<Phone>"
    And Input to "Address_FaxNumber" text box with value "<Fax>"
    And Click to "Save" button
    Then Success message displayed with "The new address has been added successfully."
    And The valid text display at "name" with value"<FirstName> <LastName>"
    And The valid text display at "email" with value"Email: <Email>"
    And The valid text display at "phone" with value"Phone number: <Phone>"
    And The valid text display at "fax" with value"Fax number: <Fax>"
    And The valid text display at "address1" with value"<Address1>"
    And The valid text display at "address2" with value"<Address2>"
    And The valid text display at "city-state-zip" with value"<City>, <ZipCode>"
    And The valid text display at "country" with value"<Country>"
    
    Examples:
    | FirstName | LastName | Email    | Country  | City    | Address1      | Address2        | ZipCode | Phone      | Fax        |
    | Tony      | John     | tonyjohn | Viet Nam | Da Nang | 123/04 Le Lai | 234/5 Hai Phong | 550000  | 0987654321 | 0123456789 |