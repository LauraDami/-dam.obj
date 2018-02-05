package dam.obj;

import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Grupo {

	private String nombre;
	private String pais;
	private Representante representante;
	TreeMap <String, CD> discografia;
	int num_integrantes;
	
	@Override
	public boolean equals (Object obj) {
		if (obj==null) {return false;}
		if (getClass()!=obj.getClass()) {return false;}
		final Grupo other=(Grupo)obj;
		if (this.nombre!=other.nombre) {return false;}
		return true;
	}
	
	Grupo (){
	}
	
	/**
	 * Constructor para grupo, este es el constructor usado para añadir nuevos grupos
	 * @param nombre
	 * @param pais
	 * @param n_inte
	 * @param nrep
	 * @param edad
	 * @param sueldo
	 */
	Grupo (String nombre, String pais, int n_inte, String nrep, int edad, float sueldo){
		boolean aux=true;
		do {
			
			try {
		
			this.nombre=nombre;
			System.out.println(this.nombre);
			this.pais=pais;
			this.num_integrantes=n_inte;
			discografia=new TreeMap<String, CD>();
			representante= new Representante(nrep, edad, sueldo);
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
		}while (aux==false);
	}
	
	
	/**
	 * Constructor para grupos, este lo usamos para dejamos algunos grupos metidos por defecto y facilitar las pruebas
	 * @param nombre
	 * @param pais
	 * @param n_inte
	 * @param nrep
	 * @param edad
	 * @param sueldo
	 * @param cd
	 * @param ncd
	 */
	Grupo (String nombre, String pais, int n_inte, String nrep, int edad, float sueldo, CD cd, String ncd){
		boolean aux=true;
		do {
			
			try {
				this.nombre=nombre.toLowerCase();
				this.pais=pais;
				this.num_integrantes=n_inte;
				discografia=new TreeMap<String, CD>();
				discografia.put(ncd, cd);
				representante= new Representante(nrep, edad, sueldo);		
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero para indicar el numero de integrantes");
				nfe.printStackTrace();}
		}while (aux==false);
	}
	
	
	public String toString () {
		
		if (discografia.isEmpty()==true) {
			return "\n"+representante+" representa al grupo '"+nombre+"' procedientes de "+pais+". Este grupo aun no tiene discografía."+"\n\n";
		}else {
			return representante+" representa al grupo '"+nombre+"' procedientes de "+pais+" cuya discografia esta conpuesta por: \n"+ Operaciones.imprimir_discografia(discografia);
	}}
	
	/**
	 * Método creado para añadir un disco nuevo a una discografía
	 */
	public void disco_nuevo() {
		boolean aux=true;
		do {
			aux=true;  //creamos auxiliar para que cuando salte el catch entre en el bucle y vuelva a pedir los datos
			try {		
				String nombre=(JOptionPane.showInputDialog("Introduzca el nombre del disco que desea introducir")).toLowerCase();
				if (discografia.get(nombre)!=null) {
					JOptionPane.showMessageDialog(null, "El disco introducido ya existe");
				}else{
					int agno=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el agno del disco"));
					int pistas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de pistas que tiene el disco"));
					String estilo=JOptionPane.showInputDialog("Introduzca el estilo del disco que desea introducir");
					CD cd=new CD(nombre, agno, estilo, pistas);
					discografia.put(nombre, cd);
				}	
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
			
		}while (aux==false);
						
	}
	
	/**
	 * Método creado para eliminar un disco de una discografía, primero comprueba si el disco está en dicha discografía
	 * @return
	 */
	public boolean eliminar_disco () {
		try {
			String aux=(JOptionPane.showInputDialog("Introduzca el nombre del disco que desea eliminar")).toLowerCase();
				aux.toLowerCase();
			if (discografia.get(aux)==null) {
				JOptionPane.showMessageDialog(null, "El disco introducido no existe");
				return false;
			}else{
				discografia.remove(aux);
				return true;	
			}
		}catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Accion cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
            return false;
    }
	}
	
	/**
	 * Metodo creado para modificar uno de los datos del CD, te la opción entre los posibles datos a modificar
	 */
	public void modificar_cd() {
		int dato=0;
					
			try {
				String nombre=(JOptionPane.showInputDialog("Introduzca el nombre del disco que desea modificar")).toLowerCase();
				dato=Integer.parseInt(JOptionPane.showInputDialog("Indique el dato del disco que desea modificar:\n"
						+ "\n1. Agno\n2. Numero de pistas\n3. Estilo\n4. Salir"));
				if (discografia.get(nombre)==null) {
					JOptionPane.showMessageDialog(null, "El disco introducido no existe");
										
				}else{
					
					switch (dato) {
						case 1:
							int agno=Integer.parseInt(JOptionPane.showInputDialog("Que agno desea poner?"));
							discografia.get(nombre).setano(agno);
							break;	
						
						case 2:
							int pistas=Integer.parseInt(JOptionPane.showInputDialog("Que numero de pistas desea poner?"));
							discografia.get(nombre).setpistas(pistas);
							break;
							
						case 3:
							String estilo=JOptionPane.showInputDialog("De que estilo es el disco?");
							discografia.get(nombre).setestilo(Estilos.getEstilo(estilo));
							break;
					}
				}
			}catch(NumberFormatException nfe) {
				
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
			catch (Exception e) {
		        JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
		       
			}
						
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public TreeMap<String, CD> getDiscografia() {
		return discografia;
	}

	public void setDiscografia(TreeMap<String, CD> discografia) {
		this.discografia = discografia;
	}

	public int getNum_integrantes() {
		return num_integrantes;
	}

	public void setNum_integrantes(int num_integrantes) {
		this.num_integrantes = num_integrantes;
	} 
	
	
	
	
	
	
	
}
