package challenger.attus.PeaploManagement.infra.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import challenger.attus.PeaploManagement.domain.entities.User;

/**
 * UserRepositoryJPA
 */
@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {

  public Optional<User> findUserById(Long id);

  public User save(User user);
}
