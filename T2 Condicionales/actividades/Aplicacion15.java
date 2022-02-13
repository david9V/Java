package actividades;
import java.util.Scanner;
public class Aplicacion15 {

	public static void main(String[] args) {
		double base,altura,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba la base:");
		base=sc.nextDouble();
		System.out.println("Escriba la altura:");
		altura=sc.nextDouble();
		sc.close();
		area=base*altura;
		if (area<0) {
			System.out.print("Error: ha introducido valores negativos");
		}
		else {
			System.out.println("El área es de "+area);
		}
	}

}
