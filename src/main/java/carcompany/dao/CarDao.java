package carcompany.dao;

import java.util.List;

import carcompany.entities.CarEntity;
import carcompany.enums.BrandEnum;

public interface CarDao extends Dao<CarEntity, Long> {

	List<CarEntity> getByBrand(BrandEnum brand);

	List<CarEntity> getByCapacity(int capacity);
}
