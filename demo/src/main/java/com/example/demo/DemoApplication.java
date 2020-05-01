package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(DemoApplication.class, args);
		  Class.forName("oracle.jdbc.driver.OracleDriver"); 

	      // Step 2: Establish the connection to the database 
	      String url = "jdbc:oracle:thin:@mysqlz04.sasken.com:1521:gurukulnew"; 
	      System.out.println("This statement Before connection");
	      Connection conn = DriverManager.getConnection(url,"gurukulread","hou9Ki_e");  
	      System.out.println("This statement after connection");
	}

}
