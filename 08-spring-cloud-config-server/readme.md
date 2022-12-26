# Spring Cloud Config server

HTTP GET: `http://localhost:8082/api/address/test`

Response:

```
My Address is High Street Park!
```

----

HTTP POST:

```
curl --location --request POST 'http://localhost:8082/actuator/refresh'
```

Response:

```
[
    "config.client.version",
    "address.test"
]
```

----


HTTP GET: `http://localhost:8082/api/address/test`

Response:

```
My Address is High Street Park! - Something has changed! ===>
```
