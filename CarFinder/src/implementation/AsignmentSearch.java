package implementation;

import java.util.List;

public interface AsignmentSearch {
	public List<Car> carBelowFourWeeks(List<CarAsignment> list);
	public List<Worker> workersWhoUsedSameCar(List<CarAsignment> list, Car car);
	public List<Car> privateCarOnly(List<CarAsignment> list);
	public List<Car> carsUsedByMoreThenFourWorkers(List<CarAsignment> list);
	public List<Car> carsWithCapacity(List<CarAsignment> list, int capacity);
}
