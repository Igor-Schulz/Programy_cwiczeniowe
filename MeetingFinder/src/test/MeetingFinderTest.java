package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import exception.MettingException;
import implementation.Departments;
import implementation.Period;
import implementation.Project;
import implementation.ProjectAssignment;
import implementation.Workers;
import implementation.WorkersFinderImpl;

public class MeetingFinderTest {
	private WorkersFinderImpl finder = new WorkersFinderImpl();
	@SuppressWarnings("deprecation")
	@Test(expected = MettingException.class)
	public void fromIsBeforeTo() throws MettingException {
		//given
		ProjectAssignment exampleAssignment = new ProjectAssignment();
		exampleAssignment.assignProject(new Workers("Jan",Departments.PROGRAMMERS), new Project("JavaApp"), new Period(new Date( 2011, 8, 1),new Date( 2012,01, 13)));
		//when
		finder.findWorker(new Project("JavaApp"),new Date(2011,5,7) , new Date(2005,3,5), exampleAssignment.getListOfAssignments());
		//then
		Assert.fail();
	}
	@Test
	public void CorrectSearch() throws MettingException {
		//given
		ProjectAssignment exampleAssignment = new ProjectAssignment();
		exampleAssignment.assignProject(new Workers("Jan",Departments.PROGRAMMERS), new Project("JavaApp"), new Period(new Date( 2011, 8, 1),new Date( 2012,01, 13)));
		List<Workers> expectedWorker = new ArrayList<Workers>();
		expectedWorker.add(new Workers("Jan",Departments.PROGRAMMERS));
		//when
		finder.findWorker(new Project("JavaApp"),new Date(2011,5,7) , new Date(2013,3,5), exampleAssignment.getListOfAssignments());
		//then
		Assert.assertEquals(expectedWorker,finder.findWorker(new Project("JavaApp"),new Date(2011,5,7) , new Date(2013,3,5), exampleAssignment.getListOfAssignments()));
	}
}
