package mvc.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
	String name;
    long phone;
    String email;
    String password;
    
}
