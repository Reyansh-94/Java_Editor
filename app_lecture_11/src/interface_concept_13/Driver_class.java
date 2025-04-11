package interface_concept_13;
public class Driver_class {
    public static void main(String[] args) {
        PropertyService propertyService = new PropertyServiceImpl();

        // Add a property
        propertyService.addProperty("Beautiful Villa", "https://example.com/villa.jpg", "1234");

        // View property details
        propertyService.viewPropertyDetails(1);

        // Update property details
        propertyService.updatePropertyDetails(1, "Luxury Villa", "https://example.com/luxury_villa.jpg", "5678");

        // View updated property details
        propertyService.viewPropertyDetails(1);

        // Delete property
        propertyService.deletePropertyById(1);
    }
}

