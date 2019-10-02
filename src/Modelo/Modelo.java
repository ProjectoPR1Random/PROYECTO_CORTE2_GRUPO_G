package Modelo;

import java.util.ArrayList;

public class Modelo {

	private ArrayList<Refrigerados> refrigerados;
	private ArrayList<Frescos> frescos;
	private ArrayList<Congelado_Agua> congelados_Aguas;
	private ArrayList<Congelado_Aire> congelado_Aires;
	private ArrayList<Congelado_Nitrogeno> congelado_Nitrogenos;
	private ArrayList<Object> vendidos;
	private ArrayList<String> codigos;

	public Modelo() {

		refrigerados = new ArrayList<>();
		frescos = new ArrayList<>();
		congelado_Aires = new ArrayList<>();
		congelados_Aguas = new ArrayList<>();
		congelado_Nitrogenos = new ArrayList<>();
		codigos = new ArrayList<>();

	}

	public String agregarRefrigerados(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pCodigoOrganismo, String pTemperatura) {

		String ag = "";

		try {

			if (existeRefrigerado(pNumeroDeLote) == false && existeFrescos(pNumeroDeLote) == false
					&& existeCongelado_Nitrogeno(pNumeroDeLote) == false && existeCongelado_Agua(pNumeroDeLote) == false
					&& existeCongelado_Aire(pNumeroDeLote) == false && codigos.contains(pNumeroDeLote) == false) {

				Refrigerados nuevo = new Refrigerados(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen,
						pCodigoOrganismo, pTemperatura);

				refrigerados.add(nuevo);

				ag = "Comprado, Producto Refrigerado";
			} else if (codigos.contains(pNumeroDeLote) == true) {

				ag = "Un producto anteriormente ya fue comprado con ese codigo";

			} else {
				ag = "El producto ya existe\n" + buscarRefigerados(pNumeroDeLote);

			}
		} catch (Exception e) {
			e = new Exception("Error al agregar el producto");
			e.printStackTrace();
		}
		return ag;
	}

	public String agregarFresco(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen) {

		String ag = "";

		try {

			if (existeRefrigerado(pNumeroDeLote) == false && existeFrescos(pNumeroDeLote) == false
					&& existeCongelado_Nitrogeno(pNumeroDeLote) == false && existeCongelado_Agua(pNumeroDeLote) == false
					&& existeCongelado_Aire(pNumeroDeLote) == false && codigos.contains(pNumeroDeLote) == false) {

				Frescos nuevo = new Frescos(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen);

				frescos.add(nuevo);

				ag = "Comprado, Producto Fresco";
			} else if (codigos.contains(pNumeroDeLote) == true) {

				ag = "Un producto anteriormente ya a fue comprado con ese codigo";

			} else {
				ag = "El producto ya existe\n" + buscarFrescos(pNumeroDeLote);

			}
		} catch (Exception e) {
			e = new Exception("Error al agregar el producto");
			e.printStackTrace();
		}
		return ag;
	}

	public String agregarCongelado_Agua(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pTemperatura, String pSalinidadDelAgua) {

		String ag = "";

		try {

			if (existeRefrigerado(pNumeroDeLote) == false && existeFrescos(pNumeroDeLote) == false
					&& existeCongelado_Nitrogeno(pNumeroDeLote) == false && existeCongelado_Agua(pNumeroDeLote) == false
					&& existeCongelado_Aire(pNumeroDeLote) == false && codigos.contains(pNumeroDeLote) == false) {

				Congelado_Agua nuevo = new Congelado_Agua(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen,
						pTemperatura, pSalinidadDelAgua);

				congelados_Aguas.add(nuevo);

				ag = "Comprado, Producto Congelado Agua";
			} else if (codigos.contains(pNumeroDeLote) == true) {

				ag = "Un producto anteriormente ya a fue comprado con ese codigo";

			} else {
				ag = "El producto ya existe\n" + buscarCongelado_Agua(pNumeroDeLote);

			}
		} catch (Exception e) {
			e = new Exception("Error al agregar el producto");
			e.printStackTrace();
		}
		return ag;
	}

