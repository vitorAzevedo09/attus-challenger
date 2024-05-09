package challenger.attus.PeaploManagement.infra.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

/**
 * UserTests
 */
public class UserTests {

  @Test
  public void testExistUserEntity() {
    User user = new User("vitor azevedo silva", ZonedDateTime.now(), new Address());
    assertEquals(user.getClass(), User.class);
  }

}
