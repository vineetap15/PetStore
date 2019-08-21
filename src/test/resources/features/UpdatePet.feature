Feature: To validate the updation of a pet

    To vaidate the updation of pets

@UpdatePet
Scenario: Update a Pet

   Given the user has PUT api of pet
   When the user enters the new pet details
   When the user hits the put api
   Then the pet should be updated