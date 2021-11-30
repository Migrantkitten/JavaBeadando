package prog3beadando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
      private static Connection con = null;
      public static Connection getConnection(){
          
        if (con == null) {
            
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog3database","root","root321");
                //con = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net/sql11455022","sql11455022","ztMZhCubJw");
            } catch (Exception ex) {
                 System.out.println(ex.getMessage());
             }
        }
        return con;
    }  
     public static void CloseConnection(){         
         try {
            con.close();  
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
