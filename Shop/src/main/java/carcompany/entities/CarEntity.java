package carcompany.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import carcompany.enums.BrandEnum;

@Entity
@Table(name = "car")
public class CarEntity implements Serializable {
	private static final long serialVersionUID = -2590219530360537793L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "brand", nullable = false)
	private BrandEnum brand;
	
	@Column(name = "capacity", nullable = false)
	private int capacity;
	
	@OneToMany(targetEntity = AssignmentEntity.class, mappedBy = "car", cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignments = new HashSet<AssignmentEntity>();
	
	public CarEntity(){
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public BrandEnum getBrand() {
		return brand;
	}

	public void setBrand(BrandEnum brand) {
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}