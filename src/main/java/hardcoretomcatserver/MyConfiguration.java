package hardcoretomcatserver;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration

@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
})

public class MyConfiguration {


    @Bean
    @Conditional(value = TomcatOnClassPathCondition.class)
    public TomcatLauncher tomcatLauncher() {
        return new TomcatLauncher();
    }


    @Bean
    public DataSource dataSource(Environment environment) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String className;
        Driver driver = (Driver) Class.forName(environment.getProperty("spring.datasource.driver-class-name")).newInstance();
        String url = environment.getProperty("spring.datasource.url");
        return new SimpleDriverDataSource(driver, url);

    }
}