package space.bum.jsp.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private BigDecimal price;

}
