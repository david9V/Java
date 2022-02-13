package actividades;
import java.util.Scanner;
import java.lang.Math;
public class Aplicacion18 {

	public static void main(String[] args) {
		double r1,r2,r3,resultadoS,resultadoR,resultadoM,resultadoUsuario;
		r1=(int) (Math.random()*100);
		r2=(int) (Math.random()*100);
		resultadoS=(int) (r1+r2);
		resultadoR=(int) (r1-r2);
		resultadoM=(int) (r1*r2);
		Scanner sc=new Scanner(System.in);
		r3=(int) (Math.random()*3);
		if (r3==0) {
			System.out.println("Sume "+r1+" + "+r2+":");
			resultadoUsuario=sc.nextDouble();
			sc.close();
			if (resultadoUsuario==resultadoS) {
				System.out.println("Felicidades, has acertado");
			}
			else {
				System.out.println("Respuesta errónea, el resultado era: "+resultadoS);
		}
		}
		else if (r3==1) {
			System.out.println("Multiplique "+r1+" * "+r2+":");
			resultadoUsuario=sc.nextDouble();
			sc.close();
			if (resultadoUsuario==resultadoM) {
				System.out.println("Felicidades, has acertado");
			}
			else {
				System.out.println("Respuesta errónea, el resultado era: "+resultadoM);
		}
		}
		else if (r3==2) {
			System.out.println("Reste "+r1+" - "+r2+":");
			resultadoUsuario=sc.nextDouble();
			sc.close();
			if (resultadoUsuario==resultadoR) {
				System.out.println("Felicidades, has acertado");
			}
			else {
				System.out.println("Respuesta errónea, el resultado era: "+resultadoR);
		}
		}
		
		
	}

}