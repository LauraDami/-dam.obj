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
		
		
		//Representante repres=new Representante(nrep1, edad1, sueldo1);
		CD cd1=new CD("el cd1", 2015, "jazz", 9);
		CD cd2=new CD("el cd2", 2015, "rock", 15);
		CD cd3=new CD("el cd3", 2015, "clasica", 5);
		Grupo grupo1=new Grupo ("Los sinnombre", "Espagna", 5, "Pepe", 45, 2500, cd1, "el cd1");
		Grupo grupo2=new Grupo ("vacio", "Suecia", 4, "Ana", 36, 1850, cd2, "el cd2");
		Grupo grupo3=new Grupo ("A la espera", "Croacia", 7, "Alex", 29, 1700, cd3, "el cd3");
		grupos.put("los sinnombre", grupo1);
		grupos.put("vacio", grupo2);
		/*grupo1.disco_nuevo();
		grupo1.disco_nuevo();
		grupo1.eliminar_disco();
		System.out.println(grupo1);	*/	
				
		do {
			
			try {
				gestion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la gestion a realizar:\n"
						+ "\n1. Lista de grupos\n2. Informacion de un grupo\n3. Agnadir grupo\n4. Discografia del grupo"
						+ "\n5. Agnadir disco a la discografia\n6. Borrar disco de la discografia \n7. "
						+ "\n8. \n9. Salir\n "));
				
				switch(gestion) {
					
				case 1:
					//Lista de grupos
					//*********NO FUNCIONA CON EL METODO********
					Operaciones.imprimir_grupos(grupos);
					//grupos.forEach( System.out.println(grupos+"\n") );
					
					//System.out.println(grupos);
					break;
					
				case 2:
					//n2. Informacion de un grupo
					//************NO FUNCIONA***************
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
					if (grupos.get(ngrupo)!=null) {
						 
						System.out.println(grupos.get(ngrupo));
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}	
					break;
					
				case 3:
					//n3. Agnadir grupo
					Operaciones.grupo_nuevo(grupos);
					
				case 4:
					//\n4. Discografia del grupo"
					//************NO FUNCIONA***************
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
					if (grupos.get(ngrupo)!=null) {
						System.out.println(grupos.get(ngrupo).getDiscografia());
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}
					
				case 5:
					//n5. Agnadir disco a la discografia
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:"));
					if (grupos.get(ngrupo)!=null) {
						grupos.get(ngrupo).disco_nuevo();
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}
					
				case 6:
					//n6. Borrar disco de la discografia
					ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:"));
					if (grupos.get(ngrupo)!=null) {
						grupos.get(ngrupo).eliminar_disco();
					}else {
						JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
					}
					
					
				}
			
			}catch(NumberFormatException nfe){
				
				JOptionPane.showMessageDialog(null, "Debe introducir un número");
				nfe.printStackTrace();}
				
		}while(gestion!=9);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
