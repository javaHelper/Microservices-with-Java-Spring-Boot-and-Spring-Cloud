#

HTTP GET

```
http://localhost:8888/address-service/default
```


Response:

```
{
    "name": "address-service",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": "7f9791a1fef5fc35947146b01bb20eff4de30d4f",
    "state": null,
    "propertySources": [
        {
            "name": "https://gitlab.com/javaHelper1/infybuzz-microservice.git/address-service.properties",
            "source": {
                "spring.datasource.driverClassName": "com.mysql.cj.jdbc.Driver",
                "spring.datasource.url": "jdbc:mysql://localhost:3306/university?createDatabaseIfNotExist=true",
                "spring.datasource.username": "root",
                "spring.datasource.password": "Password",
                "spring.jpa.database-platform": "org.hibernate.dialect.MySQL5InnoDBDialect",
                "spring.jpa.hibernate.ddl-auto": "update",
                "spring.jpa.generate-ddl": "true",
                "spring.application.name": "address-service",
                "server.port": "8082",
                "eureka.client.service-url.defaultZone": "http://localhost:8761/eureka",
                "spring.zipkin.base-url": "http://localhost:9411"
            }
        }
    ]
}
```