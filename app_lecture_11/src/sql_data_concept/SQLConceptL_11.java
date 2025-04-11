package sql_data_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConceptL_11 {
public static void main(String[] args) throws ClassNotFoundException {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Class successfully load...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root", "banti@936827");
Statement stmnt = con.createStatement();
System.out.println(con);
//Insert Data 
/*tmnt.executeUpdate("INSERT INTO employee(id, name, position, salary) VALUES"
		+ "(2, 'sonu sharama', 'software developer', 45705.25),"
		+ "(3, 'pooja rani', 'network engineer', 45789.12),"
		+ "(4, 'mahendra singh', 'senior data', 45789.123)");*/
//Delete data
stmnt.executeUpdate("DELETE FROM employee WHERE id=1");
con.close();
}catch(SQLException e) {
	e.printStackTrace();
	}
}
}
