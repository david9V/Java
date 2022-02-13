package actividades;
import java.util.Scanner;
public class Aplicacion13 {

	public static void main(String[] args) {
		int comidaDiaria,numAnimales,kilosPorAnimal,necesario,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la comida diaria de la que se dispone:");
		comidaDiaria=sc.nextInt();
		System.out.println("Introduzca el número de animales a alimentar:");
		numAnimales=sc.nextInt();
		System.out.println("Introduzca lo que come cada animal:");
		kilosPorAnimal=sc.nextInt();
		sc.close();
		necesario=numAnimales*kilosPorAnimal;
		if (necesario>comidaDiaria) {
			r=necesario-comidaDiaria;
			comidaDiaria=comidaDiaria+r;
			System.out.println("No hay suficiente comida, se necesitarían:"+comidaDiaria);
		}
		else {
			System.out.println("Comida suficiente");
		}

	}

}
