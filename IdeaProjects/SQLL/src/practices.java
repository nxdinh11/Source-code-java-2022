import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class practices {
    private Connection conn;

    public practices(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QL_DETAI_SV;integratedSecurity=true","sa","Dinhsqlserver2004");
            System.out.println("successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new practices();
    }
}
