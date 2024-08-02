import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//store thr url,username,password,in string object of database
        String url = "jdbc:mysql://localhost:3306/railwaybookingdb";
        String username = "root";
        String password = "";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");
            //add booking info
            String insertQuery="insert into ticketbookingtable(username,age,gender,mobile,email,doj,source,destination,ticketprice,seatpreference) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(insertQuery);
            ps.setString(1,"Anuj Patel");
            ps.setInt(2,21);
            ps.setString(3,"male");
            ps.setString(4,"7376217814");
            ps.setString(5,"anujpatelfzd@gmail.com");
            ps.setString(6,"05/08/2024");
            ps.setString(7,"lucknow");
            ps.setString(8,"Banaras");
            ps.setString(9,"420");
            ps.setString(10,"window");
            ps.execute();
            System.out.println("your ticket booked");


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}


