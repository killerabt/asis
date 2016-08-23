/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SuperUser
 */
public class DBconnection {
    
    public static Connection connect()
    {
        Connection con;
        con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
  
       // Connection con; 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","");
            if(con==null){
            System.out.println("Not connected");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        
        return con;
    }
    
}