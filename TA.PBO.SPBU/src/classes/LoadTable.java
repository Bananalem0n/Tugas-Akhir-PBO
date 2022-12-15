/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bananalemon
 */

public class LoadTable {
  
    Connection conn;
    ConnectDB openconn = new ConnectDB();
    

    public /*ArrayList<String>*/ void load(String nama_tabel, String[] head_rows){

        this.conn = openconn.ConnectDatabase();
        ArrayList<String> datamenu = new ArrayList<>();
       
        
        try{

            String query = "SELECT * FROM " + nama_tabel;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            

            while (result.next()){
 
                for (int index = 0; index < head_rows.length; index++) {
                    head_rows[index] = result.getString(index + 1);
                    String data = head_rows[index];
                    datamenu.add(data);
                }
                
            }
            System.out.println(datamenu);

            //return datamenu;
        } 
        
        catch (SQLException error) {
            System.out.println(error);
        }
        //return null;
    }
}



   /* 
    DefaultTableModel tableModel;
    Connection conn;
    
    
    public LoadTable(javax.swing.JTable DBtable, String nama_table){
        
        ConnectDB link = new ConnectDB();
        this.conn = link.ConnectDatabase();
        
        tableModel = (DefaultTableModel)DBtable.getModel();
        
    } */