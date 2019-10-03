package Modelo;
 
    /**
     * Esta clase contiene los objetos de los productos cogelados por medio de agua, y hereda los objetos de la clase Congelados
     * @author JUAN POVEDA, BRYAN CASTILLO, NICOLAS GONZALEZ
     */

    public class Congelado_Agua extends Congelados{
    	
    private String salinidadDelAgua;
	
    /**
	 * Constructor de la clase Congelado_Agua
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 * @param pTemperatura Temperatura ideal del producto pTemperatura!=null, pTemperatura!=""
	 * @param pSalinidadDelAgua La cantidad de salinidad del producto pSalinidadDelAgua!=null, pSalinidadDelAgua!=""
	 */
	public Congelado_Agua(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pSalinidadDelAgua) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub
		
	this.salinidadDelAgua=pSalinidadDelAgua;
	}
    

	/**
	 * metodo para obtener salinidad de agua
	 * <b>pre</b> que el atributo salinidaddeagua exista
	 * <b>post </b> obtener salinidad de agua
	 * @return salinidadDelAgua
	 */
	
	public String getSalinidadDelAgua() {
		return salinidadDelAgua;
	}
    
	/**
	 * Meotodo para 
	 * <b>pre</b> que el atributo salinidadDelAgua exista
	 * <b>post</b> que se actualice el atributo
	 * @param salinidadDelAgua
	 */
	public void setSalinidadDelAgua(String salinidadDelAgua) {
		this.salinidadDelAgua = salinidadDelAgua;
	}

}
