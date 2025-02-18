# Project README

## How to Run This Project

1. Navigate to the `src/main/java` directory.
2. Open the `resources` folder.
3. Locate the `application.properties` file.
4. Update the following properties with your PostgreSQL database details:
   - `spring.datasource.url=jdbc:postgresql://localhost:5432/yourDatabaseName`
   - `spring.datasource.username=yourUsername`
   - `spring.datasource.password=yourPassword`
5. Save the changes to the `application.properties` file.
6. Run the project using your preferred method (e.g., IDE run configuration, command line).

### Example Command Line Run

```sh
./mvnw spring-boot:run
```

Make sure you have Maven installed and configured properly.

Enjoy using the project!
