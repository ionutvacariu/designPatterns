package hardcoretomcatserver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * https://www.youtube.com/watch?v=Ybfo8Dwactg
 */
public class Main {


    @Configuration
    @Import(MyConfiguration.class)
    public static class MyAppConfig {

    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);

        DataSource ds = ctx.getBean(DataSource.class);
        try (Connection connection = ds.getConnection()) {
            ResultSet resultSet = connection.createStatement().executeQuery("select RANDOM_UUID() as random");

            while (resultSet.next()) {
                System.out.println(" =====" + resultSet.getString("random"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("playyy");


    }


}



