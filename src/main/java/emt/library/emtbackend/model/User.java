package emt.library.emtbackend.model;

import emt.library.emtbackend.model.enumerations.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
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
