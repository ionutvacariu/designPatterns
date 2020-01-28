package testeUnitare;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBContainer {


    @Rule
    public MySQLContainer mySQLContainer = new MySQLContainer().withUsername("ionut").withPassword("pass");


    @Test
    public void test() throws SQLException {

        try(Connection connection = DriverManager.getConnection(mySQLContainer.getJdbcUrl(), mySQLContainer.getUsername(), mySQLContainer.getPassword())){
            System.out.println("blea===========================");
            System.out.println(connection.isValid(6000));
            System.out.println("blea===========================");

        }




    }
}
