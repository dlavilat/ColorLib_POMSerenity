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
      |Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|
      |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password>|<ConfirmPassword>|<MinField>|<MaxField>|
    And clic button Validate
    Then all fields will be empty

    Examples:
    |User|Password|Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|
    |admin|admin|prueba  |option2|option3        |http://dfsdfd.com|a@q.com|123|123 |1|null           |


