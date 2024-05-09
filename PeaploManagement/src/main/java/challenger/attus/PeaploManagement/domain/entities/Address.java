package challenger.attus.PeaploManagement.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Address
 */
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "street", nullable = false)
  private String street;

  @Column(name = "postal_code", nullable = false)
  private String postalCode;

  @Column(name = "number", nullable = false)
  private String number;

  @Column(name = "city", nullable = false)
  private String city;

  @Column(name = "state", nullable = false)
  private String state;

  Address(String street, String postalCode, String number, String city, String state) {
    this.street = street;
    this.postalCode = postalCode;
    this.number = number;
    this.city = city;
    this.state = state;
  }

  public Long getId() {
    return id;
  }

  public String getStreet() {
    return street;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getNumber() {
    return number;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

}
