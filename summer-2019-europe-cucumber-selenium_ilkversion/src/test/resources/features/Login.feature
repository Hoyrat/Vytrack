
@login
Feature: Users should be able to login

  Background: #baslangicta ayni olan adimlar buraya yazilir
    Given the user is on the login page

  @driver @VYT-123 @smoke
  Scenario: Login as a driver
    #Given the user is on the login page-->ihtiyacimiz yok
    When the user enter the driver information
    Then the user should be able to login
  @sales_manager @VYT-123 @smoke @db
  Scenario: Login as a sales manager
   # Given the user is on the login page -->ihtiyacimiz yok-->go to Backgroung
    When the user enter the sales manager information
    Then the user should be able to login
  @store_manager @db
  Scenario: Login as a store manager
   # Given the user is on the login page-->ihtiyacimiz yok
    When the user enter the store manager information
    Then the user should be able to login
