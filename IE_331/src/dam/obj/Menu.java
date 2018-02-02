package dam.obj;

import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nrep, ngrupo, pais, ncd, estilo;
		int edad, agno, npistas, gestion=0;
		float sueldo;
		TreeMap <String, Grupo> grupos=new TreeMap<String, Grupo>();
		

		
		//
		//Representante repres=new Representante(nrep1, edad1, sueldo1);
		CD cd1=new CD("el cd1", 2015, "jazz", 9);
		CD cd2=new CD("el cd2", 2015, "rock", 15);
		CD cd3=new CD("el cd3", 2015, "clasica", 5);
		Grupo grupo1=new Grupo ("Los sinnombre", "Espagna", 5, "Pepe", 45, 2500, cd1, "el cd1");
		Grupo grupo2=new Grupo ("Vacio", "Suecia", 4, "Ana", 36, 1850, cd2, "el cd2");
		Grupo grupo3=new Grupo ("A la espera", "Croacia", 7, "Alex", 29, 1700, cd3, "el cd3");
		grupos.put("Los SinNombre", grupo1);
		grupos.put("Vacio", grupo2);
		/*grupo1.disco_nuevo();
		grupo1.disco_nuevo();
		grupo1.eliminar_disco();
		System.out.println(grupo1);	*/	
				
		do {
			
			try {
				gestion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la gestion a realizar:\n"
						+ "\n1. Lista de grupos\n2. Información de un grupo\n3. Añadir grupo\n4. Discografía del grupo"
						+ "\n5. Añadir disco a la discografía\n6. Información cliente\n7. Alquilar producto"
						+ "\n8. Añadir disco a la discografía\n9. Salir\n "));
				
				switch(gestion) {
					
				case 1:
					//*********NO FUNCIONA CON EL MÉTODO********
					//Operaciones.imprimir_grupos(grupos);
					System.out.println(grupos);
					break;
					
				case 2:
					//************NO FUNCIONA***************
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
					if (grupos.get(ngrupo)!=null) {
						System.out.println(grupos.get(ngrupo));
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}	
					break;
					
				case 3:
					Operaciones.grupo_nuevo(grupos);
					
				case 4:
					//************NO FUNCIONA***************
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
					if (grupos.get(ngrupo)!=null) {
						System.out.println(grupos.get(ngrupo).getDiscografia());
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}
					
				case 5:
					
					
				}
			
			}catch(NumberFormatException nfe){
				
				JOptionPane.showMessageDialog(null, "Debe introducir un número");
				nfe.printStackTrace();}
				
		}while(gestion!=9);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
