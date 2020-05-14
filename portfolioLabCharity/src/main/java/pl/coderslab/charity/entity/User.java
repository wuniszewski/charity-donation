package pl.coderslab.charity.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

@Entity(name = "users")
public class User extends BaseEntity {
    @Email
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
