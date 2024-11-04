
public class Fiesta {	
	public static void main(String[] args) {
		//Creamos nuestra mesa que organizará la sincronización de los hilos
		Mesa mesa = new Mesa();
		
		//Creamos los hilos de los nenes y de la madre
		Nene nico = new Nene("Nico", mesa);
		Nene pablo = new Nene("Pablo", mesa);
		Nene javi = new Nene("Javi", mesa);
		Nene ivan = new Nene("Iván", mesa);
		Nene guille = new Nene("Guille", mesa);
		Nene nacho = new Nene("Nacho", mesa);
		Madre mama = new Madre(mesa);
		
		//Iniciamos los hilos
		nico.start();
		pablo.start();
		javi.start();
		ivan.start();
		guille.start();
		nacho.start();
		mama.start();
	}
}
