package Modelo;

public class Congelado_Aire extends Congelados {


	private String composicionDelAire;
<<<<<<< HEAD
	
	/**
	 * Constructor de la clase Congelado_Aire
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 * @param pTemperatura Temperatura ideal del producto pTemperatura!=null, pTemperatura!=""
	 * @param pComposiciónDelAire La composicion del aire en el producto. pComposiciónDelAire!=null, pComposiciónDelAire!=""
	 */
	
=======

>>>>>>> e0ec13078cc0d40bb6980f2fbc9338f93c15647d
	public Congelado_Aire(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pComposiciónDelAire) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub

		this.composicionDelAire = pComposiciónDelAire;
	}
	
	/**
	 * metodo para obtener la composicion del aire
	 * <b>pre</b> que el atributo composicionDelAire exista
	 * <b>post </b> obtener composicion del aire
	 * @return composicionDelAire
	 */

	public String getComposicionDelAire() {
		return composicionDelAire;
	}
	
	
	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo composicionDelAire exista
	 * <b>post</b> que se actualice el atributo
	 * @param composicionDelAire
	 */

	public void setComposicionDelAire(String composicionDelAire) {
		this.composicionDelAire = composicionDelAire;
	}

}
