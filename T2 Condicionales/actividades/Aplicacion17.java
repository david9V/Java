package actividades;
import java.util.Scanner;
import java.lang.Math;
public class Aplicacion17 {

	public static void main(String[] args) {
		double r1,r2,resultadoR,resultadoUsuario;
		r1=(int) (Math.random()*100);
		r2=(int) (Math.random()*100);
		resultadoR=(int) (r1+r2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Sume "+r1+" + "+r2+":");
		resultadoUsuario=sc.nextDouble();
		sc.close();
		if (resultadoUsuario==resultadoR) {
			System.out.println("Felicidades, has acertado");
		}
		else {
			System.out.println("Malísimo, respuesta errónea, el resultado era: "+resultadoR);
		}
	}

}
