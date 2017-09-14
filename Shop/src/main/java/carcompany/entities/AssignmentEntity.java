package carcompany.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Assignment")
public class AssignmentEntity implements Serializable {

	private static final long serialVersionUID = -2590219530360537793L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",  nullable = false)
	private int id;
	
	@Column(name = "startOfAssignment", nullable = false)
	private Date startOfAssignment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee", nullable = false)
	private EmployeeEntity employee;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car", nullable = false)
	private CarEntity car;
}