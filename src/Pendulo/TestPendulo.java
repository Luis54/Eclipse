package Pendulo;

import java.util.Scanner;

public class TestPendulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendulo p = new Pendulo (10.5);
		System.out.println(p);
		//cambiamos el valor de la longitud
		System.out.println("---------------------------");
		p.setLongitud(15.9);
		System.out.println(p);
		//Pasamos el metodo por scanner
		System.out.println("-------------------------------");
		Scanner pendulo = new Scanner(System.in);
		System.out.println("Introduce el valor de la longitud del pendulo");
		double valor = pendulo.nextDouble();
		p.setLongitud(valor);
		System.out.println(p);
		//Pasar longitud con argumentos
		double longitud = Double.parseDouble(args[0]);
		System.out.println(p);
		pendulo.close();
	}

}
