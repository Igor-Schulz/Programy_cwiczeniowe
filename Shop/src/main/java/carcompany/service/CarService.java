package carcompany.service;

import java.util.List;
import carcompany.entities.CarEntity;
import carcompany.enums.BrandEnum;

public interface CarService {
	
	List<CarEntity> getByBrand(BrandEnum brand);

	List<CarEntity> getByCapacity(int capacity);
	
	
	void deleteCar(int id);

	CarEntity createCar(CarEntity carEntity);

	CarEntity updateCar(CarEntity carEntity);
}
