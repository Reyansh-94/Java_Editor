package interface_concept_13;

public interface PropertyService {
    void addProperty(String name, String imageUrl, String password);
    void deletePropertyById(long id);
    void updatePropertyDetails(long id, String name, String imageUrl, String password);
    void viewPropertyDetails(long id);
}

