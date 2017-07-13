package rownanie.implementacja;
import java.lang.Math;

import rownanie.exception.RownanieException;



public class Square implements RownanieInterface  {
	
	public double[] RozwiazRownanie(double A, double B, double C, double[] pierwiastki) throws RownanieException {
		if(A == 0) {
			throw new RownanieException("To nie jest równanie kwadratowe!");
		}
		if(B*B - 4*A*C > 0) {
			pierwiastki[0] = ((-B)+Math.sqrt(B*B - 4*A*C))/(2*A);
			pierwiastki[1] = ((-B)-Math.sqrt(B*B - 4*A*C))/(2*A);
		}else if(B*B - 4*A*C == 0) {
			pierwiastki[0] = (-B)/(2*A);
			pierwiastki[1] = (-B)/(2*A);
		}else if (B*B - 4*A*C < 0) {
			pierwiastki[0] = (-B)/(2*A);
			pierwiastki[1] = (-B)/(2*A);
			pierwiastki[2] = Math.sqrt(Math.abs(B*B - 4*A*C))/(2*A);
			pierwiastki[3] = Math.sqrt(Math.abs(B*B - 4*A*C))*(-1)/(2*A);
		}	
	return pierwiastki;}
}
