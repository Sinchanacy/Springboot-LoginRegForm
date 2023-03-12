package com.example.FinalLoginForm.Service;

import com.example.FinalLoginForm.Model.User;
import com.example.FinalLoginForm.Registration.RegDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface Userser extends UserDetailsService {
    User adduser(RegDetails details);
}
