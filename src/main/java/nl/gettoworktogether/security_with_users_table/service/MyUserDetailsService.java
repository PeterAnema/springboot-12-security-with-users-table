//package nl.gettoworktogether.security_with_user_table.service;
//
//import nl.gettoworktogether.security_with_user_table.model.User;
//import nl.gettoworktogether.security_with_user_table.repository.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.WebApplicationContext;
//
//import javax.annotation.PostConstruct;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        return new MyUserPrincipal(user);
//    }
//
//}
//
