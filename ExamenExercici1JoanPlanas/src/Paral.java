
public class Paral<T extends Number> {
	
	private T longitud;
	private T amplada;
	private T alçada;
	
	public Paral(T l,T am,T al) {
		this.longitud = l;
		this.amplada = am;
		this.alçada = al;
		
	}
	
	public String toString() {
		return "Longitud: " + this.longitud + "\n"
				+ "Amplada: " +  this.amplada + "\n"
				+ "Alçada: "+ this.alçada; 
	}
	
	public double volum() {
		return this.alçada.doubleValue() * this.amplada.doubleValue() * this.longitud.doubleValue();
	}

	public T getLongitud() {
		return longitud;
	}

	public void setLongitud(T longitud) {
		this.longitud = longitud;
	}

	public T getAmplada() {
		return amplada;
	}

	public void setAmplada(T amplada) {
		this.amplada = amplada;
	}

	public T getAlçada() {
		return alçada;
	}

	public void setAlçada(T alçada) {
		this.alçada = alçada;
	}
	
	public void test() {
		System.out.print("test");
	}
	
	
	
	
	

}