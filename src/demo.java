import java.sql.Connection;//inbuilt
import java.sql.DriverManager;//inbuilt
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws Exception {//add exception
        String sql = "select * from customers";//a query from the db
        String url = "jdbc:mysql://localhost:3306/zeptoDB";// connect jdbc to your database;
        String username = "root";//your db username
        String password = "5.somethinG";//your db password
        Connection con = DriverManager.getConnection(url, username, password);//create var, Connection is interface therefore cannot create object, so access through a inbuilt class(DriverManager) which contains inbuilt method(getConnection)
        Statement st = con.createStatement();// create inbuilt interface and store in var, connection with create statement
        st.executeQuery(sql);//execute the statement
        ResultSet rs = st.executeQuery(sql);// create inbuilt interface and store in rs, execute the query
        while(rs.next()) //change line//
        {
        Integer id = rs.getInt(1);
        String name = rs.getString(2);//get the value of first column
        System.out.println(id + " " + name);//print
    }
    }
}
