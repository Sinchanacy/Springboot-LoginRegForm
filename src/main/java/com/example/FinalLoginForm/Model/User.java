package com.example.FinalLoginForm.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="User_reg", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    private String firstname;
    private String email;
    private String password;


    public User(String firstname, String email, String password) {
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }


}
