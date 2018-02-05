package dam.obj;


public class CD {

	/**
	 * Atributos de los CDs (nombre, año, número de pistas, y estilo de música
	 */
		private String nombre;
		private int ano;
		private int pistas;
		private Estilos estilo;
	
				
		/**
		 * Constructor
		 * @param nombre
		 * @param ano
		 * @param estilo
		 * @param pistas
		 */
		CD (String nombre, int ano, String estilo, int pistas) {
			this.nombre=nombre.toLowerCase();
			this.ano=ano;
			this.estilo=Estilos.getEstilo(estilo);
			this.pistas=pistas;
		}

		@Override
		public boolean equals (Object obj) {
			if (obj==null) {return false;}
			if (getClass()!=obj.getClass()) {return false;}
			final CD other=(CD)obj;
			if (this.nombre!=other.nombre) {return false;}
			return true;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getano() {
			return ano;
		}
		
		public void setano(int ano) {
			this.ano = ano;
		}
		
		public void setpistas(int pistas) {
			this.pistas = pistas;
		}
		
		public void setestilo(Estilos estilo) {
			this.estilo = estilo;
		}
		
		/**
		 * Modificamos el toString para que al imprimir las discografía salga mejor
		 */
		public String toString () {
			return "- "+nombre+" del "+ano+", tiene "+pistas+" pistas y el estilo es "+estilo+"\n";
		}
	}
