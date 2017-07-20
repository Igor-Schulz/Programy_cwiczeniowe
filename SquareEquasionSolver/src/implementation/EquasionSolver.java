package implementation;

import java.util.List;


import execption.SquareEquasionException;

public interface EquasionSolver {
	public List<Imaginary> solveEquasion(Imaginary squareCoefficient, Imaginary linearCoefficient, Imaginary freeTerm)throws SquareEquasionException;
}
