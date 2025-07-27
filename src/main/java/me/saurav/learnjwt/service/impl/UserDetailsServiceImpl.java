package me.saurav.learnjwt.service.impl;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import me.saurav.learnjwt.modal.User;
import me.saurav.learnjwt.repo.UserRepo;

@RequiredArgsConstructor
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByName(username);
        if (user.isEmpty())
            throw new UsernameNotFoundException("user does not exist");

        return new UserPrincipal(user.get());
    }

}
