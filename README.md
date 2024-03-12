# demo-load-yml-data
Demo little-Treasures
- Create & Add `hotels.yml`file and place it under `/src/main/resources`
- Add spring.config.import=hotels.yml to the application.properties file.-
- create Hotel and HotelProperties as entity classes.
 - Ensure to annotate HotelProperties with `@Component`` to allow detection by the  application context."
 - Ensure to add `@ConfigurationProperties(prefix = "treasures")`to HotelProperties
      - `@ConfigurationProperties` Annotation for externalized configuration. Add this to a class definition or a @Bean method in a @Configuration class if you want to bind and validate some external Properties (e.g. from a .properties file)