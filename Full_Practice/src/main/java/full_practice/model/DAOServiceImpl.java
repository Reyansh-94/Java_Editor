package full_practice.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
   Connection connection = null;
   Statement stmnt = null;
	@Override
	public void connectDB() {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");				
				stmnt = connection.createStatement();
				if(stmnt == null) {
					System.out.println("Connection Failed Not Found it Data Collection");
				}else {
					System.out.println("Connection Successfully");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("Select * from login where email='"+email+"' and password = '"+password+"'");
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void createInquiry(String name, String email, String mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInquiry(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInquiry(String email, String mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet listInquiry(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
