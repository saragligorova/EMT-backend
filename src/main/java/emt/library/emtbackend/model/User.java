package emt.library.emtbackend.model;

import emt.library.emtbackend.model.enumerations.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "library_users")
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String surname;
    @Enumerated(value = EnumType.STRING)
    private Role role;

    public User(){}

    public User(String username, String password, String name, String surname, Role role){
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

}
