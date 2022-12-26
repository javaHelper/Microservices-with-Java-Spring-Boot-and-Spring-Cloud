# Using Eureka Service Registry

1) Http GET

```
http://localhost:8080/api/student/getById/1
```

Response:

```json
{
    "id": 1,
    "firstName": "Raj",
    "lastName": "Dave",
    "email": "raj_dave@yahoo.com",
    "addressResponse": {
        "addressId": 1,
        "street": "Delhi",
        "city": "Happy Street"
    }
}
```
