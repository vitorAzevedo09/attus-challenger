package challenger.attus.PeaploManagement.domain.services;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import challenger.attus.PeaploManagement.domain.entities.User;
import challenger.attus.PeaploManagement.domain.repositories.UserRepository;
import challenger.attus.PeaploManagement.domain.service.UserService;

/**
 * UserServiceTests
 */
public class UserServiceTests {

  @Mock
  private UserRepository userRepository;

  @InjectMocks
  private UserService userService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }
}
