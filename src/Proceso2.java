
public class Proceso2 {
	
	void Laplace2 (String ec) {
		String ecp = "";
		String resultado = "";
		String [] prt;
		String pv;
		String sv;
		int pve = 0;
		int sve = 0;
		
		prt = ec.split("t");
		pv = prt[0];	//Determina lo que está antes de la base
		sv = prt[1];	//Determina lo que está despues de la base
		
		//System.out.println(pv);
		//System.out.println(sv);
		
		if (!pv.equals("") && !sv.equals("")) {
			try {
				pve = Integer.parseInt(pv);	//Convierte lo que está antes en un entero
				sve = Integer.parseInt(sv);	//Convierte lo que está despues en un entero
				
				if ( pve == 0) {
					ecp = "(" + pve + ")" + "t^" + sve;
					resultado = "¡No es posible resolver!";
				} else {
					if (sve <= 0) {
						resultado = "¡No es posible resolver!";
					} else {
						ecp = "(" + pve + ")" + "t^" + sve;
						sve += 1;
						resultado = factorial(pve) + "/(s^" + sve + ")";
					}
				}
				
			} 
			catch (Exception e) {
				ecp = "¡ERROR!";
				resultado = "¡No es posible resolver!";
			} 
			finally {
				System.out.println("La función es: " + ecp);
				System.out.println("Su Transformada de Laplace es: " + resultado);
			
			}
		}
	}
	
	public static int factorial (int numero) {
        	if (numero == 0) {
            		return 1;
		} else {
           	 	return numero * factorial(numero - 1);
		}
   	 }
	
}
