# Distributed Tracing with Sleuth and Zipkin

- Start the zipkin

```sh
docker run -d -p 9411:9411 openzipkin/zipkin
```
----------

- HTTP GET - `http://localhost:9090/student-service/api/student/getById/1`

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
-------

<img width="1418" alt="Screenshot 2022-12-26 at 3 15 21 PM" src="https://user-images.githubusercontent.com/54174687/209533850-9d292c88-bec3-4b7f-8b3b-a8fc7e7bec83.png">


-----

- You can also search by TraceId: 6bdc6fe79d0e92b7

<img width="980" alt="Screenshot 2022-12-26 at 3 16 41 PM" src="https://user-images.githubusercontent.com/54174687/209533952-9967f580-b0f2-4606-96db-ddaa0dfb5192.png">

<img width="1418" alt="Screenshot 2022-12-26 at 3 17 19 PM" src="https://user-images.githubusercontent.com/54174687/209534046-8c575d9a-2e4e-4fb7-abad-8af73b73d168.png">

