package challenger.attus.PeaploManagement.domain.repositories;

import java.util.Optional;

import challenger.attus.PeaploManagement.domain.entities.User;
import challenger.attus.PeaploManagement.infra.repositories.UserRepositoryJPA;

/**
 * UserRepository
 */
public interface UserRepository extends UserRepositoryJPA {

  public Optional<User> findUserById(Long id);

  public User save(User user);
}
