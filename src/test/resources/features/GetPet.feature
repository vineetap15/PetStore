Feature: To validate a pet details

    Validate a pet details

    @GetPet
    Scenario: get a pet details

        Given the user has GET api of pet
        When the user hits the GET api
        Then the pet details should be fetched