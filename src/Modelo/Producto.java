package Modelo;

public class Producto {
	private String fechaCaducidad;
	private String numeroDeLote;
	private String fechaEnvasado;
	private String paisOrigen;

	public Producto(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen) {
		this.fechaCaducidad = pFechaCaducidad;
		this.numeroDeLote = pNumeroDeLote;
		this.fechaEnvasado = pFechaEnvasado;
		this.paisOrigen = pPaisOrigen;
	}
		
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumeroDeLote() {
		return numeroDeLote;
	}

	public void setNumeroDeLote(String numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

}
