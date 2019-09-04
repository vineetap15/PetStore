Feature: To validate the creation of a pet

    To vaidate the creation of pets
    @pet
    Scenario Outline: Create a Pet

        Given the user has POST api of pet
        When the user enters the category "<categoryId>" and "<categoryName>"
        When the user enters the pet name "jack"
        When the user enters the photo URLs
        |photo1|
        |photo2| 
        When the user enters the tag data
        |id|567 |
        |name| jack|
        When the user enters the status "available"
        When the user hits the api
        Then the pet should be created

   Examples:
   | categoryId | categoryName|
   | 678 | jytre  |