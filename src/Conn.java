import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    Connection con;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            long start = System.currentTimeMillis();
            System.out.println(start);
            con = DriverManager.getConnection("jdbc:mysql://localhost:8000/db_user&autoReconnect=true&failOverReadOnly=false ",
                    "root","root");
            long end = System.currentTimeMillis();
            if (!con.isClosed()){
                System.out.println("数据库连接成功");
                System.out.println(end);
            }
            System.out.println(end-start);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main (String args[]){
        Conn c = new Conn();
        c.getConnection();
    }

}
