package actividades;
import java.util.*;
public class Aplicacion19 {

	public static void main(String[] args) {
		int grados,mod;
		double radianes;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca los grados:");
		grados=sc.nextInt();
		sc.close();
		if (grados>=0 && grados<=360) {
			radianes=grados*(Math.PI/180);
			System.out.println("El ángulo en radianes es: "+radianes);
		}
		else {
			mod=grados%360;
			radianes=mod*(Math.PI/180);
			System.out.println("El ángulo en radianes es: "+radianes);
		}
		

	}

}
