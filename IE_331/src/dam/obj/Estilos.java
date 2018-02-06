package dam.obj;

public enum Estilos {
	
	POP,
	ROCK,
	JAZZ,
	RAP,
	SALSA,
	CLASICA,
	DESCONOCIDO;
	
	/**
	 * Creamos un constructor para los estilos, para poder llamarlo y asignar uno de los estilos a cada CD
	 * @param estilo
	 * @return Estilo
	 */
public static Estilos getEstilo(String estilo) {
		
		if (estilo.equalsIgnoreCase("pop")) {
			return Estilos.POP;
		}else if (estilo.equalsIgnoreCase("rock")){			
			return Estilos.ROCK;
		}else if (estilo.equalsIgnoreCase("jazz")){
			return Estilos.JAZZ;
		}else if (estilo.equalsIgnoreCase("rap")){
			return Estilos.RAP;
		}else if (estilo.equalsIgnoreCase("salsa")){
			return Estilos.SALSA;
		}else if (estilo.equalsIgnoreCase("clasica")){
			return Estilos.CLASICA;	
		}else{
			return Estilos.DESCONOCIDO;
		}
		
	}

}
