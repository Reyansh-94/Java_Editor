package full_practice.model;

import java.sql.ResultSet;

public interface DAOService {
public void connectDB();
public boolean verifyLogin(String email, String password);
public void createInquiry(String name, String email, String mobile);
public void deleteInquiry(String email, String password);
public void updateInquiry(String email, String mobile);
public ResultSet listInquiry(String email);
}
