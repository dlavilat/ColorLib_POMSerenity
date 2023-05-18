#Autor: Diana Lucia Avila

  @HistoriaDeUsuario
  Feature: Verify loggin session for colorlib platform
    Me as a user WANT to enter the colorlib page TO verify if I can access to correctly

  @CasoAutenticacionCorrecta
  #Scenario: Verify correct entry
  #  Given I enter with my credentials
  #  When I proceed with the authentication
  #  Then go to the main view of the page

  Scenario Outline: Verify correct entry
    Given I enter with my credentials
      |User|Password|
      |<User>|<Password>|
    When I proceed with the authentication
    And go to the main view of the page
    And enter submenu form validations
    And Check the title of the form on the screen
    And fill out information
    And clic button Validate
    Then all fields will be empty

    Examples:
    |User|Password|
    |admin|admin|


