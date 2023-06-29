package DB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    public Connection getConnection()
    {
   
        Connection con = null;
        
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:XYZEmp", "sa", "123");
            System.out.println("Connecting to database");
        } catch (Exception ex) {
            System.err.println("Error connecting to database" + ex);
        }
     return con;
    }
}

   
 

