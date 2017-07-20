package implementation;

public class ImaginaryHelper {
	public Imaginary multiplication(Imaginary firstNumber, Imaginary secondNumber) {
		Imaginary product = new Imaginary();
		product.setRealPart(firstNumber.getRealPart()*secondNumber.getRealPart()-firstNumber.getImaginaryPart()*secondNumber.getImaginaryPart());
		product.setImaginaryPart(firstNumber.getRealPart()*secondNumber.getImaginaryPart()+firstNumber.getImaginaryPart()*secondNumber.getRealPart());
	return product;
	}
	public Imaginary addition(Imaginary firstNumber, Imaginary secondNumber) {
		Imaginary sum = new Imaginary();
		sum.setRealPart(firstNumber.getRealPart()+secondNumber.getRealPart());
		sum.setImaginaryPart(firstNumber.getImaginaryPart()+secondNumber.getImaginaryPart());
		return sum;
	}
}
