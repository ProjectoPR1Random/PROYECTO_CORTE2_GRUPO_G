package Modelo;

public class Producto {
	private String fechaCaducidad;
	private String numeroDeLote;
	private String fechaEnvasado;
	private String paisOrigen;

	/**
	 * Constructor de la clase Congelado_Agua
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 */
	
	
	public Producto(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen) {
		this.fechaCaducidad = pFechaCaducidad;
		this.numeroDeLote = pNumeroDeLote;
		this.fechaEnvasado = pFechaEnvasado;
		this.paisOrigen = pPaisOrigen;
	}
		
	
	/**
	 * metodo para obtener la fechaCaducidad
	 * <b>pre</b> que el atributo fechaCaducidad exista
	 * <b>post </b> obtener fecha de caducidad
	 * @return fechaCaducidad
	 */
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo fechaCaducidad   exista
	 * <b>post</b> que se actualice el atributo
	 * @param fechaCaducidad 
	 */
	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * metodo para obtener el numero de lote
	 * <b>pre</b> que el atributo numeroDeLote exista
	 * <b>post </b> obtener numeroDeLote
	 * @return numeroDeLote
	 */
	
	public String getNumeroDeLote() {
		return numeroDeLote;
	}
	
	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo numeroDeLote  exista
	 * <b>post</b> que se actualice el atributo
	 * @param numeroDeLote
	 */

	public void setNumeroDeLote(String numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}

	/**
	 * metodo para obtener la fecha de envasado
	 * <b>pre</b> que el atributo fechaEnvasado exista
	 * <b>post </b> obtener fechaEnvasado
	 * @return fechaEnvasado
	 */
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo fechaEnvasado  exista
	 * <b>post</b> que se actualice el atributo
	 * @param fechaEnvasado 
	 */
	
	
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	/**
	 * metodo para obtener el pais de origen
	 * <b>pre</b> que el atributo paisOrigen exista
	 * <b>post </b> obtener paisOrigen
	 * @return paisOrigen
	 */
	
	public String getPaisOrigen() {
		return paisOrigen;
	}
	
	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo paisOrigen   exista
	 * <b>post</b> que se actualice el atributo
	 * @param paisOrigen
	 */
	

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

}
