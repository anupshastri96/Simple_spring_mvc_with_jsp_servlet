package com.anup.learns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	
	public static List<Food> getFoodItems() throws SQLException, ClassNotFoundException{
		
		ArrayList<Food> foodList = new ArrayList<Food>();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/Food?useSSL=false";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement stmt =  con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from foodcart");
		
		while(rs.next()) {
			Food f = new Food(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			foodList.add(f);
		}
		
		
		return foodList;
		
	}

}
