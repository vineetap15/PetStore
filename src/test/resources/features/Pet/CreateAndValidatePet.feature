Feature: to create a new pet and validate the successfull creation

    to create a new pet and validate the successfull creation

    @pet
    Scenario Outline: Create a Pet

        Given the user has POST api of pet
        When the user enters the category data "<categoryId>" and "<categoryName>"
        When the user enters the pet name "jack"
        When the user enters the photo URLs
            | photo1 |
            | photo2 |
        When the user enters the tag data
            | id   | 456  |
            | name | jack |
        When the user enters the status "available"
        When the user hits the api
        Then the pet should be created

        Examples:
            | categoryId | categoryName |
            | 678        | jytre        |

    @GetPet
    Scenario: get a pet details

        Given the user has GET api of pet
        When the user hits the GET api with id
        Then the pet should be validated