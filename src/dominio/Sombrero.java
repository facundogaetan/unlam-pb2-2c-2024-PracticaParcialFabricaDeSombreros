package dominio;

public class Sombrero {

	private String tipoDeSombrero;
	private int cantidadProducida;
	private String materialesUsados;
	private int costoDeProduccion;

	public Sombrero(String tipoDeSombrero, int cantidadProducida, String materialesUsados, int costoDeProduccion) {
		this.tipoDeSombrero = tipoDeSombrero;
		this.cantidadProducida = cantidadProducida;
		this.materialesUsados = materialesUsados;
		this.costoDeProduccion = costoDeProduccion;
		}

}
