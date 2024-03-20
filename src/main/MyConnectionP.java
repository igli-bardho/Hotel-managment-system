/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.*;

/**
 *
 * @author user
 */
public class MyConnectionP {
    public static Connection getConnection() {
		Connection con = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root", "");
	
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return con;
		}
}
