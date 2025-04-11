package interface_concept_13;
public class Property {
    private long id;
    private String name;
    private String imageUrl;
    private String password;

    // Constructor
    public Property(long id, String name, String imageUrl, String password) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.password = password;
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
