# Feign Client with APIGW

- Eureka: http://localhost:8761/

<img width="1402" alt="Screenshot 2022-12-26 at 1 50 36 PM" src="https://user-images.githubusercontent.com/54174687/209524123-92b3e43e-a094-451e-b378-288dbbc47f40.png">

-------

HTTP GET: 

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

<img width="1261" alt="Screenshot 2022-12-26 at 1 51 54 PM" src="https://user-images.githubusercontent.com/54174687/209524293-d06e180e-2b01-4ccd-9c96-0d0a43abb87c.png">
