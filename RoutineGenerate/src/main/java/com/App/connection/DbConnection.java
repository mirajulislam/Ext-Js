package com.App.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	private Connection connect = null;
	
		public Connection get_connection(){
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 
			 connect = (Connection) DriverManager
	                    .getConnection("jdbc:mysql://localhost:3307/routinegenerate?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
	                            + "user=root&password=");
              System.out.println("successfully"); 
			
		} catch (Exception e) {
			System.out.println(e);
		}
		  return connect;
		}
		}
