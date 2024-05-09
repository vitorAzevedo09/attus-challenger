package challenger.attus.PeaploManagement.domain.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import challenger.attus.PeaploManagement.domain.entities.User;

/**
 * UserRepositoryTests
 */
public class UserRepositoryTests {

  @InjectMocks
  private UserRepository userRepository;

  @Test
  public void shouldReturnUser_ById() {

    User user = userRepository.findUserById(1L);

    assertEquals("vitor azevedo silva", user.getFullName());
  }

}