	public String agregarCongelado_Nitrogeno(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pTemperatura, String pMetodoCongelacion, String pTiempoExposicion) {

		String ag = "";

		try {

			if (existeRefrigerado(pNumeroDeLote) == false && existeFrescos(pNumeroDeLote) == false
					&& existeCongelado_Nitrogeno(pNumeroDeLote) == false && existeCongelado_Agua(pNumeroDeLote) == false
					&& existeCongelado_Aire(pNumeroDeLote) == false && codigos.contains(pNumeroDeLote) == false) {

				Congelado_Nitrogeno nuevo = new Congelado_Nitrogeno(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado,
						pPaisOrigen, pTemperatura, pMetodoCongelacion, pTiempoExposicion);
				congelado_Nitrogenos.add(nuevo);

				ag = "Comprado, Producto Congelado Nitrogeno";
			} else if (codigos.contains(pNumeroDeLote) == true) {

				ag = "Un producto anteriormente ya a fue comprado con ese codigo";

			} else {
				ag = "El producto ya existe\n" + buscarCongelado_Nitrogeno(pNumeroDeLote);

			}

		} catch (Exception e) {
			e = new Exception("Error al agregar el producto");
			e.printStackTrace();
		}
		return ag;
	}

	public String agregarCongelado_Aire(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pTemperatura, String pComposiciónDelAire) {

		String ag = "";

		try {

			if (existeRefrigerado(pNumeroDeLote) == false && existeFrescos(pNumeroDeLote) == false
					&& existeCongelado_Nitrogeno(pNumeroDeLote) == false && existeCongelado_Agua(pNumeroDeLote) == false
					&& existeCongelado_Aire(pNumeroDeLote) == false && codigos.contains(pNumeroDeLote) == false) {

				Congelado_Aire nuevo = new Congelado_Aire(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen,
						pTemperatura, pComposiciónDelAire);

				congelado_Aires.add(nuevo);

				ag = "Comprado, Producto Congelado Aire";
			} else if (codigos.contains(pNumeroDeLote) == true) {

				ag = "Un producto anteriormente ya a fue comprado con ese codigo";

			} else {
				ag = "El producto ya existe\n" + buscarCongelado_Aire(pNumeroDeLote);

			}

		} catch (Exception e) {
			e = new Exception("Error al agregar el producto");
			e.printStackTrace();
		}
		return ag;
	}

	public String venderProducto(String pNumeroDeLote) {
		String respuesta = "";
		if (existeRefrigerado(pNumeroDeLote) == true || existeFrescos(pNumeroDeLote) == true
				|| existeCongelado_Nitrogeno(pNumeroDeLote) == true || existeCongelado_Agua(pNumeroDeLote) == true
				|| existeCongelado_Aire(pNumeroDeLote) == true && codigos.contains(pNumeroDeLote) == true) {

			if (existeRefrigerado(pNumeroDeLote) == true) {

				Refrigerados encontrado = buscarRefigerados(pNumeroDeLote);

				if (vendidos.contains(encontrado) == false) {

					vendidos.add(encontrado);
					refrigerados.remove(encontrado);

					respuesta = "Vendido, Producto Refrigerado";
				} else {

					respuesta = "El producto ya fue vendido";
				}

			}

			if (existeFrescos(pNumeroDeLote) == true) {

				Frescos encontrado = buscarFrescos(pNumeroDeLote);

				if (vendidos.contains(encontrado) == false) {

					vendidos.add(encontrado);
					frescos.remove(encontrado);
					respuesta = "Vendido, Producto Fresco";
				} else {

					respuesta = "El producto ya fue vendido";
				}

			}

			if (existeCongelado_Nitrogeno(pNumeroDeLote) == true) {

				Congelado_Nitrogeno encontrado = buscarCongelado_Nitrogeno(pNumeroDeLote);

				if (vendidos.contains(encontrado) == false) {

					vendidos.add(encontrado);
					congelado_Nitrogenos.remove(encontrado);
					respuesta = "Vendido, Producto Congelado Nitrogeno";
				} else {

					respuesta = "El producto ya fue vendido";
				}

			}

			if (existeCongelado_Aire(pNumeroDeLote) == true) {

				Congelado_Aire encontrado = buscarCongelado_Aire(pNumeroDeLote);
				if (vendidos.contains(encontrado) == false) {

					vendidos.add(encontrado);
					congelado_Aires.remove(encontrado);
					respuesta = "Vendido, Producto Congelado Aire";
				} else {

					respuesta = "El producto ya fue vendido";
				}

			}
		} else {

			respuesta = "El producto no existe, por lo tanto es imposible venderlo";

		}
		return respuesta;
	}

