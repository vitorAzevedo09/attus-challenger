package challenger.attus.PeaploManagement.domain.entities;

import java.time.ZonedDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * User
 */
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_name", nullable = false)
  private String fullName;

  @Column(name = "date_of_birth", nullable = false, columnDefinition = "date")
  private ZonedDateTime dateOfBirth;

  @Column(name = "main_address", nullable = false)
  private Address mainAddress;

  @Column(name = "addresses", nullable = false)
  private List<Address> addresses;

  User(String fullName, ZonedDateTime dateOfBirth, Address mainAddress) {
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.mainAddress = mainAddress;
  }

}
