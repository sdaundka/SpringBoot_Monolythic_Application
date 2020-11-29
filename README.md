# SpringBoot_Monolythic_Application

goodbooksread is a monolythic application created using spring boot. This application mainly has different entities as:
1. User
2. Books
3. Rating

The application mainly maintains the User rating for the books. The application is capable of performing the CRUD operations for all above mentioned entities.

Sample Request Structure:
1. User:
{
    "name": "Shyam",
    "email": "shyam@test.com"
}

2. Book:
{
    "name": "Let us C",
    "author": "Vasant Kanitkar"
}

3. Rating:
{
    "user": {
        "name": "Shyam",
        "email": "shyam@test.com"
    },
    "book": {
        "name": "Effective Java",
        "author": "Joshua Bloch"
    },
    "ratingScore": 4
}


CRUD operations for the User and Book can be done seperately as well as through the RatingResource.

The purpose of this application is to create the sample monolythic application which can be later converted into microservice based application.
