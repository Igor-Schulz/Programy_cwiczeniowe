package implementation;

import java.util.ArrayList;
import java.util.List;

public class ProjectAssignment {
	private List<TimeTable> listOfAssignments = new ArrayList<TimeTable>();;
	
	public List<TimeTable> getListOfAssignments() {
		return listOfAssignments;
	}

	public void assignProject(Workers worker, Project project, Period fromTo) {
		TimeTable table = new TimeTable(project,fromTo,worker);
		listOfAssignments.add(table);
	}

}
