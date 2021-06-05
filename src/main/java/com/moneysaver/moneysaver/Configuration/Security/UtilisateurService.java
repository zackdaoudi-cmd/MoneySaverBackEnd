package com.moneysaver.moneysaver.Configuration.Security;

import com.moneysaver.moneysaver.DAO.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public UserDetails loadUserByUsername(String s) {
        Users subscriber = loadApplicationUserByUserName(s);
        return new User(subscriber.getUsername(), subscriber.getPassword(), AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
    }

    public Users loadApplicationUserByUserName(String username) {
        Users susbcriber = utilisateurRepository.findByUsername(username);
        if (susbcriber == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {

            return new Users(susbcriber.getIdUser(),susbcriber.getUsername(), susbcriber.getPassword());
        }
    }
}
