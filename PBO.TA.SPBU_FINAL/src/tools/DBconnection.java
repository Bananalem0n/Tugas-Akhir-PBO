/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Kingslaive
 */
public class DBconnection {
    public static final Connection create_connection(){
        String url = "jdbc:mysql://localhost:3306/uas_pbo";
        String user = "root";
        String password = "";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);            
            return conn;
        }
        catch (SQLException e) {
            System.out.print("failed to connect \nerror at : ");
            e.printStackTrace();
        }
        return null;
    }
}
