package hi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class DAO {

        // public static final String connectionUrl = "jdbc:sqlserver://DESKTOP-2NFJ7C1\\SQLEXPRESS:1433;databaseName=DINH\\SQLEXPRESS;user=sa;password=Dinhsq";
        public static Connection getDBConnect(){
            Connection con;
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection(connectionUrl);
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=helloWorld2;integratedSecurity=true","sa","Dinhsqlserver2004");
                return con;
            } catch (ClassNotFoundException ex) {
                System.out.println("Where is Driver?");
                System.out.println("Error:" + ex);

            } catch (SQLException ex) {
                System.out.println("Error:" + ex);
            }
            return null;
        }
        static Connection conn = getDBConnect();
        public DAO() {

            if (conn != null) {
                System.out.println("Kết nối thành công");
            } else {
                System.out.println("Kết nối thất bại");
            }
        }

//đưa du liệu vào sql server
    public boolean addStudent(Student s){

        String sql = "INSERT INTO table_1(ID, name, dob, address, phone, email, mark) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getID());
            ps.setString(2, s.getName());
            ps.setDate(3, new Date(s.getDob().getTime()));
            ps.setString(4, s.getAddress());
            ps.setString(5, s.getPhone());
            ps.setString(6, s.getEmail());
            ps.setFloat(7, s.getMark());

            //return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    //đọc dữ liệu trong sql
    public ArrayList<Student> getListStudent(){
        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM table_1";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setID(rs.getString("ID"));
                s.setName(rs.getString("name"));
                s.setDob(rs.getDate("dob"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
                s.setMark(rs.getFloat("mark"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void main(String[] args) {
        new DAO();
    }
}

