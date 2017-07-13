package rownanie.implementacja;

import rownanie.exception.RownanieException;

public interface RownanieInterface {
	public double[] RozwiazRownanie(double A, double B, double C, double[] pierwiastki) throws RownanieException;
}
