package space.bum.jsp.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class UserId implements Serializable{
    private String name;
    private String lastName;
}
