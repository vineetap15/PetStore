Feature: To validate the creation of a pet

    To vaidate the creation of pets
@pet
Scenario: Create a Pet

   Given the user has POST api of pet
   When the user enters the pet details
   When the user hits the api
   Then the pet should be created

Feature: To validate updation of the pet

    To validate the updation of the pet

@UpdatePet
Scenario: Update a Pet

   Given the user has PUT api of pet
   When the user enters the new pet details
   When the user hits the api
   Then the pet should be updated

Feature: To validate deletion of the pet

    To validate the deletion of the pet

@DeletePet
Scenario: Delete a Pet

   Given the user has DELETE api of pet
   When the user hits the api
   Then the pet should be deleted
