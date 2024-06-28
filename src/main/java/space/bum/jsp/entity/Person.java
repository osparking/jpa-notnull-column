package space.bum.jsp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(name = "uniqActiveNumber", columnNames = { "personNumber",
        "isActive" }),
    @UniqueConstraint(name = "uniqSecuDeptCode", columnNames = {
        "securityNumber", "departmentCode" }) })
@Data
public class Person implements Serializable {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String password;

  @Column(unique = true)
  private String email;
  @Column(unique = true)
  private Long personNumber;
  private Boolean isActive;
  private String securityNumber;
  private String departmentCode;
  @JoinColumn(name = "addressId", referencedColumnName = "id")
  private Address address;
}