	public String eliminarProducto(String pNumeroDeLote) {

		String res = "";

		if (existeRefrigerado(pNumeroDeLote) == true || existeFrescos(pNumeroDeLote) == true
				|| existeCongelado_Nitrogeno(pNumeroDeLote) == true || existeCongelado_Agua(pNumeroDeLote) == true
				|| existeCongelado_Aire(pNumeroDeLote) == true && codigos.contains(pNumeroDeLote) == true) {
		
		if (existeRefrigerado(pNumeroDeLote) == true) {
			
			Refrigerados encontrado = buscarRefigerados(pNumeroDeLote);
			
			refrigerados.remove(encontrado); 
			res = "Producto Eliminado, Producto Refrigerado";
		}
		
		else if(existeFrescos(pNumeroDeLote) == true) {
			
			Frescos encontrado = buscarFrescos(pNumeroDeLote);
			
			frescos.remove(encontrado);
			res ="Producto Eliminado, Producto Fresco";
			
		}
		
		else if(existeCongelado_Agua(pNumeroDeLote) == true) {
			
			Congelado_Agua encontrado = buscarCongelado_Agua(pNumeroDeLote);
			
			congelados_Aguas.remove(encontrado);
			res = "Producto Eliminado, Producto Congelado Agua";
		}
		
		else if(existeCongelado_Aire(pNumeroDeLote) == true) {
			
			Congelado_Aire encontrado = buscarCongelado_Aire(pNumeroDeLote);
			
			congelado_Aires.remove(encontrado);
			res = "Producto Eliminado, Producto Congelado Aire";
			
		}
		
		else if(existeCongelado_Nitrogeno(pNumeroDeLote) == true) {
			
			Congelado_Nitrogeno encontrado = buscarCongelado_Nitrogeno(pNumeroDeLote);
			
			congelado_Nitrogenos.remove(encontrado);
			res = "Producto Eliminado, Producto Congelado Nitrogeno";
			
		}
		
		}else {
			
			res = "No existe ningun Producto con ese numero de lote";
			
		}
		return res;
	}

	public Refrigerados buscarRefigerados(String codigo) {
		Refrigerados encontrado = null;
		for (int i = 0; i < refrigerados.size(); i++) {
			if (refrigerados.get(i).getNumeroDeLote().equalsIgnoreCase(codigo)) {
				encontrado = refrigerados.get(i);
			}
		}
		return encontrado;
	}

	public boolean existeRefrigerado(String codigo) {
		if (buscarRefigerados(codigo) != null) {
			return true;
		}
		return false;
	}

	public Frescos buscarFrescos(String codigo) {
		Frescos encontrado = null;
		for (int i = 0; i < frescos.size(); i++) {
			if (frescos.get(i).getNumeroDeLote().equalsIgnoreCase(codigo)) {
				encontrado = frescos.get(i);
			}
		}
		return encontrado;
	}

	public boolean existeFrescos(String codigo) {
		if (buscarFrescos(codigo) != null) {
			return true;
		}
		return false;
	}

	public Congelado_Agua buscarCongelado_Agua(String codigo) {
		Congelado_Agua encontrado = null;
		for (int i = 0; i < congelados_Aguas.size(); i++) {
			if (congelados_Aguas.get(i).getNumeroDeLote().equalsIgnoreCase(codigo)) {
				encontrado = congelados_Aguas.get(i);
			}
		}
		return encontrado;
	}

	public boolean existeCongelado_Agua(String codigo) {
		if (buscarCongelado_Agua(codigo) != null) {
			return true;
		}
		return false;
	}

	public Congelado_Aire buscarCongelado_Aire(String codigo) {
		Congelado_Aire encontrado = null;
		for (int i = 0; i < congelado_Aires.size(); i++) {
			if (congelado_Aires.get(i).getNumeroDeLote().equalsIgnoreCase(codigo)) {
				encontrado = congelado_Aires.get(i);
			}
		}
		return encontrado;
	}

	public boolean existeCongelado_Aire(String codigo) {
		if (buscarCongelado_Aire(codigo) != null) {
			return true;
		}
		return false;
	}

	public Congelado_Nitrogeno buscarCongelado_Nitrogeno(String codigo) {
		Congelado_Nitrogeno encontrado = null;
		for (int i = 0; i < congelado_Nitrogenos.size(); i++) {
			if (congelado_Nitrogenos.get(i).getNumeroDeLote().equalsIgnoreCase(codigo)) {
				encontrado = congelado_Nitrogenos.get(i);
			}
		}
		return encontrado;
	}

	public boolean existeCongelado_Nitrogeno(String codigo) {
		if (buscarCongelado_Nitrogeno(codigo) != null) {
			return true;
		}
		return false;
	}

}
