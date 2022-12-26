# Using Client Side Load Balancing - using Spring Cloud LoadBalancer

Note: Please make sure to start the address-service on 8082 and 8083 ports.

- Eureka: http://localhost:8761/

<img width="1419" alt="Screenshot 2022-12-26 at 1 00 56 PM" src="https://user-images.githubusercontent.com/54174687/209518480-3b2af23c-2fcc-460d-bd26-7fdaa57865d2.png">

-----

HTTP GET: http://localhost:8080/api/student/getById/1

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
