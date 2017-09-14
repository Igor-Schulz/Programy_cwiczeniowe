package carcompany.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import carcompany.entities.CarEntity;
import carcompany.service.to.CarTO;

public class CarMapper {
	
	public static CarTO map(CarEntity carEntity) {
		if (carEntity != null) {
			CarTO carTO = new CarTO(carEntity.getId(), carEntity.getBrand(),
					carEntity.getCapacity());

			return carTO;
		}
		return null;
	}

	public static CarEntity map(CarTO carTO) {
		if (carTO != null) {
			CarEntity carEntity = new CarEntity();
			carEntity.setId(carTO.getId());
			carEntity.setBrand(carTO.getBrand());
			carEntity.setCapacity(carTO.getCapacity());
			return carEntity;
		}
		return null;
	}

	public static CarEntity update(CarEntity carEntity, CarTO carTO) {
		if (carTO != null && carEntity != null) {

		}
		return carEntity;
	}

	public static List<CarTO> map2TOs(List<CarEntity> carEntities) {
		return carEntities.stream().map(CarMapper::map).collect(Collectors.toList());
	}

	public static List<CarEntity> map2Entities(List<CarTO> carTOs) {
		return carTOs.stream().map(CarMapper::map).collect(Collectors.toList());
	}
}
