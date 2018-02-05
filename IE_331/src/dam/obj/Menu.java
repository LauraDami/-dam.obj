package dam.obj;

import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ngrupo;
		int gestion=0;
		TreeMap <String, Grupo> grupos=new TreeMap<String, Grupo>();
		
		//Incluimos algunos CDs y grupos para hacer pruebas y aligerar el proceso
		CD cd1=new CD("cd1_prueba", 2015, "jazz", 9);
		CD cd2=new CD("cd2_prueba", 2015, "rock", 15);
		CD cd3=new CD("cd3_prueba", 2015, "clasica", 5);
		Grupo grupo1=new Grupo ("Los sinnombre", "Espagna", 5, "Pepe", 45, 2500, cd1, "cd1_prueba");
		Grupo grupo2=new Grupo ("vacio", "Suecia", 4, "Ana", 36, 1850, cd2, "cd2_prueba");
		Grupo grupo3=new Grupo ("a la espera", "Croacia", 7, "Alex", 29, 1700, cd3, "cd3_prueba");
		grupos.put("los sinnombre", grupo1);
		grupos.put("vacio", grupo2);

				
		do {
			
			try {
				gestion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la gestion a realizar:\n"
						+ "\n1. Lista de grupos\n2. Informacion de un grupo\n3. Agnadir grupo\n4. Discografia del grupo"
						+ "\n5. Agnadir disco a la discografia\n6. Borrar disco de la discografia \n7. Modificar datos de un CD"
						+ "\n8. Eliminar grupo\n9. Salir\n "));
				
				switch(gestion) {
					
				case 1:
					//n1. Lista de grupos - Imprimimos por consola la información de los grupos almacenados
					
					//Operaciones.imprimir_grupos(grupos);
					//grupos.forEach( System.out.println(grupos+"\n") );
					
					System.out.println(grupos);
					break;
					
				case 2:
					//n2. Informacion de un grupo - Imprimimos por consola la información del grupo que elijamos, primero comprueba
					//que el grupo exista
										
					try {
						ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
						if (grupos.get(ngrupo)!=null) {
							 
							System.out.println(grupos.get(ngrupo));
						}else {
							JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
						}	
					}catch (Exception e) {
		                JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
		                
		            }
					break;
					
				case 3:
					//n3. Agnadir grupo - Añadimos un nuevo grupo a una discografía
					
					Operaciones.grupo_nuevo(grupos);
					break;
					
				case 4:
					//\n4. Discografia del grupo - Imprimimos por consola la discografía de un grupo que elijamos, primero comprueba
					//que el grupo exista
					
					try {
						
						ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
						if (grupos.get(ngrupo)!=null) {
							//Operaciones.imprimir_discografia(grupos.get(ngrupo).discografia);
							//Operaciones.imprimir_discografia(discografia);
							System.out.println(grupos.get(ngrupo).getDiscografia());
						}else {
							JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
						}
					}catch (Exception e) {
			            JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
			        }
					
					break;
					
				case 5:
					//n5. Agnadir disco a la discografia - Añadimos un disco a la discografía del grupo que elijamos, primero
					//comprobamos que el grupo exista
					
					try {
						ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
						if (grupos.get(ngrupo)!=null) {
							grupos.get(ngrupo).disco_nuevo();
						}else {
							JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
						}
					}catch (Exception e) {
		                JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
		                
		            }
					break;
					
				case 6:
					//n6. Borrar disco de la discografia - Borramos un disco de la discografía del grupo que elijamos, primero
					//comprobamos que el grupo exista
					
					try {
						ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
						if (grupos.get(ngrupo)!=null) {
							grupos.get(ngrupo).eliminar_disco();
						}else {
							JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
						}
					}catch (Exception e) {
			            JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
			            
					}
					break;
					
				case 7:	
					//n7. Modificar datos de un CD - Modificamos un disco de la discografía del grupo que elijamos, primero
					//comprobamos que el grupo exista
					
					try {
						ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:")).toLowerCase();
						if (grupos.get(ngrupo)==null) {
							JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
						}else {
							grupos.get(ngrupo).modificar_cd();
						}
					}catch (Exception e) {
			            JOptionPane.showMessageDialog(null,"Acción cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
			            
					}
					break;
					
				case 8:
					//n8. Eliminar grupo - Eliminamos el grupo que elijamos
					//ngrupo=(JOptionPane.showInputDialog("Nombre del grupo:"));
					Operaciones.eliminar_grupo(grupos);
					break;
					
				}
			
			}catch(NumberFormatException nfe){  //usamos el try catch para que no de error si se introducen algo que no sean números
				//cuando el datos que debemos recoger es un número
				
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
			catch (Exception e) {
	            JOptionPane.showMessageDialog(null,"Accion cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
	       	}
				
		}while(gestion!=9);   //usamos el do while para que nos siga apareciendo el menú y podamos seguir haciendo gestiones hasta que 
		//decidamos salir de él.
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
