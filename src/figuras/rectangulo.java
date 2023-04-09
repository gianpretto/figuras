package figuras;

public class rectangulo {
	private Double ancho;
	private Double alto;
	
	public rectangulo(Double ancho, Double alto) {
		this.ancho = ancho;
	    this.alto = alto;
	}
	
	public Double getPerimetro () {
		return this.ancho*2 + this.alto*2;
		
	}

	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
