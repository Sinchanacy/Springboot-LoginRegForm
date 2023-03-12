package com.example.FinalLoginForm.Registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RegDetails {
    //private Integer userid;
    private String firstname;
    private String email;
    private String password;
    public RegDetails()
    {
        super();

    }

    public RegDetails(String firstname, String email, String password) {
        super();
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

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
