package dam.obj;


public class CD {

		private String nombre;
		private int ano;
		private int pistas;
		private Estilos estilo;
	
		/*CD (String nombre, int ano, String estilo, int pistas) {
			this.nombre=nombre;
			nombre.toLowerCase();
			this.ano=ano;
			this.estilo=Estilos.getEstilo(estilo);
			this.pistas=pistas;
		}*/
		
		
		CD (String nombre, int ano, String estilo, int pistas) {
			this.nombre=nombre;
			nombre.toLowerCase();
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
		
		public String toString () {
			return " en el "+ano+", tiene "+pistas+" pistas y el estilo es "+estilo;
		}
	}
