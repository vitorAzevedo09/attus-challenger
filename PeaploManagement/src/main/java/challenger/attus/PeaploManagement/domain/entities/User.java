package challenger.attus.PeaploManagement.domain.entities;

import java.time.ZonedDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

/**
 * User
 */
@Entity(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_name", nullable = false)
  private String fullName;

  @Column(name = "date_of_birth", nullable = false, columnDefinition = "date")
  private ZonedDateTime dateOfBirth;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "main_address_id", referencedColumnName = "id")
  private Address mainAddress;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Address> addresses;

  public User(String fullName, ZonedDateTime dateOfBirth, Address mainAddress) {
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.mainAddress = mainAddress;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public ZonedDateTime getDateOfBirth() {
    return dateOfBirth;
  }

  public Address getMainAddress() {
    return mainAddress;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

}
