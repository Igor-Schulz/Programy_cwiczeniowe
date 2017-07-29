package implementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AsignmentMeneger {
	public List<CarAsignment> createAsignemt(Car car, Worker worker, Date dateOfAsign,Date dateOfReturn){
		
		CarAsignment temporaryAsignment = new CarAsignment(car,worker,dateOfAsign,dateOfReturn);
		
		List<CarAsignment> listOfAsignment = new ArrayList<CarAsignment>();
		
		listOfAsignment.add(temporaryAsignment);
		
		return listOfAsignment;
	}
}
