package application.spring;

import endpoint.SoapWebServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import prototype.Prototype;


@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Prototype.class, Application.class, SoapWebServiceConfig.class})
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}