package dam.obj;


import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Grupo {

	private String nombre;
	private String pais;
	private Representante representante;
	TreeMap <String, CD> discografia;
	int num_integrantes;
	
	Grupo (){
	}
	//
	Grupo (String nombre, String pais, int n_inte, Representante repre){
		boolean aux=true;
		do {
			
			try {
		
			this.nombre=nombre;
			this.pais=pais;
			this.num_integrantes=n_inte;
			discografia=new TreeMap<String, CD>();
			representante= new Representante();
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero para indicar el numero de integrantes");
				nfe.printStackTrace();}
		}while (aux==false);
	}
	
	
	Grupo (String nombre, String pais, int n_inte, String nrep, int edad, float sueldo){
		boolean aux=true;
		do {
			
			try {
				this.nombre=nombre;
				this.pais=pais;
				this.num_integrantes=n_inte;
				discografia=new TreeMap<String, CD>();
				representante= new Representante(nrep, edad, sueldo);		
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero para indicar el numero de integrantes");
				nfe.printStackTrace();}
		}while (aux==false);
}
	
	
	public String toString () {
		return representante+" representa al grupo "+nombre+" procedientes de "+pais+" cuya discografia está conpuesta por: "+discografia ;
	}
	
	public void disco_nuevo() {
		boolean aux=true;
		do {
			
			try {		
				String nombre=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea introducir");
				int agno=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el agno del disco"));
				int pistas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de pistas que tiene el disco"));
				String estilo=JOptionPane.showInputDialog("Introduzca el estilo del disco que desea introducir");
				CD cd=new CD(nombre, agno, estilo, pistas);
				discografia.put(nombre, cd);
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
		}while (aux==false);
						
	}
	
	public boolean eliminar_disco () {
		String aux=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea eliminar");
			aux.toLowerCase();
		if (discografia.remove(aux)==null) {
			JOptionPane.showMessageDialog(null, "El disco introducido no existe");
			return false;
		}else{
			discografia.remove(aux);
			return true;	
		}
	}
	
	public void imprimir_grupo() {
		
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
