Feature: To validate the deletion of a pet

    To vaidate the deletion of pets

@DeletePet
Scenario: Delete a Pet

   Given the user has DELETE api of pet
   When the user hits the delete api with id "5"
   Then the pet should be deleted