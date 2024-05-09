package challenger.attus.PeaploManagement.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * AddressTests
 */
public class AddressTests {

  @Test
  public void testExistAddressEntity() {
    Address address = new Address("rua do teste", "12345678", "123", "sao paulo", "sp");
    assertEquals(address.getCity(), "sao paulo");
  }

}
