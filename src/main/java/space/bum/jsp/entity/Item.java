package space.bum.jsp.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private BigDecimal price;

}
