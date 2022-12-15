/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author bananalemon
 */
public class ConnectDB {
    
    // database and user configuration 
    private final String host = "jdbc:mysql://localhost:3306/",
                          user = "root", password = "", database = "pertamini";
    
    
    /*=======================================================================================================================*/
    
    
    // attempt on first connect, will make database if not exist
    private Connection FirstConnect(){
        
        try{
            //Attempting to Create a Database if not exist
            Connection link = DriverManager.getConnection(host,user,password);
            Statement bind = link.createStatement();
            String query = "CREATE DATABASE IF NOT EXISTS pertamini";
            bind.execute(query);    
            System.out.println("Successfully Created a Database");
            
            // otherwise will catch an error
        } catch (SQLException error) {
            System.out.println("Error at " + Arrays.toString(error.getStackTrace()));
        } return null;

    }
    
    
    /*=======================================================================================================================*/

    // create database connection
    public Connection ConnectDatabase(){
        
        FirstConnect();
        try {
            // trying connect to database, and make new database if doesn't exist 
            Connection link = DriverManager.getConnection(host + database, user, password);
            return link;    
            
            // otherwise will catch an error
        } catch (SQLException error) {
            System.out.println("Error at " + Arrays.toString(error.getStackTrace()));
        } return null;
    }    
}


    /*=======================================================================================================================*/
