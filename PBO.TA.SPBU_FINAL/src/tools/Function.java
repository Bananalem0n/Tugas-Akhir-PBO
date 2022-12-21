/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tools;

import java.lang.reflect.Array;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class Function {
    
    public static void reset_table (DefaultTableModel tbl){
        
    //  reset row data from table model
        for (int i = tbl.getRowCount()-1; i>=0; i--){
            tbl.removeRow(i);
    }}
    
    //               -- batas suci --         

    public void load_table (DefaultTableModel tbl,String[] arr,String nama_tabel){
    
    // LoadTable Format = { table model, Array of Displayed Content, Table Name }
    
       Connection conn = DBconnection.create_connection();
       try
        {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM " + nama_tabel);
            Function.reset_table(tbl);
            
            while(result.next()){
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = result.getString(i+1);
                    
            }   tbl.addRow(arr);}
        }
       catch (SQLException e){ System.out.println(e); }
    }
    
    //               -- batas suci --           

    
    public void add_table (String nama_table,String[] arr_column,String[] arr_data){
        
        Connection conn = DBconnection.create_connection();
        String kolom = "",data= "";
        
        for (int i = 0; i < arr_column.length; i++) {
             kolom = String.join(",", arr_column);
             data = String.join(",", arr_data);
        }
        
       try
        {   
            String sql = "INSERT INTO " + nama_table + " (" + kolom + ")VALUES(" + data + " )";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
           
        } catch (Exception e) { System.out.println(e); }
    }
    
    //               -- batas suci --           

    public void update_table (String nama_table,String[] arr_data,String id){
        
        Connection conn = DBconnection.create_connection();
        String kolom = "",data= "";
        
        String arr ="";
        for (int i = 0; i < arr_data.length; i++) {
            arr = String.join(",", arr_data);
        }
        
       try
        {   
            String sql = "UPDATE " + nama_table + " SET " + arr + " WHERE " + id;
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
           
        } catch (Exception e) { System.out.println(e); }
    }
   
    //               -- batas suci --           
   
    public void delete_table (String nama_table,String id){
        
        Connection conn = DBconnection.create_connection();
        
       try
        {   
            String sql = "DELETE FROM " + nama_table + " WHERE " + id;
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
           
        } catch (Exception e) { System.out.println(e); }
    }
    
   
}
