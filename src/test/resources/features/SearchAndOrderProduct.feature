#Einloggen im Webshop
#Navigieren zum Produkt HP Z3200 WIRELESS MOUSE
#Legen Sie Laptop der Farbe Grau und 3 der Farbe weiß in den Warenkorb.
#Führen Sie den Bezahlprozess bis zum Ende durch.
#Registrieren Sie einen User
#Der richtige Preis und der Gesamtpreis sollen mindestens verifiziert werden.

  # As a user I should be navigate to product with search button
  # As a user , I should be able to order product in the color I want and pay
  # By Mehmet Firez



Feature:As a user , I should be able to search and order product

  Background:
    Given the user is on the home page

  @msg
  Scenario: Navigate to Product
    And the user click to the search button
    When the user enters product name "HP Z3200 WIRELESS MOUSE"
    And the user click product
    Then the user should be able to see the product "HP Z3200 WIRELESS MOUSE"

  @msg
  Scenario: Order Laptop and pay
    When the user navigate to "laptops"
    And the user selected the color GRAY
    And the user add to cart one Gray Laptop
    And the user selected the color WHITE
    And the user add to cart three White Laptops
    And the user click to cart
    And  the user click registration
    And the user should be create a account with valid credential
    And the user navigate to order payment page
    And the user should be choose payment method and enters valid credentials
    Then the user should be able to pay successfully "$2,161.96"



