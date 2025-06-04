
public class Raio extends Forma {
	
	private double p ;
	private double r; 


	public  Raio(double p, double r) {
		this.p = 3.14;
		this.r = 2;
	}
		@Override
		public double calcularArea() {
			return p * r * r;
		}
	
}
