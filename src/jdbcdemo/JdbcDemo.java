package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521","hr","hr");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from jobs");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
