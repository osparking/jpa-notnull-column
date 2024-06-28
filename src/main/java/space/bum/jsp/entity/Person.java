package space.bum.jsp.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Person implements Serializable {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String password;
  private String email;
  private Long personNumber;
  private Boolean isActive;
  private String securityNumber;
  private String departmentCode;
  @JoinColumn(name = "addressId", referencedColumnName = "id")
  private Address address;
}
