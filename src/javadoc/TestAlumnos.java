package javadoc;

//import java.util.Scanner;

public class TestAlumnos {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Luis","Usero Reyes","Desarrollo aplicaciones multiplataforma");
		System.out.println(a1);
		a1.setNombre("Luis");
		a1.setApellidos("Usero Reyes");
		a1.setCiclo("Desarrollo aplicaciones multiplataforma");
		System.out.println(a1);
		//Scanner in = new Scanner(System.in);
		//System.out.println("Introduce el nombre del alumno");
		//String nombre = in.next();
		//System.out.println("Introduce el apellido del alumno");
		//String apellido = in.next();
		//System.out.println("Introduce el ciclo del alumno");
		//String ciclo = in.next();
		//System.out.println("Alumno con Nombre"+nombre+"y apellido"+apellido+ "esta en el Ciclo "+ciclo );
		//in.close();
	}

}
