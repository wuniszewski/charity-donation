package pl.coderslab.charity.entity;

import javax.persistence.Entity;

@Entity(name = "categories")
public class Category extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
