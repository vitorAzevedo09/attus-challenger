package challenger.attus.PeaploManagement.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import challenger.attus.PeaploManagement.domain.entities.User;
import challenger.attus.PeaploManagement.domain.repositories.UserRepository;

/**
 * UserService
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User findOrFail(Long id) {
    return userRepository.findUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
  }

  public User create(User user) {
    return userRepository.save(user);
  }

  public User update(Long id, User user) {
    user.setId(id);
    return userRepository.save(user);
  }
}
