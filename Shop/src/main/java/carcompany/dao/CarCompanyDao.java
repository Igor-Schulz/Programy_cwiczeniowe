package carcompany.dao;
import java.util.List;

import carcompany.entities.CarEntity;

public interface CarCompanyDao extends Dao<CarEntity, Long>{
		
		List<CarEntity> getById(int id);

		List<CarEntity> getByCapacity(int capacity);
}
