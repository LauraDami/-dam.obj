package dam.obj;

import java.util.Map;

import javax.swing.JOptionPane;

public class Operaciones {
	
	public void disco_nuevo() {
		try {		
			String nombre=JOptionPane.showInputDialog("Introduzca el nombre del disco que desea introducir");
			int agno=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el agno del disco"));
			int pistas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de pistas que tiene el disco"));
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
