package dam.obj;

public class Representante {

	 String nombre;
	 int edad;
	 float sueldo;
	
	 /**
	  * Constructor de representantes
	  * @param nombre
	  * @param edad
	  * @param sueldo
	  */
	public Representante (String nombre, int edad, float sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public Representante () {
	
	}
	
	public String getnombre () {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getedad () {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float getsueldo () {
		return sueldo;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String toString () {
		return "El representante "+nombre+" de "+edad+" agnos y con sueldo "+sueldo+" ";
	}
}
