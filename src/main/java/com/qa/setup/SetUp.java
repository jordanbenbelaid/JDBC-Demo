package com.qa.setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SetUp {

	public static final Logger LOGGER = LogManager.getLogger();

	private String jdbcConnectionURL;
	private String username;
	private String password;

	public SetUp(String username, String password) {
		jdbcConnectionURL = "jdbc:mysql://localhost:3306/kittendb";
		this.username = username;
		this.password = password;
	}

	public SetUp(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}

	public void testConnection() {

		Connection conn = null;
		try {
			System.out.println("Im attempting connection");
			conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
			System.out.println("Ive connected");
		} catch (SQLException e) {
            LOGGER.error(e.getMessage());
//			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	//CREATE STATEMENT
	public void create(Kitten kitten) {
//    	Connection conn = null;
    	try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password); 
    			Statement statement = conn.createStatement()) {
    				statement.executeUpdate("INSERT INTO kitten(age, breed, cuteness, name) VALUES(" + kitten.getAge() + ",'"
    						+ kitten.getBreed() + "'," + kitten.getCuteness() + ",'" + kitten.getName() + "')");
     		
    	}catch(SQLException e) {
    		LOGGER.error(e.getMessage());
    	}
    }
	
	//CREATE PREPARED STATEMENT
	
	//RESULTSET
	
	//READ STATEMENT
	
	//READ PREPARED STATEMENT
	
	//UPDATE STATEMENT
	
	//UPDATE PREPARED STATEMENT
	
	//DELETE STATEMENT
	public void delete(int id) {
		try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password); 
    			Statement statement = conn.createStatement()) {
					statement.executeUpdate("DELETE FROM kitten WHERE id = " + id);
			
		}catch(SQLException e) {
			LOGGER.error(e.getMessage());
		}
	}
	
	//DELETE PREPARED STATEMENT
	
	

}
