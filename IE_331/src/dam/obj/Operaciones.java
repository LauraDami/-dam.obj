package dam.obj;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;


public class Operaciones {
	
	
	//apartado 2
	
	public static String imprimir_grupos(TreeMap <String, Grupo>  grupos) {
		Iterator<String> it= grupos.keySet().iterator();
		String a=" ";
		while (it.hasNext()) {
			String key=(String) it.next();
			a=a+grupos.get(key);
		}return a;
			
	}
	
	
	public static void grupo_nuevo(TreeMap <String, Grupo>  grupos) {
		boolean aux=true;
		do {
			//Grupo (String nombre, String pais, int n_inte, String nrep, int edad, float sueldo)
			try {		
				String nombre=JOptionPane.showInputDialog("Indique el nombre del grupo que desea introducir");
				String pais=JOptionPane.showInputDialog("Indique el país del grupo");
				int n_inte=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de integrantes"));
				String nrep=JOptionPane.showInputDialog("Indique el nombre del representante que se encargará del grupo");
				int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del representante"));
				Float sueldo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo del representante"));
				Grupo grupo=new Grupo(nombre, pais, n_inte, nrep, edad, sueldo);
				grupos.put(nombre, grupo);
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
		}while (aux==false);
						
	}
	
	
/*	public void disco_nuevo() {
		try {		
			String nombre=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea introducir");
			int agno=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el agno del disco"));
			int pistas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero de pistas que tiene el disco"));
			String estilo=JOptionPane.showInputDialog("Introduzca el estilo del disco que desea introducir");
			CD cd=new CD(nombre, agno, estilo, pistas);
			discografia.put(nombre, cd);
		}catch (NumberFormatException nfe){
			
			JOptionPane.showMessageDialog(null, "Debe introducir un numero");
			nfe.printStackTrace();}
			
	
				
	}
	
	public void eliminar_disco () {
		String aux=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea eliminar");
		aux.toLowerCase();
		discografia.remove(aux);
			
	}
	

	/*
	public void eliminar_disco () {
		String aux=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea eliminar");
		
		for(Map.Entry<String,CD> cd : discografia.entrySet()) {
			  String key = cd.getKey();
			  CD value = cd.getValue();

			  System.out.println(key + " => " + value);
			}
		discografia.remove(nombre.equalsIgnoreCase(aux));
	}
	
	for(Map.Entry<String,CD> cd : discografia.entrySet()) {
		  String key = cd.getKey();
		  CD value = cd.getValue();

		  if (aux.equals(key)) {
			  int posicion=c;
			  existe=true;
		  }
		  c++;
		}
	
	if (existe==true) {
	
	*/
	
	
}
