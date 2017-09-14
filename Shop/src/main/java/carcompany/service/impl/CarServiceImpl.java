package carcompany.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import carcompany.dao.CarDao;
import carcompany.entities.CarEntity;
import carcompany.enums.BrandEnum;
import carcompany.service.CarService;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDao carDao;

	public List<CarEntity> getByBrand(BrandEnum brand) {

		return carDao.getByBrand(brand);
	}

	public List<CarEntity> getByCapacity(int capacity) {

		return carDao.getByCapacity(capacity);
	}

	public void deleteCar(int id) {
		// carDao.delete(id); zmienic na longa

	}

	public CarEntity createCar(CarEntity carEntity) {
		return carDao.save(carEntity);
	}

	public CarEntity updateCar(CarEntity carEntity) {
		return carDao.update(carEntity);
	}

}
