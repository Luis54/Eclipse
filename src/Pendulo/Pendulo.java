package Pendulo;

public class Pendulo {
	private double longitud;
	private static final double GRAVEDAD = 9.8;
	public Pendulo(double longitud) {
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double calcularPeriodo(){
		return Math.round(2*Math.PI*Math.sqrt(this.longitud/GRAVEDAD));
		
	}

	@Override
	public String toString() {
		return "El perido del pendulo es " + calcularPeriodo();
	}
	
}
