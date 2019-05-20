package JUEGO;
import java.util.Scanner;

public class Main {

	static Scanner lc=new Scanner(System.in);
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido a El ojo del abismo");
		System.out.println("Selecciona");
		
		System.out.println("");
		System.out.println("1-Iniciar");
		System.out.println("2-Cerrar juego");
		
		int opcion;
		opcion=sc.nextInt();
		switch (opcion) {
		case 1:
			
			System.out.println("[Iniciando juego]");
			iniciar();
			
			
			break;

		case 2: System.out.println("Gracias por jugar");
			break;
		}
	}

	private static void iniciar() {
		String nombre;	
		System.out.println("Introduce tu nombre");
		nombre=lc.nextLine();
		System.out.println("Bienvenido" + nombre);
		System.out.println("Listo para empezar?");
		System.out.println("Preparate");
		
		
		
		
		
	}

}
