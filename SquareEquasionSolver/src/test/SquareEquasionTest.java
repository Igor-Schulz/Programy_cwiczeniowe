package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import execption.SquareEquasionException;
import implementation.EquasionSolverImpl;
import implementation.Imaginary;


public class SquareEquasionTest {
	private EquasionSolverImpl solver = new EquasionSolverImpl();
	
	@Test(expected = SquareEquasionException.class)
	public void linearEquasion() throws SquareEquasionException{
		//given
		Imaginary a = new Imaginary(0,0);
		Imaginary b = new Imaginary(1,0);
		Imaginary c = new Imaginary(1,0);
		//when
		solver.solveEquasion(a, b, c);
		//then
		Assert.fail();
	}
	@Test
	public void deltaGreaterThenZero() throws SquareEquasionException{
		//given
		Imaginary a = new Imaginary(1,0);
		Imaginary b = new Imaginary(-2,0);
		Imaginary c = new Imaginary(-3,0);
		List<Imaginary>expectedResults = new ArrayList<Imaginary>();
		expectedResults.add(new Imaginary(3,0));
		expectedResults.add(new Imaginary(-1,0));
		//when
		solver.solveEquasion(a, b, c);
		//then
		Assert.assertEquals(expectedResults,solver.solveEquasion(a, b, c));
	}
	@Test
	public void deltaEqualsZero() throws SquareEquasionException{
		//given
		Imaginary a = new Imaginary(1,0);
		Imaginary b = new Imaginary(-2,0);
		Imaginary c = new Imaginary(1,0);
		List<Imaginary>expectedResults = new ArrayList<Imaginary>();
		expectedResults.add(new Imaginary(1,0));
		expectedResults.add(new Imaginary(1,0));
		//when
		solver.solveEquasion(a, b, c);
		//then
		Assert.assertEquals(expectedResults,solver.solveEquasion(a, b, c));
	}
	@Test
	public void deltaLessThenZero() throws SquareEquasionException {
		//given
		Imaginary a = new Imaginary(1,0);
		Imaginary b = new Imaginary(0,0);
		Imaginary c = new Imaginary(1,0);
		List<Imaginary>expectedResults = new ArrayList<Imaginary>();
		expectedResults.add(new Imaginary(0,-1));
		expectedResults.add(new Imaginary(0,1));
		//when
		solver.solveEquasion(a, b, c);
		//then
		Assert.assertEquals(expectedResults,solver.solveEquasion(a, b, c));
}
}
