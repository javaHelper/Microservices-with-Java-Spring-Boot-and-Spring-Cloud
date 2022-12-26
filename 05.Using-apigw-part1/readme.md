# Using APIGW

1) HTTP GET

```sh
curl --location --request GET 'http://localhost:9090/student-service/api/student/getById/1' \
--header 'Authorization: ABC'
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
