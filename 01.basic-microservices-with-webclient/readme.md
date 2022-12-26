# Basic microservices With Web Client

1) Http GET

```
http://localhost:8082/api/address/getById/3
```

Response:

```json
{
    "addressId": 3,
    "street": "Any street",
    "city": "Nagpur"
}
```
---

2) Http GET

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


----

3) Http Post - create address

```
curl --location --request POST 'http://localhost:8082/api/address/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "street": "Any street",
    "city": "Nagpur"
}'
```

Sample Response:

```json
{
    "addressId": 3,
    "street": "Any street",
    "city": "Nagpur"
}
```
