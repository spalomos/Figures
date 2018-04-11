package figuras;

public class Circulo {

	private Integer radio;

	public Circulo(Integer radio) {
		super();
		this.radio = radio;
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	public double area(Integer radi) {
		return radi * radi * Math.PI;
	}

	public double perimetre(Integer radi) {
		return 2 * radi * Math.PI;
	}


}
