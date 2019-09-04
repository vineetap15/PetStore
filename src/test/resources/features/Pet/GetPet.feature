Feature: To validate a pet details

    Validate a pet details

    @GetPet
    Scenario: get a pet details

        Given the user has GET api of pet
        When the user hits the GET api with id "/-9223372036854775808"
        Then the pet should be validated