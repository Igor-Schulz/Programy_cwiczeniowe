package implementation;

public class Imaginary {
	private double realPart;
	private double imaginaryPart;
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public Imaginary(double realPart, double imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	public Imaginary() {}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginaryPart);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(realPart);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imaginary other = (Imaginary) obj;
		if (Double.doubleToLongBits(imaginaryPart) != Double.doubleToLongBits(other.imaginaryPart))
			return false;
		if (Double.doubleToLongBits(realPart) != Double.doubleToLongBits(other.realPart))
			return false;
		return true;
	};
	
	 
}
