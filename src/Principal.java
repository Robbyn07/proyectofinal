import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		int tec;			//Total de funciones
		int opcion;			//Opcion
		String ecuacion;	//Ecuación
		String x;			//Variables
		String a;		
		String b;
		
		Scanner leer = new Scanner(System.in);
		//ProcesoG LG = new ProcesoG();
		
		System.out.println("¿Cuantas funciones desea resolver?");
		tec = leer.nextInt();
		
		for (int cont = 1; cont <= tec; cont++) {
			System.out.println("¿Cual es la función "+ (cont) + "?");
			
			System.out.println("1. Funcion a");
			System.out.println("2. Funcion (x)t^a");
			System.out.println("3. Funcion (x)e^at");
			System.out.println("4. Funcion (x)Hat");
			System.out.println("5. Funcion (x)sen(bt)");
			System.out.println("6. Funcion (x)cos(bt)");
			System.out.println("7. Funcion (x)senh(bt)");
			System.out.println("8. Funcion (x)cosh(bt)");
			opcion = leer.nextInt();			
		
			switch (opcion) {
			case 1:
				//Proceso 1
				Proceso1 L1 = new Proceso1();
				System.out.println("Escriba un número");
				a = leer.next();
				L1.Laplace1(a);
				break;
			
			case 2:
				//Proceso t^
				Proceso2 L2 = new Proceso2();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de a");
				a = leer.next();
				ecuacion = x + "t" + a;
				L2.Laplace2(ecuacion);
				break;
				
			case 3:
				//Proceso e^at
				Proceso3 L3 = new Proceso3();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de a");
				a = leer.next();
				ecuacion = x + "e" + a;
				L3.Laplace3(ecuacion);
				break;
				
			case 4:
				//Proceso Ha(t)
				Proceso4 L4 = new Proceso4();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de a");
				a = leer.next();
				ecuacion = x + "H" + a;
				L4.Laplace4(ecuacion);
				break;
				
			case 5:
				//Proceso sen(bt)
				Proceso5 L5 = new Proceso5();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de b");
				b = leer.next();
				ecuacion = x + "s" + b;
				L5.Laplace5(ecuacion);
				break;
			
			case 6:
				//Proceso cos(bt)
				Proceso6 L6 = new Proceso6();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de b");
				b = leer.next();
				ecuacion = x + "c" + b;
				L6.Laplace6(ecuacion);
				break;
				
			case 7:
				//Proceso senh(bt)
				Proceso7 L7 = new Proceso7();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de b");
				b = leer.next();
				ecuacion = x + "S" + b;
				L7.Laplace7(ecuacion);
				break;
			
			case 8:	
				//Proceso cosh(bt)
				Proceso8 L8 = new Proceso8();
				System.out.println("Escriba el valor de x");
				x = leer.next();
				System.out.println("Escriba el valor de b");
				b = leer.next();
				ecuacion = x + "C" + b;
				L8.Laplace8(ecuacion);
				break;
			}
			System.out.println("");
		}
	}

}
