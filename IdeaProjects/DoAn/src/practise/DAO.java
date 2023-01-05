package practise;

import com.sun.source.tree.TryTree;

import java.sql.*;
import java.util.ArrayList;


public class DAO {
    public static Connection getDBConnect(){
        Connection con;
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;" +
                "trustServerCertificate=true;databseName=DoAn;integratedSecurity=true","sa","Dinhsqlserver2004");
        return con;}
        catch (ClassNotFoundException e){
            System.out.println("Where is Driver?");
            System.out.println("Error: " + e);
        }catch (SQLException e){
            System.out.println("Error: " + e);

        }
    return null;
    }
    Connection conn = getDBConnect();
    public DAO(){
        if (conn != null){
            System.out.println("Successfully connection!!");
        }else
            System.out.println("Fail connected");
    }

    // đưa dữ liệu vào sql
    public boolean addStudent(student s){
        String sql = "INSERT INTO Table_1(ID, name, dob, address, phone, email, mark)"+
                "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getID());
            ps.setString(2,s.getName());
            ps.setDate(3,new Date(s.getDob().getTime()));
            ps.setString(4, s.getAddress());
            ps.setString(5,s.getPhone());
            ps.setString(6, s.getEmail());
            ps.setFloat(7,s.getMark());

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;//default
    }
//đọc dữ liệu trong sql
    public ArrayList<student> getListStudent(){
        ArrayList<student> list = new ArrayList<>();
        String sql  = "SELECT * FROM Table_1";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//          Giao diện PreparedStatement trong java là một sub-interface của Statement. Nó được sử dụng để thực hiện truy vấn tham số.
            ResultSet rs = ps.executeQuery();//truy và trả về kết quả
            while(rs.next()){//di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
                student s = new student();
                s.setID(rs.getString("ID"));
                s.setName(rs.getString("name"));
                s.setDob(rs.getDate("dob"));
                s.setAddress(rs.getString("adress"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
                s.setMark(rs.getFloat("mark"));

                list.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        new DAO();
    }
}

