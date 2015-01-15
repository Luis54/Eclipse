
package javadoc;

/**
 * Estamos creando una clase alumnos para el ejercicio de generar javadoc
 * en eclipse 
 * el ejericico se encuentra en las diapositivas
 * @author luis
 * @version 1.0
 */

public class Alumno {
	/** Creamo los atrivutos de los alumnos privado*/
	private String nombre;
	private String apellidos;
	private String ciclo;
	/** constructo 
	 * @param nombre del alumno
	 * @param apellidos del alumno
	 * @param ciclo del alumno
	 */
	public Alumno(String nombre, String apellidos, String ciclo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciclo = ciclo;
	}
	
	/** @return returna el nombre del alumno*/
	public String getNombre() {
		return nombre;
	}
	/** @param reescribe el nombre del alumno*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** @return retorna el apellido del alumno*/
	public String getApellidos() {
		return apellidos;
	}
	/** @param reescribe el apellido del alumno*/
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/** @return returna el ciclo del alumno*/
	public String getCiclo() {
		return ciclo;
	}
	/** @param reescribe el ciclo del alumno*/
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	@Override
	public String toString() {
		return "Alumno con Nombre y Apellido " + nombre + " " + apellidos
				+ " esta en el Ciclo " + ciclo ;
	}
}
