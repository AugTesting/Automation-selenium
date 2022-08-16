package extentreports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection;
		String url="jdbc:mssql://localhost:3306/";
		String dbName="apr";
		String userName="root";
		String userPwd="testing";
		
		try {
			connection= DriverManager.getConnection(url+dbName,userName,userPwd);
			String query1="Select *from apr";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(query1);
			
			while(result.next()) {
				String id=result.getString("userId");
				System.out.println(id);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
