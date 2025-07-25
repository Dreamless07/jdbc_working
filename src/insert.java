import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) throws Exception{
        String sql = "insert into customers (cid, cname) values(4,'Harry')";//a query from the db
        String url = "jdbc:mysql://localhost:3306/zeptoDB";// connect jdbc to your database;
        String username = "root";//your db username
        String password = "5.somethinG";//your db password
        Connection con = DriverManager.getConnection(url, username, password);//create var, Connection is interface therefore cannot create object, so access through a inbuilt class(DriverManager) which contains inbuilt method(getConnection)
        Statement st = con.createStatement();// create inbuilt interface and store in var, connection with create statement
        int row=st.executeUpdate(sql);//execute the statement and update store in row
        System.out.println("Inserted succesfully"+row);//insert statement
    }
}
