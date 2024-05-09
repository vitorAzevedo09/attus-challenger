package challenger.attus.PeaploManagement.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

/**
 * UserTests
 */
public class UserTests {

  @Test
  public void testExistUserEntity() {
    Address address = new Address();
    User user = new User("vitor azevedo silva", ZonedDateTime.now(), address);
    assertEquals(user.getClass(), User.class);
  }

}
