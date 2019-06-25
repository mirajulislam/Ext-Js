package com.App.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Test {
	
	public void show() {
	
	DbConnection db=new DbConnection();
	Connection con=db.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		String query = "SELECT * FROM batch";
	 ps=con.prepareStatement(query);			
	rs=ps.executeQuery();
	while(rs.next()){
				

			System.out.println("Id no -"+rs.getInt("id"));
			System.out.println("Batch name -"+rs.getString("batchname"));
			System.out.println("total student -"+rs.getInt("total_student"));
			System.out.println();
//			rs.toString();
			}
			
	}catch(Exception e) {
		System.out.println(e); 
		e.printStackTrace();
	}
	
     // execute the query, and get a java resultset
}
}
