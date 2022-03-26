#Cristian Avendaño Cadavid
  @stories
  Feature: User create
  I want to automatice the create new user in Utest

    @scenary1
    Scenario Outline: Search the link UTest
      Given that Camilo wants automation the create new user in Utest
      When he complete the form for create user
        | strFirsName | strLastName | strEmail | strCity | strPostalCode | strMobile | strModel | strOperatingSystem | strPassword | strConfPassword |
        |<strFirsName>|<strLastName>|<strEmail>|<strCity>|<strPostalCode>|<strMobile>|<strModel>|<strOperatingSystem>|<strPassword>|<strConfPassword>|
      Then he creates a new user in Utest
        | strTitle  |
        | <strTitle>|

      Examples:
        | strFirsName | strLastName | strEmail      | strCity  | strPostalCode | strMobile | strModel | strOperatingSystem | strPassword | strConfPassword |strTitle|
        | Camilo      |  Cadavid   |m5iliewto@mail.com| Manizales|  170002       |  Apple    | iPhone   |     iOS 2.0        | Prueba1155+ |  Prueba1155+     |Welcome to the world's largest community of freelance software testers!|
