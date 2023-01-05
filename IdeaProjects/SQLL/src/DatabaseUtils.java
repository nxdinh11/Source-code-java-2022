import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
   // public static final String connectionUrl = "jdbc:sqlserver://DESKTOP-2NFJ7C1\\SQLEXPRESS:1433;databaseName=DINH\\SQLEXPRESS;user=sa;password=Dinhsq";
    public static Connection getDBConnect(){
        try {
            Connection con;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection(connectionUrl);
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QL_DETAI_SV;integratedSecurity=true","sa","Dinhsqlserver2004");
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is Driver?");
            System.out.println("Error:" + ex);

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = getDBConnect();
        if (conn != null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Kết nối thất bại");
        }
    }
}

