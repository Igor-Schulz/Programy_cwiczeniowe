package rownanie.test;

import org.junit.Assert;
import org.junit.Test;

import rownanie.exception.RownanieException;
import rownanie.implementacja.Square;

public class Juint_Test {
	Square rownanie = new Square();
	
	@Test(expected = RownanieException.class)
	public void RownanieLiniowe() throws RownanieException {
		double[] pierwiastki = new double[4];
		double A = 0;
		double B = 1;
		double C = 1;
		
		rownanie.RozwiazRownanie(A, B, C, pierwiastki);	
	}
	@Test
	public void DeltaWiekszaOdZera() throws RownanieException {
		double[] pierwiastki = new double[4];
		double A = 1;
		double B = -2;
		double C = -3;
		
		Assert.assertArrayEquals(new double[]{3,-1,0,0}, rownanie.RozwiazRownanie(A, B, C, pierwiastki), 0);
	}
	@Test
	public void DeltaRownaZero() throws RownanieException {
		double[] pierwiastki = new double[4];
		double A = 1;
		double B = -2;
		double C = 1;
		
		Assert.assertArrayEquals(new double[]{1,1,0,0}, rownanie.RozwiazRownanie(A, B, C, pierwiastki), 0);
	}
	@Test
	public void DeltaMniejszaOdZera() throws RownanieException {
		double[] pierwiastki = new double[4];
		double A = 1;
		double B = 0;
		double C = 1;
		
		Assert.assertArrayEquals(new double[]{0,0,1,-1}, rownanie.RozwiazRownanie(A, B, C, pierwiastki), 0);
	}
	
}
