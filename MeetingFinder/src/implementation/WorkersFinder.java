package implementation;

import java.util.Date;
import java.util.List;

import exception.MettingException;

public interface WorkersFinder {
	public List<Workers> findWorker(Project project, Date from, Date to,List<TimeTable>timetable) throws MettingException;
}
