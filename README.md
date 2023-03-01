# ExpressFlight Version 1


ExpressFlight V1 is a personal website made in Spring Boot 2.7.3. Its main purpose is to hold airport, flight and airplane data in its database and allow users to search for flights at a given date. For its creation Both MVC and SOLID principles are followed for a cleaner and more standardized code.

ExpressFlight V1 is written in Java and Spring Framework. The project is created in Spring initialzr where multiple extra dependencies are added for easier coding. These dependencies include Lombok, Spring Web, Spring Data JPA and PostgreSQL Driver.

The Front-End of ExpressFlight V1 is stored in a serperate project called "frontend". The project uses React Library for its creation. The Front-End, uses React Axios for CRUD operations in Back-End. However in this current version the Front-End is only capable of searching nonstop and connected flights.


![ExpressFlight_Demo1](https://user-images.githubusercontent.com/40835236/222236034-e3e5ecad-cf2a-4900-825e-fad66052321e.png)



The Database is a PostgreSQL database stored locally in the computer. However the project also utilizes JSON data storage. Multiple json files each hold data for one entity and in each create, update or delete operation the JSON files are updated using GSON.

![ExpressFlight_Demo2](https://user-images.githubusercontent.com/40835236/222236056-6eac2583-693b-46ed-acc8-a5231d0da777.png)
