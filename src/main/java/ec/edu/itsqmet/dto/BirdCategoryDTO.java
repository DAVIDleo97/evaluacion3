package ec.edu.itsqmet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "birdCategory")
public class BirdCategoryDTO {
	@Id
	private Integer id;
	private String name;

}
