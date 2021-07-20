package academy.mindswap.bootcamp_spring.persistence.repository;

import academy.mindswap.bootcamp_spring.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
