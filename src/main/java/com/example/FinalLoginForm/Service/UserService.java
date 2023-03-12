package com.example.FinalLoginForm.Service;

import com.example.FinalLoginForm.Model.User;
import com.example.FinalLoginForm.Registration.RegDetails;
import com.example.FinalLoginForm.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements Userser{
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
     @Autowired
    private UserRepository repo;
    public UserService(UserRepository repo){
        super();
        this.repo=repo;
    }

    public UserService() {
        super();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("invalid username or  password");
            //return org.springframework.security.core.userdetails.User(user.getEmailid(),user.getPassword(),null);
        }
        //new method
        return new CustomerUserDetails(user);
        //old method
        //return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), null);
        //
    }

    @Override
    public User adduser(RegDetails details) {
            User u=new User(details.getFirstname(), details.getEmail(), passwordEncoder.encode(details.getPassword()));
            return repo.save(u);
        }
    }

