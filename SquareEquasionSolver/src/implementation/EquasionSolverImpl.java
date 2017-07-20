package implementation;

import java.util.ArrayList;
import java.util.List;


import execption.SquareEquasionException;

public class EquasionSolverImpl implements EquasionSolver {

	@Override
	public List<Imaginary> solveEquasion(Imaginary squareCoefficient, Imaginary linearCoefficient, Imaginary freeTerm) throws SquareEquasionException{
		if (squareCoefficient.getRealPart()!= 0) {
			ImaginaryHelper imaHelper = new ImaginaryHelper();
			Imaginary delta = new Imaginary();
			delta.setRealPart(imaHelper.multiplication(linearCoefficient, linearCoefficient).getRealPart()-imaHelper.multiplication(imaHelper.multiplication(new Imaginary(4,0), squareCoefficient),freeTerm).getRealPart());
			if(delta.getRealPart()>= 0) {
				List<Imaginary> result = new ArrayList<Imaginary>();
				result.add(new Imaginary((((-1)*linearCoefficient.getRealPart()+Math.sqrt(delta.getRealPart()))/(2*squareCoefficient.getRealPart())) ,0));
				result.add(new Imaginary((((-1)*linearCoefficient.getRealPart()-Math.sqrt(delta.getRealPart()))/(2*squareCoefficient.getRealPart())) ,0));
				return result;
			}else {
				List<Imaginary> result = new ArrayList<Imaginary>();
				result.add(new Imaginary((((-1)*linearCoefficient.getRealPart())/(2*squareCoefficient.getRealPart())) ,((Math.sqrt(Math.abs(delta.getRealPart())))/(2*squareCoefficient.getRealPart()))));
				result.add(new Imaginary((((-1)*linearCoefficient.getRealPart())/(2*squareCoefficient.getRealPart())) ,(((-1)*Math.sqrt(Math.abs(delta.getRealPart())))/(2*squareCoefficient.getRealPart()))));
				return result;
			}
		}else {
			throw new SquareEquasionException("This is not a quadratic equasion. The squareCoefficient can not be equal to zero.");
		}
	}
}
