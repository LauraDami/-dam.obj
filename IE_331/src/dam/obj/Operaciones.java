package dam.obj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;


public class Operaciones {
	
	
	//apartado 2
	

	public static String imprimir_discografia(TreeMap <String, CD>  discografia) {
		Iterator<String> it= discografia.keySet().iterator();
		String a=" ";
		while (it.hasNext()) {
			String key=(String) it.next();
			a=a+discografia.get(key);
		}return a;
			
	}
	
		
	/**
	 * Metodo para añadir un grupo al treemap, añadimos el try catch para que no de error si se mete algun datos que no sea numÃ©rico
	 * por teclado cuando lo que tenemos que recoger es un numero
	 * @param grupos
	 */
	public static void grupo_nuevo(TreeMap <String, Grupo>  grupos) {
		boolean aux=true;
		do {
			aux=true;
			
			try {		
				String nombre=(JOptionPane.showInputDialog("Indique el nombre del grupo que desea introducir")).toLowerCase();
				if (grupos.remove(nombre)!=null) {
					JOptionPane.showMessageDialog(null, "El grupo introducido ya existe");
				}else{
					String pais=JOptionPane.showInputDialog("Indique el pais del grupo");
					int n_inte=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de integrantes"));
					String nrep=JOptionPane.showInputDialog("Indique el nombre del representante que se encargara del grupo");
					int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del representante"));
					Float sueldo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo del representante"));
					Grupo grupo=new Grupo(nombre, pais, n_inte, nrep, edad, sueldo);
					grupos.put(nombre, grupo);
				}
			}catch (NumberFormatException nfe){
				aux=false;
				JOptionPane.showMessageDialog(null, "Debe introducir un numero");
				nfe.printStackTrace();}
			catch (Exception e) {
	                JOptionPane.showMessageDialog(null,"Accion cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
	        }
			
		}while (aux==false);
						
	}
	
	/**
	 * Metodo para eliminar un grupo del treemap
	 * @param grupos
	 * @return
	 */
	public static boolean eliminar_grupo (TreeMap <String, Grupo>  grupos) {
		try {
		String aux=(JOptionPane.showInputDialog("Introduzca el nombre del grupo que desea eliminar")).toLowerCase();
		if (grupos.remove(aux)==null) {
			JOptionPane.showMessageDialog(null, "El grupo introducido no existe");
			return false;
		}else{
			grupos.remove(aux);
			return true;	
		}
		}catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Accion cancelada !!!"," ^-^ Information^-^ ",JOptionPane.INFORMATION_MESSAGE);
            return false;
    }
	}
	
	
}
