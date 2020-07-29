package com.example.demo;

import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlExampleApplication.class, args);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cities");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
