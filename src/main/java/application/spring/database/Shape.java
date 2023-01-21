package application.spring.database;

import jakarta.persistence.*;

@Entity
@Table(name = "shape")
public class Shape {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	Integer id;

	@Column
	String type;

	public Integer getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
