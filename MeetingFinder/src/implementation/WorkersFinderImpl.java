package implementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exception.MettingException;

public class WorkersFinderImpl implements WorkersFinder {

	@Override
	public List<Workers> findWorker(Project project, Date from, Date to, List<TimeTable> timetable) throws MettingException {
		List<Workers> resultWorkers = new ArrayList<Workers>();
		validate(from,to);
		for(TimeTable tableTemp:timetable) {
			if(tableTemp.getProject().getName()==project.getName()) {
				if((from.before(tableTemp.getPeriod().getFrom()))&&(to.after(tableTemp.getPeriod().getFrom()))) {
					resultWorkers.add(tableTemp.getWorker());
				}else if(((from.after(tableTemp.getPeriod().getFrom())))&&(from.before(tableTemp.getPeriod().getTo()))) {
					resultWorkers.add(tableTemp.getWorker());
				}else {throw new MettingException("Could not find any workers in given range.");}
			}
		}
		
		return resultWorkers;
	}
	public void validate(Date from, Date to) throws MettingException {
		if(to.before(from)) {
			throw new MettingException("Range is invalid. Make sure that first parametr of date is before second parameter.");
		}
	}
}
