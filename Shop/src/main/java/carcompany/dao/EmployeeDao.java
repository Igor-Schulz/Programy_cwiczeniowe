package carcompany.dao;

import java.util.Date;
import java.util.List;

import carcompany.entities.EmployeeEntity;

public interface EmployeeDao extends Dao<EmployeeEntity, Long> {

	List<EmployeeEntity> getByPesel(String pesel);

	List<EmployeeEntity> getByFirstName(String firstName);

	List<EmployeeEntity> getByLastName(String secondName);
	
	List<EmployeeEntity> getByDateOfEmployment(Date dateOfEmployment);

}