import java.sql.Connection;
import java.sql.DriverManager;

public class demo {
    public static void main(String[] args) {
        String url;
        String username="root";
        String password="5.somethinG";
        Connection con= DriverManager.getConnection(url,username,password);
    }
}
