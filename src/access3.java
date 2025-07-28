import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class access3 {
    public static void main(String[] args) throws Exception{
        String sql = "select customers.cname, sum(orders.oquantity * items.iprice) as total_spent\n" +
                "from orders join customers on orders.cid=customers.cid\n" +
                "join items on orders.iid=items.iid\n" +
                "group by customers.cname";//a query from the db
        String url = "jdbc:mysql://localhost:3306/zeptoDB";// connect jdbc to your database;
        String username = "root";//your db username
        String password = "5.somethinG";//your db password
        Connection con = DriverManager.getConnection(url, username, password);//create var, Connection is interface therefore cannot create object, so access through a inbuilt class(DriverManager) which contains inbuilt method(getConnection)
        Statement st = con.createStatement();// create inbuilt interface and store in var, connection with create statement
        st.executeQuery(sql);//execute the statement
        ResultSet rs = st.executeQuery(sql);// create inbuilt interface and store in rs, execute the query
        while(rs.next()) //change line//
        {
            String name = rs.getString(1);//get the value of first column
            Integer total= rs.getInt(2);
            System.out.println(name + " " +total);//print
        }
    }
}
