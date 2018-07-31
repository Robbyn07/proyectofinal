
public class Proceso1 {

	void Laplace1 (String ec) {
		String resultado = " ";

		if (!ec.equals("")) {
			try {
				Integer.parseInt(ec);
				
				if (ec == "0") {
					resultado = "0";
				} else {
					resultado = ec + "/s";
				}
				
			}
			catch (Exception e) {
				resultado = "¡No es posible resolver!";
			}
			finally {
				System.out.println("Su Transformada de Laplace es: " + resultado);
			}
		}
	}
	
}
