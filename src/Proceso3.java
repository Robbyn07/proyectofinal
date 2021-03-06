
public class Proceso3 {

	void Laplace3 (String ec) {
		String ecp = "";
		String resultado = "";
		String [] prt;
		String pv;
		String sv;
		int pve = 0;
		int sve = 0;
		
		prt = ec.split("e");
		pv = prt[0];	//Determina lo que está antes de la base
		sv = prt[1];	//Determina lo que está despues de la base
		
		if (!pv.equals("") && !sv.equals("")) {
			try {
				pve = Integer.parseInt(pv);	//Convierte lo que está antes en un entero
				sve = Integer.parseInt(sv);	//Convierte lo que está despues en un entero
				
				if (pve == 0) {
					resultado = "0";
				} else {
					if (sve < 0 ) {
						ecp = "(" + pve + ")" + "e^" + sve + "t";
						sve *= -1;
						resultado = (pve * 1) + "/(s+" + sve + ")";
					} else {
						ecp = "(" + pve + ")" + "e^" + sve + "t";
						resultado = (pve * 1) + "/(s-" + sve + ")";
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
	
}
