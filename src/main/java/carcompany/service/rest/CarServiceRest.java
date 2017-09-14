package carcompany.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import carcompany.enums.BrandEnum;
import carcompany.service.CarService;
import carcompany.service.mapper.CarMapper;
import carcompany.service.to.CarTO;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/rest/car")
public class CarServiceRest {

	CarService carService;

	@Autowired
	public CarServiceRest(CarService carService) {
		this.carService = carService;
	}

	@RequestMapping(value = "/find/{brand}", method = RequestMethod.GET)
	@ResponseBody
	public List<CarTO> readCar(@PathVariable BrandEnum brand) {

		return CarMapper.map2TOs(carService.getByBrand(brand));

	}
}
