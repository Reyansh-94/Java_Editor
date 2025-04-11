package interface_concept_13;
import java.sql.*;

public class PropertyServiceImpl implements PropertyService {

    @Override
    public void addProperty(String name, String imageUrl, String password) {
        String sql = "INSERT INTO Properties (name, imageUrl, password) VALUES (?, ?, ?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, imageUrl);
            statement.setString(3, password);
            statement.executeUpdate();
            System.out.println("Property added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePropertyById(long id) {
        String sql = "DELETE FROM Properties WHERE id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Property deleted successfully.");
            } else {
                System.out.println("No property found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePropertyDetails(long id, String name, String imageUrl, String password) {
        String sql = "UPDATE Properties SET name = ?, imageUrl = ?, password = ? WHERE id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, imageUrl);
            statement.setString(3, password);
            statement.setLong(4, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Property details updated successfully.");
            } else {
                System.out.println("No property found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewPropertyDetails(long id) {
        String sql = "SELECT * FROM Properties WHERE id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String imageUrl = resultSet.getString("imageUrl");
                String password = resultSet.getString("password");
                System.out.println("Property Details: ");
                System.out.println("Name: " + name);
                System.out.println("Image URL: " + imageUrl);
                System.out.println("Password: " + password);
            } else {
                System.out.println("No property found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
