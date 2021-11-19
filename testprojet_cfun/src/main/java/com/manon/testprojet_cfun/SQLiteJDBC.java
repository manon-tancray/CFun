package com.manon.testprojet_cfun;

import java.sql.*;

/**
 * @author manon
 *
 */
public class SQLiteJDBC {
  public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      
/*connection application*/      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         System.out.println("Opened database successfully");
         
         stmt = c.createStatement();
         String sql = "CREATE TABLE USER " +
                        "(ID INTEGER PRIMARY KEY AUTOINCREMENT   NOT NULL, " +
                        " NAME           TEXT    NOT NULL, " +
                        " MDP	VARCHAR(30)	NOT NULL," +
                        " SATUS VARCHAR(30) NOT NULL)";        
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
         
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}
