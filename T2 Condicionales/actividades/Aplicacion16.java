package actividades;
import java.util.Scanner;
public class Aplicacion16 {

	public static void main(String[] args) {
		int n,abs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número para calcular su valor absoluto:");
		n=sc.nextInt();
		sc.close();
		abs=n>0? n : n*-1;
		System.out.println("El valor absoluto del número introducido es: "+abs);

	}

}
