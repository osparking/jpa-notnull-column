package space.bum.jsp.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Address implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String streetAddress;
}
