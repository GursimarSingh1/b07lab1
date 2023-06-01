public class Polynomial{
	double[] coefficients;

	public Polynomial(){
		this.coefficients = new double[0];
	}

	public Polynomial(double[] coefficients){
		this.coefficients = coefficients;
	}

	public Polynomial add (Polynomial other){

		int length = other.coefficients.length;

		if(this.coefficients.length > length){
			length = this.coefficients.length;
		}


		double[] newPoly = new double[length];

		for(int i = 0 ; i<this.coefficients.length; i++){
			newPoly[i] += this.coefficients[i];
		}

		for(int i = 0; i<other.coefficients.length; i++){
			newPoly[i] += other.coefficients[i];
		}

		return new Polynomial(newPoly);

	}

	public double evaluate(double x){
		double sum = 0;
		
		for(int i = 0; i < this.coefficients.length; i++){
			sum += coefficients[i]*(Math.pow(x,i));
		}

		return sum;
	}





	public boolean hasRoot(double x){
		return this.evaluate(x) == 0;
	}
	

}

				
