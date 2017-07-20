package implementation;

import java.util.List;
public class TimeTable {
	private Project project;
	private Period period;
	private Workers worker;
	public Project getProject() {
		return project;
	}
	public Period getPeriod() {
		return period;
	}
	public Workers getWorker() {
		return worker;
	}
	public TimeTable(Project project, Period period, Workers worker) {
		super();
		this.project = project;
		this.period = period;
		this.worker = worker;
	}
	public TimeTable(Project project, Period period) {
		this.project = project;
		this.period = period;
	}
	
}
