package carcompany.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable{
	
	private static final long serialVersionUID = -2590219530360537793L;
	

	@Id
	@Column(name="pesel", nullable = false, length=11)
	private String pesel;
	
	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String secondName;
	
	@Column(name="dateOfEmployment")
	private Date dateOfEmployment;


	@OneToMany(targetEntity = AssignmentEntity.class, mappedBy = "employee", cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignments = new HashSet<AssignmentEntity>();
}
