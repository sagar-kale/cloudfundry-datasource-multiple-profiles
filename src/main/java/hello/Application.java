package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@SpringBootApplication
public class Application {
    @Autowired
    private Environment environment;

    /*@Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(environment.getProperty("url"));
        builder.username(environment.getProperty("username"));
        builder.password(environment.getProperty("password"));
        return builder.build();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
