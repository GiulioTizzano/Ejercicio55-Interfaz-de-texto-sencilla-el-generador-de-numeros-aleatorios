import java.util.Scanner;



public class Aleatorio{
	public static void main(String args[]){
		boolean salir = false;
		int opcion;

		Scanner sc = new Scanner(System.in);

		while(!salir){
			System.out.println("1. help");
			System.out.println("2. start");
			System.out.println("3. exit");

			System.out.println("Escriba una de las opciones");
			opcion = sc.nextInt();

             		switch(opcion){
				case 1:{
					System.out.println("Has seleccionado la opción 1");
					System.out.println("En esta aplicación, se genera un número aleatorio entero, que es mayor que el uno y menor que el número que depositas");
				}
					break;
				case 2:{
					System.out.println("Deposite  un número entero");
						int n = sc.nextInt();
						int numero = (int)(Math.random()*(n + 1));
						System.out.println(numero);
				}
					break;
				case 3:
					salir = true;
				default:
					System.out.println("Solo números entre 1 y 3");

				}
			}
		}
}