import java.util.Scanner;

public class TestParal {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introdueix la longitud: ");
		int longitud = teclat.nextInt();
		
		
		System.out.println("Introdueix l'amplada: ");
		int amplada = teclat.nextInt();
		
		System.out.println("Introdueix l'alçada: ");
		int alçada = teclat.nextInt();
		
		
		
		Paral<Integer> objecte = new Paral<>(longitud, amplada, alçada);
		
		System.out.println(objecte.toString());
		
		double volum = objecte.volum();
		
		System.out.println("El volum del paral·lelepípede és " + volum);
		
		teclat.close();
		
		
		
		
		
			
	
		}

}
