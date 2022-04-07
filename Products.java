package Springbootcrud.components;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
  
    @Id
    private String id;

    private String name;
    private String quantity;
    private String category;
    private String image;

    
    public Products(String id, String name, String quantity, String category, String image) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.image = image;
    }
    
    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
