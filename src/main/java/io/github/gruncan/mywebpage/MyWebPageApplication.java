package io.github.gruncan.mywebpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyWebPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebPageApplication.class, args);
    }

}
