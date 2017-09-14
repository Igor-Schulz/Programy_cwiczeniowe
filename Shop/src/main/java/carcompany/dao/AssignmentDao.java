package carcompany.dao;

import java.util.Date;
import java.util.List;

import carcompany.entities.AssignmentEntity;

public interface AssignmentDao extends Dao<AssignmentEntity, Long> {

	List<AssignmentEntity> getByStartOfAssignment(Date startOfAssignment);

	List<AssignmentEntity> getByEmployeesPesel(String pesel);

	List<AssignmentEntity> getByCarId(int carId);
	
}
