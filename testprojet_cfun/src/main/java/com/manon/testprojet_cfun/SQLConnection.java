package com.manon.testprojet_cfun;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author manon
 *
 */

/*connection base de données */
public class SQLConnection {
	Connection conn = null;
		public static Connection ConnectDb() {
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
				System.out.println("connection etablie");
				return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
