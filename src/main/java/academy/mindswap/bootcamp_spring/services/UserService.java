package academy.mindswap.bootcamp_spring.services;

import academy.mindswap.bootcamp_spring.persistence.entity.User;
import academy.mindswap.bootcamp_spring.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        repository.findAll().forEach(user -> users.add(user));

        /*for (User user : repository.findAll()){
            users.add(user);
        }*/
        return users;
    }

    public User getUserById(Long id) {
        Optional<User> byId = repository.findById(id);
        //    return byId.isPresent() ? byId.get() : null;
        return byId.orElse(null);
    }

    public User createUser(String name) {
        return repository.save(new User(name));
    }

    @Autowired
    public void setRepository(UserRepository userRepository) {
        this.repository = userRepository;
    }
}
