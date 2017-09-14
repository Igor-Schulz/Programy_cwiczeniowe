package carcompany.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import carcompany.dao.CarDao;
import carcompany.dao.impl.AbstractDao;
//import com.capgemini.shop.dataaccess.entities.ProductEntity; encje
import carcompany.entities.CarEntity;
import carcompany.enums.BrandEnum;

@Repository
public class CarDaoImpl extends AbstractDao<CarEntity, Long> implements CarDao{

	public List<CarEntity> getByCapacity(int capacity) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.capacity = :capacity", CarEntity.class);

		query.setParameter("capacity",capacity );

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<CarEntity> getByBrand(BrandEnum brand) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.brand = :brand", CarEntity.class);

		query.setParameter("brand",brand );

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

}
