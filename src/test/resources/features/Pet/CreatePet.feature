Feature: To validate the creation of a pet

    To vaidate the creation of pets
@pet
Scenario: Create a Pet

   Given the user has POST api of pet
   When the user enters the pet details
   When the user hits the api
   Then the pet should be created

