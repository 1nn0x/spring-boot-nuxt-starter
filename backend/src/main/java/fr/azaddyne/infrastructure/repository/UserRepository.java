package fr.azaddyne.infrastructure.repository;

import fr.azaddyne.domain.model.account.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jacky on 09/05/2017.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByUsername(@Param("username") String username);
    List<User> findByUsernameAndPassword(@Param("username") String username,
                                         @Param("password") String password);
}
