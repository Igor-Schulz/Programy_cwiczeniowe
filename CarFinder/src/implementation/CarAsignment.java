package implementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarAsignment {
	private Car car;
	private Worker worker;
	private Date dateOfAsign;
	private Date dateOfReturn;
	public CarAsignment(Car car, Worker worker,Date dateOfAsign,Date dateOfReturn) {
		this.car = car;
		this.worker = worker;
		this.dateOfAsign = dateOfAsign;
		this.dateOfReturn = dateOfReturn;
	}
	
}
