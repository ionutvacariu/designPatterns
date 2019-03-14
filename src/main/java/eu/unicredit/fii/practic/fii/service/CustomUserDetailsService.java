package eu.unicredit.fii.practic.fii.service;

import eu.unicredit.fii.practic.fii.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repo
                .findByUsername(username)
                .map(u -> new org.springframework.security.core.userdetails.User(
                        u.getUsername(),
                        u.getPassword(),
                        true,
                        true,
                        true,
                        true,
                        new ArrayList<>()
                        ))
                .orElseThrow(() -> new UsernameNotFoundException("No login with "
                        + "the name " + username + "was found in the database"));
    }

}
