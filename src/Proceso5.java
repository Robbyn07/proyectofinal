
public class Proceso5 {

	void Laplace5 (String ec) {
		String ecp = "";
		String resultado = "";
		String [] prt;
		String pv;
		String sv;
		int pve = 0;
		int sve = 0;
		
		prt = ec.split("s");
		pv = prt[0];	//Determina lo que está antes de la base
		sv = prt[1];	//Determina lo que está despues de la base
		
		if (!pv.equals("") && !sv.equals("")) {
			try {
				pve = Integer.parseInt(pv);	//Convierte lo que está antes en un entero
				sve = Integer.parseInt(sv);	//Convierte lo que está despues en un entero
				
				if (pve == 0) {
					ecp = "(" + pve + ")" + "sen(" + sve + "t)";
					resultado = "0";
				} else {
					ecp = "(" + pve + ")" + "sen(" + sve + "t)";
					resultado = (pve * sve) + "/(s^2+" + potencia(sve, 2) + ")";
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
	
	public static int potencia (int base, int exponente) {
        if (exponente==0)
            return 1;
        else
            return base * potencia(base, exponente-1);
        
    }
	
}
