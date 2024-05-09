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
    User user = buildUser();
    assertEquals(user.getFullName(), "vitor azevedo silva");
    assertEquals(user.getMainAddress().getCity(), "sao paulo");
  }

  private Address buildAddress() {
    return new Address("rua do teste", "12345678", "123", "sao paulo", "sp");
  }

  private User buildUser() {
    return new User("vitor azevedo silva", ZonedDateTime.now(), buildAddress());
  }

}
